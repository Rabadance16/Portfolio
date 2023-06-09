/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package psp.filezillaftp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
/**
 *
 * @author Álvaro
 */
public class JFrame extends javax.swing.JFrame {

/*
    Cambio para GIT
    */
    public JFrame() {
        initComponents();
        //Añadimos el logo de FileZilla a la ventana
        ImageIcon icon = new ImageIcon("img/FileZillaicon.jpg");
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelServidor = new javax.swing.JLabel();
        jTextFieldS = new javax.swing.JTextField();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldU = new javax.swing.JTextField();
        jLabelC = new javax.swing.JLabel();
        jTextFieldP = new javax.swing.JTextField();
        jButtonConexion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemArchivo = new javax.swing.JMenuItem();
        jMenuItemFoto = new javax.swing.JMenuItem();
        jMenuItemDirectorio = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemNombre = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemDelete = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FileZilla");

        jLabelServidor.setText("Servidor:");

        jTextFieldS.setText("localhost");

        jLabelUsuario.setText("Usuario:");

        jLabelC.setText("Contraseña:");

        jTextFieldP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPActionPerformed(evt);
            }
        });

        jButtonConexion.setText("Conexión");
        jButtonConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConexionActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("INFORMACIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabelServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldS, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabelUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabelC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConexion)
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServidor)
                    .addComponent(jTextFieldS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario)
                    .addComponent(jTextFieldU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelC)
                    .addComponent(jTextFieldP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConexion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCerrar)
                        .addGap(299, 299, 299))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("Archivo");

        jMenuItemArchivo.setText("Subir Fichero");
        jMenuItemArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemArchivo);

        jMenuItemFoto.setText("Subir Foto");
        jMenuItemFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFotoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemFoto);

        jMenuItemDirectorio.setText("Crear Directorio");
        jMenuItemDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDirectorioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDirectorio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItemNombre.setText("Cambiar Nombre (Fichero)");
        jMenuItemNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemNombre);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Eliminar");

        jMenuItemDelete.setText("Borrar Archivo");
        jMenuItemDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDeleteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemDelete);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConexionActionPerformed

        try{
            // TODO add your handling code here:
            //Introducir nombre Juan para que funcione ya que habilitamos los permisos para ese nombre en el FIleZille Server
            //Recordar añadir la libreria commons-net-3.9.0 () está en descargas
            FTPClient cliente = new FTPClient();
            
            String serverFTP = "localhost";
            jTextArea.append("\nNos vamos a conectar a localhost");
         
            cliente.connect(serverFTP);
          
            jTextArea.append("\nHay un servicio FTP funcionando");
            String cReplyCode = Integer.toString(cliente.getReplyCode());
            jTextArea.append("\n" + cReplyCode);
            
            //Entrando en modo pasivo
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            
            jTextArea.append("\nNos hemos conectado como " + jTextFieldU.getText());
        }catch(IOException ex){
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            
        
    }//GEN-LAST:event_jButtonConexionActionPerformed

    private void jTextFieldPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        jTextFieldU.setText("");
        jTextFieldP.setText("");
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jMenuItemArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemArchivoActionPerformed
        try {
            // TODO add your handling code here:
            FTPClient cliente = new FTPClient();
            String serverFTP = "localhost";
            cliente.connect(serverFTP);
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            
            
            JFileChooser chooser = new JFileChooser();
            int returnVal = chooser.showOpenDialog(null);
            
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedInputStream in = new BufferedInputStream(new FileInputStream(chooser.getSelectedFile()));
                    
                    //Subida de fichero a la carpeta correspondiente en el usuario Juan del servidor
                    boolean subido;
                    subido = cliente.storeFile(chooser.getSelectedFile().getName(), in);
                    
                    if(subido){
                        jTextArea.append("\nFichero subido correctamente");
                    }else{
                        jTextArea.append("\nFichero no se ha subido");
                    }
                    in.close();
                    cliente.logout();
                    cliente.disconnect();
                } catch (IOException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemArchivoActionPerformed

    private void jMenuItemFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFotoActionPerformed

        try {
            FTPClient cliente = new FTPClient();
            String serverFTP = "localhost";
            cliente.connect(serverFTP);
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            
            //Al no tener ruta ponemos el nombre de la imagen, en caso contrario se pondria la ruta correspondiente
            String foto = JOptionPane.showInputDialog(null,"Introduce el nombre de la foto");
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(foto));
            
            //Subida de fichero a la carpeta correspondiente en el usuario Juan del servidor
            boolean subido = cliente.storeFile(foto, in);
            if(subido){
                jTextArea.append("\nFoto subido correctamente");
            }else{
                jTextArea.append("\nFoto no se ha subido");
            }
            in.close();
            cliente.logout();
            cliente.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemFotoActionPerformed

    private void jMenuItemDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDirectorioActionPerformed
        try {
            // TODO add your handling code here:
            FTPClient cliente = new FTPClient();
            String serverFTP = "localhost";
            cliente.connect(serverFTP);
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            String directorio = JOptionPane.showInputDialog(null,"Introduce el nombre del directorio");
            if(cliente.makeDirectory(directorio)){
                jTextArea.append("\nDirectorio creado correctamente");
            }else{
                jTextArea.append("\nFallo al crear el directorio");
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemDirectorioActionPerformed

    private void jMenuItemNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNombreActionPerformed
        try {
            // TODO add your handling code here:
            FTPClient cliente = new FTPClient();
            String serverFTP = "localhost";
            cliente.connect(serverFTP);
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            String nOriginal = JOptionPane.showInputDialog(null,"Introduce el nombre del Fichero");
            String nNuevo = JOptionPane.showInputDialog(null,"Introduce el nombre nuevo del fichero");
            if (cliente.rename(nOriginal,nNuevo)){
                jTextArea.append("\nFichero renombrado correctamente");
            }else{
                jTextArea.append("\nError al renombrar el fichero");
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemNombreActionPerformed

    private void jMenuItemDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDeleteActionPerformed
        try {
            // TODO add your handling code here:
            FTPClient cliente = new FTPClient();
            String serverFTP = "localhost";
            cliente.connect(serverFTP);
            cliente.enterLocalPassiveMode();
            boolean haEntrado =  cliente.login(jTextFieldU.getText(), jTextFieldP.getText());
            cliente.setFileType(FTP.BINARY_FILE_TYPE);
            String borrar = JOptionPane.showInputDialog(null,"Introduce el archivo que quiere eliminar");
       
            if(cliente.deleteFile(borrar)){
                jTextArea.append("\nFichero borrado");
            }else{
                jTextArea.append("\nFichero no borrado");
            }
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonConexion;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelServidor;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemArchivo;
    private javax.swing.JMenuItem jMenuItemDelete;
    private javax.swing.JMenuItem jMenuItemDirectorio;
    private javax.swing.JMenuItem jMenuItemFoto;
    private javax.swing.JMenuItem jMenuItemNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldP;
    private javax.swing.JTextField jTextFieldS;
    private javax.swing.JTextField jTextFieldU;
    // End of variables declaration//GEN-END:variables
}
