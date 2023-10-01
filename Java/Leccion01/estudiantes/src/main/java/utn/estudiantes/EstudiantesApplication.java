package utn.estudiantes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import utn.estudiantes.servicio.EstudianteServicio;
import utn.estudiantes.modelo.Estudiantes2022;




@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

  @Override
	public void run(String... args) throws Exception {
		logger.info(nl+"Ejecutando el metodo run de Spring Boot..."+nl);
		var salir = false;
		var consola = new Scanner(System.in);
		while (!salir){
			mostrarMenu();
			salir = ejecutarOpciones(consola);
			logger.info(nl);
		}//fin while


	}
	public void mostrarMenu(){
		//logger.info(nl);
		logger.info("""
        ******* Sistema de Estudiantes *******
     	1) Listar Estudiantes
     	2) Buscar Estudiante
     	3) Agregar Estudiante
     	4) Modificar Estudiante
     	5) Eliminar Estudiante
     	6) Salir
	 	Elija una opción: """);


	}

	private boolean ejecutarOpciones(Scanner consola){
		var opcion = Integer.parseInt(consola.nextLine());
		var salir = false;
		switch (opcion){
			case 1 ->{
				logger.info("Listando Estudiantes: "+nl);
				List<Estudiantes2022> estudiantes = estudianteServicio.listarEstudiantes();
				estudiantes.forEach(estudiante -> logger.info(estudiante.toString()+nl));
            }//Fin caso 1
            case 3 -> { //Agregar estudiante
				logger.info("Ingrese los datos del estudiante: ");
				logger.info("Nombre: ");
				var nombre = entrada.nextLine();
				logger.info("Apellido: ");
				var apellido = entrada.nextLine();
				logger.info("Teléfono: ");
				var telefono = entrada.nextLine();
				logger.info("email: ");
				var email = entrada.nextLine();

				var estudiante = new Estudiantes2022();
				estudiante.setNombre(nombre);
				estudiante.setApellido(apellido);
				estudiante.setEmail(email);
				estudiante.setTelefono(telefono);

				estudianteServicio.guardarEstudiante(estudiante);
				logger.info("Estudiante agregado: " + estudiante + nl);
				return false;
			}
			case 4 -> { //Modificar estudiante
				logger.info("Modificando estudiante: ");
				var idEstudiante = Integer.parseInt(entrada.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);

				if (estudiante != null){
					logger.info("Ingrese los nuevos datos del estudiante: ");
					var nombre = entrada.nextLine();
					var apellido = entrada.nextLine();
					var telefono = entrada.nextLine();
					var email = entrada.nextLine();

					estudiante.setNombre(nombre);
					estudiante.setApellido(apellido);
					estudiante.setEmail(email);
					estudiante.setTelefono(telefono);

					estudianteServicio.guardarEstudiante(estudiante);
					return false;
				} else {
					logger.info("Error en el número de id. Saliendo al menú...");
					return true;
				}
			}
			case 5 -> { //Eliminar estudiante
				logger.info("Ingrese el ID: ");
				var idEstudiante = Integer.parseInt(entrada.nextLine());
				Estudiantes2022 estudiante = estudianteServicio.buscarEstudiantePorId(idEstudiante);
				estudianteServicio.eliminarEstudiante(estudiante);
			}



				
			case 5 ->{//Eliminar estudiante
				logger.info("Eliminar estudiante: ");
				logger.info("Id estudiante: ");
				var idEstudiante = Integer.parseInt(consola.nextLine());
				//Buscamos el id estudiante a eliminar
				var estudiante = estudianteServicio.eliminarEstudiante(idEstudiante);
				if(estudiante != null) {
					estudianteServicio.eliminarEstudiante(estudiante);
					logger.info("Estudiante eliminado: "+estudiante+nl);
				}else
					logger.info("Estudiante NO encontrado con el id: "+estudiante+nl);
			}//Fin caso 5
			case 6 -> {//Salir
				logger.info("Hasta pronto!!!");
				salir = true;
			}//Fin caso 6
			default -> logger("Opción no reconocida: "+opcion+nl);
			}//fin switch
		return salir;
	}
}






