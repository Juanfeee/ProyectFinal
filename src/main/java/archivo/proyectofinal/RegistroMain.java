
package archivo.proyectofinal;

import java.awt.Color;
import javax.swing.JOptionPane;


public class RegistroMain extends javax.swing.JFrame {
    public Controller controller;// controlar
    public RegistroMain() {      
        initComponents();
        this.setLocationRelativeTo(null);  //posiciona la pagina  
        controller= new Controller(this);
        

    }
public static String Dni=""; // aqui lo que hacemos es para acceder la 
                                //informacion de este jframe para luego usarla en otra clase exterior
public static String Clave="";// aqui lo que hacemos es para acceder la 
                                //informacion de este jframe para luego usarla en otra clase exterior


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Fondo = new javax.swing.JPanel();
        JPanel1 = new javax.swing.JPanel();
        clave = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        registro = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        contenedor = new javax.swing.JPanel();
        containerbtn = new javax.swing.JPanel();
        btnguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setFont(new java.awt.Font("Dongle", 0, 12)); // NOI18N
        Fondo.setMinimumSize(new java.awt.Dimension(400, 500));
        Fondo.setPreferredSize(new java.awt.Dimension(400, 500));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel1.setBackground(new java.awt.Color(16, 192, 203));

        javax.swing.GroupLayout JPanel1Layout = new javax.swing.GroupLayout(JPanel1);
        JPanel1.setLayout(JPanel1Layout);
        JPanel1Layout.setHorizontalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        JPanel1Layout.setVerticalGroup(
            JPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Fondo.add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        clave.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        clave.setForeground(new java.awt.Color(0, 0, 0));
        clave.setText("CLAVE");
        Fondo.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 120, 20));

        dni.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.setText("DNI");
        Fondo.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 120, 20));

        txtcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtcontraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtcontraseña.setText("Ingese una contrañesa");
        txtcontraseña.setBorder(null);
        txtcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraseñaMousePressed(evt);
            }
        });
        txtcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaActionPerformed(evt);
            }
        });
        txtcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontraseñaKeyTyped(evt);
            }
        });
        Fondo.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 220, -1));

        txtdni.setBackground(new java.awt.Color(255, 255, 255));
        txtdni.setForeground(new java.awt.Color(153, 153, 153));
        txtdni.setText("Ingrese su cedula");
        txtdni.setBorder(null);
        txtdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtdniMousePressed(evt);
            }
        });
        txtdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniActionPerformed(evt);
            }
        });
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdniKeyTyped(evt);
            }
        });
        Fondo.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 220, -1));

        registro.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        registro.setForeground(new java.awt.Color(0, 0, 0));
        registro.setText("REGISTRO");
        Fondo.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 220, 10));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 220, 10));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new java.awt.GridBagLayout());

        containerbtn.setBackground(new java.awt.Color(16, 192, 203));
        containerbtn.setPreferredSize(new java.awt.Dimension(100, 25));
        containerbtn.setLayout(new java.awt.BorderLayout());

        btnguardar.setFont(new java.awt.Font("Dongle", 1, 18)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Guardar");
        btnguardar.setContentAreaFilled(false);
        btnguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnguardar.setFocusPainted(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        containerbtn.add(btnguardar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        contenedor.add(containerbtn, gridBagConstraints);

        Fondo.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 220, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        Dni= txtdni.getText();  Clave= txtcontraseña.getText();
        if(Clave.equals("Ingese una contrañesa")){
            JOptionPane.showMessageDialog(null, "ERROR CUMPLA CON LOS REQUISITOS", "ERROR", 0);
        }else{
        Registro register= new Registro(Dni, Clave);
        register.continuar();
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdniKeyTyped
        //Limitar a numeros
        char rango= evt.getKeyChar();
        if(rango<'0' || rango>'9'){
            evt.consume();}
        //Limitar a 10 digitos
        if(txtdni.getText().length()>=10){
            evt.consume();
        }

    }//GEN-LAST:event_txtdniKeyTyped

    private void txtdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniActionPerformed

    }//GEN-LAST:event_txtdniActionPerformed

    private void txtdniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdniMousePressed
        if(txtdni.getText().equals("Ingrese su cedula")){
            txtdni.setText("");
            txtdni.setForeground(Color.black);}
        if(txtcontraseña.getText().isEmpty()){
            txtcontraseña.setText("Ingese una contrañesa");
            txtcontraseña.setForeground(Color.gray);}

    }//GEN-LAST:event_txtdniMousePressed

    private void txtcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaActionPerformed

    }//GEN-LAST:event_txtcontraseñaActionPerformed

    private void txtcontraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraseñaMousePressed
        if(txtcontraseña.getText().equals("Ingese una contrañesa")){
            txtcontraseña.setText("");
            txtcontraseña.setForeground(Color.black);}
        if(txtdni.getText().isEmpty()){
            txtdni.setText("Ingrese su cedula");
            txtdni.setForeground(Color.gray);}
    }//GEN-LAST:event_txtcontraseñaMousePressed

    private void txtcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontraseñaKeyTyped

    }//GEN-LAST:event_txtcontraseñaKeyTyped
 
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel JPanel1;
    public javax.swing.JButton btnguardar;
    private javax.swing.JLabel clave;
    public javax.swing.JPanel containerbtn;
    public javax.swing.JPanel contenedor;
    private javax.swing.JLabel dni;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel registro;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtdni;
    // End of variables declaration//GEN-END:variables


}
