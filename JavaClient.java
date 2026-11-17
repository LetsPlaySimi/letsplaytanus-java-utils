import java.awt.*;
import java.awt.event.*;

public class JavaClient extends Frame {
	
	public void window(){
		setLayout(null);
		setBounds(0,0,500,500);
		setTitle("JavaClient");
	
		WindowAdapter wl = new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(wl);
		setVisible(true);
	}
	
	public static void main(String[] args){
		JavaClient app = new JavaClient();
		app.window();
	}
}
