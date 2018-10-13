import java.util.Scanner;


/* Jump Problem : To count jumps till end of string
 * Input in format of 1s and 0s
 * Example 10101  Number of Jumps: 2 to reach end of string
 * Example 11110  Number of Jumps: 5 to reach end of String
1. Jump from 0 to 0 and 1 to 1 
*/
public class Jump {

	public static void main(String args[])
	{
		
	
	int maxjump=Integer.MIN_VALUE;
	int count = 1;
	String s="";
	System.out.println("\nEnter the string to count the junps for:");
	Scanner scan = new Scanner(System.in);
		s= scan.next();	
				
			
	char end = s.charAt(s.length()-1);
	
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) == end)
		{
			if(count>maxjump)
			{
				maxjump=count;
			}
			count=1;
		}
		else
		{
			count++;
		}
	}
	System.out.println(maxjump);
	}
}
