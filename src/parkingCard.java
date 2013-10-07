import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class parkingCard extends abstractPage {
	
	public parkingCard(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		parkCardLabel.setFont(new Font("Arial", Font.BOLD, 38));
		parkCardLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		parkCardInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		parkCardInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		parkCardIDLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		parkCardIDLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		parkCardStudIDLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		parkCardStudIDLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		parkCardStudNameLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		parkCardStudNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		parkCardExpiredDateLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		parkCardExpiredDateLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		parkCardBarcodeLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		parkCardBarcodeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
		
		

        // -------------
        // add listeners
        // -------------
        
		parkCardNew.addActionListener(controller);
		parkCardClose.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
		JPanel parkCardIDPanel = new JPanel();
		JPanel parkCardStudIDPanel = new JPanel();
		JPanel parkCardStudNamePanel = new JPanel();
		JPanel parkCardExpiredDatePanel = new JPanel();
		JPanel parkCardBarcodePanel = new JPanel();
	    
		
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(parkCardLabel);
        top.add(parkCardInfoLabel);

        
        parkCardIDPanel.add(parkCardIDLabel);
        parkCardIDPanel.add(parkCardID);
        
        parkCardStudIDPanel.add(parkCardStudIDLabel);
        parkCardStudIDPanel.add(parkCardStudID);
        
        parkCardStudNamePanel.add(parkCardStudNameLabel);
        parkCardStudNamePanel.add(parkCardStudName);
        
        parkCardExpiredDatePanel.add(parkCardExpiredDateLabel);
        parkCardExpiredDatePanel.add(parkCardExpiredDate);
        
        parkCardBarcodePanel.add(parkCardBarcodeLabel);
        parkCardBarcodePanel.add(parkCardBarcode);
        
        center.add(parkCardIDPanel,BorderLayout.NORTH);
        center.add(parkCardStudIDPanel,BorderLayout.CENTER);
        center.add(parkCardStudNamePanel,BorderLayout.AFTER_LINE_ENDS);
        center.add(parkCardExpiredDatePanel,BorderLayout.CENTER);
        center.add(parkCardBarcodePanel,BorderLayout.CENTER);
        
        
          
        center.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        
        bottom.add(parkCardClose, BorderLayout.LINE_START);
        bottom.add(parkCardNew, BorderLayout.CENTER);
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
        

	}

}
