

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JButton;
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
	//--------Buttons-------
	public JButton start;
	
	
	//studentRecord
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
	public JTextField parkCarInsurance;
	public JTextField parkMonth;
	public JTextField parkYear;
	//---------Buttons---------
	public JButton parkStudCalculate;
	public JButton parkStudCancel;
	
	//PaymentApproved
	//---------Labels--------
	public JLabel payTotalLabel;
	public JLabel payPeriodLabel;
	//---------TextFields--------
	public JTextField payTotal;
	public JTextField payPeriod;
	//---------Buttons---------
	public JButton PayConfirm;
	public JButton PayCancel;
	
	//ParkingCard
	//---------Labels--------
	public JLabel parkCardIDLabel;
	public JLabel parkCardStudIDLabel;
	public JLabel parkCardStudNameLabel;
	public JLabel parkCardExpiredDateLabel;
	public JLabel parkCardBarcodeLabel;
	//---------TextFields--------
	public JTextField parkCardID;
	public JTextField parkCardStudID;
	public JTextField parkCardStudName;
	public JTextField parkCardExpiredDate;
	public JTextField parkCardBarcode;
	//----------Buttons---------
	public JButton parkCardNew;
	public JButton parkCardClose;
	
	protected JLabel header;
	protected JLabel info;
	protected JLabel info2;
	
	
	
	public JButton startButton;
	public JButton nextButton;
	public JButton backButton;
	public JButton exitButton;
	public JButton addDrink;
	public JButton newDrink;
	public JButton delDrink;
	public JButton showResult;
	public JButton saveButton;
	public JButton cancelButton;
	
	private String lang = "en"; 
	
	public abstractPage(){
		super(new BorderLayout());
		
		if ( lang.equals("en"))
		{
			//static Button 
			appLang = new JButton("عربي");
			//welcomePage
			//--------Labels--------
			appNameLabel = new JLabel("Parking Permit Kiosk");
			appInfoLabel = new JLabel("This application issues parking permits for York University's students");
			appVersionLabel = new JLabel("1.0");
			//--------Buttons-------
			start = new JButton("Start");

			//studentRecord
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
			parkCarInsurance = new JTextField("");
			parkMonth = new JTextField("");
			parkYear = new JTextField("");
			//---------Buttons---------
			parkStudCalculate = new JButton("Calculate");
			parkStudCancel = new JButton("Cancel");

			//PaymentApproved
			//---------Labels--------
			payTotalLabel = new JLabel("Total cost");
			payPeriodLabel = new JLabel("Total period");
			//---------TextFields--------
			payTotal = new JTextField("");
			payPeriod = new JTextField("");
			//---------Buttons---------
			PayConfirm = new JButton("Confirm");
			PayCancel = new JButton("Cancel");

			//ParkingCard
			//---------Labels--------
			parkCardIDLabel = new JLabel("Parking permit ID");
			parkCardStudIDLabel = new JLabel("Student number");
			parkCardStudNameLabel = new JLabel("Studnet name");
			parkCardExpiredDateLabel = new JLabel("Expired date");
			parkCardBarcodeLabel = new JLabel("Barcode");
			//---------TextFields--------
			parkCardID = new JTextField("");
			parkCardStudID = new JTextField("");
			parkCardStudName = new JTextField("");
			parkCardExpiredDate = new JTextField("");
			parkCardBarcode = new JTextField("");
			//----------Buttons---------
			parkCardNew = new JButton("New parking permit");
			parkCardClose = new JButton("Close");			
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
			parkCarInsurance = new JTextField("");
			parkMonth = new JTextField("");
			parkYear = new JTextField("");
			//---------Buttons---------
			parkStudCalculate = new JButton("احسب");
			parkStudCancel = new JButton("إلفاء الأمر");

			//PaymentApproved
			//---------Labels--------
			payTotalLabel = new JLabel("المجموع");
			payPeriodLabel = new JLabel("المدة");
			//---------TextFields--------
			payTotal = new JTextField("");
			payPeriod = new JTextField("");
			//---------Buttons---------
			PayConfirm = new JButton("وافق");
			PayCancel = new JButton("إلغاء الأمر");

			//ParkingCard
			//---------Labels--------
			parkCardIDLabel = new JLabel("رقم التصريح");
			parkCardStudIDLabel = new JLabel("رقم الطالب");
			parkCardStudNameLabel = new JLabel("اسم الطالب");
			parkCardExpiredDateLabel = new JLabel("تاريخ الانتهاء");
			parkCardBarcodeLabel = new JLabel("الباركود");
			//---------TextFields--------
			parkCardID = new JTextField("");
			parkCardStudID = new JTextField("");
			parkCardStudName = new JTextField("");
			parkCardExpiredDate = new JTextField("");
			parkCardBarcode = new JTextField("");
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
