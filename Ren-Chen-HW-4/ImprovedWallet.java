package wallet;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ImprovedWallet {
	static HashMap<String, Integer> wal = new HashMap<String, Integer>();
	public void add(String coinType, int v0)
	{			
		wal.put(coinType, v0);		
	}
	public static void outPut(Map map)
	{
	   if(map != null)
	   {
	    Object key    = null;
	    Object value = null;
	    Iterator<?> iterater = map.keySet().iterator();
	    while(iterater.hasNext())
	    {
	     key = iterater.next();
	     value = map.get(key);
	     System.out.print(key+": "+value+"\n");
	    }
	   }
	}
	public void equal(String coinType1, String coinType2)
	{
		if(wal.containsKey(coinType1)&&wal.containsKey(coinType2))
				System.out.println("They are the same.");
			else
				System.out.print("They are different.");
	}
	public void run(String coinType, String v, String v1)
	{
			
			StringBuffer sb= new StringBuffer().append(coinType).append('(').append(v.toString()).append(" ").append(v1).append(')');
			coinType = (String) sb.toString();
			int v0 = 1;
			if(wal.containsKey(coinType)){
			v0 = Integer.valueOf(wal.get(coinType)) + 1;
			}
			this.add(coinType, v0);
			this.outPut(wal);
	}
}
