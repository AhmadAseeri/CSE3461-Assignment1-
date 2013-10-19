import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class paymentApproved extends abstractPage {

	public paymentApproved(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		payLabel.setFont(new Font("Arial", Font.BOLD, 38));
		payLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		payTotalLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		payTotalLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		payNoteLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		payNoteLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		
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
		JPanel payPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel notePanel = new JPanel();
		JPanel buttonNotePanel = new JPanel();

		

	    
		
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(payLabel);
        //top.add(payInfoLabel);

        
        payTotalPanel.add(payTotalLabel);
        payTotalPanel.add(payTotal);
        payTotalPanel.setLayout(new BoxLayout(payTotalPanel, BoxLayout.Y_AXIS));
        
        payPeriodPanel.add(payPeriodLabel);
        payPeriodPanel.add(payPeriod);
        payPeriodPanel.setLayout(new BoxLayout(payPeriodPanel, BoxLayout.Y_AXIS));
        
        buttonPanel.add(payCancel);
        buttonPanel.add(payConfirm);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        
        notePanel.add(payNoteLabel);
        notePanel.setLayout(new BoxLayout(notePanel, BoxLayout.X_AXIS));
        
        payPanel.add(Box.createRigidArea(new Dimension(12, 12)));
        payPanel.add(payTotalPanel);
        payPanel.add(Box.createRigidArea(new Dimension(12, 8)));
        payPanel.add(payPeriodPanel);
        payPanel.add(Box.createRigidArea(new Dimension(12, 12)));
        payPanel.setLayout(new BoxLayout(payPanel, BoxLayout.Y_AXIS));
        payPanel.setBorder(new TitledBorder(new EtchedBorder(), "Total Cost"));
        
        //buttonNotePanel.add(Box.createRigidArea(new Dimension(12, 12)));
        buttonNotePanel.add(notePanel);
        buttonNotePanel.add(Box.createRigidArea(new Dimension(18, 12)));
        buttonNotePanel.add(buttonPanel);
        buttonNotePanel.add(Box.createRigidArea(new Dimension(12, 12)));
        buttonNotePanel.setLayout(new BoxLayout(buttonNotePanel, BoxLayout.Y_AXIS));
        buttonNotePanel.setBorder(new TitledBorder(new EtchedBorder(), "Approveal"));
        
        
        
        
        center.add(payPanel);
        center.add(buttonNotePanel);
        center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));  
        //center.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        //this.add(bottom, BorderLayout.PAGE_END);
        
        
        //TextField Sitting
        //TextFiled Settings
        payTotal.setAlignmentX(Component.LEFT_ALIGNMENT);
        payTotal.setPreferredSize(new Dimension(210, 35));
        payTotal.setMaximumSize(payTotal.getPreferredSize());
        payTotal.setMinimumSize(payTotal.getPreferredSize());
        payTotal.setFont(new Font("Arial", Font.BOLD, 22));
        payTotal.setBackground(Color.decode("#E0ECF8"));
        payTotal.setEditable(false);
        
        payPeriod.setAlignmentX(Component.LEFT_ALIGNMENT);
        payPeriod.setPreferredSize(new Dimension(210, 35));
        payPeriod.setMaximumSize(payTotal.getPreferredSize());
        payPeriod.setMinimumSize(payTotal.getPreferredSize());
        payPeriod.setFont(new Font("Arial", Font.BOLD, 22));
        payPeriod.setBackground(Color.decode("#E0ECF8"));
        payPeriod.setEditable(false);
        
        payNoteLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        payNoteLabel.setOpaque(true);
        payNoteLabel.setPreferredSize(new Dimension(210, 50));
        payNoteLabel.setMaximumSize(payNoteLabel.getPreferredSize());
        payNoteLabel.setMinimumSize(payNoteLabel.getPreferredSize());
        payNoteLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        
        //Buttons Sittings
        payConfirm.setPreferredSize(new Dimension(120, 60));
        payConfirm.setMaximumSize(payConfirm.getPreferredSize());
        payConfirm.setMinimumSize(payConfirm.getPreferredSize());
        payConfirm.setFont(new Font("Arial", Font.PLAIN, 28));
        payConfirm.setOpaque(true);
        payConfirm.setBackground(Color.decode("#E0F8EC"));
        
      //Buttons Sittings
        payCancel.setPreferredSize(new Dimension(120, 60));
        payCancel.setMaximumSize(payConfirm.getPreferredSize());
        payCancel.setMinimumSize(payConfirm.getPreferredSize());
        payCancel.setFont(new Font("Arial", Font.PLAIN, 28));
        payCancel.setOpaque(true);
        payCancel.setBackground(Color.decode("#F8E0E0"));

	}
	
}
