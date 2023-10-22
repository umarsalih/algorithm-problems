import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		
		System.out.println(longestPalindrome(name));
	}

    public static String longestPalindrome(String s) {
    	
    	String longestPalindrome = "";
    	
    	if(s.length() == 1) {
    		longestPalindrome = s.substring(0, s.length());
    	}
    	else if (s.length() == 2) {
    		if (isPalindrome(s) == true) {
    			longestPalindrome = s;
    		}
    		else {
        		longestPalindrome = s.substring(0, 1);
    		}
    		
    	}
    	else {
       		if (isPalindrome(s) == true) {
    			longestPalindrome = s;
    		}
       		else {
       			for (int i = 0; i < s.length(); i++) {
            		
            		for (int j = i; j < s.length(); j++) {
            			
                		String testStr = s.substring(i, j+1);
                		
                		if(isPalindrome(testStr) == true && testStr.length() != 1 && testStr.length() >= longestPalindrome.length()) {
                			longestPalindrome = testStr;
                		}
                		else {
                			//System.out.println(testStr + " is not a palindrome.");
                		}
        			}
        	
        		}
       		}
    		
        	
    	}   	 
    	
    	if(longestPalindrome == "") {
    		return s.substring(0,1);
    	}
    	else {
        	return longestPalindrome;
    	}
    	
    }
    
    public static boolean isPalindrome(String x) {
    	
    	boolean isPalindrome = false;
    	
        Stack<Character> myStack = new Stack<Character>();
        
        for (int i = 0; i < x.length(); i++) {
			myStack.push(x.charAt(i));
		}
        
        String newWord = "";
        
        for (int i = 0; i < x.length(); i++) {
			newWord = newWord + myStack.pop();
		}
        
        if(x.equals(newWord)) {
        	isPalindrome = true;
        }
        else {
        	isPalindrome = false;
        }
    	
    	return isPalindrome;
    }
}
