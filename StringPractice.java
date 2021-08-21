package practicingJava;

public class StringPractice 
{

	public static void main(String[] args) 
	{
		System.out.println(doubleChar("Britt"));
		String str = "Brittany";
		System.out.println(str.indexOf("rit"));
		System.out.println(str.substring(0,2)+str.substring(0,3));
		System.out.println(prefixAgain("BRittaBR", 2));
		System.out.println();
		/**
		 * str.charAt returns a character. str.substring returns a string!
		 */
		/**
		 * str.substring(0,3) returns the first character and the 2nd character 
		 */
		System.out.println(extraEnd("Candy"));
		System.out.println(xyzThere("abcxyz.xyz"));
	}
	
	private static String startOut(String str)
	{
		String star = "";
		
		for(int i = 0; i< str.length(); i++)
		{
			if(i == 0 && str.charAt(i) != '*')
			{
				star +=  str.charAt(i); 
			}
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*')
			{
				star += str.charAt(i); 
			}
			if(i> 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*')
			{
				star = star.substring(0, star.length()-1); 
			}
		}
		return star; 
	}
	
	private static boolean sameStarChar(String str) 
	{

		for (int i = 1; i < str.length() - 1; i++) 
		{
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) 
			{
				return false;
			}
		}
		return true;
	}


	private static boolean prefixAgain(String str, int n) 
	{
	  String prefix = str.substring(0,n); 
	  
	  for(int i = 0+n; i<str.length()-(n-1); i++)
	  {
	    if(str.substring(i,i+n).equals(prefix))
	    {
	    	return true;
	    }
	  }
	  return false; 
	  
	}
	
	private static String doubleChar(String str)
	{
		String result = "";
		for (int i = 0; i < str.length(); i++) 
		{
		result = result + str.charAt(i) + str.charAt(i);
		}

		return result;
	}
	
