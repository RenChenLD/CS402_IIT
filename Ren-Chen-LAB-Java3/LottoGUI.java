import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Stack;

import javax.swing.*;

public class LottoGUI extends JFrame implements ActionListener, KeyListener{
	
	static JButton num[] = new JButton[49];
	static JButton leftB[] = new JButton[3];
	String[] leftS = {"Draw", "Reset", "Quit"};
	static Stack stack = new Stack();
	static Stack selected = new Stack();
	static int money = 10;
	static JLabel result = new javax.swing.JLabel();
	public LottoGUI(){
		super("CompSci Lotto");
		this.setSize(440, 260);
		JPanel pleft = new JPanel();
		pleft.setBounds(0, 0, 70, 210);
		JPanel pright = new JPanel();
		pright.setBounds(70, 0, 350, 210);
		pright.setLayout(null);
		pleft.setLayout(null);
		addKeyListener(this);
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
				num[n].addActionListener(this);
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
			leftB[i].addActionListener(this);
			y+=70;
			pleft.add(leftB[i]);
		}
		
		leftB[0].setForeground(Color.gray);
		leftB[0].setEnabled(false);
		leftB[1].setForeground(Color.red);
		leftB[2].setForeground(Color.white);
		
		JLabel label1 = new javax.swing.JLabel();
		label1.setBounds(0, 210, 200, 10);
		label1.setText("Picking numbers...");
		this.add(label1,null);
		result.setBounds(390,210,30,10);
		result.setText("$"+money);
		this.add(result);
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
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Draw"))
		{
			int x =e.getModifiers()&ActionEvent.SHIFT_MASK;
			if(x == 1)
			{
				pickWinner(true);
				money ++;
				System.out.println("mark");
			}
			else
			{
				pickWinner(false);
				boolean win = true;
				for(int i = 0; i<6; i++)
					if(!selected.contains(stack.elementAt(i)))
						win = false;
				if(win)
					money ++;
				else
					money --;
			}
			result.setText("$"+money);
		}else if(e.getActionCommand().equals("Reset"))
		{
			for(int i = 0; i< num.length; i++)
				num[i].setBackground(Color.white);
			stack.clear();
			selected.clear();
			leftB[0].setEnabled(false);
		}else if(e.getActionCommand().equals("Quit"))
		{
			this.dispose();
		}else
		{
			if(stack.size()<6&&!stack.contains(e.getActionCommand()))
			{
				num[Integer.valueOf(e.getActionCommand())].setBackground(Color.blue);
				stack.add(e.getActionCommand());
				if(stack.size()==6)
				{
					leftB[0].setEnabled(true);
					leftB[0].setForeground(Color.green);
				}else
				{
					leftB[0].setEnabled(false);
					leftB[0].setForeground(Color.gray);
				}
			}else if(stack.size()<=6&&stack.contains(e.getActionCommand()))
			{
				num[Integer.valueOf(e.getActionCommand())].setBackground(Color.white);
				stack.remove(e.getActionCommand());
				if(stack.size()==6)
				{
					leftB[0].setEnabled(true);					
				}else
					leftB[0].setEnabled(false);
			}else 
			{
				
			}
		}
	}
	
	
	public void pickWinner(boolean flag)
	{
		if(flag)
		{
			selected = stack;
		}else
		{
			int a;
			Random r = new Random();
			r.setSeed(48);
			for(int i = 0; i<6; i++)
			{
				a = r.nextInt();
				if(selected.contains(a))
					i=i-1;
				else
				selected.add(a);
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
