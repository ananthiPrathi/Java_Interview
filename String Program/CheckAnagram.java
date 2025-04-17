import java.util.Arrays;
public class CheckAnagram{
 public static void main(String[] args)
 {
  String a = "Happys";
  String b = "silent";
  boolean result = checkanagram(a,b);
  if(result)
  {
	System.out.println("String is a Anagram");  
  }
  else
  {
	  System.out.println("String is a  not a Anagram");
	  
  }
 }
     public static boolean checkanagram(String a,String b)
	 {
		if(a.length() != b.length())
		{
			return false;
		}	
          
         char charArray1[] =  a.toCharArray();
		 char charArray2[] =  b.toCharArray();
		 
		 Arrays.sort(charArray1);
		 Arrays.sort(charArray2);
		 
		 return Arrays.equals(charArray1,charArray2);
		  
		 
	 }
  
 ;
 }