	private static String wordEnds(String str, String word)
		{
			int strLen = str.length();
			int wordLen = word.length();
			String result = "";

			for (int i = 0; i < strLen-wordLen+1; i++) 
			{
				if (i > 0 && str.substring(i,i+wordLen).equals(word))
				{
					result += str.charAt(i-1);
				}
				if (i < strLen-wordLen && str.substring(i,i+wordLen).equals(word))
				{
					result += str.charAt(i+wordLen);
				}
			}
			return result; 
		}
	
	
	
	
	public String zipZap(String str) 
	{
		String temp = "";

		if (str.length() <= 2)
		{
			return str;
		}

		for (int i = 0; i < str.length() - 2; i++) 
		{
			if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) 
			{
				temp += str.substring(i, i + 1) + str.substring(i + 2, i + 3);
				i += 2;
			} 
			else 
			{
				temp += str.substring(i, i + 1);
			}
		}
		return temp;
	}

	private static String getSandwich(String str) 
	{
		
		if(str.contains("bread"))
		{
			int x = str.indexOf("bread")+5;
			int y = str.lastIndexOf("bread");
			return str.substring(x,y);	
		}
		else
		{
			return ""; 
		}
	}
	
	
	private static String repeatSeparator(String word, String sep, int count) 
	{
			if(sep.equals(""))
			{
				return word; 
			}
			String temp = "";
			for(int i = 1; i<count; i++)
			{
				temp += word+sep; 
			}
			temp += word; 
			return temp; 
	}

	private static String mixString(String a, String b) 
	{
	 String temp = ""; 
	 int greatestStringIndex = 0; 
	 if(b.length()>a.length() && b.length()!=a.length())
	 {
		 greatestStringIndex = b.length();  
	 }
	 else
	 {
		 greatestStringIndex = a.length(); 
	 }
	 
	 for(int i =0; i<greatestStringIndex; i++)
	 {
		 if(i<a.length())
		 {
			 temp+= a.substring(i,i+1);
		 }
		 if(i<b.length())
		 {
			 temp+=b.substring(i,i+1); 
		 } 
	 }
	 return temp;  
  
	}
	
	private static boolean xyzThere(String str) 
	{
		if (str.equals("xyz") && str.length() == 3) 
		{
			return true;
		}
		for (int i = 0; i < str.length() - 4; i++) 
		{
			if (str.contains("xyz") && !str.contains(".xyz")) 
			{
				return true;
			}
			if (str.contains("xyz") && str.substring(i, i + 3).equals("xyz")
					&& !str.substring(i, i + 4).equals(".xyz")) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean CatDog(String str)
	{
		int c = 0; 
		for(int i=0; i<str.length()-2; i++)
		{
			if(str.substring(i,i+3).equals("cat"))
					{
						c++;
					}
			if(str.substring(i,i+3).equals("dog"))
					{
						c--; 
					}
		}
		return(c==0);
	}

	private static String comboString(String a, String b) 
	{
	  if(a.length()>b.length())
	  {
	  return b+a+b; 
	  }
	  if(a.length()<b.length())
	  {
	    return a+b+a; 
	  }
	  else
	  return ""; 
	}

	
	public String firstTwo(String str) 
	{
		if (str.length() > 1) 
		{
			return str.substring(0, 2);
		} 
		else if (str.length() == 1) 
		{
			return str.substring(0, 1);
		} 
		else
			return "";

	}
	
	public String left2(String str) 
	{
		return str.substring(2) + str.substring(0, 2);
	}

	public String withoutEnd(String str) 
	{
		return str.substring(1, str.length() - 1);
	}
	
	private static String extraEnd(String str) 
	{
		String firstTwo = str.substring(str.length()-2,str.length()); 
				return firstTwo+firstTwo+firstTwo; 
	}
	
	private static String middleThree(String str) 
	{
	  int middle = str.length()/2;
	  return str.substring(middle-1, middle+2);
	}
	
	private static String firstHalf(String str) 
	{
		int half = str.length()/2;
		String returned = str.substring(0,half);
		return returned;
	}

	private static String theEnd(String str, boolean front) 
	{
	  if(front)
	  {
	    return str.substring(0,1);
	  }
	  else
	  {
	    return str.substring(str.length()-1);
	  }
	}
	
	private static boolean endsLy(String str) 
	{
	  if(str.endsWith("ly"))
	  {
	  return true;
	  }
	  else
	  return false; 
	}
	
	private static int countCode(String str)
	{
		int count = 0;
		for (int i = 0; i < str.length()-3; ++i)
		{
		if (str.substring(i,i+2).equals("co") && str.charAt(i+3) == 'e') count++;
		}
			return count;
	}
	
	private static boolean bobThere(String str)
	{	
   		boolean bob = false; 
		for(int i=0; i<str.length()-2; i++)
		{
			if(str.substring(i,i+1).equals("b") && str.charAt(i+2) == 'b')
			{
				bob = true; 
			}
		}
		return bob; 
	}
	
	public String repeatEnd(String str, int n) 
	{
	  String nstring = "";
	 int start = str.length() - n; 
	 for(int i = 0; i<n; i++)
	 {
	  nstring  += str.substring(start);
	 }
	 return nstring; 
	}


	
	
	private static boolean prefixAgain2(String str, int n) 
	{
		String substr = str.substring(n);
		String pattern = str.substring(0, n);

		return substr.contains(pattern);
	}
	
	private static boolean sameStarChar1s(String str) 
	{
		 int start = str.indexOf("*");
		for (int i=1; i<str.length()-1; i++) 
		{
			if (str.charAt(i) == '*') 
			{
				if (str.substring(i-1,i) == null || str.substring(i+1,i) == null)
					{
					return false;
					}
			}
		}
		return true;
	}
		
	private static boolean sameStarChars2(String str) 
	{
			int star = str.lastIndexOf("*", str.length()-2);
			if(str.length()<3 || !str.contains("*")) return true;
			
			return str.charAt(star-1)==str.charAt(star+1);
	}
		
	private static String wordEnds3(String str, String word)
	{
		String temp ="";
		if(str.contains(word)) 
		{
			for(int i = 0; i<= str.length()- word.length(); i++)
			{
				int len = word.length(); 
				
				if(str.substring(i,len).equals(word) && i==0)
				{
					temp += str.substring(len,len+1); 
					System.out.println(temp);
				}
				if(str.substring(i,i+len).equals(word) && i == str.length()-word.length())
				{
					temp+= str.lastIndexOf(word);
					System.out.println(temp);
				}
			}
		}
		return temp; 
	}
	
	
}
