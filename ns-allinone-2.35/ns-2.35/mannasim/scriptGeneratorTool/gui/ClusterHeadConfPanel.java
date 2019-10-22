/*
 * ClusterHeadConfPanel.java
 *
 * Created on 25 de Novembro de 2005, 10:59
 */

package gui;

/**
 *
 * @author  Helen Peters
 */
public class ClusterHeadConfPanel extends javax.swing.JPanel {

    /** Creates new form ClusterHeadConfPanel */
    public ClusterHeadConfPanel() {
        initComponents();
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        clusterHeadApplicationComboBox = new javax.swing.JComboBox();
        clusterHeadNumberLabel = new javax.swing.JLabel();
        clusterHeadNumberTextField = new javax.swing.JTextField();
        clusterHeadLocationLabel = new javax.swing.JLabel();
        clusterHeadEnergyLabel = new javax.swing.JLabel();
        clusterHeadEnergyTextField = new javax.swing.JTextField();
        joulesLabel = new javax.swing.JLabel();
        clusterHeadApplicationLabel = new javax.swing.JLabel();
        clusterHeadLocationComboBox = new javax.swing.JComboBox();
        clusterHeadPtLabel = new javax.swing.JLabel();
        clusterHeadDissTypeLabel = new javax.swing.JLabel();
        clusterHeadDissTypeComboBox = new javax.swing.JComboBox();
        secondsLabel = new javax.swing.JLabel();
        clusterHeadDissIntervalTextField = new javax.swing.JTextField();
        clusterHeadDissIntervalLabel = new javax.swing.JLabel();
        clusterHeadApplicationLabel1 = new javax.swing.JLabel();
        clusterHeadProcessingComboBox = new javax.swing.JComboBox();
        clusterHeadTransmissionRangeTextField = new javax.swing.JTextField();
        secondsLabel1 = new javax.swing.JLabel();

        setLayout(null);

        setBackground(new java.awt.Color(240, 238, 231));
        clusterHeadApplicationComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadApplicationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Application/ClusterHeadApplication" }));
        clusterHeadApplicationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadApplicationComboBoxActionPerformed(evt);
            }
        });

        add(clusterHeadApplicationComboBox);
        clusterHeadApplicationComboBox.setBounds(210, 140, 270, 22);

        clusterHeadNumberLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadNumberLabel.setText("CLUSTER HEAD NUMBER: ");
        add(clusterHeadNumberLabel);
        clusterHeadNumberLabel.setBounds(20, 20, 128, 14);

        clusterHeadNumberTextField.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadNumberTextField.setText("0");
        clusterHeadNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadNumberTextFieldActionPerformed(evt);
            }
        });
        clusterHeadNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clusterHeadNumberTextFieldFocusLost(evt);
            }
        });

        add(clusterHeadNumberTextField);
        clusterHeadNumberTextField.setBounds(210, 20, 270, 19);

        clusterHeadLocationLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadLocationLabel.setText("CLUSTER HEAD LOCATION:");
        add(clusterHeadLocationLabel);
        clusterHeadLocationLabel.setBounds(20, 60, 135, 14);

        clusterHeadEnergyLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadEnergyLabel.setText("INITIAL ENERGY:");
        add(clusterHeadEnergyLabel);
        clusterHeadEnergyLabel.setBounds(20, 100, 81, 14);

        clusterHeadEnergyTextField.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadEnergyTextField.setText("1000");
        clusterHeadEnergyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadEnergyTextFieldActionPerformed(evt);
            }
        });
        clusterHeadEnergyTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clusterHeadEnergyTextFieldFocusLost(evt);
            }
        });

        add(clusterHeadEnergyTextField);
        clusterHeadEnergyTextField.setBounds(210, 100, 220, 19);

        joulesLabel.setFont(new java.awt.Font("Arial", 0, 11));
        joulesLabel.setText("Joules");
        add(joulesLabel);
        joulesLabel.setBounds(450, 100, 31, 20);

        clusterHeadApplicationLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadApplicationLabel.setText("CLUSTER HEAD APPLICATION:");
        add(clusterHeadApplicationLabel);
        clusterHeadApplicationLabel.setBounds(20, 140, 149, 14);

        clusterHeadLocationComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadLocationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RANDOM", "GRID" }));
        clusterHeadLocationComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadLocationComboBoxActionPerformed(evt);
            }
        });

        add(clusterHeadLocationComboBox);
        clusterHeadLocationComboBox.setBounds(210, 60, 270, 22);

        clusterHeadPtLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadPtLabel.setText("TRANSMISSION RANGE:");
        add(clusterHeadPtLabel);
        clusterHeadPtLabel.setBounds(20, 220, 118, 14);

        clusterHeadDissTypeLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadDissTypeLabel.setText("DISSEMINATION TYPE: ");
        add(clusterHeadDissTypeLabel);
        clusterHeadDissTypeLabel.setBounds(20, 260, 112, 14);

        clusterHeadDissTypeComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadDissTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Continuous", "Programmed", "On Demand" }));
        clusterHeadDissTypeComboBox.setSelectedIndex(1);
        clusterHeadDissTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadDissTypeComboBoxActionPerformed(evt);
            }
        });

        add(clusterHeadDissTypeComboBox);
        clusterHeadDissTypeComboBox.setBounds(210, 260, 270, 22);

        secondsLabel.setFont(new java.awt.Font("Arial", 0, 11));
        secondsLabel.setText("seconds");
        add(secondsLabel);
        secondsLabel.setBounds(440, 300, 42, 20);

        clusterHeadDissIntervalTextField.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadDissIntervalTextField.setText("20");
        clusterHeadDissIntervalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadDissIntervalTextFieldActionPerformed(evt);
            }
        });
        clusterHeadDissIntervalTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clusterHeadDissIntervalTextFieldFocusLost(evt);
            }
        });

        add(clusterHeadDissIntervalTextField);
        clusterHeadDissIntervalTextField.setBounds(210, 300, 220, 19);

        clusterHeadDissIntervalLabel.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadDissIntervalLabel.setText("DISSEMINATION INTERVAL:");
        add(clusterHeadDissIntervalLabel);
        clusterHeadDissIntervalLabel.setBounds(20, 300, 133, 14);

        clusterHeadApplicationLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadApplicationLabel1.setText("PROCESSING TYPE:");
        add(clusterHeadApplicationLabel1);
        clusterHeadApplicationLabel1.setBounds(20, 180, 97, 14);

        clusterHeadProcessingComboBox.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadProcessingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Processing/AggregateProcessing" }));
        clusterHeadProcessingComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadProcessingComboBoxActionPerformed(evt);
            }
        });

        add(clusterHeadProcessingComboBox);
        clusterHeadProcessingComboBox.setBounds(210, 180, 270, 22);

        clusterHeadTransmissionRangeTextField.setFont(new java.awt.Font("Arial", 0, 11));
        clusterHeadTransmissionRangeTextField.setText("70");
        clusterHeadTransmissionRangeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clusterHeadTransmissionRangeTextFieldActionPerformed(evt);
            }
        });
        clusterHeadTransmissionRangeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                clusterHeadTransmissionRangeTextFieldFocusLost(evt);
            }
        });

        add(clusterHeadTransmissionRangeTextField);
        clusterHeadTransmissionRangeTextField.setBounds(210, 220, 220, 19);

        secondsLabel1.setFont(new java.awt.Font("Arial", 0, 11));
        secondsLabel1.setText("meters");
        add(secondsLabel1);
        secondsLabel1.setBounds(450, 220, 33, 20);

    }// </editor-fold>//GEN-END:initComponents

    private void clusterHeadDissIntervalTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clusterHeadDissIntervalTextFieldFocusLost
          javax.swing.JTextField textField = (javax.swing.JTextField) evt.getSource();
          String content = textField.getText();
          if (content.length() != 0) {
            try {
              double aux = Double.parseDouble(content);
              MainFrame.getTcl().setClusterHeadDissInterval(aux);
            } catch (NumberFormatException nfe) {
              textField.requestFocus();
            }
          }
    }//GEN-LAST:event_clusterHeadDissIntervalTextFieldFocusLost

    private void clusterHeadTransmissionRangeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clusterHeadTransmissionRangeTextFieldFocusLost
          javax.swing.JTextField textField = (javax.swing.JTextField) evt.getSource();
          String content = textField.getText();
          if (content.length() != 0) {
            try {
              double aux = Double.parseDouble(content);
              MainFrame.getTcl().setClusterHeadTransmissionRange(aux);
            } catch (NumberFormatException nfe) {
              textField.requestFocus();
            }
          }
    }//GEN-LAST:event_clusterHeadTransmissionRangeTextFieldFocusLost

    private void clusterHeadEnergyTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clusterHeadEnergyTextFieldFocusLost
          javax.swing.JTextField textField = (javax.swing.JTextField) evt.getSource();
          String content = textField.getText();
          if (content.length() != 0) {
            try {
              double aux = Double.parseDouble(content);
              MainFrame.getTcl().setClusterHeadEnergy(aux);
            } catch (NumberFormatException nfe) {
              textField.requestFocus();
            }
          }
    }//GEN-LAST:event_clusterHeadEnergyTextFieldFocusLost

    private void clusterHeadNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clusterHeadNumberTextFieldFocusLost
          javax.swing.JTextField textField = (javax.swing.JTextField) evt.getSource();
          String content = textField.getText();
          if (content.length() != 0) {
            try {
              int aux = Integer.parseInt(content);
              MainFrame.getTcl().setClusterHeadNumber(aux);
            } catch (NumberFormatException nfe) {
              textField.requestFocus();
            }
          }
    }//GEN-LAST:event_clusterHeadNumberTextFieldFocusLost

    private void clusterHeadNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadNumberTextFieldActionPerformed

        int aux = 0;
        String s = clusterHeadNumberTextField.getText();
        if (s.length() != 0) {
            try {
                aux = Integer.parseInt(s);
                MainFrame.getTcl().setClusterHeadNumber(aux);
            } catch (NumberFormatException nfe) {
                getToolkit().beep();
                clusterHeadNumberTextField.requestFocus();
            }
        }        
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadNumberTextFieldActionPerformed

    private void clusterHeadLocationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadLocationComboBoxActionPerformed

        MainFrame.getTcl().setClusterHeadLocation((String)clusterHeadLocationComboBox.getSelectedItem());
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadLocationComboBoxActionPerformed

    private void clusterHeadEnergyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadEnergyTextFieldActionPerformed

        double aux = 0;
        String s = clusterHeadEnergyTextField.getText();
        if (s.length() != 0) {
            try {
                aux = Double.parseDouble(s);
                MainFrame.getTcl().setClusterHeadEnergy(aux);
            } catch (NumberFormatException nfe) {
                getToolkit().beep();
                clusterHeadEnergyTextField.requestFocus();
            }
        }        
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadEnergyTextFieldActionPerformed

    private void clusterHeadApplicationComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadApplicationComboBoxActionPerformed

        MainFrame.getTcl().setClusterHeadApplication((String)clusterHeadApplicationComboBox.getSelectedItem());
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadApplicationComboBoxActionPerformed

    private void clusterHeadProcessingComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadProcessingComboBoxActionPerformed

        MainFrame.getTcl().setClusterHeadProcessingType((String)clusterHeadProcessingComboBox.getSelectedItem());
        MainFrame.setXMLSaved(false);       
    }//GEN-LAST:event_clusterHeadProcessingComboBoxActionPerformed

    private void clusterHeadTransmissionRangeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadTransmissionRangeTextFieldActionPerformed

        double aux = 0;
        String s = clusterHeadTransmissionRangeTextField.getText();
        if (s.length() != 0) {
            try {
                aux = Double.parseDouble(s);
                MainFrame.getTcl().setClusterHeadTransmissionRange(aux);
            } catch (NumberFormatException nfe) {
                getToolkit().beep();
                clusterHeadTransmissionRangeTextField.requestFocus();
            }
        }            
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadTransmissionRangeTextFieldActionPerformed

    private void clusterHeadDissTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadDissTypeComboBoxActionPerformed

        MainFrame.getTcl().setClusterHeadDissType((String)clusterHeadDissTypeComboBox.getSelectedItem());
        MainFrame.setXMLSaved(false);       
    }//GEN-LAST:event_clusterHeadDissTypeComboBoxActionPerformed

    private void clusterHeadDissIntervalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clusterHeadDissIntervalTextFieldActionPerformed

        double aux = 0;
        String s = clusterHeadDissIntervalTextField.getText();
        if (s.length() != 0) {
            try {
                aux = Double.parseDouble(s);
                MainFrame.getTcl().setClusterHeadDissInterval(aux);
            } catch (NumberFormatException nfe) {
                getToolkit().beep();
                clusterHeadDissIntervalTextField.requestFocus();
            }
        }    
        MainFrame.setXMLSaved(false);
    }//GEN-LAST:event_clusterHeadDissIntervalTextFieldActionPerformed

    

    
    
    private void setClusterHeadLocationComboBox(String s) {
        clusterHeadLocationComboBox.addItem(s);
        clusterHeadLocationComboBox.setSelectedItem(s);
    }

    private void setClusterHeadNumberTextField(String s) {
        clusterHeadNumberTextField.setText(s);
    }

    private void setClusterHeadEnergyTextField(String s) {
        clusterHeadEnergyTextField.setText(s);
    }

    private void setClusterHeadApplicationComboBox(String s) {
        clusterHeadApplicationComboBox.addItem(s);
        clusterHeadApplicationComboBox.setSelectedItem(s);
    }

    private void setClusterHeadProcessingComboBox(String s) {
        clusterHeadProcessingComboBox.addItem(s);
        clusterHeadProcessingComboBox.setSelectedItem(s);
    }

    private void setClusterHeadTransmissionRangeTextField(String s) {
        clusterHeadTransmissionRangeTextField.setText(s);
    }

    private void setClusterHeadDissTypeComboBox(String s) {
        clusterHeadDissTypeComboBox.addItem(s);
        clusterHeadDissTypeComboBox.setSelectedItem(s);
    }

    private void setClusterHeadDissIntervalTextField(String s) {
        clusterHeadDissIntervalTextField.setText(s);
    }    
    

    public void updateFields(TclFields tcl){
        setClusterHeadLocationComboBox(tcl.getClusterHeadLocation());
        setClusterHeadNumberTextField(String.valueOf(tcl.getClusterHeadNumber()));  
        setClusterHeadEnergyTextField(String.valueOf(tcl.getClusterHeadEnergy())); 
        setClusterHeadApplicationComboBox(tcl.getClusterHeadApplication()); 
        setClusterHeadProcessingComboBox(tcl.getClusterHeadProcessingType()); 
        setClusterHeadTransmissionRangeTextField(String.valueOf(tcl.getClusterHeadTransmissionRange())); 
        setClusterHeadDissTypeComboBox(tcl.getClusterHeadDissType()); 
        setClusterHeadDissIntervalTextField(String.valueOf(tcl.getClusterHeadDissInterval()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox clusterHeadApplicationComboBox;
    private javax.swing.JLabel clusterHeadApplicationLabel;
    private javax.swing.JLabel clusterHeadApplicationLabel1;
    private javax.swing.JLabel clusterHeadDissIntervalLabel;
    private javax.swing.JTextField clusterHeadDissIntervalTextField;
    private javax.swing.JComboBox clusterHeadDissTypeComboBox;
    private javax.swing.JLabel clusterHeadDissTypeLabel;
    private javax.swing.JLabel clusterHeadEnergyLabel;
    private javax.swing.JTextField clusterHeadEnergyTextField;
    private javax.swing.JComboBox clusterHeadLocationComboBox;
    private javax.swing.JLabel clusterHeadLocationLabel;
    private javax.swing.JLabel clusterHeadNumberLabel;
    private javax.swing.JTextField clusterHeadNumberTextField;
    private javax.swing.JComboBox clusterHeadProcessingComboBox;
    private javax.swing.JLabel clusterHeadPtLabel;
    private javax.swing.JTextField clusterHeadTransmissionRangeTextField;
    private javax.swing.JLabel joulesLabel;
    private javax.swing.JLabel secondsLabel;
    private javax.swing.JLabel secondsLabel1;
    // End of variables declaration//GEN-END:variables

}
