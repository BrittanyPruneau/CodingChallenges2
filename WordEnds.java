package practicingJava;

public class WordEnds {

	public static void main(String[] args) {

		String newString6 = wordEnds6("ihhi", "i");
		System.out.println(newString6);

	}

	private static String wordEnds6(String str, String word)
	{
		StringBuilder WordEnds = new StringBuilder();
		int i =0;
		if(str.equals(word))
		{
			return "";
		}
		
		if(word.length() == 1)
		{
			for(i=0; i<str.length()-1; i++)
			{
				if(str.charAt(i) == word.charAt(0) && i==0)
				{
					WordEnds.append(str.charAt(i+1));
				}
				else if(str.charAt(i) == word.charAt(0) && i>0 && i<str.length())
				{
					WordEnds.append(str.charAt(i-1)).append(str.charAt(i+1));
				}
				else if(i == str.length() && i!=word.charAt(0))
				{
					return WordEnds.toString();
				}
				else 
					return WordEnds.toString();

			}
		}
		
		
		if(word.length()>1)
		{

			for (i = 0; i < str.length(); i++)  // for through the String str
			{
				if(str.charAt(i) == word.charAt(0)) // the only way to get into othis loop is if i is == the first character of String word
				{
					int count = 0;
					while(i<str.length() && count<word.length()) // while our index is less than the String str AND the count of == characters is less than the total characters in String 
					{
						if(str.charAt(i) != word.charAt(count)) // if the char is != char(count) we will break out
						{
							break;
						}
						i++;  //while str.charAt(i) == word.charAt(count) i++ and count++
						count++;
					}
				
					if(count == i)
					{
						int temp = str.length()-count; 
						WordEnds.append(str.charAt(str.length()-temp)); 
						i = i-1;
					}
					if(i==str.length() && count == word.length()) // this one is for end of the 
					{
					// print the index i that is 
						int charBeforeEnd = (str.length()-1)-word.length(); 
						WordEnds.append(str.charAt(charBeforeEnd));
					}
				}
			}
		}	
		return WordEnds.toString(); 
		}
	

	// after we get paste count=length which means all three characters are same we
	// can jump out and do things
	// we will have a number of things to do based on where i is located.

	// for XYXsdlfj (if count==i) when 3 is the count (8-3 = 5) so we want to
	// append-> index (str.length-5 = 3)
	// for XYXXYX if(str.length-count == i - count) when 3 is the count (6-3 = 3) so
	// append (str.length-3) AND append(str.length-count+1)
	// for dfXYxy elseif(count!=i && str.length-count != i-count) append.(figure out
	// where i is and adjust yor append before and append after)
	// "abc1xyz1i1j", "1") will the above work?
	//

	// above we have an entry in if the first characters are == to each other.
	// we can stay in the while loop until our characters alike are different OR
	// greater than length of word
	// then we have a seperate space for if statments that tell us what to do as
	// soon as we break the while loop
	// lets see what variables look like once I get out of the while loop

	private static String wordEnds5(String str, String word) {
		StringBuilder WordEnds = new StringBuilder();
		int i = 0;
		for (i = 0; i < str.length(); i++) // for through the String str
		{
			int prev = i - 1;
			if (str.charAt(i) == word.charAt(0)) // the only way to get into othis loop is if i is == the first
													// character of String word
			{
				int count = 0;
				while (i < str.length() && count < word.length()) // while our index is less than the String str AND the
																	// count of == characters is less than the total
																	// characters in String
				{
					if (str.charAt(i) != word.charAt(count)) // if the char is != char(count) we will break out
					{
						break;
					}
					i++; // while str.charAt(i) == word.charAt(count) i++ and count++
					count++;
				}
				// once they are no longer equal(innerloop), or i> word length(outerloop) --i or
				// if
				i--; //
				if (count == word.length()) {
					if (prev >= 0)
						WordEnds.append(str.charAt(prev)); // append char 2 before i(bc we sued i-- above)
					if (i + 1 < str.length())
						WordEnds.append(str.charAt(i + 1)); // append the charAt i-1(bc we used i-- above)
				}
			}
		}
		return WordEnds.toString();
	}

