/*
Amstrong Number or not

Given a number x, determine whether the given number is Armstrong number or not. 

A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.
*/

class AmstrongNumber{
	//O(n)
	static boolean isAmstrong(String n){
		
		char[] arr = n.toCharArray();
		
		int length = arr.length, sum = 0;
		String t = n;
		
		for(char c : arr){
			
			int temp = 1;
			int digit = Integer.parseInt(Character.toString(c));
			
			for(int j = 0; j < digit-1; j++){
				temp *= digit;
			}
			
			sum += temp;
		}
		
		return (Integer.parseInt(t) == sum) ? true : false;
	}
	
	// log n * log ( log n )
	/*static boolean isAmstrong(int n){
		
		int length = (Integer.toString(n)).length(), sum =0, t = n;
		
		while( n > 0){
			int r = n % 10;
			sum += Math.pow( r, length);  //log (log n)
			n = n/10;
		}
		
		return (t == sum) ? true : false;
	}*/

	public static void main(String[] args){
	
	int number = 153;
	
	System.out.println(isAmstrong(Integer.toString(number)));
	
	}
}