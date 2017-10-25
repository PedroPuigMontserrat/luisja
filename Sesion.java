package Modelos;

import java.sql.Connection;
import javax.swing.JFrame;

//------------CLASE------------------
public class Sesion {
     private Connection cnn;
     private JFrame form;

//------------CONSTRUCTOR Sin Parametros------------
    public Sesion() {
        super();
    }

//------------CONSTRUCTOR con Parametros------------
    public Sesion(Connection cnn, JFrame form) {
        super();
        this.cnn = cnn;
        this.form = form;
    }
//------------Getters y Setters----------
    public Connection getCnn() {
        return cnn;
    }

    public void setConection(Connection cnn) {
      this.cnn = cnn;
    }
    public JFrame getForm() {
        return form;
    }

    public void setForm(JFrame form) {
      this.form=form;
    }
}
