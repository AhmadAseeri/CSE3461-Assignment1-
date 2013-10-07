//package view;

import java.awt.CardLayout;
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
	private JPanel main;
	private welcomePage panel1;
	private studentRecord panel2;
	private parkingPermit panel3;
	private paymentApproved panel4;
	private parkingCard panel5;
	
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
		
		//add pages to main panel
		main.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		main.add(panel1,"1");
		main.add(panel2,"2");
		main.add(panel3,"3");
		main.add(panel4,"4");	
		main.add(panel5,"5");
		
		//create window
		frame = new JFrame("York University | Parking Permit Kiosk");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.add(main);
		frame.pack();
		frame.setSize(670, 420);
		frame.setVisible(true);
		frame.setResizable( true );
		this.addWindowListener(new WindowCloser());
		
		//invoke first site "WelcomePage"
		cardLayout.show(main,"1"); 
	
		
	}
	/*
	public Result getPanel4()
	{
		return this.panel4;
	}
	*/
	public void setCardLayout(String no)
	{
		cardLayout.show(main, no);
	}
	
	/*
	public String getCardLayout()
	{
		
	}
	*/
	public static void main(String[]args)
	{
		new a1();
		
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
