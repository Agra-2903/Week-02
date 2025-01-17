class PalindromeChecker{
	String text;
	
	public PalindromeChecker(String str){
		this.text = str;
	}
	
	boolean checkPalindrome(String str){
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
			}
		}
		
		return true;
	}
	
	void display(){
		if(checkPalindrome(text)){
			System.out.println(text + " is a palindrome");
		}
		else{
			System.out.println(text + " is not a palindrome");
		}
	}
}

class CheckPalindrome{
	public static void main(String[]args){
		
		PalindromeChecker text1 = new PalindromeChecker("madam");
		PalindromeChecker text2 = new PalindromeChecker("akash");
		
		text1.display();
		text2.display();
	}
}