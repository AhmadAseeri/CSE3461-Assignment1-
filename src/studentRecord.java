import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class studentRecord extends abstractPage {
	
	public studentRecord(a1 s)
	{
		
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		studLabel.setFont(new Font("Arial", Font.BOLD, 38));
		studLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		studInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
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
		

        // -------------
        // add listeners
        // -------------
        
		studClear.addActionListener(controller);
		studNext.addActionListener(controller);
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
		del.addActionListener(controller);
			
		// ------------------
	    // arrange components
	    // ------------------
		
		//Major panels
		JPanel studRecord = new JPanel();
		JPanel keyPad = new JPanel();
		
	    // add components panels in panels
		JPanel studIDPanel = new JPanel();
		JPanel studPinPanel = new JPanel();
		JPanel studLastPanel = new JPanel();
		JPanel studFirstPanel = new JPanel();
		JPanel studNamePanel = new JPanel();
		JPanel studStatusPanel = new JPanel();
		
		//KeyPad panels
		JPanel num123 = new JPanel();
		JPanel num456 = new JPanel();
		JPanel num789 = new JPanel();
		JPanel num00 = new JPanel();
		JPanel cmdButtons =  new JPanel();
	    
		
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(studLabel);
        top.add(studInfoLabel);
        
        
        studIDPanel.add(studIDLabel);
        studIDPanel.add(studID);
        studIDPanel.setLayout(new BoxLayout(studIDPanel, BoxLayout.Y_AXIS));
        
        
        studPinPanel.add(studPinLabel);
        studPinPanel.add(studPin);
        studPinPanel.setLayout(new BoxLayout(studPinPanel, BoxLayout.Y_AXIS));
        
        studLastPanel.add(studLastLabel);
        studLastPanel.add(studLast);
        studLastPanel.setLayout(new BoxLayout(studLastPanel, BoxLayout.Y_AXIS));

        
        studFirstPanel.add(studFirstLabel);
        studFirstPanel.add(studFirst);
        studFirstPanel.setLayout(new BoxLayout(studFirstPanel, BoxLayout.Y_AXIS));
        
        studNamePanel.add(studFirstPanel);
        studNamePanel.add(studLastPanel);
        studNamePanel.setLayout(new BoxLayout(studNamePanel, BoxLayout.Y_AXIS));
        
        
        studStatusPanel.add(studStatus);
        studStatusPanel.setLayout(new BoxLayout(studStatusPanel, BoxLayout.Y_AXIS));
        studStatusPanel.setBorder(new TitledBorder(new EtchedBorder(), "Student Status"));
        
        
        

        //add to studRecord
        studRecord.add(Box.createRigidArea(new Dimension(12, 8)));
        studRecord.add(studIDPanel);
        studRecord.add(Box.createRigidArea(new Dimension(0, 6)));
        studRecord.add(studPinPanel);
        studRecord.add(Box.createRigidArea(new Dimension(0, 6)));
        studRecord.add(studNamePanel);
        studRecord.add(Box.createRigidArea(new Dimension(0, 6)));
        studRecord.add(studStatusPanel);
        studRecord.add(Box.createRigidArea(new Dimension(0, 6)));
        studRecord.setLayout(new BoxLayout(studRecord, BoxLayout.Y_AXIS));
        studRecord.setBorder(new TitledBorder(new EtchedBorder(), "Student Information"));
        

        
        //add to keyPad
        num123.add(num1);
		num123.add(num2);
		num123.add(num3);
		num123.setLayout(new BoxLayout(num123, BoxLayout.X_AXIS));
		
		num456.add(num4);
		num456.add(num5);
		num456.add(num6);
		num456.setLayout(new BoxLayout(num456, BoxLayout.X_AXIS));
		
		num789.add(num7);
		num789.add(num8);
		num789.add(num9);
		num789.setLayout(new BoxLayout(num789, BoxLayout.X_AXIS));
		
		num00.add(num0);
		num00.add(del);
		num00.setLayout(new BoxLayout(num00, BoxLayout.X_AXIS));
		
		cmdButtons.add(studClear);
		cmdButtons.add(studNext);
		cmdButtons.setLayout(new BoxLayout(cmdButtons, BoxLayout.X_AXIS));
		cmdButtons.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 10));
		
		//add to keyPad Main Panel
		keyPad.add(num123);
		keyPad.add(num456);
		keyPad.add(num789);
		keyPad.add(num00);
		keyPad.add(cmdButtons);
		keyPad.add(Box.createRigidArea(new Dimension(0, 6)));
		keyPad.setLayout(new BoxLayout(keyPad, BoxLayout.Y_AXIS));
		keyPad.setBorder(new TitledBorder(new EtchedBorder(), "KeyPad"));
		
        
        
        //Add to Center Panel
        center.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        center.setLayout(new BoxLayout(center, BoxLayout.X_AXIS));
        center.add(studRecord);
        center.add(Box.createRigidArea(new Dimension(10, 0)));
        center.add(keyPad);
        
           
        //add to the contentPane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER );
        this.add(bottom, BorderLayout.PAGE_END);
        
        
        //TextFields settings
        studID.setAlignmentX(Component.LEFT_ALIGNMENT);
        studID.setPreferredSize(new Dimension(210, 35));
        studID.setMaximumSize(studID.getPreferredSize());
        studID.setMinimumSize(studID.getPreferredSize());
        studID.setFont(new Font("Arial", Font.BOLD, 22));
        studID.setBackground(Color.decode("#E0ECF8"));
        
        studPin.setAlignmentX(Component.LEFT_ALIGNMENT);
        studPin.setPreferredSize(studID.getPreferredSize());
        studPin.setMaximumSize(studID.getPreferredSize());
        studPin.setMinimumSize(studID.getPreferredSize());
        studPin.setFont(studID.getFont());
        studPin.setBackground(studID.getBackground());
        
        studLast.setAlignmentX(Component.LEFT_ALIGNMENT);
        studLast.setPreferredSize(new Dimension(200, 35));
        studLast.setMaximumSize(studID.getPreferredSize());
        studLast.setMinimumSize(studID.getPreferredSize());
        studLast.setEditable(false);
        studLast.setFont(studID.getFont());
        studLast.setBackground(studID.getBackground());
        
        studFirst.setAlignmentX(Component.LEFT_ALIGNMENT);
        studFirst.setPreferredSize(studID.getPreferredSize());
        studFirst.setMaximumSize(studID.getPreferredSize());
        studFirst.setMinimumSize(studID.getPreferredSize());
        studFirst.setEditable(false);
        studFirst.setFont(studID.getFont());
        studFirst.setBackground(studID.getBackground());
        
        studStatus.setAlignmentX(Component.LEFT_ALIGNMENT);
        studStatus.setPreferredSize(new Dimension(200, 50));
        studStatus.setMaximumSize(studStatus.getPreferredSize());
        studStatus.setMinimumSize(studStatus.getPreferredSize());
        studStatus.setEditable(false);
        studStatus.setText("Enter the student ID & Pin");
        studStatus.setFont(new Font("Arial", Font.BOLD, 14));
        
        //Buttons Settings
        num1.setPreferredSize(new Dimension(60, 60));
        num1.setMaximumSize(num1.getPreferredSize());
        num1.setMinimumSize(num1.getPreferredSize());
        num1.setFont(new Font("Arial", Font.PLAIN, 28));
        
        num2.setPreferredSize(num1.getPreferredSize());
        num2.setMaximumSize(num1.getPreferredSize());
        num2.setMinimumSize(num1.getPreferredSize());
        num2.setFont(num1.getFont());
        
        num3.setPreferredSize(num1.getPreferredSize());
        num3.setMaximumSize(num1.getPreferredSize());
        num3.setMinimumSize(num1.getPreferredSize());
        num3.setFont(num1.getFont());
        
        num4.setPreferredSize(num1.getPreferredSize());
        num4.setMaximumSize(num1.getPreferredSize());
        num4.setMinimumSize(num1.getPreferredSize());
        num4.setFont(num1.getFont());
        
        num5.setPreferredSize(num1.getPreferredSize());
        num5.setMaximumSize(num1.getPreferredSize());
        num5.setMinimumSize(num1.getPreferredSize());
        num5.setFont(num1.getFont());
        
        num6.setPreferredSize(num1.getPreferredSize());
        num6.setMaximumSize(num1.getPreferredSize());
        num6.setMinimumSize(num1.getPreferredSize());
        num6.setFont(num1.getFont());
        
        num7.setPreferredSize(num1.getPreferredSize());
        num7.setMaximumSize(num1.getPreferredSize());
        num7.setMinimumSize(num1.getPreferredSize());
        num7.setFont(num1.getFont());
        
        num8.setPreferredSize(num1.getPreferredSize());
        num8.setMaximumSize(num1.getPreferredSize());
        num8.setMinimumSize(num1.getPreferredSize());
        num8.setFont(num1.getFont());
        
        num9.setPreferredSize(num1.getPreferredSize());
        num9.setMaximumSize(num1.getPreferredSize());
        num9.setMinimumSize(num1.getPreferredSize());
        num9.setFont(num1.getFont());
        
        del.setPreferredSize(num1.getPreferredSize());
        del.setMaximumSize(num1.getPreferredSize());
        del.setMinimumSize(num1.getPreferredSize());
        del.setFont(num1.getFont());
        
        num0.setPreferredSize(new Dimension(120, 60));
        num0.setMaximumSize(num0.getPreferredSize());
        num0.setMinimumSize(num0.getPreferredSize());
        num0.setFont(num1.getFont());
        
        studNext.setPreferredSize(new Dimension(90, 60));
        studNext.setMaximumSize(studNext.getPreferredSize());
        studNext.setMinimumSize(studNext.getPreferredSize());
        studNext.setFont(new Font("Arial", Font.PLAIN, 28));
        studNext.setOpaque(true);
        studNext.setBackground(Color.decode("#E0F8EC"));
        
        studClear.setPreferredSize(studNext.getPreferredSize());
        studClear.setMaximumSize(studNext.getPreferredSize());
        studClear.setMinimumSize(studNext.getPreferredSize());
        studClear.setFont(new Font("Arial", Font.PLAIN, 28));
        studClear.setOpaque(true);
        studClear.setBackground(Color.decode("#F8E0E0"));
        
        
        


	}
	

}
