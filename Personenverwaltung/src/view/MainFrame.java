package view;

import javax.swing.JFrame;

import layout.TableLayout;
/**
 * Dieses Interface beinhaltet die Defaultabstände für das TableLayout.
 * 
 * 16.09.2016 gafner	File erstellt.
 * 
 * 
 * @author Severin Gafner
 *
 */
public class MainFrame extends JFrame {
	
	public MainFrame() {
	this.setSize(500,500);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setLayout(new TableLayout());
	}
}
