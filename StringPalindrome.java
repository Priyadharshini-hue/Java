/*
String is palindrome or not

lol = lol
*/
class StringPalindrome{
	// log n
	static boolean isPalindrome(String s){
		int start = 0, end = s.length()-1;
		
		while( start < end ){
			if(s.charAt(start) == s.charAt(end)){
				start++;
				end--;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		String str = "ababa";
		
		System.out.println(isPalindrome(str));
	}
}