

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;




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
	    		  
	    		  
	    	  }
	    	  else if(getLang().equals("ar"))
	    	  {
	    		  setLang("en");
	    		  System.out.println("English");
	    		  
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
	    	  }
	      }
	      
	      if(source == page.studNext)
	      {
	    	  System.out.println("Move to Parking Permit Page");
	    	  s.setCardLayout("3");
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
	      }
	      
	      if(source == page.parkStudCancel)
	      {
	    	  System.out.println("Move to Welcome Page");
	    	  s.setCardLayout("1");
	      }
	      
	      if(source == page.payConfirm)
	      {
	    	  System.out.println("Move to Parking Card Page");
	    	  s.setCardLayout("5");
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
	      }
	      
	      if(source == page.parkCardClose)
	      {
	    	  System.out.println("End the application");
	    	  System.exit(0);
	      }
	      
	      /*
	      //handle on backButton on PersonalData
	      if(source == page.backButton)
	      {   	  
	    	  if(page instanceof studentRecord)
	    	  {
	    		  s.setCardLayout("1");
	    	  }  
	    	  
	    	  if(page instanceof paymentApproved)
	    	  {
	    		  s.setCardLayout("3");
	    	  }
	    	  
	      }
	      
	      if(source == page.nextButton)
	      {  
	    	  if(page instanceof studentRecord)
	    	  {
	    		 if(page.getIsDirty() == true )
	    		 {
	    			 JOptionPane.showMessageDialog(null,
                             "Please select one gender.",
                             "no value for gender",                                            
                             JOptionPane.WARNING_MESSAGE);
	    		 }
	    		 else
	    		 {		 
	    			 s.setCardLayout("3");
	    		 }
	    	  }
	      }
	 
	      //Action events AddDrink   
	      if(page instanceof AddDrink )
	      {    	  
	    	  AddDrink ad = (AddDrink) page;    	  
	    	  
	    	  if(source == page.backButton)
	    	  {
	    		  s.setCardLayout("2");
	    	  }
	    	  
	    	  if(source == page.addDrink)
	    	  {
	    		  ad.setCardLayoutRight("2");
	    		  ad.leftlist.setEnabled(false);
	    		  ad.addDrink.setEnabled(false);
	    		  ad.showResult.setEnabled(false);
	    		  ad.newDrink.setEnabled(false);
	    		  ad.delDrink.setEnabled(false);
	    		  
	    		  System.out.println("add drink to list");
	    	  }
	    	  
	    	  if(source == page.showResult)
	    	  {	
	    		  
	    		  if(ad.rmodel.getSize()==0)
	    		  {
	    			  JOptionPane.showMessageDialog(null,
	                             "There are no drinks in your drunken list",
	                             "no drunken drinks",                                            
	                             JOptionPane.WARNING_MESSAGE);
	    		  }
	    		  else
	    		  {	
	    			  s.getPanel4().openPage();
	    			  s.setCardLayout("4");
	    		  }
	    	  }
	    	  
	    	  if(source == page.newDrink)
	    	  {
	    		  ad.setCardLayoutLeft("2");
	    		  ad.rightlist.setEnabled(false);
	    		  ad.addDrink.setEnabled(false);
	    		  ad.deleteBtn.setEnabled(false);
	    		  ad.showResult.setEnabled(false);
	    	  }
	    	  
	    	  if(source == page.cancelButton)
	    	  {
	    		  ad.setCardLayoutLeft("1");
	    		  ad.rightlist.setEnabled(true);
	    		  ad.addDrink.setEnabled(true);
	    		  ad.deleteBtn.setEnabled(true);
	    		  ad.showResult.setEnabled(true);
	    	  }
	    	  if(source == ad.cancelButtonRight)
	    	  {
	    		  ad.setCardLayoutRight("1");
	    		  ad.leftlist.setEnabled(true);
	    		  ad.addDrink.setEnabled(true);
	    		  ad.showResult.setEnabled(true);
	    		  ad.newDrink.setEnabled(true);
	    		  ad.delDrink.setEnabled(true);
	    		  System.out.println("cancel");
	    	  }
	    	  
	    	  if(source == page.delDrink)
	    	  {
	    		  ad.deleteDrink();
	    	  }
	    	  
	    	  if(source == page.saveButton)
	    	  {
	    		 ad.addDrink.setEnabled(true);
	    		 ad.deleteBtn.setEnabled(true);
	    		 ad.showResult.setEnabled(true);
	    		 ad.rightlist.setEnabled(true);
	    		 ad.createNewDrink();
	    	  }
	    	  
	    	  if(source == ad.okButtonRight)
	    	  {
	    		  System.out.println("ok");
	    		  ad.addDrinkToDrinklist();
	    		  ad.leftlist.setEnabled(true);	    		  
	    		  ad.addDrink.setEnabled(true);
	    		  ad.showResult.setEnabled(true);
	    		  ad.newDrink.setEnabled(true);
	    		  ad.delDrink.setEnabled(true);
	    	  }
	    	  if(source == ad.deleteBtn)
	    	  {
	    		  ad.deleteDrinkPersList();
	    		  System.out.println("delete");
	    	  }
	    	  
	    	  
	      }
		*/
	}
	
}

