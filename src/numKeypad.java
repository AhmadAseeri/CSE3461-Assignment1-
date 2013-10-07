import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import a1.WindowCloser;

public class numKeypad extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private CardLayout cardLayout; 
	private JFrame frame = null; 
	
	public numKeypad(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		//Number Keypad
		public JButton num1 = new JButton("1");
		public JButton num2 = new JButton("2");
		public JButton num3 = new JButton("3");
		public JButton num4 = new JButton("4");
		public JButton num5 = new JButton("5");
		public JButton num6 = new JButton("6");
		public JButton num7 = new JButton("7");
		public JButton num8 = new JButton("8");
		public JButton num9 = new JButton("9");
		public JButton num0 = new JButton("0");
		
		
		//comp
		
		JPanel num123 = new JPanel();
		JPanel num456 = new JPanel();
		JPanel num789 = new JPanel();
		JPanel num00 = new JPanel();
		JPanel numAll = new JPanel();
		
		num123.add(num1, BorderLayout.WEST);
		num123.add(num2, BorderLayout.CENTER);
		num123.add(num3, BorderLayout.EAST);
		
		num456.add(num4, BorderLayout.WEST);
		num456.add(num5, BorderLayout.CENTER);
		num456.add(num6, BorderLayout.EAST);
		
		num789.add(num7, BorderLayout.WEST);
		num789.add(num8, BorderLayout.CENTER);
		num789.add(num9, BorderLayout.EAST);
		
		num00.add(num0, BorderLayout.CENTER);
		
		numAll.add(num123, BorderLayout.NORTH);
		numAll.add(num456, BorderLayout.CENTER);
		numAll.add(num789, BorderLayout.SOUTH);
		numAll.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		numAll.add(numAll,"1");
		
		 // -------------
        // add listeners
        // -------------
        
		num1.addActionListener(controller);
		num2.addActionListener(controller);
		num3.addActionListener(controller);
		num4.addActionListener(controller);
		num5.addActionListener(controller);
		num6.addActionListener(controller);
		num7.addActionListener(controller);
		num8.addActionListener(controller);
		num9.addActionListener(controller);
		num0.addActionListener(controller);
		
		//keypad window
		
				//create window
						frame = new JFrame("Keypad");
						frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
						frame.add(numAll);
						frame.pack();
						frame.setSize(670, 420);
						frame.setVisible(true);
						frame.setResizable( true );
						this.addWindowListener(new WindowCloser());
						
						//invoke first site "WelcomePage"
						cardLayout.show(numAll, "1");
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
