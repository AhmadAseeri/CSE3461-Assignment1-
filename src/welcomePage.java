

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class welcomePage extends abstractPage
{
	private static final long serialVersionUID = 1L;
	


	//Constructor
	public welcomePage(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		appNameLabel.setFont(new Font("Arial", Font.BOLD, 38));
		appNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		appInfoLabel.setFont(new Font("Arial", Font.BOLD, 12));
		appInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		progs.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
		

        // -------------
        // add listeners
        // -------------
        
		start.addActionListener(controller);
		appLang.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
		
		JPanel buttonPanel = new JPanel();
		JPanel textPanel = new JPanel();
		
	    // add components/panels in panels
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(appNameLabel);
        top.add(appInfoLabel);
        top.add(appVersionLabel);
        
        
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 10)));
        buttonPanel.add(start);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.add(appLang);
        buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.setBorder(new TitledBorder(new EtchedBorder(), "Start"));
        
        textPanel.add(progs);
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
        textPanel.setBorder(new TitledBorder(new EtchedBorder(), "Info"));
        
        center.add(textPanel);
        center.add(Box.createRigidArea(new Dimension(10, 0)));
        center.add(buttonPanel);
        center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));
        //center.setAlignmentX(CENTER_ALIGNMENT);
        
           
        //add to the contentPane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);
        
        
        //buttons
        start.setPreferredSize(new Dimension(90, 60));
        start.setMaximumSize(start.getPreferredSize());
        start.setMinimumSize(start.getPreferredSize());
        start.setFont(new Font("Arial", Font.PLAIN, 28));
        start.setOpaque(true);
        start.setBackground(Color.decode("#F8E0E0"));
        
        appLang.setPreferredSize(new Dimension(120, 60));
        appLang.setMaximumSize(appLang.getPreferredSize());
        appLang.setMinimumSize(appLang.getPreferredSize());
        appLang.setFont(new Font("Arial", Font.PLAIN, 28));
        appLang.setOpaque(true);
        appLang.setBackground(Color.decode("#E0F8EC"));
	}
	
	
}
