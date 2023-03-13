package EjerciciosLogica;

import Condicional.Sueldo;

import javax.swing.*;
import java.awt.event.*;

public class Salario extends JDialog {
    private JPanel contentPane;
    private JButton buttonCancel;
    private JButton salarioRepartidorButton;
    private JButton salarioCajeroButton;
    private JButton salarioSupervisorButton;

    public Salario() {
        setContentPane(contentPane);
        setModal(true);
        setLocationRelativeTo(null);


        salarioRepartidorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sueldo.salarioRepartidor();
            }
        });
        salarioCajeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sueldo.sueldoCajero();
            }
        });
        salarioSupervisorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sueldo.salarioSupervisor();
            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }


}
