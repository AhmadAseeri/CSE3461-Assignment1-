import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class parkingCard extends abstractPage {
	
	public parkingCard(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		parkCardLabel.setFont(new Font("Arial", Font.BOLD, 25));
		parkCardLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		parkCardLabel.setForeground(Color.WHITE);
		
		parkCardInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		parkCardInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		parkCardInfoLabel.setForeground(Color.WHITE);
		
		parkCardIDLabel.setFont(new Font("Arial", Font.BOLD, 20));
		parkCardIDLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		parkCardIDLabel.setForeground(Color.WHITE);
		
		parkCardStudIDLabel.setFont(new Font("Arial", Font.BOLD, 20));
		parkCardStudIDLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		parkCardStudIDLabel.setForeground(Color.WHITE);
		
		parkCardStudNameLabel.setFont(new Font("Arial", Font.BOLD, 20));
		parkCardStudNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		parkCardStudNameLabel.setForeground(Color.WHITE);
		
		parkCardExpiredDateLabel.setFont(new Font("Arial", Font.BOLD, 20));
		parkCardExpiredDateLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		parkCardExpiredDateLabel.setForeground(Color.WHITE);
		
		parkCardBarcodeLabel.setFont(new Font("Arial", Font.BOLD, 20));
		parkCardBarcodeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		parkCardBarcodeLabel.setForeground(Color.WHITE);
		
		
		JLabel bannerIcon = new JLabel(new ImageIcon("parkCard.png"));
		
		
		
		
		

        // -------------
        // add listeners
        // -------------
        
		parkCardNew.addActionListener(controller);
		parkCardClose.addActionListener(controller);
		parkCardHist.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
		JPanel parkInfoPanel = new JPanel();
		JPanel parkCardIDPanel = new JPanel();
		JPanel parkCardStudIDPanel = new JPanel();
		JPanel parkCardStudNamePanel = new JPanel();
		JPanel parkCardExpiredDatePanel = new JPanel();
		JPanel parkCardBarcodePanel = new JPanel();
		JPanel buttonPanel = new JPanel();
	    
		
		
		parkInfoPanel.add(parkCardLabel);
		parkInfoPanel.add(parkCardInfoLabel);
		parkInfoPanel.setLayout(new BoxLayout(parkInfoPanel, BoxLayout.Y_AXIS));
		parkInfoPanel.setBounds(30,100, 300, 70);
		parkInfoPanel.setBackground(Color.decode("#CC0000"));
        
        parkCardIDPanel.add(parkCardIDLabel);
        parkCardIDPanel.add(parkCardID);
        parkCardIDPanel.setLayout(new BoxLayout(parkCardIDPanel, BoxLayout.Y_AXIS));
        parkCardIDPanel.setBounds(50,280, 220, 50);
        parkCardIDPanel.setBackground(Color.decode("#CC0000"));
        
        parkCardStudIDPanel.add(parkCardStudIDLabel);
        parkCardStudIDPanel.add(parkCardStudID);
        parkCardStudIDPanel.setLayout(new BoxLayout(parkCardStudIDPanel, BoxLayout.Y_AXIS));
        parkCardStudIDPanel.setBounds(50,355, 220, 50);
        parkCardStudIDPanel.setBackground(Color.decode("#CC0000"));
        
        parkCardStudNamePanel.add(parkCardStudNameLabel);
        parkCardStudNamePanel.add(parkCardStudName);
        parkCardStudNamePanel.setLayout(new BoxLayout(parkCardStudNamePanel, BoxLayout.Y_AXIS));
        parkCardStudNamePanel.setBounds(50,420, 220, 70);
        parkCardStudNamePanel.setBackground(Color.decode("#CC0000"));
        
        parkCardExpiredDatePanel.add(parkCardExpiredDateLabel);
        parkCardExpiredDatePanel.add(parkCardExpiredDate);
        parkCardExpiredDatePanel.setLayout(new BoxLayout(parkCardExpiredDatePanel, BoxLayout.Y_AXIS));
        parkCardExpiredDatePanel.setBounds(50,500, 220, 70);
        parkCardExpiredDatePanel.setBackground(Color.decode("#CC0000"));
        
        parkCardBarcodePanel.add(parkCardBarcodeLabel);
        parkCardBarcodePanel.add(parkCardBarcode);
        parkCardBarcodePanel.setLayout(new BoxLayout(parkCardBarcodePanel, BoxLayout.Y_AXIS));
        parkCardBarcodePanel.setBounds(50,570, 200, 100);
        parkCardBarcodePanel.setBackground(Color.decode("#CC0000"));
        
        buttonPanel.add(parkCardClose);
        buttonPanel.add(parkCardNew);
        buttonPanel.add(parkCardHist);
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBounds(80,630, 210, 50);
        buttonPanel.setBackground(Color.decode("#CC0000"));
        
        center.add(parkInfoPanel);
        center.add(parkCardIDPanel);
        center.add(parkCardStudIDPanel);
        center.add(parkCardStudNamePanel);
        center.add(parkCardExpiredDatePanel);
        center.add(buttonPanel);
        center.add(bannerIcon);
        center.setLayout(null);
        
        
        
          
        center.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        
        //bottom.add(parkCardClose, BorderLayout.LINE_START);
        //bottom.add(parkCardNew, BorderLayout.CENTER);
           
        //add to the contentpane
        //this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        //this.add(bottom, BorderLayout.PAGE_END);
        
        //Text Field sittings
        
        parkCardID.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCardID.setPreferredSize(new Dimension(210, 35));
        parkCardID.setMaximumSize(parkCardID.getPreferredSize());
        parkCardID.setMinimumSize(parkCardID.getPreferredSize());
        parkCardID.setFont(new Font("Arial", Font.BOLD, 22));
        parkCardID.setForeground(Color.WHITE);
        
        parkCardStudID.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCardStudID.setPreferredSize(new Dimension(210, 35));
        parkCardStudID.setMaximumSize(parkCardID.getPreferredSize());
        parkCardStudID.setMinimumSize(parkCardID.getPreferredSize());
        parkCardStudID.setFont(new Font("Arial", Font.BOLD, 22));
        parkCardStudID.setForeground(Color.WHITE);
        
        parkCardStudName.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCardStudName.setPreferredSize(new Dimension(210, 35));
        parkCardStudName.setMaximumSize(parkCardID.getPreferredSize());
        parkCardStudName.setMinimumSize(parkCardID.getPreferredSize());
        parkCardStudName.setFont(new Font("Arial", Font.BOLD, 22));
        parkCardStudName.setForeground(Color.WHITE);
        
        parkCardExpiredDate.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCardExpiredDate.setPreferredSize(new Dimension(210, 35));
        parkCardExpiredDate.setMaximumSize(parkCardID.getPreferredSize());
        parkCardExpiredDate.setMinimumSize(parkCardID.getPreferredSize());
        parkCardExpiredDate.setFont(new Font("Arial", Font.BOLD, 22));
        parkCardExpiredDate.setForeground(Color.WHITE);
        
        parkCardBarcode.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCardBarcode.setPreferredSize(new Dimension(210, 35));
        parkCardBarcode.setMaximumSize(parkCardID.getPreferredSize());
        parkCardBarcode.setMinimumSize(parkCardID.getPreferredSize());
        parkCardBarcode.setFont(new Font("Arial", Font.BOLD, 22));
        parkCardBarcode.setForeground(Color.WHITE);
        
        
        
        //image Settings
        bannerIcon.setBounds(0, 0, 371, 732);
        
        
        //buttons Stittings
        parkCardClose.setPreferredSize(new Dimension(70, 50));
        parkCardClose.setMaximumSize(parkCardClose.getPreferredSize());
        parkCardClose.setMinimumSize(parkCardClose.getPreferredSize());
        parkCardClose.setFont(new Font("Arial", Font.BOLD, 12));
        parkCardClose.setOpaque(true);
        parkCardClose.setBackground(Color.white);
        

        parkCardNew.setPreferredSize(new Dimension(70, 50));
        parkCardNew.setMaximumSize(parkCardClose.getPreferredSize());
        parkCardNew.setMinimumSize(parkCardClose.getPreferredSize());
        parkCardNew.setFont(new Font("Arial", Font.BOLD, 12));
        parkCardNew.setOpaque(true);
        parkCardNew.setBackground(Color.white);
        
        parkCardHist.setPreferredSize(new Dimension(70, 50));
        parkCardHist.setMaximumSize(parkCardClose.getPreferredSize());
        parkCardHist.setMinimumSize(parkCardClose.getPreferredSize());
        parkCardHist.setFont(new Font("Arial", Font.BOLD, 12));
        parkCardHist.setOpaque(true);
        parkCardHist.setBackground(Color.white);
	}

}
