

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class controller extends abstractPage implements ActionListener 
{
	private abstractPage page;
	private a1 s;
	
	// constructor
	public controller( abstractPage p, a1 s)
	{
		this.page = p;
		this.s = s;
	}
	
	
	
// --------------------------------
// implement ActionListener method
// --------------------------------

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		Object source = ae.getSource();

	    // 'Command' - check if a command button was pressed
		//exit button
	      if (source == page.appLang)
	      {
	    	  if (getLang().equals("en"))
	    	  {
	    		  setLang("ar");
	    		  System.out.println("Arabic");
	    		//static Button 
		  			page.appLang.setText("Arabic");
		  			//welcomePage
		  			//--------Labels--------
		  			page.appNameLabel.setText("Parking Permit Kiosk");
		  			page.appInfoLabel.setText("This application issues parking permits for York University's students");
		  			page.appVersionLabel.setText("1.0");
		  			page.progs.setText("<html>"+"Created by: <br>" + "Aidan Waite <br>"+ "and <br>" + "Ahmad Aseeri");
		  			
		  			//--------Buttons-------
		  			page.start.setText("Start");

		  			//studentRecord
		  			//--------Info--------
		  			page.studLabel.setText("Studnet Records");
		  			page.studInfoLabel.setText("Checkes the stduents datebase wether they are eligible to issue a parking permit or not ");
		  			
		  			//--------Labels-------
		  			page.studIDLabel.setText("Student number");
		  			page.studPinLabel.setText("Student pin");
		  			page.studLastLabel.setText("Last name");
		  			page.studFirstLabel.setText("First name");
		  			page.studStatusLabel.setText("Status");
		  			//--------Buttons---------
		  			page.studClear.setText("Clear");
		  			page.studNext.setText("Next");

		  			//parkingPermit
		  			//--------Info--------
		  			page.parkLabel.setText("Parking Permit");
		  			page.parkInfoLabel.setText("Issues a prking permit for the eligible student");
		  			//--------Labels--------
		  			page.parkStudIDLabel.setText("Student number");
		  			page.parkStudPinLabel.setText("Student pin");
		  			page.parkStudEmailLabel.setText("Email");
		  			page.parkCarMakeLabel.setText("Make");
		  			page.parkCarModelLabel.setText("Model");
		  			page.parkCarPlateLabel.setText("Plate number");
		  			page.parkCarInsuranceLabel.setText("Insurance");
		  			page.parkMonthLabel.setText("Month");
		  			page.parkYearLabel.setText("Year");
		  			//---------Buttons---------
		  			page.parkStudCalculate.setText("Calculate");
		  			page.parkStudCancel.setText("Cancel");

		  			//PaymentApproved
		  			//--------Info--------
		  			page.payLabel.setText("Payment comfirmation");
		  			page.payNoteLabel.setText("<html>"+"Note: The total cost will be added to the "+"</br>"+"financial student account. The cost for each day is C$3.5");
		  			//---------Labels--------
		  			page.payTotalLabel.setText("Total cost is: ");
		  			page.payPeriodLabel.setText("Total period is: ");
		  			//---------Buttons---------
		  			page.payConfirm.setText("Confirm");
		  			page.payCancel.setText("Cancel");

		  			//ParkingCard
		  			//--------Info--------
		  			page.parkCardLabel.setText("Parking Permit Card");
		  			page.parkCardInfoLabel.setText("Student must applay the card inside the card");
		  			//---------Labels--------
		  			page.parkCardIDLabel.setText("Parking permit ID:");
		  			page.parkCardStudIDLabel.setText("Student number:");
		  			page.parkCardStudNameLabel.setText("Studnet name:");
		  			page.parkCardExpiredDateLabel.setText("Expired date:");
		  			page.parkCardBarcodeLabel.setText("Barcode:");
		  			//----------Buttons---------
		  			page.parkCardNew.setText("New");
		  			page.parkCardClose.setText("Close");
		  			page.parkCardHist.setText("History");
	    		  
	    		  
	    	  }
	    	  else if(getLang().equals("ar"))
	    	  {
	    		  setLang("en");
	    		  System.out.println("English");
	    		//static Button 
	    		  page.appLang.setText("English");
	  			//welcomePage
	  			//--------Labels--------
	    		  page.appNameLabel.setText("نطام اصدار تصريح المواقف");
	    		  page.appInfoLabel.setText("برنامح تابع لجامغة يورك لاصدار تصريح المواقف للطلاب");
	    		  page.appVersionLabel.setText("١,٠");
	  			//--------Buttons-------
	    		  page.start.setText("إبدأ");

	  			//studentRecord
	  			//--------Info--------
	    		  page.studLabel.setText("سجلات الطلاب");
	    		  page.studInfoLabel.setText("للتأكد من قابلية الطالب لاصدار بطاقة تصريح موقف ");
	  			//--------Labels-------
	    		  page.studIDLabel.setText("رقم الطالب");
	    		  page.studPinLabel.setText("الرقم السري");
	    		  page.studLastLabel.setText("اسم العائلة");
	    		  page.studFirstLabel.setText("الاسم الاول");
	    		  page.studStatusLabel.setText("الحالة");
	  			//--------Buttons---------
	    		  page.studClear.setText("مسح البيانات");
	    		  page.studNext.setText("التالي");

	  			//parkingPermit
	  			//--------Info--------
	    		  page.parkLabel.setText("اصدار تصريح الموقف");
	    		  page.parkInfoLabel.setText("تعبئة بينات تصريح الموقف ");
	  			//--------Labels--------
	    		  page.parkStudIDLabel.setText("رقم الطالب");
	    		  page.parkStudPinLabel.setText("الرقم السري");
	    		  page.parkStudEmailLabel.setText("البريد الالكتروني");
	    		  page.parkCarMakeLabel.setText("نوع السيارة");
	    		  page.parkCarModelLabel.setText("المودبل");
	    		  page.parkCarPlateLabel.setText("رفم اللوحة");
	    		  page.parkCarInsuranceLabel.setText("التأمين");
	    		  page.parkMonthLabel.setText("الشهر");
	    		  page.parkYearLabel.setText("الستة");
	  			//---------Buttons---------
	    		  page.parkStudCalculate.setText("احسب");
	    		  page.parkStudCancel.setText("إلفاء الأمر");

	  			//PaymentApproved
	  			//--------Info--------
	    		  page.payLabel.setText("تأكيد الدفع");
	  			//---------Labels--------
	    		  page.payTotalLabel.setText("المجموع");
	    		  page.payPeriodLabel.setText("المدة");
	  			//---------Buttons---------
	    		  page.payConfirm.setText("وافق");
	    		  page.payCancel.setText("إلغاء الأمر");

	  			//ParkingCard
	  			//--------Info--------
	    		  page.parkCardLabel.setText("بطاقة تصريح الموقف");
	    		  page.parkCardInfoLabel.setText("يجب وضع البطاقة في مكان واضح داخل السيارة");
	  			//---------Labels--------
	    		  page.parkCardIDLabel.setText("رقم التصريح");
	    		  page.parkCardStudIDLabel.setText("رقم الطالب");
	    		  page.parkCardStudNameLabel.setText("اسم الطالب");
	    		  page.parkCardExpiredDateLabel.setText("تاريخ الانتهاء");
	    		  page.parkCardBarcodeLabel.setText("الباركود");

	  			//----------Buttons---------
	    		  page.parkCardNew.setText("اصدار تصريح جديد");
	    		  page.parkCardClose.setText("إغلاق البرنامج");
	    		  page.parkCardHist.setText("السحل");
	    		  
	    	  }
	      }
	      
	      //start button
	      if(source == page.start)
	      {
	    	  System.out.println("Move to Student Records Page");
	    	  page.setVisible(false);
	    	  
	    	  if(page instanceof welcomePage)
	    	  {
	    		  welcomePage wp = (welcomePage) page;
	    		  //wp.saveAlc();
	    		  s.setCardLayout("2");
	    		  s.setFrameSize(530, 490);
	    		  s.frameSetMidd();
	    		  page.studID.setFocusable(true);
	    	  }
	      }
	      
	      if(source == page.studNext)
	      {
	    	  System.out.println("Move to Parking Permit Page");
	    	  s.setCardLayout("3");
	    	  s.setFrameSize(850, 750);
	    	  s.frameSetMidd();
	    	
	      }
	      
	      if(source == page.studClear)
	      {
	    	  System.out.println("Clear Text Fields!");
	    	  studID.setText("");
	    	  studPin.setText("");
	    	  studLast.setText("");
	    	  studFirst.setText("");
	    	  studStatus.setText("");
	      }
	      
	      if(source == page.parkStudCalculate)
	      {
	    	  System.out.println("Move to Payment Approved Page");
	    	  s.setCardLayout("4");
	    	  s.setFrameSize(515, 300);
	    	  s.frameSetMidd();
	      }
	      
	      if(source == page.parkStudCancel)
	      {
	    	  System.out.println("Move to Welcome Page");
	    	  s.setCardLayout("1");
	    	  s.setFrameSize(450, 300);
	    	  s.frameSetMidd();
	    	  
	      }
	      
	      if(source == page.payConfirm)
	      {
	    	  System.out.println("Move to Parking Card Page");
	    	  s.setCardLayout("5");
	    	  s.setFrameSize(400, 730);
	    	  s.frameSetMidd();
	    	  s.main.setBackground(Color.WHITE);
	      }
	      
	      if(source == page.payCancel)
	      {
	    	  System.out.println("Move to Welcome Page");
	    	  s.setCardLayout("1");
	      }
	      
	      if(source == page.parkCardNew)
	      {
	    	  System.out.println("Move to Student Record Page");
	    	  s.setCardLayout("2");
	    	  s.setFrameSize(530, 490);
    		  s.frameSetMidd();
    		  page.studID.setFocusable(true);
    		  s.main.setBackground(null);
	    	  
	      }
	      
	      if(source == page.parkCardClose)
	      {
	    	  System.out.println("End the application");
	    	  System.exit(0);
	      }
	      
	      if(source == page.parkCardHist)
	      {
	    	  System.out.println("Move to Parking Permit Page");
	    	  s.setCardLayout("6");
	    	  s.setFrameSize(700, 500);
	    	  s.frameSetMidd();
	    	  s.main.setBackground(null);
	      }
	  
	   
	      
	    
	}
	
}

