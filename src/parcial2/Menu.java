/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    String jugadores[][] = new String[100][10];
    int contador = 0;

    int contadorGuardarArchivos = 0;
    int contadorCargarArchivos = 0;
    String rutaFiles = System.getProperty("user.dir")+"\\";

    //Datos del jugador en las posiciones de la matriz 
    //[0] -> Numero de documento
    //[1] -> Nombre
    //[2] -> Edad
    //[3] -> Salario
    //[4] -> Posición
    //[5] -> Minutos jugados
    //[6] -> Goles anotados
    //[7] -> Bonificacion tiempo de juego
    //[8] -> Bonificacion goles anotados
    //[9] -> Total a pagar
    /**
     * Creates new form menu
     */
    public Menu() {
        initComponents();
    }

    public void cargarInfo(String[][] jugadores, int contador) {
        this.jugadores = jugadores;
        this.contador = contador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU PRINCIPAL ");

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Registrar Jugador");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarJugadorAction(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Gestionar Info Jugador");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarJugadorAction(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Consultar Jugador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarJugadorAction(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitAction(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAction(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setText("Cargar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadAction(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gestionarJugadorAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarJugadorAction
        // TODO add your handling code here:
        GestionarJugador gestionarJugador = new GestionarJugador();
        gestionarJugador.cargarInfo(jugadores, contador);
        this.setVisible(false);
        gestionarJugador.setVisible(true);
    }//GEN-LAST:event_gestionarJugadorAction

    private void registrarJugadorAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarJugadorAction
        RegistrarJugador registrarJugador = new RegistrarJugador();
        registrarJugador.cargarInfo(jugadores, contador);
        this.setVisible(false);
        registrarJugador.setVisible(true);
    }//GEN-LAST:event_registrarJugadorAction

    private void consultarJugadorAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarJugadorAction
        // TODO add your handling code here:
        ConsultarJugador consultarJugador = new ConsultarJugador();
        consultarJugador.cargarInfo(jugadores, contador);
        this.setVisible(false);
        consultarJugador.setVisible(true);
    }//GEN-LAST:event_consultarJugadorAction

    private void exitAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitAction
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitAction

    private void saveAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAction
        // TODO add your handling code here:
        if (contador > 0) {
            guardar();
        } else {
            JOptionPane.showMessageDialog(null, "No hay jugadores registrados");
        }
    }//GEN-LAST:event_saveAction

    private void loadAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadAction
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_loadAction

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    public void guardar() {

        //GUARDA JUGADORES 
        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            fichero = new FileWriter(rutaFiles + "jugadores.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < 5; j++) {
                    pw.println(jugadores[i][j]);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                    contadorGuardarArchivos = contadorGuardarArchivos + 1;

                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        //GUARDA INFORMACION JUGADORES
        fichero = null;
        pw = null;
        try {
            fichero = new FileWriter(rutaFiles + "informacion.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < contador; i++) {
                for (int j = 5; j < 7; j++) {
                    pw.println(jugadores[i][j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                    contadorGuardarArchivos = contadorGuardarArchivos + 1;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        //GUARDA NOMINAS
        fichero = null;
        pw = null;
        try {
            fichero = new FileWriter(rutaFiles + "nomina.txt");
            pw = new PrintWriter(fichero);
            for (int i = 0; i < contador; i++) {
                for (int j = 7; j < 10; j++) {
                    pw.println(jugadores[i][j]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fichero != null) {
                    fichero.close();
                    contadorGuardarArchivos = contadorGuardarArchivos + 1;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        if (contadorGuardarArchivos == 3) {
            JOptionPane.showMessageDialog(null, "Archivos generados satisfactoriamente");
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un problema al generar los archivos");
        }

    }

    private void loadData() {

    

        List<String> jugadoresList = new ArrayList<String>();
        List<String> informacionList = new ArrayList<String>();
        List<String> nominaList = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(rutaFiles + "jugadores.txt"));
            while (sc.hasNextLine()) {
                jugadoresList.add(sc.nextLine());
            }

            sc = new Scanner(new File(rutaFiles + "informacion.txt"));

            while (sc.hasNextLine()) {
                informacionList.add(sc.nextLine());
            }

            sc = new Scanner(new File(rutaFiles + "nomina.txt"));
            while (sc.hasNextLine()) {
                nominaList.add(sc.nextLine());
            }

            contador = jugadoresList.size() / 5;
            int contadorPos = 0;
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < 5; j++) {
                    jugadores[i][j] = jugadoresList.get(j + contadorPos);
                }
                contadorPos = contadorPos + 5;
            }

            int contadorPos2 = 0;
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < 2; j++) {
                    jugadores[i][j+5] = informacionList.get(j + contadorPos2);
                }
                contadorPos2 = contadorPos2 + 2;
            }
            
            int contadorPos3 = 0;
            for (int i = 0; i < contador; i++) {
                for (int j = 0; j < 3; j++) {
                    jugadores[i][j+7] = nominaList.get(j + contadorPos3);
                }
                contadorPos3 = contadorPos3 + 3;
            }

            JOptionPane.showMessageDialog(null, "Archivos cargados satisfactoriamente");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Archivos no encontrados");
        }
        
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