	private static String wordEnds4(String str, String word) {
		StringBuilder wordEnds = new StringBuilder();
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			int j = 0;
			int count = 0;

			while (str.charAt(i) == word.charAt(j) && j < word.length() - 1) {
				i++;
				j++;
				count++;
			}
			if (word.length() - (i) == 0) {
				wordEnds.append(str.charAt(i));
			}
			if (str.length() - word.length() == i) {
				wordEnds.append(str.charAt(i - 1));
			}
		}
		return wordEnds.toString();
	}
	/*
	 * if(i>0 && str.charAt(i)==word.charAt(j) && (count+1) == word.length() &&
	 * i!=str.length()-1) { wordEnds.append(str.charAt(i+1)); j = 0; break; }
	 */
	/*
	 * if (i > 0 && str.charAt(i) != word.charAt(j-1) && i== word.length()) {
	 * wordEnds.append(str.charAt(i)); j=0; } else if (i > 0 && str.charAt(i) !=
	 * word.charAt(j-1)) { count = count +1; wordEnds.append(str.charAt(i -
	 * count)).append(str.charAt(i)); j = 0; } else if (i>0 && str.charAt(i) ==
	 * word.charAt(j) && i == str.length()-1) { count = count +1;
	 * wordEnds.append(str.charAt(i-count)); break; }
	 */

	private static String wordEnds3(String str, String word) {
		StringBuilder wordEnds = new StringBuilder();
		int i = 0;
		for (i = 0; i < str.length() - 1; i++) {
			int j = 0;
			int count = 0;
			while (str.charAt(i) == word.charAt(j)) {
				i++;
				j++;
				count++;
				/*
				 * if(i>0 && str.charAt(i)==word.charAt(j) && (count+1) == word.length() &&
				 * i!=str.length()-1) { wordEnds.append(str.charAt(i+1)); j = 0; break; }
				 */

				if (i > 0 && str.charAt(i) != word.charAt(j - 1) && i == word.length()) {
					wordEnds.append(str.charAt(i));
					j = 0;
				} else if (i > 0 && str.charAt(i) != word.charAt(j - 1)) {
					count = count + 1;
					wordEnds.append(str.charAt(i - count)).append(str.charAt(i));
					j = 0;
				} else if (i > 0 && str.charAt(i) == word.charAt(j) && i == str.length() - 1) {
					count = count + 1;
					wordEnds.append(str.charAt(i - count));
					break;
				}
			}

		}
		return wordEnds.toString();
	}

	private static String wordEnds2(String str, String word) {
		int i = 0;
		char x = word.charAt(0);
		char y = word.charAt(1);
		if (!str.contains(word)) {
			return "";
		}
		StringBuilder XY = new StringBuilder();
		for (i = 0; i <= str.length() - 2; i++) {
			if (str.charAt(i) == x && str.charAt(i + 1) == y && i == str.length() - 2) {
				XY.append(str.charAt(i - 1));
			}
			if (str.charAt(i) == x && str.charAt(i + 1) == y && i > 0 && i != str.length() - 2) {
				XY.append(str.charAt(i - 1)).append(str.charAt(i + 2));
			}
			if (str.charAt(i) == x && str.charAt(i + 1) == y && i == 0) {
				XY.append(str.charAt(i + 2));
			}
		}
		return XY.toString();
	}
	/*
	 * int i = 0; char x = word.charAt(0); char y = word.charAt(1);
	 * if(!str.contains(word)) { return ""; } StringBuilder XY = new
	 * StringBuilder(); if(str.contains("xy"); for(i=0; i<=str.length()-2; i++) {
	 * if(str.charAt(i)==x && str.charAt(i+1)==y && i==str.length()-2) {
	 * XY.append(str.charAt(i-1)); } if(str.charAt(i)==x && str.charAt(i+1)==y &&
	 * i>0 && i != str.length()-2) {
	 * XY.append(str.charAt(i-1)).append(str.charAt(i+2)); } if(str.charAt(i)==x &&
	 * str.charAt(i+1)==y && i==0) { XY.append(str.charAt(i+2)); } } return
	 * XY.toString(); }
	 */

}
