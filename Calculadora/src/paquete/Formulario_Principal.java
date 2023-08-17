package paquete;

import java.io.FileInputStream;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;
import java.io.BufferedInputStream;
import java.io.IOException;

/**
 *
 * @author brecinosm
 */
public class Formulario_Principal extends javax.swing.JFrame {

    Bitacora bitacora = new Bitacora();

    String n1 = "0", n2 = "0", signo;
    Double ayuda = 0.0;

    public Formulario_Principal() {
        initComponents();
    }

    private void audio() {
        try {
            // Ruta del archivo .mp3 (ajusta esta ruta)
            String rutaArchivo = "C:\\Users\\brecinosm\\OneDrive - Comunicaciones Celulares, S.A\\Documentos\\NetBeansProjects\\Calculadora\\src\\paquete\\sonido.mp3";

            // Crea un flujo de entrada para el archivo .mp3
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(rutaArchivo));

            // Crea un reproductor JLayer
            AdvancedPlayer player = new AdvancedPlayer(bis);

            // Agrega un oyente para manejar eventos de reproducción
            player.setPlayBackListener(new PlaybackListener() {
                @Override
                public void playbackFinished(PlaybackEvent evt) {
                    // Puedes agregar código aquí para manejar eventos de finalización de reproducción
                }
            });

            // Reproduce el archivo .mp3
            player.play();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_mas = new javax.swing.JButton();
        btn_menos = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_por = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_dividir = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_datos = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_opciones = new javax.swing.JMenu();
        Submenu_Nuevo = new javax.swing.JMenuItem();
        Submenu_Historial = new javax.swing.JMenuItem();
        Menu_ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA BRYAN ☺");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_mas.setText("+");
        btn_mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masActionPerformed(evt);
            }
        });

        btn_menos.setText("-");
        btn_menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menosActionPerformed(evt);
            }
        });

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_por.setText("*");
        btn_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porActionPerformed(evt);
            }
        });

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_dividir.setText("/");
        btn_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dividirActionPerformed(evt);
            }
        });

        btn_punto.setText(".");
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });

        btn_igual.setText("=");
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        txt_datos.setColumns(20);
        txt_datos.setRows(5);
        jScrollPane1.setViewportView(txt_datos);

        Menu_opciones.setText("Opciones");

        Submenu_Nuevo.setText("Nuevo");
        Submenu_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submenu_NuevoActionPerformed(evt);
            }
        });
        Menu_opciones.add(Submenu_Nuevo);

        Submenu_Historial.setText("Historial");
        Submenu_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submenu_HistorialActionPerformed(evt);
            }
        });
        Menu_opciones.add(Submenu_Historial);

        jMenuBar1.add(Menu_opciones);

        Menu_ayuda.setText("Ayuda");
        Menu_ayuda.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Menu_ayudaStateChanged(evt);
            }
        });
        Menu_ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_ayudaMouseClicked(evt);
            }
        });
        Menu_ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_ayudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(Menu_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn_por, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_menos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_por, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "1");
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "2");
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        audio();
        txt_datos.setText(txt_datos.getText() + "0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        // TODO add your handling code here:
        audio();
        String cadena;
        cadena = txt_datos.getText();

        if (cadena.length() <= 0) {

            txt_datos.setText("0.");

        } else {

            if (!Punto(txt_datos.getText())) {

                txt_datos.setText(txt_datos.getText() + ".");
            }

        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void Submenu_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submenu_NuevoActionPerformed
        // TODO add your handling code here:

        txt_datos.setText("");
        n1 = "0";
    }//GEN-LAST:event_Submenu_NuevoActionPerformed

    private void btn_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dividirActionPerformed
        // TODO add your handling code here:
        audio();

        if (!txt_datos.getText().equals("")) {

            if (n1 == "0") {
                n1 = txt_datos.getText();
            } else {
                ayuda = Double.parseDouble(n1) / Double.parseDouble(txt_datos.getText());

                n1 = ayuda.toString();
            }
            signo = "/";
            bitacora.concatenar(txt_datos.getText() + " " + signo);
            txt_datos.setText("");
        }
    }//GEN-LAST:event_btn_dividirActionPerformed

    private void btn_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porActionPerformed
        // TODO add your handling code here:
        audio();
        if (!txt_datos.getText().equals("")) {

            if ("0".equals(n1)) {
                n1 = txt_datos.getText();
            } else {
                ayuda = Double.parseDouble(n1) * Double.parseDouble(txt_datos.getText());

                n1 = ayuda.toString();
            }
            signo = "*";
            bitacora.concatenar(txt_datos.getText() + " " + signo);
            txt_datos.setText("");
        }
    }//GEN-LAST:event_btn_porActionPerformed

    private void btn_menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menosActionPerformed
        // TODO add your handling code here:
        audio();
        if (!txt_datos.getText().equals("")) {

            if (n1 == "0") {
                n1 = txt_datos.getText();
            } else {
                ayuda = Double.parseDouble(n1) - Double.parseDouble(txt_datos.getText());

                n1 = ayuda.toString();
            }

            signo = "-";
            bitacora.concatenar(txt_datos.getText() + " " + signo);
            txt_datos.setText("");
        }
    }//GEN-LAST:event_btn_menosActionPerformed

    private void btn_masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masActionPerformed
        // TODO add your handling code here:
        audio();
        if (!txt_datos.getText().equals("")) {

            ayuda = Double.parseDouble(n1) + Double.parseDouble(txt_datos.getText());

            n1 = ayuda.toString();

            signo = "+";

            bitacora.concatenar(txt_datos.getText() + " " + signo);

            txt_datos.setText("");

        }
    }//GEN-LAST:event_btn_masActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        // TODO add your handling code here:
        audio();
        String total;

        n2 = txt_datos.getText();
        bitacora.concatenar(txt_datos.getText() + " = ");

        if (!n2.equals("")) {

            total = Calculo(n1, signo, n2);
            txt_datos.setText(total);
            bitacora.concatenar(txt_datos.getText());
            try {
                bitacora.mostrar();
            } catch (IOException ex) {
                // Logger.getLogger(Formulario_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            bitacora.limpiar();

        }
    }//GEN-LAST:event_btn_igualActionPerformed

    private void Submenu_HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submenu_HistorialActionPerformed
        // TODO add your handling code here:
        Formulario_historial historial = new Formulario_historial();
        historial.setVisible(true);
    }//GEN-LAST:event_Submenu_HistorialActionPerformed

    private void Menu_ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_ayudaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_Menu_ayudaActionPerformed

    private void Menu_ayudaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Menu_ayudaStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_Menu_ayudaStateChanged

    private void Menu_ayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_ayudaMouseClicked
        // TODO add your handling code here:
        Formulario_Ayuda ayuda = new Formulario_Ayuda();
        ayuda.setVisible(true);
    }//GEN-LAST:event_Menu_ayudaMouseClicked

    public static boolean Punto(String cadena) {

        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.substring(i, i + 1).equals(".")) {

                resultado = true;
                break;
            }
        }

        return resultado;
    }

    public static String Calculo(String n1, String signo, String n2) {

        Double total = 0.0;
        String resultado;

        if (signo.equals("/")) {

            total = Double.parseDouble(n1) / Double.parseDouble(n2);
        }

        if (signo.equals("*")) {

            total = Double.parseDouble(n1) * Double.parseDouble(n2);
        }

        if (signo.equals("-")) {

            total = Double.parseDouble(n1) - Double.parseDouble(n2);
        }

        if (signo.equals("+")) {

            total = Double.parseDouble(n1) + Double.parseDouble(n2);
        }

        resultado = total.toString();
        return resultado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_ayuda;
    private javax.swing.JMenu Menu_opciones;
    private javax.swing.JMenuItem Submenu_Historial;
    private javax.swing.JMenuItem Submenu_Nuevo;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_dividir;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_mas;
    private javax.swing.JButton btn_menos;
    private javax.swing.JButton btn_por;
    private javax.swing.JButton btn_punto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_datos;
    // End of variables declaration//GEN-END:variables
}
