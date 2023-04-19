package simpleController12.core.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JRootPane;
import javax.swing.RootPaneContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import simpleController12.ViewContainer;



public class AbstractViewContainer implements ViewContainer{
	private static final Logger logger = LoggerFactory.getLogger(AbstractViewContainer.class);
	private JRootPane 								rootPane;
	//application
	public JFrame frame;
	public AbstractViewContainer() {
		super();
		this.getContentPane().setLayout(new BorderLayout());
	}
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	@Override
	public JRootPane getRootPane() {
		logger.info("get_root_pane");
		if (this.rootPane == null){
			logger.info("root_pane_is_null");
			this.rootPane = new JRootPane();
			this.rootPane.setName("ROOTPANE");
		}else {
			logger.info("root_pane_is_not_null");
		}
		return this.rootPane;
		
	}

	@Override
	public void setContentPane(Container contentPane) {
		// TODO Auto-generated method stub
		this.getRootPane().setContentPane(contentPane);
	}

	@Override
	public Container getContentPane() {
		return this.getRootPane().getContentPane(); 
		
	}

	@Override
	public void setLayeredPane(JLayeredPane layeredPane) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JLayeredPane getLayeredPane() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setGlassPane(Component glassPane) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Component getGlassPane() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
