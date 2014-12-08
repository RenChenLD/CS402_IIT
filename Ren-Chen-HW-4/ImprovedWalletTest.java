package wallet;
import java.util.Scanner;

import wallet.ImprovedWallet;
public class ImprovedWalletTest {
	public static void main(String[] args)
	{
	ImprovedWallet w = new ImprovedWallet();
	boolean flag = true;
	while(flag)
	{
	System.out.println("Please input the type of coin(input '0' to exit):");
	Scanner sc = new Scanner(System.in);
	String coinType = (String) sc.next();
	if(coinType.equals("0"))
	{
		flag = false;
		break;
	}
	System.out.println("Please input the values:");
	String v = (String) sc.next();
	String v1 = (String)sc.next();
	w.run(coinType, v,v1);
	}
	}
}
