package intefaces;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;

public class JLabel {

	public JLabel(String string) {
		// TODO Auto-generated constructor stub
	}

	public JLabel(String string, ImageIcon icone1, int left) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TesteJLabel tjl = new TesteJLabel();
		tjl.addWindowListener(new WindowAdapter(){
			@Override
		public void windowClosing (WindowEvent e){
			System.exit(0);}});
		}
}