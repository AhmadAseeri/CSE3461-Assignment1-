

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;


public class history extends abstractPage
{
	private static final long serialVersionUID = 1L;
	


	//Constructor
	public history(a1 s)
	{
		controller controller = new controller(this, s);
		
		
		//
		
		Object columnNames[] = { "Candy Bar", "Calories", "Peanut-Free", "Price" };

		Object rowData[][] = { { "Mr. Small", new Integer(95), new Boolean(false), new Double(1.75) },
				{ "Kispy Kunch", new Integer(450), new Boolean(false), new Double(2.25) },
				{ "Kitch Katch", new Integer(400), new Boolean(true), new Double(2.75) },
				{ "Wunderbloat", new Integer(1300), new Boolean(false), new Double(2.65) },
				{ "Saramilk", new Integer(295), new Boolean(true), new Double(1.25) },
				{ "Big Swede", new Integer(300), new Boolean(false), new Double(3.10) },
				{ "Oh Hank", new Integer(450), new Boolean(false), new Double(4.25) },
				{ "Eat-Less", new Integer(333), new Boolean(false), new Double(2.50) },
				{ "Chewbacca", new Integer(456), new Boolean(false), new Double(1.85) },
				{ "Arrow", new Integer(375), new Boolean(false), new Double(1.75) },
				{ "Red Rocket", new Integer(300), new Boolean(true), new Double(2.00) } };

		JTable t = new JTable(rowData, columnNames);
		t.setPreferredScrollableViewportSize(new Dimension(300, 100));

		JScrollPane sp = new JScrollPane(t);

		// ------------------
		// arrange components
		// ------------------

		JPanel p = new JPanel(new BorderLayout());
		p.add(sp, "Center");
		p.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
		
		center.add(p);
		
		this.add(center, BorderLayout.CENTER);
		
		
	}
}