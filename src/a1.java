//package view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class a1 extends JFrame
{
	
	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout; 
	private JFrame frame = null; 
	public JPanel main;
	private welcomePage panel1;
	private studentRecord panel2;
	private parkingPermit panel3;
	private paymentApproved panel4;
	private parkingCard panel5;
	private history panel6;
	
	// constructor
	public a1()
	{
		// -------------------------------
	    // create and configure components, objects
	    // -------------------------------
		

		
		//Create the main panel with cardlayout
		main = new JPanel();
		cardLayout = new CardLayout();
        main.setLayout(cardLayout);

        //create all pages		
		panel1 = new welcomePage(this);
		panel2 = new studentRecord(this);
		panel3 = new parkingPermit(this);
		panel4 = new paymentApproved(this);
		panel5 = new parkingCard(this);
		panel6 = new history(this);
		
		//add pages to main panel
		main.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		main.add(panel1,"1");
		main.add(panel2,"2");
		main.add(panel3,"3");
		main.add(panel4,"4");	
		main.add(panel5,"5");
		main.add(panel6,"6");
		
		//create window
		frame = new JFrame("York University | Parking Permit Kiosk");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(main);
		frame.pack();
		frame.setSize(450, 300);
		
		frameSetMidd();
		
		frame.setVisible(true);
		frame.setResizable( true );
		frame.setResizable(false);
		this.addWindowListener(new WindowCloser());
		
		//invoke first site "WelcomePage"
		cardLayout.show(main,"1"); 
	
		
	}
	
	public void setFrameSize( int w, int h)
	{
		frame.setSize(w, h);
	}
	
	

	public void setCardLayout(String no)
	{
		cardLayout.show(main, no);
	}
	
	public static void main(String[]args)
	{
		
		new a1();
		
	}
	
	public void frameSetMidd()
    {
      //Locate in the midd of the screen
		Dimension d1 = frame.getSize();
		Dimension d2 = Toolkit.getDefaultToolkit().getScreenSize();

		int x = (d2.width - d1.width) / 2;
		int y = (d2.height - d1.height) / 2;
		frame.setLocation(new Point(x, y));
    }

//-----------
// inner class
// -----------

// Note: WindowAdapter implements WindowListener

	private class WindowCloser extends WindowAdapter
	{
	   public void windowClosing(WindowEvent event)
	   {
	      System.exit(0);
	   }
	}
}
