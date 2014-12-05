import java.util.Scanner;

import javax.swing.*;
public class DialogViewer {
	public static void main(String[] args)
	{
		JFrame root = new JFrame();
		root.setSize(600, 600);
		root.setVisible(true);
		root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane op = new JOptionPane();
		System.out.println("Please input command among 'f', 'c' and 'm'");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		if(c.equals("f"))
		{
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showDialog(root, "Open");
			if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            fc.getSelectedFile().getName());
			    }
			fc.setVisible(true);
		}else if(c.equals("c"))
		{
			op.showConfirmDialog(root, "Are you sure?");
			
		}else if(c.equals("m"))
		{
			op.showMessageDialog(root, "Ren Chen");
		}else
			System.out.println("Command error.");
	}
}
