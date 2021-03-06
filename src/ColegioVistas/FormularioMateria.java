/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColegioVistas;

import ColegioClases.Alumno;
import ColegioClases.Materia;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class FormularioMateria extends javax.swing.JInternalFrame {
private HashSet<Materia> materias;
    /**
     * Creates new form FormularioMateria
     */
    public FormularioMateria(HashSet<Materia> materias) {
        initComponents();
        this.materias=materias;
        this.getContentPane().setBackground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormulariodeMaterias = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jCODIGOdeMATERIA = new javax.swing.JLabel();
        jtNombreMateria = new javax.swing.JTextField();
        jNOMBREdelaMATERIA = new javax.swing.JLabel();
        jtCodigoMateria = new javax.swing.JTextField();
        jANIO = new javax.swing.JLabel();
        jtAnio = new javax.swing.JTextField();
        jGUARDAR = new javax.swing.JButton();
        jNUEVO = new javax.swing.JButton();
        jSALIR = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 153));
        setPreferredSize(new java.awt.Dimension(450, 300));

        jFormulariodeMaterias.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jFormulariodeMaterias.setText("Formulario de Materias");

        jCODIGOdeMATERIA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCODIGOdeMATERIA.setText("CODIGO DE MATERIA:");

        jNOMBREdelaMATERIA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jNOMBREdelaMATERIA.setText("NOMBRE DE LA MATERIA:");

        jANIO.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jANIO.setText("A??O AL QUE PERTENCE:");

        jGUARDAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jGUARDAR.setText("GUARDAR");
        jGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGUARDARActionPerformed(evt);
            }
        });

        jNUEVO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jNUEVO.setText("NUEVO");
        jNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNUEVOActionPerformed(evt);
            }
        });

        jSALIR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSALIR.setText("SALIR");
        jSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCODIGOdeMATERIA)
                        .addGap(30, 30, 30)
                        .addComponent(jtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jANIO)
                            .addGap(18, 18, 18)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jNOMBREdelaMATERIA)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jGUARDAR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jNUEVO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSALIR)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jFormulariodeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFormulariodeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCODIGOdeMATERIA)
                    .addComponent(jtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNOMBREdelaMATERIA)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jANIO)
                    .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGUARDAR)
                    .addComponent(jNUEVO)
                    .addComponent(jSALIR))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSALIRActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSALIRActionPerformed

    private void jNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNUEVOActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jNUEVOActionPerformed

    private void jGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGUARDARActionPerformed
        // TODO add your handling code here:
        int idMateria= Integer.parseInt(jtCodigoMateria.getText());

        String nombre = jtNombreMateria.getText();
        int anio = Integer.parseInt(jtAnio.getText());

        Materia materiaNvo = new Materia(idMateria,nombre,anio);
        materias.add(materiaNvo);
        JOptionPane.showMessageDialog(this, "Materia cargada exitosamente");
    }//GEN-LAST:event_jGUARDARActionPerformed

    private void limpiar() {

        jtCodigoMateria.setText("");
        jtNombreMateria.setText("");
        jtAnio.setText("");

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jANIO;
    private javax.swing.JLabel jCODIGOdeMATERIA;
    private javax.swing.JLabel jFormulariodeMaterias;
    private javax.swing.JButton jGUARDAR;
    private javax.swing.JLabel jNOMBREdelaMATERIA;
    private javax.swing.JButton jNUEVO;
    private javax.swing.JButton jSALIR;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigoMateria;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
