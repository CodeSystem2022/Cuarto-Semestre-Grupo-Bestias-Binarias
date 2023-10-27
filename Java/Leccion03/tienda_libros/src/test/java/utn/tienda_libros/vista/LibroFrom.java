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



    
 private void createUIComponents() {
        // TODO: place custom component creation code here
        idTexto = new JTextField("");
        idTexto.setVisible(false);

        this.tablaModeloLibros = new DefaultTableModel(0, 5){
            @Override
            public boolean isCellEditable(int row, int column){return false;}
        };

        String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
        this.tablaModeloLibros.setColumnIdentifiers(cabecera);
        // Intanciar el objeto JTable
        this.tablaLibros = new JTable(tablaModeloLibros);
        // Evitar que se seleccionen varios registros
        tablaLibros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listarLibros();
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
