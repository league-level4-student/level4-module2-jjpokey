package StringMethods;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.util.Arrays;
import java.util.Base64;

/*
Visit the JavaDocs for the String class to view everything you can do with a String.  


HINT:  Here are some String methods you might find useful 
contains
replace
trim
length
getBytes
endsWith
split 
indexOf
lastIndexOf
compareTo(IgnoreCase)
substring


Here are some Character methods you might find useful:
Character.toLowerCase(char c);
Character.isLetter(char c);
Character.isDigit(char c);
Character.getNumericValue(char c);
 */

public class StringMethods {

	// Given Strings s1 and s2, return the longer String
	public static String longerString(String s1, String s2) {
int i1 = s1.length();
int i2 = s2.length();
if(i1 > i2) {
	return s1;
}
else if(i1 < i2){
	return s2;
}
return s1;
	}

	
	// if String s contains the word "underscores", change all of the spaces to underscores
	public static String formatSpaces(String s) {
		String s2 = s;
		if(s.contains("underscores")) {
			s2 = s.replace(' ', '_');
		}
		System.out.println(s2);
		return s2;
	}

	
	// Return the name of the person whose LAST name would appear first if they were in alphabetical order
	// You cannot assume there are no extra spaces around the name, but you can
	// assume there is only one space between the first and last name
	public static String lineLeader(String s1, String s2, String s3) {
		s1 = s1.trim();
		s2 = s2.trim();
		s3 = s3.trim();
		
		String[] s11 = s1.split(" ");
		String[] s12 = s2.split(" ");
		String[] s13 = s3.split(" ");
		
		if(s11[1].compareTo(s12[1]) < 0 && s1.compareTo(s13[1]) < 0) {
			return s1;
		}
		else if(s12[1].compareTo(s11[1]) < 0 && s12[1].compareTo(s13[1]) < 0) {
			return s2;
		}
		else if(s13[1].compareTo(s11[1]) < 0 && s13[1].compareTo(s12[1]) < 0) {
			return s3;
		}
		return s1;
	}
	
	
	// Return the sum of all numerical digits in the String
	public static int numeralSum(String s) {
		int total = 0;
		for(int i = 0; i < s.length(); i++) {
			
		if(s.charAt(i) == '1') {
			total +=1;
		} 
		else if(s.charAt(i) == '2') {
			total +=2;
		}
		else if(s.charAt(i) == '3') {
			total +=3;
		}
		else if(s.charAt(i) == '4') {
			total +=4;
		} 
		else if(s.charAt(i) == '5') {
			total +=5;
		}
		else if(s.charAt(i) == '6') {
			total +=6;
		}
		else if(s.charAt(i) == '7') {
			total +=7;
		}
		else if(s.charAt(i) == '8') {
			total +=8;
		}
		else if(s.charAt(i) == '9') {
			total +=9;
		}
		else {
			total += 0;
		}
		}
		return total;
	}
	
	
	// Return the number of times String substring appears in String s
	public static int substringCount(String s, String substring) {
		return 0;
	}

	// Call Utitilities.encrypt to encrypt String s
	public static String encrypt(String s, char key) {
		return null;
	}

	// Call Utilities.decrypt to decrypt the cyphertext
	public static String decrypt(String s, char key) {
		return null;
	}


	// Return the number of words in String s that end with String substring
	// You can assume there are no punctuation marks between words
	public static int wordsEndsWithSubstring(String s, String substring) {
		return 0;
	}
	

	// Given String s, return the number of characters between the first occurrence
	// of String substring and the final occurrence
	// You can assume that substring will appear at least twice
	public static int distance(String s, String substring) {
		return 0;
	}


	// Return true if String s is a palindrome
	// palindromes are words or phrases are read the same forward as backward.
	// HINT: ignore/remove all punctuation and spaces in the String
	public static boolean palindrome(String s) {
		return true;
	}
	
}

class Utilities {
	// This basic encryption scheme is called single-byte xor. It takes a single
	// byte and uses exclusive-or on every character in the String.
	public static String encrypt(byte[] plaintext, byte key) {
		for (int i = 0; i < plaintext.length; i++) {
			plaintext[i] = (byte) (plaintext[i] ^ key);
		}
		return Base64.getEncoder().encodeToString(plaintext);
	}

	public static String decrypt(String cyphertext, byte key) {
		byte[] b = Base64.getDecoder().decode(cyphertext);
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) (b[i] ^ key);
		}
		return new String(b);
	}
}
