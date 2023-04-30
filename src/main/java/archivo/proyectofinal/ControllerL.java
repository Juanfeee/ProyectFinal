
package archivo.proyectofinal;

import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class ControllerL implements MouseListener {
    private final Login view;
    
    public final void events(){
    view.btnIniciar.addMouseListener(this);
    view.btnRegistrar.addMouseListener(this);
    }
    public ControllerL(Login view){
    this.view=view;
    events(); 
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//Se acciona cuando el cursor esta sobre el componente
    Object evt= e.getSource();
    if(evt.equals(view.btnIniciar)){
        cambiarfondo(view.containerbtn, new Color(11,137,145));
    }
    else if(evt.equals(view.btnRegistrar)){
        cambiarfondo(view.containerbtn1, new Color(11,137,145));
    }
    }

    @Override
    public void mouseExited(MouseEvent e) {
//Se acciona cuando el cursor sale del componente
    Object evt= e.getSource();
    if(evt.equals(view.btnIniciar)){
     cambiarfondo(view.containerbtn, new Color(16,192,203));   
    }
    else if(evt.equals(view.btnRegistrar)){
        cambiarfondo(view.containerbtn1,new Color(16,192,203));
    }
    }
private void cambiarfondo(JPanel panel,Color color){
    panel.setBackground(color);

}
    
}
