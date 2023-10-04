package UTN.presentacion;

import UTN.conexion.Conexion;
import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.Scanner;

public class SistemaEstudianesApp {
    public static void main(String[] args) {
        var salir = false; //recuerden esto ya lo hicimos antes
        var consola = new Scanner(System.in); //Para leer informacion de la consola
        //Se crea una instancia de la clase servicio, esto lo hacemos fuera del ciclo
        var estudianteDao = new EstudianteDAO();//Esta instancia debe hacerse una vez
        while(!salir){
            try{
                mostrarMenu();//Mostramos el menu
                //Este será el metodo ejecutarOpciones que devolvera un booleano
                salir = ejecutarOpciones(consola, estudianteDao);//Este arroja una excetion
            } catch(Exception e){
                System.out.println("Ocurrio un error al ejecutar la operacion:" +e.getMessage());
            }
        }//Fin while
    }//Fin main

 private static void mostrarMenu(){
        System.out.print("""
                ******* Sistema de Estudiante *******
                1. Listar Estudiantes
                2. Buscar Estudiantes
                3. Agregar Estudiante
                4. Modificar Estudiante
                5. Eliminar Estudiante
                6. Salir
                Elige una opcion:
                """);
    }
 //Metodo para ejecutar las opciones, va a regresar un valor booleano, ya que es el que
    //puede modificar el valor de la variable salir, si es verdadero termina el ciclo while
    private static boolean ejecutarOpciones(Scanner consola, EstudianteDAO estudianteDAO) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> { //Listar estudiantes
                System.out.println("Listado de Estudiantes...");
                //No muestra la informacion, solo recupera la info y regresa una lista
                var estudiantes = estudianteDAO.listarEstudiantes();//recibe el listado
                //vamos a iterar cada objeto de tipo estudiante
                estudiantes.forEach(System.out::println);//Para imprimir la lista
            }//fin caso 1
            case 2 -> { //Buscar estudiante por id
                System.out.println("Introduce el id_estudiante a buscar: ");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                var estudiante = new Estudiante(idEstudiante);
                var encontrado = estudianteDAO.buscarEstudiantePorId(estudiante);
                if (encontrado)
                    System.out.println("Estudiante Encontrado: " + estudiante);
                else
                    System.out.println("Estudiante NO encontrado: " + estudiante);
            }//fin caso 2
 case 3 -> {// Agregar estudiante
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante sin id
                var estudiante = new Estudiante(nombre, apellido, telefono, email);
                var agregado = estudianteDao.agregarEstudiante(estudiante);
                if (agregado)
                    System.out.println("Estudiante agregado: " + estudiante);
                else
                    System.out.println("No se ha podido agregar estudiante: " + estudiante);
            }// Fin caso 3
            case 4 -> {// Modificar estudiante
                System.out.println("Modificar estudiante...");
                //Aqui lo primero es especificar el id del estudiante(objeto) a modificar
                System.out.println("Ingrese el id del estudiante a modificar:");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Telefono: ");
                var telefono = consola.nextLine();
                System.out.println("Email: ");
                var email = consola.nextLine();
                //crea el objeto estudiante a modificar
                var estudiante = new Estudiante(idEstudiante, nombre, apellido, telefono, email);
                var modificado = estudianteDao.modificarEstudiante(estudiante);
                if (modificado)
                    System.out.println("Estudiante modificado: " + estudiante);
                else
                    System.out.println("No se ha podido modificar estudiante: " + estudiante);
            }// Fin caso 4
            case 5 ->{// Eliminar estudiante
                System.out.println("Eliminar estudiante...");
                //Aqui lo primero es especificar el id del estudiante(objeto) a eliminar
                System.out.println("Ingrese el id del estudiante a eliminar:");
                var idEstudiante = Integer.parseInt(consola.nextLine());
                //crea el objeto estudiante a eliminar
                var estudiante = new Estudiante(idEstudiante);
                var eliminado = estudianteDao.eliminarEstudiante(estudiante);
                if (eliminado)
                    System.out.println("Estudiante eliminado: " + estudiante);
                else
                    System.out.println("No se ha podido eliminar estudiante: " + estudiante);
            }// Fin caso 5
            case 6 ->{// Salir
                System.out.println("Saliendo del sistema...");
                salir = true;
            }// Fin caso 6
            default -> System.out.println("Opcion no valida, ingrese otra opcion");
        }// Fin switch
        return salir;
    } // Fin metodo ejecutarOpcion

} // Fin clase Main
}//fin clase

}//Fin clase
