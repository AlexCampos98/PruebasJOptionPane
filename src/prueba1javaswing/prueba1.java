/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1javaswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro Campos Maestre
 */
public class prueba1 extends javax.swing.JFrame
{

    /**
     * Creates new form prueba1
     */
    public prueba1()
    {
        super("Seleciona un boton");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JButton btn1 = new JButton("Informacion");
        JButton btn2 = new JButton("Advertencia");
        JButton btn3 = new JButton("Error");
        JButton btn4 = new JButton("Entrada de datos");
        JButton btn5 = new JButton("Multiplicar por 2");
        JButton btn6 = new JButton("Selector de Opciones, Des");
        JButton btn7 = new JButton("Selector de Opciones, Bot");
        JButton btn8 = new JButton("YES_NO_CANCEL");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);

        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Prueba de mensaje", "Ventana 1", 1);
            }
        });

        btn2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Advertencia Loco", "Gran advertencia", 2);
            }
        });

        btn3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "La has liado", "Error", 0);
            }
        });

        btn4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String informacion = JOptionPane.showInputDialog(null, "Introduce informacion", "Entrada de datos", 1);
                System.out.println(informacion);
            }
        });

        btn5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String nDoblar = JOptionPane.showInputDialog(null, "Introduce un numero: ", "Multiplicador x2", -1);
                boolean resultado;
                Integer numero = 0;

                try
                {
                    numero = Integer.parseInt(nDoblar);
                    resultado = true;
                    numero = numero * 2;
                } catch (NumberFormatException eNumero)
                {
                    resultado = false;
                }

                if (resultado)
                {
                    JOptionPane.showMessageDialog(null, "El resultado es: " + numero * 2, "Rersultado", 1);
                } else
                {
                    JOptionPane.showMessageDialog(null, "No has introducido correctamente el numero, esto es lo que has introducido: " + nDoblar, "Error del sistema", 2);
                }

            }
        });

        btn6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String[] opciones =
                {
                    "Este", "Este no", "Mejor no", "Elijo", "Ninguno"
                };
                String opcion = (String) JOptionPane.showInputDialog(null, "Seleciona una opcion:", "Menu de seleccion", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[2]);
                JOptionPane.showMessageDialog(null, opcion, "Has seleccionado", 1);

            }
        });

        btn7.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String[] opciones =
                {
                    "Opcion 1", "Opcion 2", "Opcion 3"
                };

                int opcion = JOptionPane.showOptionDialog(null, "Pulsa uno de los botones", "Elije entre una de las opciones", WIDTH, HEIGHT, null, opciones, opciones[0]);

                String mensaje = "";

                switch (opcion)
                {
                    case 0:
                        mensaje = "Opcion 1";
                        break;
                    case 1:
                        mensaje = "Opcion 2";
                        break;
                    case 2:
                        mensaje = "Opcion 3";
                        break;
                }

                JOptionPane.showMessageDialog(null, mensaje, "La opcion escogida es", 1);
            }
        });

        btn8.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Se acabara el Covid rapido?", "Pregunta dificil", JOptionPane.YES_NO_CANCEL_OPTION,2);

                String mensaje = "";

                switch (opcion)
                {
                    case 0:
                        mensaje = "Si";
                        break;
                    case 1:
                        mensaje = "No";
                        break;
                    case 2:
                        mensaje = "Cancelar";
                        break;
                }

                System.out.println("La opcion elegida es: " + mensaje);
            }
        });

        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(prueba1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new prueba1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
