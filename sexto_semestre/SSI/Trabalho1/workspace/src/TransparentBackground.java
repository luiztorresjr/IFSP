// http://www.onjava.com/pub/a/onjava/excerpt/swinghks_hack41/index.html 

import java.awt.Dimension;   
import java.awt.Graphics;   
import java.awt.Image;   
import java.awt.Point;   
import java.awt.Rectangle;   
import java.awt.Robot;   
import java.awt.Toolkit;   
import javax.swing.JComponent;   
  
public class TransparentBackground extends JComponent{   
    private Image background;   
  
    public TransparentBackground() {   
        updateBackground();   
    }   
  
    public void updateBackground() {           
        try {   
            Robot rbt = new Robot();   
            Toolkit tk = Toolkit.getDefaultToolkit();   
            Dimension dim = tk.getScreenSize();   
            background = rbt.createScreenCapture(new Rectangle(0, 0, (int) dim   
                    .getWidth(), (int) dim.getHeight()));   
        } catch (Exception ex) {   
            ex.printStackTrace();   
        }     
    }   
  
    public void paintComponent(Graphics g) {   
        Point pos = this.getLocationOnScreen();   
        Point offset = new Point(-pos.x, -pos.y);   
        g.drawImage(background, offset.x, offset.y, null);   
    }   
}  
