package wallet;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImprovedWalletTestTest {

	@Test
	public void testAddandPrint()
	{
		ImprovedWallet wal = new ImprovedWallet();
		wal.add("penny(1 cent)", 1);
		wal.outPut(wal.wal);
	}
	
	@Test
	public void testEqual()
	{
		ImprovedWallet wal = new ImprovedWallet();
		wal.add("penny(1 cent)", 1);
		wal.add("penny(1 cent)", 2);
		wal.equal("penny(1 cent)", "penny(1 cent)");

	}
	
	@Test
	public void testNotEqual()
	{
		ImprovedWallet wal = new ImprovedWallet();
		wal.add("penny(1 cent)", 1);
		wal.add("Penny(1 cent)", 1);
		wal.equal("penny(1 cent)", "Penny(1 cent)");
			
	}
	
	@Test
	public void testRun()
	{
		ImprovedWallet wal = new ImprovedWallet();
		wal.run("dime", "10", "cents");
	}
}
