package archivo.proyectofinal;

import javax.swing.JOptionPane;

public class Registro {
    String dni, contraseña;
    String DniC,ContraseñaC;
    public Registro(String dni, String contraseña ) {
        this.dni = dni;
        this.contraseña = contraseña;
        DniC = RegistroMain.Dni;
        ContraseñaC= RegistroMain.Clave;
    }

    public void continuar(){
        if((10==dni.length()) && contraseña.length()>=8) {
            JOptionPane.showMessageDialog(null, "Sus datos se registraron perfectamente\nDni: " + dni + "\nClave: " + contraseña,
                "Registro Completado",
                JOptionPane.INFORMATION_MESSAGE);
            Login login = new Login();
            login.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR CUMPLA CON LOS REQUISITOS", "ERROR", 0);
            RegistroMain registro = new RegistroMain();
            registro.setVisible(true);
        }
    }

    public void continuar2(){
        if(DniC.equals(dni) &&ContraseñaC.equals(contraseña)){
        MainPrincipal entrar= new MainPrincipal();
        entrar.setVisible(true);
        }
        else{
        JOptionPane.showMessageDialog(null, "Usuiario no encontrado", "ERROR", 0);
        Login repetir= new Login();
        repetir.setVisible(true);
        }

    }

    }

