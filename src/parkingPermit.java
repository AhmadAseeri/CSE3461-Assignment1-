import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;


public class parkingPermit extends abstractPage {
	
	public parkingPermit(a1 s)
	{
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		parkLabel.setFont(new Font("Arial", Font.BOLD, 38));
		parkLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		parkInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		parkInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
        // -------------
        // add listeners
        // -------------
        
		parkStudCalculate.addActionListener(controller);
		parkStudCancel.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(parkLabel);
        top.add(parkInfoLabel);

        
        center.add(parkStudIDLabel,BorderLayout.PAGE_START);
        center.add(parkStudID,BorderLayout.PAGE_START);
        
        center.add(parkStudPinLabel,BorderLayout.PAGE_START);
        center.add(parkStudPin,BorderLayout.PAGE_START);
        
        center.add(parkStudEmailLabel,BorderLayout.PAGE_START);
        center.add(parkStudEmail,BorderLayout.PAGE_START);
        
        center.add(parkCarMakeLabel,BorderLayout.PAGE_START);
        center.add(parkCarMake,BorderLayout.PAGE_START);
        
        center.add(parkCarModelLabel,BorderLayout.PAGE_START);
        center.add(parkCarModel,BorderLayout.PAGE_START);
        
        center.add(parkCarPlateLabel,BorderLayout.PAGE_START);
        center.add(parkCarPlate,BorderLayout.PAGE_START);
        
        center.add(parkCarInsuranceLabel,BorderLayout.PAGE_START);
        center.add(parkCarInsurance,BorderLayout.PAGE_START);
        
        center.add(parkMonthLabel,BorderLayout.PAGE_START);
        center.add(parkMonth,BorderLayout.PAGE_START);
        
        center.add(parkYearLabel,BorderLayout.PAGE_START);
        center.add(parkYear,BorderLayout.PAGE_START);
        
        
        //center.add(listScrollPane,BorderLayout.CENTER);   
        center.setBorder(BorderFactory.createEmptyBorder(50,200,50,200));
        
        bottom.add(parkStudCancel, BorderLayout.LINE_START);
        bottom.add(parkStudCalculate, BorderLayout.CENTER);
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
		
		
	}

}
