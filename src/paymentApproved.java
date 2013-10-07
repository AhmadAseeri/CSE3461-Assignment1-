import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class paymentApproved extends abstractPage {

	public paymentApproved(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		payLabel.setFont(new Font("Arial", Font.BOLD, 38));
		payLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		payInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		payInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		payTotalLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		payTotalLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		payPeriodLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		payPeriodLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
        // -------------
        // add listeners
        // -------------
        
		payConfirm.addActionListener(controller);
		payCancel.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
		JPanel payTotalPanel = new JPanel();
		JPanel payPeriodPanel = new JPanel();

	    
		
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(payLabel);
        top.add(payInfoLabel);

        
        payTotalPanel.add(payTotalLabel);
        payTotalPanel.add(payTotal);
        
        payPeriodPanel.add(payPeriodLabel);
        payPeriodPanel.add(payPeriod);
        
        
        center.add(payTotalPanel,BorderLayout.NORTH);
        center.add(payPeriodPanel,BorderLayout.CENTER);

        
        
          
        center.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        
        bottom.add(payCancel, BorderLayout.LINE_START);
        bottom.add(payConfirm, BorderLayout.CENTER);
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
        

	}
	
}
