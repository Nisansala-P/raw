package functions;

public class Palindrome {

	public boolean checkPalindrome(String str) {
		//return str.equals(new StringBuilder(str).reverse().toString());
		int n = str.length();
		str = str.toLowerCase();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true; 
	}
}
