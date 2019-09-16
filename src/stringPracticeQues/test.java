package stringPracticeQues;

import java.nio.charset.Charset;

public class test {

	public static void main(String[] args) {
		byte[] bArr = {71,101, 101, 107, 115};
		String s_byte = new String(bArr);
		System.out.println(s_byte);
		
		Charset cs = Charset.defaultCharset();
		String s1 = new String(bArr, cs);
		System.out.println(s1);
		
		String s = "GeeksofGeeks";
		System.out.println("Length : " + s.length());
		
		System.out.println("CharAt : " + s.charAt(3));
		
		
		System.out.println(s.substring(3)); //returns string from ith index to last of string
		System.out.println(s.substring(3, 8)); ////returns string from ith index to end index
		String s2 = "GeeksAgain";
		System.out.println("String after concatinating" + s1.concat(s2));
		System.out.println("S1 is : " + s1); // String is immutable
		
		String s4="Learn share learn share" ;
		System.out.println("Index of share is : "+ s4.indexOf("share"));
		
		System.out.println("Index of a is: " + s4.indexOf('a',3));
		System.out.println("Geeks".equals("geeks"));
		System.out.println("Geeks".equals("Geeks"));
		
		System.out.println("Geeks".equalsIgnoreCase("geeks"));
		
		System.out.println("geeky".toUpperCase());
		
		String word = "Learn gekj learn   ";
		System.out.println(word.trim());
		
		//Replacing characters
		
		System.out.println("String after replacing :" + s.replace('G', 'f')); 
		
		System.out.println("s still has the value " + s);
		
		String str5=s.replace('G', 'f');
		System.out.println(str5);
		
		
		

	}

}
