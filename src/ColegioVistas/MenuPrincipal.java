/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColegioVistas;

import ColegioClases.Alumno;
import ColegioClases.Materia;
import java.util.HashSet;

/**
 *
 * @author Barbara
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private HashSet<Alumno> alumnos = new HashSet<>();
    private HashSet<Materia> materias = new HashSet<>();

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.alumnos = alumnos;
        this.materias = materias;
        this.getContentPane().setSize(500, 500);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jAlumno = new javax.swing.JMenu();
        jFormularioAlumno = new javax.swing.JMenuItem();
        jMateria = new javax.swing.JMenu();
        jFormularioMateria = new javax.swing.JMenuItem();
        jInscripcion = new javax.swing.JMenu();
        jFormularioInscripcion = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jSalida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 204, 204));
        escritorio.setPreferredSize(new java.awt.Dimension(400, 350));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        jAlumno.setText("Alumno");

        jFormularioAlumno.setText("Formulario Alumno");
        jFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioAlumnoActionPerformed(evt);
            }
        });
        jAlumno.add(jFormularioAlumno);

        jMenuBar1.add(jAlumno);

        jMateria.setText("Materia");

        jFormularioMateria.setText("Formulario Materia");
        jFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioMateriaActionPerformed(evt);
            }
        });
        jMateria.add(jFormularioMateria);

        jMenuBar1.add(jMateria);

        jInscripcion.setText("Inscripcion");

        jFormularioInscripcion.setText("Formulario Inscripcion");
        jFormularioInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormularioInscripcionActionPerformed(evt);
            }
        });
        jInscripcion.add(jFormularioInscripcion);

        jMenuBar1.add(jInscripcion);

        jSalir.setText("Salir");

        jSalida.setText("Salida");
        jSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalidaActionPerformed(evt);
            }
        });
        jSalir.add(jSalida);

        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioAlumnoActionPerformed
        escritorio.removeAll();
        FormularioAlumno agregar = new FormularioAlumno(alumnos);
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);        // TODO add your handling code here:
    }//GEN-LAST:event_jFormularioAlumnoActionPerformed

    private void jFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        FormularioMateria agregar = new FormularioMateria(materias);
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }//GEN-LAST:event_jFormularioMateriaActionPerformed

    private void jFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormularioInscripcionActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        FormularioInscripcion agregar = new FormularioInscripcion(alumnos, materias);
        agregar.setVisible(true);
        escritorio.add(agregar);
        escritorio.repaint();
        escritorio.moveToFront(agregar);
    }//GEN-LAST:event_jFormularioInscripcionActionPerformed

    private void jSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSalidaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jAlumno;
    private javax.swing.JMenuItem jFormularioAlumno;
    private javax.swing.JMenuItem jFormularioInscripcion;
    private javax.swing.JMenuItem jFormularioMateria;
    private javax.swing.JMenu jInscripcion;
    private javax.swing.JMenu jMateria;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jSalida;
    private javax.swing.JMenu jSalir;
    // End of variables declaration//GEN-END:variables
}
