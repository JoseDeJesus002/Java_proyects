import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class VentanaPrincipal extends JFrame{
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

    public VentanaPrincipal() throws HeadlessException {
        setContentPane(panelVentanaPrincipal);
        setVisible(true);
        setSize(480,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        btnN0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton = btnN0.getText();
                String resultado = lbResultado.getText();
                resultado+=numeroBoton;
                lbResultado.setText(resultado);
            }
        });
        btnN1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton1 = btnN1.getText();
                lbResultado.setText(numeroBoton1);
            }
        });
        btnN2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton2 = btnN2.getText();
                lbResultado.setText(numeroBoton2);
            }
        });
        btnN3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton3 = btnN3.getText();
                lbResultado.setText(numeroBoton3);
            }
        });
        btnN4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton4 = btnN4.getText();
                lbResultado.setText(numeroBoton4);
            }
        });
        btnN5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton5 = btnN5.getText();
                lbResultado.setText(numeroBoton5);
            }
        });
        btnN6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton6 = btnN6.getText();
                lbResultado.setText(numeroBoton6);
            }
        });
        btnN7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton7 = btnN7.getText();
                lbResultado.setText(numeroBoton7);
            }
        });
        btnN8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton8 = btnN8.getText();
                lbResultado.setText(numeroBoton8);
            }
        });
        btnN9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numeroBoton9 = btnN9.getText();
                lbResultado.setText(numeroBoton9);
            }
        });
    }

    public static void main(String[] args){
        new VentanaPrincipal();
    }
}
