public class Checkpalindrome{
public static void main (String[] args)
{
	       String a = "Racecar";
		   a = a.toLowerCase();
		   boolean isfind = true;
		   for(int i=0;i<a.length();i++)
		   {
		     if(a.charAt(i) != a.charAt(a.length()-1-i))
			 {
				  isfind = false; 
			 }
		   }
		   if(isfind)
		   {
			   System.out.println( a +" " +"String is a palindrome");
		   }
		   else{
			   System.out.println(  a +" "+"String is a not a palindrome");
		   }
}
}