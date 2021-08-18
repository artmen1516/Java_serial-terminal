/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.formdev.flatlaf.FlatDarkLaf;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;   
import com.fazecast.jSerialComm.SerialPort;
import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.io.OutputStream;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Terminal extends javax.swing.JFrame {

    SerialPort SerialPort1;
    OutputStream outputStream1;
    /**
     * Creates new form Terminal
     */
    public Terminal() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_allData = new javax.swing.JTextArea();
        jTextField_sendData = new javax.swing.JTextField();
        jButton_send = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_comPort = new javax.swing.JComboBox<>();
        jComboBox_baudRate = new javax.swing.JComboBox<>();
        jComboBox_parity = new javax.swing.JComboBox<>();
        jComboBox_dataBits = new javax.swing.JComboBox<>();
        jComboBox_stopBits = new javax.swing.JComboBox<>();
        jToggleButton_open = new javax.swing.JToggleButton();
        jLabel_appOpenedDT = new javax.swing.JLabel();
        jLabel_currentPort = new javax.swing.JLabel();
        jTextField_stx = new javax.swing.JTextField();
        jTextField_etx = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SerialPort Terminal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea_allData.setEditable(false);
        jTextArea_allData.setColumns(20);
        jTextArea_allData.setRows(5);
        jScrollPane1.setViewportView(jTextArea_allData);

        jTextField_sendData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_sendDataActionPerformed(evt);
            }
        });

        jButton_send.setText("Send");
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jLabel3.setText("Send data:");

        jLabel4.setText("COM Port:");

        jLabel5.setText("Baud Rate:");

        jLabel6.setText("Parity:");

        jLabel7.setText("Data bits:");

        jLabel8.setText("Stop bits:");

        jComboBox_comPort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "        " }));
        jComboBox_comPort.setSelectedIndex(-1);
        jComboBox_comPort.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox_comPortPopupMenuWillBecomeVisible(evt);
            }
        });
        jComboBox_comPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_comPortActionPerformed(evt);
            }
        });

        jComboBox_baudRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1200", "2400", "4800", "9600", "19200", "38400", "57600", "115200" }));
        jComboBox_baudRate.setSelectedIndex(3);

        jComboBox_parity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE_PARITY", "ODD_PARITY", "EVEN_PARITY", "MARK_PARITY", "SPACE_PARITY" }));

        jComboBox_dataBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9" }));
        jComboBox_dataBits.setSelectedIndex(1);

        jComboBox_stopBits.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        jComboBox_stopBits.setSelectedIndex(1);

        jToggleButton_open.setText("Open");
        jToggleButton_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_openActionPerformed(evt);
            }
        });

        jLabel_currentPort.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTextField_stx.setText("02");
        jTextField_stx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_stxActionPerformed(evt);
            }
        });

        jTextField_etx.setText("03");
        jTextField_etx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_etxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(32, 32, 32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_comPort, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jToggleButton_open, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_send, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jTextField_sendData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_stx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField_etx))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox_baudRate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox_parity, 0, 102, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addGap(25, 25, 25)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBox_stopBits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_appOpenedDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_currentPort, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_appOpenedDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_currentPort, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_sendData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_stx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_etx, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_clear)
                    .addComponent(jButton_send)
                    .addComponent(jToggleButton_open))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox_stopBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_dataBits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_parity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_baudRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_comPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_sendDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_sendDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_sendDataActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        // TODO add your handling code here:
        outputStream1 = SerialPort1.getOutputStream();
        String dataToSend;
        
        dataToSend = jTextField_stx.getText()+jTextField_sendData.getText()+jTextField_etx.getText();

        try{
            outputStream1.write(jTextField_stx);
            outputStream1.write(dataToSend.getBytes());
        }
        catch(IOException c){
            JOptionPane.showMessageDialog(this,c,"ERROR",ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton_sendActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButton_send.setEnabled(false);
        jTextField_sendData.setEnabled(false);
        jTextField_stx.setEnabled(false);
        jTextField_etx.setEnabled(false);
        //jComboBox_endOfLine.setEnabled(false);
        jButton_clear.setEnabled(false);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel_appOpenedDT.setText("Application started at " + dtf.format(now) + "\r\n");
        
        
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox_comPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_comPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_comPortActionPerformed

    private void jComboBox_comPortPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox_comPortPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        jComboBox_comPort.removeAllItems();
        SerialPort []portList = SerialPort.getCommPorts();
        for (SerialPort port : portList) {
            jComboBox_comPort.addItem(port.getSystemPortName());
        }
    }//GEN-LAST:event_jComboBox_comPortPopupMenuWillBecomeVisible

    private void jToggleButton_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_openActionPerformed
        // TODO add your handling code here:
        if(jToggleButton_open.isSelected() == true){
            try{
                SerialPort []portlist = SerialPort.getCommPorts();
                SerialPort1 = portlist[jComboBox_comPort.getSelectedIndex()];
                SerialPort1.setBaudRate(Integer.parseInt(jComboBox_baudRate.getSelectedItem().toString()));
                SerialPort1.setParity(jComboBox_parity.getSelectedIndex());
                SerialPort1.setNumDataBits(Integer.parseInt(jComboBox_dataBits.getSelectedItem().toString()));
                SerialPort1.setNumStopBits(Integer.parseInt(jComboBox_stopBits.getSelectedItem().toString()));
                SerialPort1.openPort();
                
                if(SerialPort1.isOpen()){
                    jButton_send.setEnabled(true);
                    jTextField_sendData.setEnabled(true);
                    jTextField_stx.setEnabled(true);
                    jTextField_etx.setEnabled(true);
                    //jComboBox_endOfLine.setEnabled(true);
                    jButton_clear.setEnabled(true);
                    
                    jComboBox_comPort.setEnabled(false);
                    jComboBox_baudRate.setEnabled(false);
                    jComboBox_parity.setEnabled(false);
                    jComboBox_dataBits.setEnabled(false);
                    jComboBox_stopBits.setEnabled(false);
                    jToggleButton_open.setText("Close");
                    jLabel_currentPort.setText(jComboBox_comPort.getSelectedItem().toString() + " Opened ");
                    jLabel_currentPort.setForeground(Color.red);
                }
                else{
                    JOptionPane.showMessageDialog(this,"ERROR TO OPEN " + jComboBox_comPort.getSelectedItem().toString(),"ERROR",ERROR_MESSAGE);
                    jToggleButton_open.setSelected(false);
                }
            }
            catch(ArrayIndexOutOfBoundsException a){
                JOptionPane.showMessageDialog(this,"SELECT A COM PORT!","ERROR",ERROR_MESSAGE);
                jToggleButton_open.setSelected(false);
            }
            catch(Exception b){
                JOptionPane.showMessageDialog(this,b,"ERROR",ERROR_MESSAGE);
                jToggleButton_open.setSelected(false);
            }
        } 
        else if(jToggleButton_open.isSelected() == false){
            SerialPort1.closePort();
            jButton_send.setEnabled(false);
            jTextField_sendData.setEnabled(false);
            jTextField_stx.setEnabled(false);
            jTextField_etx.setEnabled(false);
            //jComboBox_endOfLine.setEnabled(false);
            jButton_clear.setEnabled(false);
        
            jComboBox_comPort.setEnabled(true);
            jComboBox_baudRate.setEnabled(true);
            jComboBox_parity.setEnabled(true);
            jComboBox_dataBits.setEnabled(true);
            jComboBox_stopBits.setEnabled(true);
            jToggleButton_open.setText("Open");
            jLabel_currentPort.setText("");
        }
    }//GEN-LAST:event_jToggleButton_openActionPerformed

    private void jTextField_stxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_stxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stxActionPerformed

    private void jTextField_etxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_etxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_etxActionPerformed

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
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Terminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Terminal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_send;
    private javax.swing.JComboBox<String> jComboBox_baudRate;
    private javax.swing.JComboBox<String> jComboBox_comPort;
    private javax.swing.JComboBox<String> jComboBox_dataBits;
    private javax.swing.JComboBox<String> jComboBox_parity;
    private javax.swing.JComboBox<String> jComboBox_stopBits;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_appOpenedDT;
    private javax.swing.JLabel jLabel_currentPort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_allData;
    private javax.swing.JTextField jTextField_etx;
    private javax.swing.JTextField jTextField_sendData;
    private javax.swing.JTextField jTextField_stx;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton_open;
    // End of variables declaration//GEN-END:variables
}