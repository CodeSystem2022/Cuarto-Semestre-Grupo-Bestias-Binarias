package utn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import utn.vista.LibroForm;


import java.awt.EventQueue;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {

			ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(TiendaLibrosApplication.class)
						.headless(false)
						.web(WebApplicationType.NONE)
						.run(args);

			// Ejecutamos el código para cargar el formulario
		EventQueue.invokeLater(() -> {
			// Obtenemos el objeto Form a traves del spring
				LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
				libroForm.setVisible(true);
		});

						
	}

}
