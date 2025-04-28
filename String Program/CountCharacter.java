public class CountCharacter{
	public static void main(String[] args)
	{
		String  a = "Happy";
		char[] ch = a.toCharArray();
		boolean b[] = new boolean[a.length ()];
		for(int i=0;i<ch.length;i++){
			if(b[i] ){
				continue;
			}
			int count = 1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j]){
				count++;
				b[j] = true;}
			}
		System.out.print("[" +ch[i] +":" +count +"]");
	}
	
			
		 
	   }
   
}
