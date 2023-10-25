package utn.vista;

import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;

public class LibroFrom extends JFrame {
    private JPanel panel;

    @Autowired
    public LibroFrom(){
        this.libroServicio = libroServicio;
        iniciarForma();
    }

    private void iniciarForma(){
        this.setContentPane(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setSize(900, 700);
    }

     private void listarLibros(){
        // Limpiar la tabla
        tablaModeloLibros.setRowCount(0);
        // Obtener los libros de la BD
        var libros = libroServicio.listarLibros();
        //Iteramos cada libro
        libros.forEach((libro)->{
            //Creamos cada registro para agregarlo a la tabla
            Object[] renglonLibro = {
                    libro.getIdLibro(),
                    libro.getNombreLibro(),
                    libro.getAutor(),
                    libro.getPrecio(),
                    libro.getExistencias()
            };
            this.tablaModeloLibros.addRow(renglonLibro);
        });
    }

}
