

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public abstract class abstractPage extends JPanel{
	
	private static final long serialVersionUID = 1L;
	public JPanel top;
	public JPanel center;
	public JPanel bottom;
	
	//static buttons
	public JButton appLang;
	
	//WelcomePage
	//--------Labels--------
	public JLabel appNameLabel;
	public JLabel appInfoLabel;
	public JLabel appVersionLabel;
	public JLabel progs;
	//--------Buttons-------
	public JButton start;
	//--------image--------
	
	
	//studentRecord
	//--------Info--------
	public JLabel studLabel;
	public JLabel studInfoLabel;
	//--------Labels-------
	public JLabel studIDLabel;
	public JLabel studPinLabel;
	public JLabel studLastLabel;
	public JLabel studFirstLabel;
	public JLabel studStatusLabel;
	//--------TextFields-------
	public JTextField studID;
	public JTextField studPin;
	public JTextField studLast;
	public JTextField studFirst;
	public JTextField studStatus;
	//--------Buttons---------
	public JButton studClear;
	public JButton studNext;
	
	//parkingPermit
	//--------Info--------
	public JLabel parkLabel;
	public JLabel parkInfoLabel;
	//--------Labels--------
	public JLabel parkStudIDLabel;
	public JLabel parkStudPinLabel;
	public JLabel parkStudEmailLabel;
	public JLabel parkCarMakeLabel;
	public JLabel parkCarModelLabel;
	public JLabel parkCarPlateLabel;
	public JLabel parkCarInsuranceLabel;
	public JLabel parkMonthLabel;
	public JLabel parkYearLabel;
	//---------TextFields------
	public JTextField parkStudID;
	public JTextField parkStudPin;
	public JTextField parkStudEmail;
	public JTextField parkCarMake;
	public JTextField parkCarModel;
	public JTextField parkCarPlate;
	public JComboBox parkCarInsurance;
	public JComboBox parkMonth;
	public JComboBox parkYear;
	//---------Buttons---------
	public JButton parkStudCalculate;
	public JButton parkStudCancel;
	
	//PaymentApproved
	//--------Info--------
	public JLabel payLabel;
	public JLabel payInfoLabel;
	public JLabel payNoteLabel;
	//---------Labels--------
	public JLabel payTotalLabel;
	public JLabel payPeriodLabel;
	//---------TextFields--------
	public JTextField payTotal;
	public JTextField payPeriod;
	//---------Buttons---------
	public JButton payConfirm;
	public JButton payCancel;
	
	//ParkingCard
	//--------Info--------
	public JLabel parkCardLabel;
	public JLabel parkCardInfoLabel;
	//---------Labels--------
	public JLabel parkCardIDLabel;
	public JLabel parkCardStudIDLabel;
	public JLabel parkCardStudNameLabel;
	public JLabel parkCardExpiredDateLabel;
	public JLabel parkCardBarcodeLabel;
	//---------TextFields--------
	public JLabel parkCardID;
	public JLabel parkCardStudID;
	public JLabel parkCardStudName;
	public JLabel parkCardExpiredDate;
	public JLabel parkCardBarcode;
	//----------Buttons---------
	public JButton parkCardNew;
	public JButton parkCardClose;
	public JButton parkCardHist;
	
	//----------KeyPad-----------
	public JButton num1 = new JButton("1");
	public JButton num2 = new JButton("2");
	public JButton num3 = new JButton("3");
	public JButton num4 = new JButton("4");
	public JButton num5 = new JButton("5");
	public JButton num6 = new JButton("6");
	public JButton num7 = new JButton("7");
	public JButton num8 = new JButton("8");
	public JButton num9 = new JButton("9");
	public JButton num0 = new JButton("0");
	public JButton del = new JButton("<--");
	
	//----------KeyPad-----------
	public JButton LQ = new JButton("Q");
	public JButton LW = new JButton("W");
	public JButton LE = new JButton("E");
	public JButton LR = new JButton("R");
	public JButton LT = new JButton("T");
	public JButton LY = new JButton("Y");
	public JButton LU = new JButton("U");
	public JButton LI = new JButton("I");
	public JButton LO = new JButton("O");
	public JButton LP = new JButton("P");
	//second row
	public JButton LA = new JButton("A");
	public JButton LS = new JButton("S");
	public JButton LD = new JButton("D");
	public JButton LF = new JButton("F");
	public JButton LG = new JButton("G");
	public JButton LH = new JButton("H");
	public JButton LJ = new JButton("J");
	public JButton LK = new JButton("K");
	public JButton LL = new JButton("L");
	//third row
	public JButton LZ = new JButton("Z");
	public JButton LX = new JButton("X");
	public JButton LC = new JButton("C");
	public JButton LV = new JButton("V");
	public JButton LB = new JButton("B");
	public JButton LN = new JButton("H");
	public JButton LM = new JButton("M");
	public JButton Ldel = new JButton("BackSpace");
	public JButton Lspace = new JButton("Space");
	
	
	
	private String lang = "en"; 
	
	public abstractPage(){
		super(new BorderLayout());
		
		
		
		if ( lang.equals("en"))
		{
			//static Button 
			appLang = new JButton("Arabic");
			//welcomePage
			//--------Labels--------
			appNameLabel = new JLabel("Parking Permit Kiosk");
			appInfoLabel = new JLabel("This application issues parking permits for York University's students");
			appVersionLabel = new JLabel("1.0");
			progs = new JLabel("<html>"+"Created by: <br>" + "Aidan Waite <br>"+ "and <br>" + "Ahmad Aseeri");
			
			//--------Buttons-------
			start = new JButton("Start");

			//studentRecord
			//--------Info--------
			studLabel = new JLabel("Studnet Records");
			studInfoLabel = new JLabel("Checkes the stduents datebase wether they are eligible to issue a parking permit or not ");
			
			//--------Labels-------
			studIDLabel = new JLabel("Student number");
			studPinLabel = new JLabel("Student pin");
			studLastLabel = new JLabel("Last name");
			studFirstLabel = new JLabel("First name");
			studStatusLabel = new JLabel("Status");
			//--------TextFields-------
			studID = new JTextField("");
			studPin = new JTextField("");
			studLast = new JTextField("");
			studFirst = new JTextField("");
			studStatus = new JTextField("");
			//--------Buttons---------
			studClear = new JButton("Clear");
			studNext = new JButton("Next");

			//parkingPermit
			//--------Info--------
			parkLabel = new JLabel("Parking Permit");
			parkInfoLabel = new JLabel("Issues a prking permit for the eligible student");
			//--------Labels--------
			parkStudIDLabel = new JLabel("Student number");
			parkStudPinLabel = new JLabel("Student pin");
			parkStudEmailLabel = new JLabel("Email");
			parkCarMakeLabel = new JLabel("Make");
			parkCarModelLabel = new JLabel("Model");
			parkCarPlateLabel = new JLabel("Plate number");
			parkCarInsuranceLabel = new JLabel("Insurance");
			parkMonthLabel = new JLabel("Month");
			parkYearLabel = new JLabel("Year");
			//---------TextFields------
			parkStudID = new JTextField("");
			parkStudPin = new JTextField("");
			parkStudEmail = new JTextField("");
			parkCarMake = new JTextField("");
			parkCarModel = new JTextField("");
			parkCarPlate = new JTextField("");
			parkCarInsurance = new JComboBox();
			parkMonth = new JComboBox();
			parkYear = new JComboBox();
			//---------Buttons---------
			parkStudCalculate = new JButton("Calculate");
			parkStudCancel = new JButton("Cancel");

			//PaymentApproved
			//--------Info--------
			payLabel = new JLabel("Payment comfirmation");
			payNoteLabel = new JLabel("<html>"+"Note: The total cost will be added to the "+"</br>"+"financial student account. The cost for each day is C$3.5");
			//---------Labels--------
			payTotalLabel = new JLabel("Total cost is: ");
			payPeriodLabel = new JLabel("Total period is: ");
			//---------TextFields--------
			payTotal = new JTextField("");
			payPeriod = new JTextField("");
			//---------Buttons---------
			payConfirm = new JButton("Confirm");
			payCancel = new JButton("Cancel");

			//ParkingCard
			//--------Info--------
			parkCardLabel = new JLabel("Parking Permit Card");
			parkCardInfoLabel = new JLabel("Student must applay the card inside the card");
			//---------Labels--------
			parkCardIDLabel = new JLabel("Parking permit ID:");
			parkCardStudIDLabel = new JLabel("Student number:");
			parkCardStudNameLabel = new JLabel("Studnet name:");
			parkCardExpiredDateLabel = new JLabel("Expired date:");
			parkCardBarcodeLabel = new JLabel("Barcode:");
			//---------TextFields--------
			parkCardID = new JLabel("### ## ###");
			parkCardStudID = new JLabel("### ### ###");
			parkCardStudName = new JLabel("____ ___ ______");
			parkCardExpiredDate = new JLabel("May, 2014");
			parkCardBarcode = new JLabel("");
			//----------Buttons---------
			parkCardNew = new JButton("New");
			parkCardClose = new JButton("Close");
			parkCardHist = new JButton("History");
		}
		else if (lang.equals("ar"))
		{
			//static Button 
			appLang = new JButton("English");
			//welcomePage
			//--------Labels--------
			appNameLabel = new JLabel("نطام اصدار تصريح المواقف");
			appInfoLabel = new JLabel("برنامح تابع لجامغة يورك لاصدار تصريح المواقف للطلاب");
			appVersionLabel = new JLabel("١,٠");
			//--------Buttons-------
			start = new JButton("إبدأ");

			//studentRecord
			//--------Info--------
			studLabel = new JLabel("سجلات الطلاب");
			studInfoLabel = new JLabel("للتأكد من قابلية الطالب لاصدار بطاقة تصريح موقف ");
			//--------Labels-------
			studIDLabel = new JLabel("رقم الطالب");
			studPinLabel = new JLabel("الرقم السري");
			studLastLabel = new JLabel("اسم العائلة");
			studFirstLabel = new JLabel("الاسم الاول");
			studStatusLabel = new JLabel("الحالة");
			//--------TextFields-------
			studID = new JTextField("");
			studPin = new JTextField("");
			studLast = new JTextField("");
			studFirst = new JTextField("");
			studStatus = new JTextField("");
			//--------Buttons---------
			studClear = new JButton("مسح البيانات");
			studNext = new JButton("التالي");

			//parkingPermit
			//--------Info--------
			parkLabel = new JLabel("اصدار تصريح الموقف");
			parkInfoLabel = new JLabel("تعبئة بينات تصريح الموقف ");
			//--------Labels--------
			parkStudIDLabel = new JLabel("رقم الطالب");
			parkStudPinLabel = new JLabel("الرقم السري");
			parkStudEmailLabel = new JLabel("البريد الالكتروني");
			parkCarMakeLabel = new JLabel("نوع السيارة");
			parkCarModelLabel = new JLabel("المودبل");
			parkCarPlateLabel = new JLabel("رفم اللوحة");
			parkCarInsuranceLabel = new JLabel("التأمين");
			parkMonthLabel = new JLabel("الشهر");
			parkYearLabel = new JLabel("الستة");
			//---------TextFields------
			parkStudID = new JTextField("");
			parkStudPin = new JTextField("");
			parkStudEmail = new JTextField("");
			parkCarMake = new JTextField("");
			parkCarModel = new JTextField("");
			parkCarPlate = new JTextField("");
			parkCarInsurance = new JComboBox();
			parkMonth = new JComboBox();
			parkYear = new JComboBox();
			//---------Buttons---------
			parkStudCalculate = new JButton("احسب");
			parkStudCancel = new JButton("إلفاء الأمر");

			//PaymentApproved
			//--------Info--------
			payLabel = new JLabel("تأكيد الدفع");
			payInfoLabel = new JLabel("سيتم احتساب ٣.٥ دولار كندي عن كل يوم. وسيتم اضافتها الى السحلات المالية للطالب");
			//---------Labels--------
			payTotalLabel = new JLabel("المجموع");
			payPeriodLabel = new JLabel("المدة");
			//---------TextFields--------
			payTotal = new JTextField("");
			payPeriod = new JTextField("");
			//---------Buttons---------
			payConfirm = new JButton("وافق");
			payCancel = new JButton("إلغاء الأمر");

			//ParkingCard
			//--------Info--------
			parkCardLabel = new JLabel("بطاقة تصريح الموقف");
			parkCardInfoLabel = new JLabel("يجب وضع البطاقة في مكان واضح داخل السيارة");
			//---------Labels--------
			parkCardIDLabel = new JLabel("رقم التصريح");
			parkCardStudIDLabel = new JLabel("رقم الطالب");
			parkCardStudNameLabel = new JLabel("اسم الطالب");
			parkCardExpiredDateLabel = new JLabel("تاريخ الانتهاء");
			parkCardBarcodeLabel = new JLabel("الباركود");
			//---------TextFields--------
			parkCardID = new JLabel("");
			parkCardStudID = new JLabel("");
			parkCardStudName = new JLabel("");
			parkCardExpiredDate = new JLabel("");
			parkCardBarcode = new JLabel("");
			//----------Buttons---------
			parkCardNew = new JButton("اصدار تصريح جديد");
			parkCardClose = new JButton("إغلاق البرنامج");
		}
		
		top = new JPanel();
        center = new JPanel(new BorderLayout());
        bottom = new JPanel(new BorderLayout());
      
	}
	public String getLang(){
		return this.lang;
	}
	
	public void setLang(String b){
		this.lang = b;
	}

}
