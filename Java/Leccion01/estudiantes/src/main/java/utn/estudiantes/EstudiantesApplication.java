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
			
			}//fin switch
		return salir;
	}
}






