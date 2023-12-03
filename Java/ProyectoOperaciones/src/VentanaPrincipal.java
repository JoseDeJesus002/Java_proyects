import javax.swing.*;
import java.awt.*;

import jose.enriquez.Suma;
import jose.enriquez.Resta;
import jose.enriquez.Multiplicacion;
import jose.enriquez.Division;
import jose.enriquez.Utilidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaPrincipal extends JFrame implements ActionListener {
    private JPanel panelVentanaPrincipal;
    private JLabel lbOperacion;
    private JLabel lbResultado;
    private JButton btnN4;
    private JButton btnN7;
    private JButton btnN8;
    private JButton btnN9;
    private JButton btnN5;
    private JButton btnN6;
    private JButton btnN1;
    private JButton btnN2;
    private JButton btnN3;
    private JButton btnN0;
    private JLabel lbPuntos;
    private JLabel lbIntentos;
    int n1 = 0;
    int n2 = 0;
    int contador=0;

    //int intentos = 3;
    double resultado=0;

    //int generarAleatorios = Utilidades.generarNumeroAleatorios();
    public VentanaPrincipal() throws HeadlessException {
        setContentPane(panelVentanaPrincipal);
        setVisible(true);
        setSize(480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        establecerListenerBotones();
        generarSuma();
        generarResta();
        generarMultiplicacion();
        generarDivision();
        /*if ( generarAleatorios == 1) {
            generarSuma();
        } else if (generarAleatorios == 2) {
            generarResta();
        }else if(generarAleatorios == 3){
            generarMultiplicacion();
        }else{
            generarDivision();
        }*/
    }
    private void establecerListenerBotones(){
        btnN0.addActionListener(this);
        btnN1.addActionListener(this);
        btnN2.addActionListener(this);
        btnN3.addActionListener(this);
        btnN4.addActionListener(this);
        btnN5.addActionListener(this);
        btnN6.addActionListener(this);
        btnN7.addActionListener(this);
        btnN8.addActionListener(this);
        btnN9.addActionListener(this);
    }
    private void generarSuma(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + "+" + n2;
        lbOperacion.setText(operacion);
    }
    private void generarResta(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + "-" + n2;
        lbOperacion.setText(operacion);
    }
    private void generarMultiplicacion(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + "*" + n2;
        lbOperacion.setText(operacion);
    }
    private void generarDivision(){
        n1 = Utilidades.generarNumeroAleatorio();
        n2 = Utilidades.generarNumeroAleatorio();
        var operacion = n1 + "/" + n2;
        lbOperacion.setText(operacion);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String numero = "";
        String total = lbResultado.getText();
        numero = validarActionEventBotones(actionEvent, numero);
        total += numero;
        lbResultado.setText(total);
        validarOperacion();

    }

    private void validarOperacion() {
        if (n1 == 1) {
            suma();
        } else if (n1 < n2) {
            resta();
        }else if(n1 == 3){
            multiplicacion();
        }else{
            division();
        }
    }

    private void resta() {
        /*resultado=Resta.operacion(n1,n2);
        if (resultado < 0){
            suma();
        }*/
            if (Integer.parseInt(lbResultado.getText()) == Resta.operacion(n1,n2)) {
                IncrementarContador();
                lbResultado.setText("");
                generarResta();
            } else {
                decrementar();
                lbResultado.setText("");
                generarResta();
                //intentos();
            }
    }
    private void suma() {
        if (Integer.parseInt(lbResultado.getText())==Suma.Operaciones(n1,n2)){
            IncrementarContador();
            lbResultado.setText("");
            generarSuma();
        }else{
            decrementar();
            lbResultado.setText("");
            generarSuma();
            //intentos();
        }
    }
    private void multiplicacion() {
        if (Integer.parseInt(lbResultado.getText())==Multiplicacion.operacion(n1,n2)){
            IncrementarContador();
            lbResultado.setText("");
            generarMultiplicacion();
        }else{
            decrementar();
            lbResultado.setText("");
            generarMultiplicacion();
            //intentos();
        }
    }
    private void division() {
        if (Integer.parseInt(lbResultado.getText())==Division.operacion(n1,n2)){
            IncrementarContador();
            lbResultado.setText("");
            generarDivision();
        }else{
            decrementar();
            lbResultado.setText("");
            generarDivision();
            //intentos();
        }
    }
    private  void IncrementarContador() {
        contador ++;
        lbPuntos.setText("Puntos: " + contador);
    }
    private void decrementar(){
        if (contador>0) {
            contador--;
        }else{
            contador=0;
        }
        lbPuntos.setText("Puntos: " + contador);
    }
   /* private void intentos(){
        intentos --;
        lbIntentos.setText("Intentos: " + intentos);
        if(intentos == 0){

            //dispose();
        }
    }
    private void cerrarPrograma(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dispose();
    }*/

    private String validarActionEventBotones(ActionEvent actionEvent, String numero) {
        if (actionEvent.getSource() == btnN0)
            numero = btnN0.getText();
        if (actionEvent.getSource() == btnN1)
            numero = btnN1.getText();
        if (actionEvent.getSource() == btnN2)
            numero = btnN2.getText();
        if (actionEvent.getSource() == btnN3)
            numero = btnN3.getText();
        if (actionEvent.getSource() == btnN4)
            numero = btnN4.getText();
        if (actionEvent.getSource() == btnN5)
            numero = btnN5.getText();
        if (actionEvent.getSource() == btnN6)
            numero = btnN6.getText();
        if (actionEvent.getSource() == btnN7)
            numero = btnN7.getText();
        if (actionEvent.getSource() == btnN8)
            numero = btnN8.getText();
        if (actionEvent.getSource() == btnN9)
            numero = btnN9.getText();
        return numero;
    }


    public static void main(String[] args){
        new VentanaPrincipal();
    }


}
