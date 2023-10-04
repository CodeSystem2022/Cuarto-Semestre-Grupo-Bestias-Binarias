package utn.estudiantes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.estudiantes.servicio.EstudianteServicio;

@SpringBootApplication
class EstudiantesApplicationTests implements CommandLineRunner {
@Autowired
private EstudianteServicio estudianteServicio;
private static final Logger logger = LoggerFactory.getLogger(EstudiantesAplication.class);

String nl = System.lineSeparator();
	
public static void main (String[] args) {
	logger.info("Iniciando la aplicacion...");
	// Levantar la fabrica de Spring
	SpringApllication.run(EstudiantesApplication.class, args);
	logger.info("Aplicacion Finalizada!");
 }
	
 @Override
 public void run(String...args) throws Exception {
	 logger.info(nl+"Ejecutando el metodo run de Spring.."+nl);
	 
 }
}
