
package archivo.proyectofinal;

import java.awt.Color;

public class Login extends javax.swing.JFrame {
    public ControllerL controller;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); // posicionar la pagina
        controller= new ControllerL(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Fondo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Iniciar = new javax.swing.JLabel();
        txtDniL = new javax.swing.JTextField();
        txtContraseñaL = new javax.swing.JTextField();
        clave = new javax.swing.JLabel();
        dni = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        contenedor = new javax.swing.JPanel();
        containerbtn = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();
        containerbtn1 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setAlignmentX(0.0F);
        Fondo.setAlignmentY(0.0F);
        Fondo.setFont(new java.awt.Font("Dongle", 0, 12)); // NOI18N
        Fondo.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        Fondo.setMinimumSize(new java.awt.Dimension(400, 500));
        Fondo.setPreferredSize(new java.awt.Dimension(400, 500));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(16, 192, 203));
        jPanel2.setPreferredSize(new java.awt.Dimension(105, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        Iniciar.setFont(new java.awt.Font("Dongle", 1, 36)); // NOI18N
        Iniciar.setForeground(new java.awt.Color(0, 0, 0));
        Iniciar.setText("INICIAR SESION");
        Iniciar.setMaximumSize(new java.awt.Dimension(107, 53));
        Iniciar.setMinimumSize(new java.awt.Dimension(107, 53));
        Iniciar.setPreferredSize(new java.awt.Dimension(107, 53));
        Fondo.add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, -1));

        txtDniL.setBackground(new java.awt.Color(255, 255, 255));
        txtDniL.setForeground(new java.awt.Color(153, 153, 153));
        txtDniL.setText("Ingrese su cedula");
        txtDniL.setBorder(null);
        txtDniL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDniLMousePressed(evt);
            }
        });
        txtDniL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniLActionPerformed(evt);
            }
        });
        txtDniL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniLKeyTyped(evt);
            }
        });
        Fondo.add(txtDniL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 220, -1));

        txtContraseñaL.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseñaL.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseñaL.setText("Ingese una contrañesa");
        txtContraseñaL.setBorder(null);
        txtContraseñaL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaLMousePressed(evt);
            }
        });
        txtContraseñaL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaLKeyTyped(evt);
            }
        });
        Fondo.add(txtContraseñaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 220, -1));

        clave.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        clave.setForeground(new java.awt.Color(0, 0, 0));
        clave.setText("CLAVE");
        Fondo.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, 20));

        dni.setFont(new java.awt.Font("Dongle", 1, 24)); // NOI18N
        dni.setForeground(new java.awt.Color(0, 0, 0));
        dni.setText("DNI");
        Fondo.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 120, 20));

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

        btnIniciar.setFont(new java.awt.Font("Dongle", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.setMaximumSize(new java.awt.Dimension(82, 34));
        btnIniciar.setMinimumSize(new java.awt.Dimension(82, 34));
        btnIniciar.setPreferredSize(new java.awt.Dimension(82, 34));
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        containerbtn.add(btnIniciar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        contenedor.add(containerbtn, gridBagConstraints);

        containerbtn1.setBackground(new java.awt.Color(16, 192, 203));
        containerbtn1.setPreferredSize(new java.awt.Dimension(100, 25));
        containerbtn1.setLayout(new java.awt.BorderLayout());

        btnRegistrar.setFont(new java.awt.Font("Dongle", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setMaximumSize(new java.awt.Dimension(82, 34));
        btnRegistrar.setMinimumSize(new java.awt.Dimension(82, 34));
        btnRegistrar.setPreferredSize(new java.awt.Dimension(82, 34));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        containerbtn1.add(btnRegistrar, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        contenedor.add(containerbtn1, gridBagConstraints);

        Fondo.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 220, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
    String dniL= txtDniL.getText();
    String contraseñaL= txtContraseñaL.getText();
    Registro login= new Registro(dniL,contraseñaL);
    login.continuar2();
    this.setVisible(false);
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void txtDniLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniLKeyTyped
        //Limitar a numeros
        char rango= evt.getKeyChar();
        if(rango<'0' || rango>'9'){
            evt.consume();}
        //Limitar a 10 digitos
        if(txtDniL.getText().length()>=10){
            evt.consume();
        }
    }//GEN-LAST:event_txtDniLKeyTyped

    private void txtDniLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniLActionPerformed

    private void txtContraseñaLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaLKeyPressed
        if(txtContraseñaL.getText().equals("Ingese una contrañesa")){
            txtContraseñaL.setText("");
            txtContraseñaL.setForeground(Color.black);}
        if(txtDniL.getText().isEmpty()){
            txtDniL.setText("Ingrese su cedula");
            txtDniL.setForeground(Color.gray);}
    }//GEN-LAST:event_txtContraseñaLKeyPressed

    private void txtContraseñaLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaLKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaLKeyTyped

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //para mostrar u ocultar la pagina dependiendo
        RegistroMain registro= new RegistroMain();
        registro.setVisible(true);// muestra la pagina donde se registra
        this.setVisible(false);// oculta esta pagina(login)
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDniLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniLKeyPressed

    }//GEN-LAST:event_txtDniLKeyPressed

    private void txtContraseñaLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaLMousePressed
        if(txtContraseñaL.getText().equals("Ingese una contrañesa")){
            txtContraseñaL.setText("");
            txtContraseñaL.setForeground(Color.black);}
        if(txtDniL.getText().isEmpty()){
            txtDniL.setText("Ingrese su cedula");
            txtDniL.setForeground(Color.gray);}
    }//GEN-LAST:event_txtContraseñaLMousePressed

    private void txtDniLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniLMousePressed
        if(txtDniL.getText().equals("Ingrese su cedula")){
            txtDniL.setText("");
            txtDniL.setForeground(Color.black);}
        if(txtContraseñaL.getText().isEmpty()){
            txtContraseñaL.setText("Ingese una contrañesa");
            txtContraseñaL.setForeground(Color.gray);}
    }//GEN-LAST:event_txtDniLMousePressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Iniciar;
    public javax.swing.JButton btnIniciar;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel clave;
    public javax.swing.JPanel containerbtn;
    public javax.swing.JPanel containerbtn1;
    public javax.swing.JPanel contenedor;
    private javax.swing.JLabel dni;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtContraseñaL;
    private javax.swing.JTextField txtDniL;
    // End of variables declaration//GEN-END:variables
}
