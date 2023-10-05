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

}
