import java.awt.Color;
import java.awt.*;
import javax.swing.*;

public class LottoGUI extends JFrame{
	public LottoGUI(){
		super("CompSci Lotto");
		this.setSize(440, 260);
		GridLayout left, right;
		
		JPanel pleft = new JPanel();
		pleft.setBounds(0, 0, 70, 210);
		JPanel pright = new JPanel();
		pright.setBounds(70, 0, 350, 210);
		pright.setLayout(null);
		pleft.setLayout(null);
		JButton num[] = new JButton[49];
		JButton leftB[] = new JButton[3];
		String[] leftS = {"Draw", "Reset", "Quit"};
		
		int x,y,n;
		x = -50;
		y = 0;
		n = 0;
		for(int i = 0; i<7; i++)
		{
			for(int j = 0; j<7;j++)
			{
				x+=50;
				num[n] = new JButton(Integer.toString(n));
				num[n].setBounds(x, y, 50, 30);
				pright.add(num[n]);
				n++;
			}
			x=-50;
			y+=30;
		}
		
		y=0;
		for(int i=0; i<3;i++)
		{
			leftB[i] = new JButton(leftS[i]);
			leftB[i].setBackground(Color.black);
			leftB[i].setBounds(0, y, 70, 70);
			y+=70;
			pleft.add(leftB[i]);
		}
		
		leftB[0].setForeground(Color.green);
		leftB[1].setForeground(Color.red);
		leftB[2].setForeground(Color.white);
		
		JLabel label1 = new javax.swing.JLabel();
		label1.setBounds(0, 210, 200, 10);
		label1.setText("Picking numbers...");
		this.add(label1,null);
		JLabel label2 = new javax.swing.JLabel();
		label2.setBounds(390,210,30,10);
		label2.setText("$10");
		this.add(label2);
		Container c = new Container();
		c.add(pleft);
		c.add(pright);
		c.setVisible(true);
		this.add(c);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		LottoGUI l = new LottoGUI();
	}
}
