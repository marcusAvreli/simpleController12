package simpleController12;

import javax.swing.JFrame;

import simpleController12.core.view.AbstractViewContainer;
import simpleController12.core.view.DefaultViewContainer;


public class MainFrame  extends JFrame{
	public MainFrame() {
		
		initComponents();
	}
	
	public void initComponents() {
		// Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	     setExtendedState(MAXIMIZED_BOTH);
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 AbstractViewContainer viewContainer = new DefaultViewContainer();
		 viewContainer.setContentPane(rootPane);
	}
}
