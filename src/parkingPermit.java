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


public class parkingPermit extends abstractPage {
	
	@SuppressWarnings("unchecked")
	public parkingPermit(a1 s)
	{
		controller controller = new controller(this, s);
		
		// -------------------------------
	    // create and configure components
	    // -------------------------------
		
		parkLabel.setFont(new Font("Arial", Font.BOLD, 38));
		parkLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		parkInfoLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		parkInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		//Student Panels
		JPanel parkStudIDPanel = new JPanel();
		JPanel parkStudPinPanel = new JPanel();
		JPanel parkStudEmailPanel = new JPanel();
		

		JPanel parkstudPanel = new JPanel();
		
		//Car Panels
		JPanel parkCarMakePanel = new JPanel();
		JPanel parkCarModelPanel = new JPanel();
		JPanel parkCarPlatePanel = new JPanel();
		JPanel parkCarInsurlPanel = new JPanel();
		
		JPanel parkCarPanel = new JPanel();
		
		//Permit Panel
		JPanel parkMonthPanel = new JPanel();
		JPanel parkYearPanel = new JPanel();
		
		JPanel parkDatePanel = new JPanel();
		
		//Keyboard+KeyPad Panel
		JPanel keyPad = new JPanel();
		JPanel keyBoard = new JPanel();
		JPanel keyBoardCommandPanel = new JPanel();
		
		//KeyPad
		JPanel num123 = new JPanel();
		JPanel num456 = new JPanel();
		JPanel num789 = new JPanel();
		JPanel num00 = new JPanel();
		JPanel cmdButtons =  new JPanel();
		
		//KeyBorad
		JPanel LQP = new JPanel();
		JPanel LAL = new JPanel();
		JPanel LZM = new JPanel();
		JPanel LSpaceDel = new JPanel();
		JPanel commandPanel = new JPanel();
		
		//Major Panels
		JPanel leftSide = new JPanel();
		JPanel rightSide = new JPanel();
		JPanel downLeftSide = new JPanel();
		JPanel downRightSide = new JPanel();
		JPanel topHalf = new JPanel();
		JPanel downHalf = new JPanel();
		
		
		
		
		
		
        // -------------
        // add listeners
        // -------------
        
		parkStudCalculate.addActionListener(controller);
		parkStudCancel.addActionListener(controller);
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
		LQ.addActionListener(controller);
		LW.addActionListener(controller);
		LE.addActionListener(controller);
		LR.addActionListener(controller);
		LT.addActionListener(controller);
		LY.addActionListener(controller);
		LU.addActionListener(controller);
		LI.addActionListener(controller);
		LO.addActionListener(controller);
		LP.addActionListener(controller);
		LA.addActionListener(controller);
		LS.addActionListener(controller);
		LD.addActionListener(controller);
		LF.addActionListener(controller);
		LG.addActionListener(controller);
		LH.addActionListener(controller);
		LJ.addActionListener(controller);
		LK.addActionListener(controller);
		LL.addActionListener(controller);
		LZ.addActionListener(controller);
		LX.addActionListener(controller);
		LC.addActionListener(controller);
		LV.addActionListener(controller);
		LB.addActionListener(controller);
		LN.addActionListener(controller);
		LM.addActionListener(controller);
		Lspace.addActionListener(controller);
		Ldel.addActionListener(controller);
		
		
			
		// ------------------
	    // arrange components
	    // ------------------
		
	    // add components/panels in panels
        top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
        top.add(parkLabel);
        top.add(parkInfoLabel);

        //Stud Fields
        parkStudIDPanel.add(parkStudIDLabel);
        parkStudIDPanel.add(parkStudID);
        parkStudIDPanel.setLayout(new BoxLayout(parkStudIDPanel, BoxLayout.Y_AXIS));
        
        parkStudPinPanel.add(parkStudPinLabel);
        parkStudPinPanel.add(parkStudPin);
        parkStudPinPanel.setLayout(new BoxLayout(parkStudPinPanel, BoxLayout.Y_AXIS));
        
        parkStudEmailPanel.add(parkStudEmailLabel);
        parkStudEmailPanel.add(parkStudEmail);
        parkStudEmailPanel.setLayout(new BoxLayout(parkStudEmailPanel, BoxLayout.Y_AXIS));
        
        //Gather Stud Panels
        parkstudPanel.add(Box.createRigidArea(new Dimension(12, 8)));
        parkstudPanel.add(parkStudIDPanel);
        parkstudPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkstudPanel.add(parkStudPinPanel);
        parkstudPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkstudPanel.add(parkStudEmailPanel);
        parkstudPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkstudPanel.setLayout(new BoxLayout(parkstudPanel, BoxLayout.Y_AXIS));
        parkstudPanel.setBorder(new TitledBorder(new EtchedBorder(), "Student Information"));
        parkstudPanel.setAlignmentY(TOP_ALIGNMENT);
        
        //Car Fileds
        parkCarMakePanel.add(parkCarMakeLabel);
        parkCarMakePanel.add(parkCarMake);
        parkCarMakePanel.setLayout(new BoxLayout(parkCarMakePanel, BoxLayout.Y_AXIS));
        
        parkCarModelPanel.add(parkCarModelLabel);
        parkCarModelPanel.add(parkCarModel);
        parkCarModelPanel.setLayout(new BoxLayout(parkCarModelPanel, BoxLayout.Y_AXIS));
        
        parkCarPlatePanel.add(parkCarPlateLabel);
        parkCarPlatePanel.add(parkCarPlate);
        parkCarPlatePanel.setLayout(new BoxLayout(parkCarPlatePanel, BoxLayout.Y_AXIS));
        
        parkCarInsurlPanel.add(parkCarInsuranceLabel);
        parkCarInsurlPanel.add(parkCarInsurance);
        parkCarInsurlPanel.setLayout(new BoxLayout(parkCarInsurlPanel, BoxLayout.Y_AXIS));
        
        //Gather Car Panels
        parkCarPanel.add(Box.createRigidArea(new Dimension(12, 8)));
        parkCarPanel.add(parkCarMakePanel);
        parkCarPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkCarPanel.add(parkCarModelPanel);
        parkCarPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkCarPanel.add(parkCarPlatePanel);
        parkCarPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkCarPanel.add(parkCarInsurlPanel);
        parkCarPanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkCarPanel.setLayout(new BoxLayout(parkCarPanel, BoxLayout.Y_AXIS));
        parkCarPanel.setBorder(new TitledBorder(new EtchedBorder(), "Car Information"));
        parkCarPanel.setAlignmentY(TOP_ALIGNMENT);

        
        
        //Date Panels
        parkMonthPanel.add(parkMonthLabel);
        parkMonthPanel.add(parkMonth);
        parkMonthPanel.setLayout(new BoxLayout(parkMonthPanel, BoxLayout.Y_AXIS));
        
        parkYearPanel.add(parkYearLabel);
        parkYearPanel.add(parkYear);
        parkYearPanel.setLayout(new BoxLayout(parkYearPanel, BoxLayout.Y_AXIS));
        
        //Gather Date Panels
        parkDatePanel.add(Box.createRigidArea(new Dimension(12, 8)));
        parkDatePanel.add(parkMonthPanel);
        parkDatePanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkDatePanel.add(parkYearPanel);
        parkDatePanel.add(Box.createRigidArea(new Dimension(0, 6)));
        parkDatePanel.setLayout(new BoxLayout(parkDatePanel, BoxLayout.X_AXIS));
        parkDatePanel.setBorder(new TitledBorder(new EtchedBorder(), "Parking Permit Duration"));
        parkDatePanel.setAlignmentY(TOP_ALIGNMENT);
        
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
		
		cmdButtons.add(parkStudCancel);
		cmdButtons.add(parkStudCalculate);
		cmdButtons.setLayout(new BoxLayout(cmdButtons, BoxLayout.X_AXIS));
		cmdButtons.setBorder(BorderFactory.createEmptyBorder(5, 10, 0, 10));
		
		//add to keyPad Main Panel
		keyPad.add(num123);
		keyPad.add(num456);
		keyPad.add(num789);
		keyPad.add(num00);
		keyPad.add(Box.createRigidArea(new Dimension(0, 6)));
		keyPad.setLayout(new BoxLayout(keyPad, BoxLayout.Y_AXIS));
		keyPad.setBorder(new TitledBorder(new EtchedBorder(), "KeyPad"));
		
		//KeyBord inner panels
        LQP.add(LQ);
        LQP.add(LW);
        LQP.add(LE);
        LQP.add(LR);
        LQP.add(LT);
        LQP.add(LY);
        LQP.add(LU);
        LQP.add(LI);
        LQP.add(LO);
        LQP.add(LP);
        LQP.setLayout(new BoxLayout(LQP, BoxLayout.X_AXIS));
		
        LAL.add(LA);
        LAL.add(LS);
        LAL.add(LD);
        LAL.add(LF);
        LAL.add(LG);
        LAL.add(LH);
        LAL.add(LJ);
        LAL.add(LK);
        LAL.add(LL);
        LAL.setLayout(new BoxLayout(LAL, BoxLayout.X_AXIS));
		
        LZM.add(LZ);
        LZM.add(LX);
        LZM.add(LC);
        LZM.add(LV);
        LZM.add(LB);
        LZM.add(LN);
        LZM.add(LM);
        LZM.add(Lspace);
        LZM.add(Ldel);
        LZM.setLayout(new BoxLayout(LZM, BoxLayout.X_AXIS));
        
        
        LSpaceDel.add(Lspace);
        LSpaceDel.add(Ldel);
        LSpaceDel.setLayout(new BoxLayout(LSpaceDel, BoxLayout.X_AXIS));
		
		//add to keyBorad Main Panel
		keyBoard.add(LQP);
		keyBoard.add(LAL);
		keyBoard.add(LZM);
		keyBoard.add(LSpaceDel);
		keyBoard.add(Box.createRigidArea(new Dimension(0, 6)));
		keyBoard.setLayout(new BoxLayout(keyBoard, BoxLayout.Y_AXIS));
		keyBoard.setBorder(new TitledBorder(new EtchedBorder(), "keyBoard"));
		
		commandPanel.add(cmdButtons);
		commandPanel.add(Box.createRigidArea(new Dimension(0, 6)));
		commandPanel.setLayout(new BoxLayout(commandPanel, BoxLayout.X_AXIS));
		

		

        
        
        //Left Side
        leftSide.add(parkstudPanel);
        leftSide.add(Box.createRigidArea(new Dimension(30, 0)));
        leftSide.add(parkCarPanel);
        leftSide.add(Box.createRigidArea(new Dimension(30, 0)));
        leftSide.add(parkDatePanel);
        leftSide.setAlignmentY(TOP_ALIGNMENT);
        leftSide.setLayout(new BoxLayout(leftSide, BoxLayout.X_AXIS));
        
        //Right Side
        
        //rightSide.setLayout(new BoxLayout(rightSide, BoxLayout.Y_AXIS));
        
      //downRight Side
        downRightSide.add(keyPad);
        downRightSide.setLayout(new BoxLayout(downRightSide, BoxLayout.Y_AXIS));
        
      //downLeft Side
        downLeftSide.add(keyBoard);
        downLeftSide.setLayout(new BoxLayout(downLeftSide, BoxLayout.Y_AXIS));
        
        
        //top Half
       // topHalf.add(leftSide);
        //topHalf.add(Box.createRigidArea(new Dimension(12, 8)));
        //topHalf.add(rightSide);
       // topHalf.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        //topHalf.setLayout(new BoxLayout(topHalf, BoxLayout.X_AXIS));
        
        //down Half
        downHalf.add(downLeftSide);
        downHalf.add(Box.createRigidArea(new Dimension(12, 8)));
        downHalf.add(downRightSide);
        //downHalf.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        downHalf.setLayout(new BoxLayout(downHalf, BoxLayout.X_AXIS));
        
        //All in One
        center.add(leftSide);
        center.add(Box.createRigidArea(new Dimension(12, 8)));
        center.add(downHalf);
        center.add(commandPanel);
        center.setBorder(BorderFactory.createEmptyBorder(20,0,10,0));
        center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
        
        
       
           
        //add to the contentpane
        this.add(top, BorderLayout.PAGE_START);
        this.add(center, BorderLayout.CENTER);
        //this.add(bottom, BorderLayout.PAGE_END);
        
        
        //TextFiled Settings
        parkStudID.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkStudID.setPreferredSize(new Dimension(210, 35));
        parkStudID.setMaximumSize(parkStudID.getPreferredSize());
        parkStudID.setMinimumSize(parkStudID.getPreferredSize());
        parkStudID.setFont(new Font("Arial", Font.BOLD, 22));
        parkStudID.setBackground(Color.decode("#E0ECF8"));
        
        parkStudPin.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkStudPin.setPreferredSize(parkStudID.getPreferredSize());
        parkStudPin.setMaximumSize(parkStudID.getPreferredSize());
        parkStudPin.setMinimumSize(parkStudID.getPreferredSize());
        parkStudPin.setFont(parkStudID.getFont());
        parkStudPin.setBackground(parkStudID.getBackground());
        
        parkStudEmail.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkStudEmail.setPreferredSize(parkStudID.getPreferredSize());
        parkStudEmail.setMaximumSize(parkStudID.getPreferredSize());
        parkStudEmail.setMinimumSize(parkStudID.getPreferredSize());
        parkStudEmail.setFont(parkStudID.getFont());
        parkStudEmail.setBackground(parkStudID.getBackground());
        
        parkCarMake.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCarMake.setPreferredSize(parkStudID.getPreferredSize());
        parkCarMake.setMaximumSize(parkStudID.getPreferredSize());
        parkCarMake.setMinimumSize(parkStudID.getPreferredSize());
        parkCarMake.setFont(parkStudID.getFont());
        parkCarMake.setBackground(parkStudID.getBackground());
        
        parkCarModel.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCarModel.setPreferredSize(parkStudID.getPreferredSize());
        parkCarModel.setMaximumSize(parkStudID.getPreferredSize());
        parkCarModel.setMinimumSize(parkStudID.getPreferredSize());
        parkCarModel.setFont(parkStudID.getFont());
        parkCarModel.setBackground(parkStudID.getBackground());
        
        parkCarPlate.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCarPlate.setPreferredSize(parkStudID.getPreferredSize());
        parkCarPlate.setMaximumSize(parkStudID.getPreferredSize());
        parkCarPlate.setMinimumSize(parkStudID.getPreferredSize());
        parkCarPlate.setFont(parkStudID.getFont());
        parkCarPlate.setBackground(parkStudID.getBackground());
       
        //ComboBox
        parkMonth.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkMonth.setPreferredSize(new Dimension(105, 35));
        parkMonth.setMaximumSize(parkMonth.getPreferredSize());
        parkMonth.setMinimumSize(parkMonth.getPreferredSize());
        parkMonth.setFont(parkStudID.getFont());
        parkMonth.setBackground(parkStudID.getBackground());
        
        parkYear.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkYear.setPreferredSize(parkMonth.getPreferredSize());
        parkYear.setMaximumSize(parkMonth.getPreferredSize());
        parkYear.setMinimumSize(parkMonth.getPreferredSize());
        parkYear.setFont(parkStudID.getFont());
        parkYear.setBackground(parkStudID.getBackground());
        
        parkCarInsurance.setAlignmentX(Component.LEFT_ALIGNMENT);
        parkCarInsurance.setPreferredSize(parkStudID.getPreferredSize());
        parkCarInsurance.setMaximumSize(parkStudID.getPreferredSize());
        parkCarInsurance.setMinimumSize(parkStudID.getPreferredSize());
        parkCarInsurance.setFont(parkStudID.getFont());
        parkCarInsurance.setBackground(parkStudID.getBackground());
        
        
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
        
        parkStudCalculate.setPreferredSize(new Dimension(300, 60));
        parkStudCalculate.setMaximumSize(parkStudCalculate.getPreferredSize());
        parkStudCalculate.setMinimumSize(parkStudCalculate.getPreferredSize());
        parkStudCalculate.setFont(new Font("Arial", Font.PLAIN, 28));
        parkStudCalculate.setOpaque(true);
        parkStudCalculate.setBackground(Color.decode("#E0F8EC"));
        
        parkStudCancel.setPreferredSize(parkStudCalculate.getPreferredSize());
        parkStudCancel.setMaximumSize(parkStudCalculate.getPreferredSize());
        parkStudCancel.setMinimumSize(parkStudCalculate.getPreferredSize());
        parkStudCancel.setFont(new Font("Arial", Font.PLAIN, 28));
        parkStudCancel.setOpaque(true);
        parkStudCancel.setBackground(Color.decode("#F8E0E0"));
        
        LQ.setPreferredSize(new Dimension(60, 60));
        LQ.setMaximumSize(LQ.getPreferredSize());
        LQ.setMinimumSize(LQ.getPreferredSize());
        LQ.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LW.setPreferredSize(LQ.getPreferredSize());
        LW.setMaximumSize(LQ.getPreferredSize());
        LW.setMinimumSize(LQ.getPreferredSize());
        LW.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LE.setPreferredSize(LQ.getPreferredSize());
        LE.setMaximumSize(LQ.getPreferredSize());
        LE.setMinimumSize(LQ.getPreferredSize());
        LE.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LR.setPreferredSize(LQ.getPreferredSize());
        LR.setMaximumSize(LQ.getPreferredSize());
        LR.setMinimumSize(LQ.getPreferredSize());
        LR.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LT.setPreferredSize(LQ.getPreferredSize());
        LT.setMaximumSize(LQ.getPreferredSize());
        LT.setMinimumSize(LQ.getPreferredSize());
        LT.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LY.setPreferredSize(LQ.getPreferredSize());
        LY.setMaximumSize(LQ.getPreferredSize());
        LY.setMinimumSize(LQ.getPreferredSize());
        LY.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LU.setPreferredSize(LQ.getPreferredSize());
        LU.setMaximumSize(LQ.getPreferredSize());
        LU.setMinimumSize(LQ.getPreferredSize());
        LU.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LI.setPreferredSize(LQ.getPreferredSize());
        LI.setMaximumSize(LQ.getPreferredSize());
        LI.setMinimumSize(LQ.getPreferredSize());
        LI.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LO.setPreferredSize(LQ.getPreferredSize());
        LO.setMaximumSize(LQ.getPreferredSize());
        LO.setMinimumSize(LQ.getPreferredSize());
        LO.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LP.setPreferredSize(LQ.getPreferredSize());
        LP.setMaximumSize(LQ.getPreferredSize());
        LP.setMinimumSize(LQ.getPreferredSize());
        LP.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LA.setPreferredSize(LQ.getPreferredSize());
        LA.setMaximumSize(LQ.getPreferredSize());
        LA.setMinimumSize(LQ.getPreferredSize());
        LA.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LS.setPreferredSize(LQ.getPreferredSize());
        LS.setMaximumSize(LQ.getPreferredSize());
        LS.setMinimumSize(LQ.getPreferredSize());
        LS.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LD.setPreferredSize(LQ.getPreferredSize());
        LD.setMaximumSize(LQ.getPreferredSize());
        LD.setMinimumSize(LQ.getPreferredSize());
        LD.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LF.setPreferredSize(LQ.getPreferredSize());
        LF.setMaximumSize(LQ.getPreferredSize());
        LF.setMinimumSize(LQ.getPreferredSize());
        LF.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LG.setPreferredSize(LQ.getPreferredSize());
        LG.setMaximumSize(LQ.getPreferredSize());
        LG.setMinimumSize(LQ.getPreferredSize());
        LG.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LH.setPreferredSize(LQ.getPreferredSize());
        LH.setMaximumSize(LQ.getPreferredSize());
        LH.setMinimumSize(LQ.getPreferredSize());
        LH.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LJ.setPreferredSize(LQ.getPreferredSize());
        LJ.setMaximumSize(LQ.getPreferredSize());
        LJ.setMinimumSize(LQ.getPreferredSize());
        LJ.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LK.setPreferredSize(LQ.getPreferredSize());
        LK.setMaximumSize(LQ.getPreferredSize());
        LK.setMinimumSize(LQ.getPreferredSize());
        LK.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LL.setPreferredSize(LQ.getPreferredSize());
        LL.setMaximumSize(LQ.getPreferredSize());
        LL.setMinimumSize(LQ.getPreferredSize());
        LL.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LZ.setPreferredSize(LQ.getPreferredSize());
        LZ.setMaximumSize(LQ.getPreferredSize());
        LZ.setMinimumSize(LQ.getPreferredSize());
        LZ.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LX.setPreferredSize(LQ.getPreferredSize());
        LX.setMaximumSize(LQ.getPreferredSize());
        LX.setMinimumSize(LQ.getPreferredSize());
        LX.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LC.setPreferredSize(LQ.getPreferredSize());
        LC.setMaximumSize(LQ.getPreferredSize());
        LC.setMinimumSize(LQ.getPreferredSize());
        LC.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LV.setPreferredSize(LQ.getPreferredSize());
        LV.setMaximumSize(LQ.getPreferredSize());
        LV.setMinimumSize(LQ.getPreferredSize());
        LV.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LB.setPreferredSize(LQ.getPreferredSize());
        LB.setMaximumSize(LQ.getPreferredSize());
        LB.setMinimumSize(LQ.getPreferredSize());
        LB.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LN.setPreferredSize(LQ.getPreferredSize());
        LN.setMaximumSize(LQ.getPreferredSize());
        LN.setMinimumSize(LQ.getPreferredSize());
        LN.setFont(new Font("Arial", Font.PLAIN, 28));
        
        LM.setPreferredSize(LQ.getPreferredSize());
        LM.setMaximumSize(LQ.getPreferredSize());
        LM.setMinimumSize(LQ.getPreferredSize());
        LM.setFont(new Font("Arial", Font.PLAIN, 28));
        
        Lspace.setPreferredSize(new Dimension(240, 60));
        Lspace.setMaximumSize(Lspace.getPreferredSize());
        Lspace.setMinimumSize(Lspace.getPreferredSize());
        Lspace.setFont(new Font("Arial", Font.PLAIN, 28));
        
        Ldel.setPreferredSize(new Dimension(120, 60));
        Ldel.setMaximumSize(Ldel.getPreferredSize());
        Ldel.setMinimumSize(Ldel.getPreferredSize());
        Ldel.setFont(new Font("Arial", Font.PLAIN, 28));
        
 
		
		
	}
	
	
}
