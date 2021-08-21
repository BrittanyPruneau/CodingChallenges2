package practicingJava;

public class XYBalance {

	public static void main(String[] args) {
		/*
		 * for(int i = 0; i<str.length(); i++) {
		 * 
		 * }
		 */
		String str = "aaxbby";
		Boolean b = xyBalance(str);
		System.out.println();
		String trj = "abc";
		String onetwo = oneTwo(trj);
		System.out.println(onetwo);
	}

	public static boolean xyBalance(String str) 
	{
		Boolean x = false;
		Boolean y = false;

		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) == 'x' && y == true) 
			{
				x = true;
				y = false;
			} else if (str.charAt(i) == 'x') 
			{
				x = true;
			}

			if (str.charAt(i) == 'y' && x == true)
				y = true;
		}

		if (x == false)
			y = true;
		return y;

	}
	
	public String repeatFront(String str, int n) {
		String ncharacters = "";

		for (int i = n; n > 0; n--) {
			ncharacters += str.substring(0, n);
		}
		return ncharacters;
	}

	public boolean xyzMiddle(String str) 
	{
	  String xyz = "xyz"; 
	 
	  int middle = str.length()/2; 
	  
	  if(str.length()<3)
	    return false; 
	  
	  if((str.length() % 2) != 0)
	  {
	    if(xyz.equals(str.substring(middle-1,middle+2)))
	    {
	      return true;
	    }
	      else
	      {
	        return false;
	      }
	  }
	    else if(xyz.equals(str.substring(middle-1, middle+2)) || xyz.equals(str.substring(middle-2, middle+1)))
	    {
	      return true;
	    }
	    else 
	      return false; 
	}
	
	public static String oneTwo(String str) 
	{
		 if( str.length() < 3 ) return "";
		  StringBuilder sb = new StringBuilder();
		  for(int s =0; s<str.length(); s++)
		  {
			  int temp = s;
			 
			 while(temp<(s+3)&&s<str.length()) 
			  {
				  sb.append(str.charAt(s+1)).append(str.charAt(s+2)).append(str.charAt(s));
				  s = s+3; 
			  }
		  }
		  return sb.toString();
	
	}

}
