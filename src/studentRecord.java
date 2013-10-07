import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;


public class studentRecord extends abstractPage {
	
	public studentRecord(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		studLabel.setFont(new Font("Arial", Font.BOLD, 38));
		studLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		studInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		studInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		studIDLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		studIDLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		studPinLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		studPinLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		studLastLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		studLastLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		studFirstLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		studFirstLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		studStatusLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		studStatusLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		studID.setSize(100, 100);
		
		studPin.setSize(100, 30);
		
		studLast.setSize(100, 30);
		
		studFirst.setSize(100, 30);
		
		studStatus.setSize(100, 30);
		
		
		

        // -------------
        // add listeners
        // -------------
        
		studClear.addActionListener(controller);
		studNext.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
		JPanel studIDPanel = new JPanel();
		JPanel studPinPanel = new JPanel();
		JPanel studLastPanel = new JPanel();
		JPanel studFirstPanel = new JPanel();
		JPanel studStatusPanel = new JPanel();
	    
		
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(studLabel);
        top.add(studInfoLabel);
        
        
        studIDPanel.add(studIDLabel);
        studIDPanel.add(studID);
        
        studPinPanel.add(studPinLabel);
        studPinPanel.add(studPin);
        
        studLastPanel.add(studLastLabel);
        studLastPanel.add(studLast);
        
        studFirstPanel.add(studFirstLabel);
        studFirstPanel.add(studFirst);
        
        studStatusPanel.add(studStatusLabel);
        studStatusPanel.add(studStatus);
        
        center.add(studIDPanel,BorderLayout.NORTH);
        center.add(studPinPanel,BorderLayout.CENTER);
        center.add(studLastPanel,BorderLayout.AFTER_LINE_ENDS);
        center.add(studFirstPanel,BorderLayout.CENTER);
        center.add(studStatusPanel,BorderLayout.CENTER);
        
        
          
        center.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        
        bottom.add(studClear, BorderLayout.LINE_START);
        bottom.add(studNext, BorderLayout.CENTER);
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
        

	}
	

}
