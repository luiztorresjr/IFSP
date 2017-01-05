
import java.awt.BorderLayout;   
import java.awt.Point;   
import java.awt.event.ComponentEvent;   
import java.awt.event.ComponentListener;   
import java.awt.event.WindowEvent;   
import java.awt.event.WindowFocusListener;   
import java.util.Date;   
import javax.swing.ImageIcon;   
import javax.swing.JComponent;   
import javax.swing.JFrame;   
import javax.swing.JLabel;   
  
public class MyFrame extends JFrame implements     
        ComponentListener,WindowFocusListener,Runnable  {   
       
    private TransparentBackground transpPanel = null;   
    private boolean refreshRequested = true;   
    private long lastupdate = 0;   
  
  
    public MyFrame() {   
        setUndecorated(true);   
        setSize(500, 500);   
        setLocation(20, 20);           
        getContentPane().add(getPanelComponents());   
        addComponentListener(this);   
        addWindowFocusListener(this);   
        new Thread(this).start( );   
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setVisible(true);   
    }   
  
    private JComponent getPanelComponents() {   
                   
        transpPanel = new TransparentBackground();   
        BorderLayout layout = new BorderLayout();   
        transpPanel.setLayout(layout);   
           
        ImageIcon icon = createImageIcon("duke.png",   
        "imagem mascote java");   
           
        JLabel label = new JLabel(icon);   
        transpPanel.add(label);;   
               
        return transpPanel;   
    }   
  
               
    /** Returns an ImageIcon, or null if the path was invalid. */   
    protected static ImageIcon createImageIcon(String path,   
                                               String description) {   
        java.net.URL imgURL = MyFrame.class.getResource(path);   
        if (imgURL != null) {   
            return new ImageIcon(imgURL, description);   
        } else {   
            System.err.println("Couldn't find file: " + path);   
            return null;   
        }   
    }   
       
    public void refresh( ) {   
        if(isVisible( )) {   
            repaint( );   
            refreshRequested = true;   
            lastupdate = new Date( ).getTime( );   
        }   
    }   
    public void run( ) {   
        try {   
            while(true) {   
                Thread.sleep(1);   
                long now = new Date( ).getTime( );   
                if(refreshRequested &&   
                    ((now - lastupdate) > 1000)) {   
                    if(isVisible( )) {   
                        Point location = getLocation( );   
                        setVisible(false);   
                        transpPanel.updateBackground( );   
                        setVisible(true);   
                        setLocation(location);   
                        refresh( );   
                    }   
                    lastupdate = now;   
                    refreshRequested = false;   
                    }   
                }   
            } catch (Exception ex) {   
                ex.printStackTrace( );   
            }   
        }   
       
    public void componentShown(ComponentEvent evt) { repaint( ); }   
    public void componentResized(ComponentEvent evt) { repaint( ); }   
    public void componentMoved(ComponentEvent evt) { repaint( ); }   
    public void componentHidden(ComponentEvent evt) { }   
  
    public void windowGainedFocus(WindowEvent evt) { refresh( ); }       
    public void windowLostFocus(WindowEvent evt) { refresh( ); }   
       
       
    public static void main(String[] args){   
        MyFrame fr = new MyFrame();   
    }   
} 
