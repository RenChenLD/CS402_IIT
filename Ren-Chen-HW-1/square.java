import java.util.Random;


public class square {
	public static void main(String []args)
	{
		long startTime = System.nanoTime();
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("a:");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j] = (int)((Math.random())*10);
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("b:");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				b[i][j] = (int)((Math.random())*10);
				System.out.print(b[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("a X b:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				c[i][j] = 0;
				for(int k=0;k<c.length;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
			}
			int column = 1;
			for(int k=0;k<c[i].length;k++)
			{
				if(column<c[0].length)
				{
					System.out.print(c[i][k]+"   ");
					column++;
				}
				else
				{
					System.out.println(c[i][k]+"   ");
					column = 1;
				}
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Program runs time:"+(endTime - startTime)+"ns");
		
		long startTime2 = System.nanoTime();
		double[][] A = new double[3][3];
		double[][] B = new double[3][3];
		double[][] C = new double[3][3];
		Random ran = new Random();
		System.out.println("A:");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				A[i][j] = ran.nextDouble();
				System.out.print(A[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("B:");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				B[i][j] = ran.nextDouble();
				System.out.print(B[i][j]+"   ");
			}
			System.out.println();
		}
		System.out.println("A X B:");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				C[i][j] = 0;
				for(int k=0;k<c.length;k++)
				{
					C[i][j] += A[i][k] * B[k][j];
				}
			}
			int column = 1;
			for(int k=0;k<C[i].length;k++)
			{
				if(column<C[0].length)
				{
					System.out.print(C[i][k]+"   ");
					column++;
				}
				else
				{
					System.out.println(C[i][k]+"   ");
					column = 1;
				}
			}
		}
		long endTime2 = System.nanoTime();
		System.out.println("Program runs time:"+(endTime2 - startTime2)+"ns");
		System.out.println("Time difference is:"+((endTime2 - startTime2)-(endTime - startTime))+"ns");
	}
}
