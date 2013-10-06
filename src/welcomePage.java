

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


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
		
		

        // -------------
        // add listeners
        // -------------
        
		start.addActionListener(controller);
		appLang.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(appNameLabel);
        top.add(appInfoLabel);
        top.add(appVersionLabel);
        
        //center.add(info2,BorderLayout.PAGE_START);
        //center.add(listScrollPane,BorderLayout.CENTER);   
        center.setBorder(BorderFactory.createEmptyBorder(50,200,50,200));
        
        bottom.add(appLang, BorderLayout.LINE_START);
        bottom.add(start, BorderLayout.CENTER);
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        this.add(bottom, BorderLayout.PAGE_END);	
	}
	
	
}
