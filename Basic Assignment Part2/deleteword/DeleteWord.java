package deleteword;
import java.util.*;
public class DeleteWord {

	public static void main(String[] args) {
		System.out.println("Enter the ssentence");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toUpperCase();
		int l=s.length();
		char lastchar=s.charAt(l-1);
		if(lastchar!='.' && lastchar!='?'  && lastchar!='!' )
		{
			System.out.println("Invalid input. Enter sentence ending with '.'");
		}
		else
		{
			StringTokenizer str=new StringTokenizer(s,".,?,!");
			int c=str.countTokens();
			String w="",ans="";
			System.out.println("Enter the word to be deleted");
			String del=sc.next();
			System.out.println("Enter the position of the word");
			int pos=sc.nextInt();
			if(pos<1 || pos>c)
			{
				System.out.println("The position is out of range");
			}
			else
			{
				for(int i=1;i<=c;i++)
				{
					w=str.nextToken();
					if(w.equals(del)==true && i==pos)
						continue;
					ans=ans+w+" ";				
				}
			System.out.println("The string is"+ ans.trim()+lastchar);	
			}
		}
	}

}
