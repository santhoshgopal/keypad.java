import java.io.*;
import java.util.*;
public class keypad 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
Map<Integer, String> a = new HashMap<Integer, String>();
a.put(2, "ABC");
a.put(3, "DEF");
a.put(4, "GHI");
a.put(5, "JKL");
a.put(6, "MNO");
a.put(7, "PQRS");
a.put(8, "TUV");
a.put(9, "WXYZ");
		String n=in.nextLine();
		int len=n.length();
		char[] b=n.toCharArray();
		ArrayList<Character> abc=new ArrayList<Character>();
		for(int i=0;i<len;i++)
		abc.add(b[i]);
		for(char z : abc)
		{
		int z1=Character.getNumericValue(z);
		System.out.print(a.get(z1)+"\t");
		}
		
		if(len<=0)
		System.out.println("NO VALID INPUT");

	}
}