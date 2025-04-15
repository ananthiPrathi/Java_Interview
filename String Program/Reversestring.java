public class Reversestring{
      public static void main(String[] args)
	  {
		  String a = "Happy Learning";
		  System.out.println("original String :"+a);
		  
		  StringBuilder obj = new StringBuilder(a);
		  System.out.println("Reversed String :"+obj.reverse());
		  
		  for(int i=a.length()-1;i>=0;i--){
			  System.out.print(a.charAt(i));
		  }
			  
	  }
	  }