/*
 * SaveChangesDialog.java
 *
 * Created on 25 de Novembro de 2005, 08:54
 */

package gui;

/**
 *
 * @author  Helen Peters
 */
public class SaveChangesDialog extends javax.swing.JDialog {
    /** A return status code - returned if Cancel button has been pressed */
    public static final int RET_CANCEL = 0;
    /** A return status code - returned if No button has been pressed */
    public static final int RET_NO = 1;
    /** A return status code - returned if Yes button has been pressed */
    public static final int RET_YES = 2;

    /** Creates new form SaveChangesDialog */
    public SaveChangesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setSize(300,150);
    }

    /** @return the return status of this dialog - one of RET_OK or RET_CANCEL */
    public int getReturnStatus() {
        return returnStatus;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        saveChangesLabel = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        setTitle("MannaSim Simulator");
        setModal(true);
        setName("saveChanges");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        yesButton.setText("Yes");
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed1(evt);
            }
        });

        getContentPane().add(yesButton);
        yesButton.setBounds(20, 60, 80, 23);

        noButton.setText("No");
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });

        getContentPane().add(noButton);
        noButton.setBounds(110, 60, 80, 23);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        getContentPane().add(cancelButton);
        cancelButton.setBounds(200, 60, 80, 23);

        saveChangesLabel.setFont(new java.awt.Font("Arial", 0, 12));
        saveChangesLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Warning24.gif")));
        saveChangesLabel.setText("Save document changes?");
        getContentPane().add(saveChangesLabel);
        saveChangesLabel.setBounds(60, 20, 171, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed1
// TODO add your handling code here:
        doClose(RET_YES);
    }//GEN-LAST:event_okButtonActionPerformed1

    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        doClose(RET_NO);
    }//GEN-LAST:event_noButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel saveChangesLabel;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
