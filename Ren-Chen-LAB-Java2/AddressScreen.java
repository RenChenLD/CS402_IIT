import javax.swing.*;
public class AddressScreen extends JFrame {
	private JLabel Name, Address, City, State, Zip;
	private JTextField name, address, city, state, zip;
	private JButton add, modify, delete;
	
	public AddressScreen()
	{
		super();
		this.setSize(300,200);
		this.getContentPane().setLayout(null);
		int x = 0;
		int y = 0;
		int width = 93;
		int heigth = 18;
		this.add(getJLabel(Name, "Name:",x, y, width, heigth), null);
		this.add(getJLabel(Address, "Address:",x, y+20, width, heigth), null);
		this.add(getJLabel(City, "City:",x, y+40, width, heigth), null);
		this.add(getJLabel(State, "State:",x, y+60, width, heigth), null);
		this.add(getJLabel(Zip, "Zip:",x, y+80, width, heigth), null);
		x = x+150;
		width += 57;
		this.add(getJTextField(name,x, y, width, heigth), null);
		this.add(getJTextField(address,x, y+20, width, heigth), null);
		this.add(getJTextField(city,x, y+40, width, heigth), null);
		this.add(getJTextField(state,x, y+60, width, heigth), null);
		this.add(getJTextField(zip,x, y+80, width, heigth), null);
		
		this.add(getJButton(add,"Add",20, 100, 70, 27), null);
		this.add(getJButton(modify,"Modify",100, 100, 70, 27), null);
		this.add(getJButton(delete,"Delete",180, 100, 70, 27), null);

		this.setTitle("Address Information");
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	private javax.swing.JLabel getJLabel(JLabel name, String Name, int x, int y, int width, int heigth) {
		   if(name == null) {
		      name = new javax.swing.JLabel();
		      name.setBounds(x,y,width,heigth);
		      name.setText(Name);
		   }
		   return name;
		}

		private javax.swing.JTextField getJTextField(JTextField name, int x, int y, int width, int heigth) {
		   if(name == null) {
		      name = new javax.swing.JTextField();
		      name.setBounds(x,y,width,heigth);
		   }
		   return name;
		}

		private javax.swing.JButton getJButton(JButton name, String text, int x, int y, int width, int heigth) {
		   if(name == null) {
		      name = new javax.swing.JButton();
		      name.setBounds(x, y, width, heigth);
		      name.setText(text);
		   }
		   return name;
		}
		public static void main(String[] args)
		{
		   AddressScreen a = new AddressScreen();
		   a.setVisible(true);
		   
		}
}
