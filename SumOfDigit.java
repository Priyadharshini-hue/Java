class SumOfDigit{
	
	static int find(int number){
		
		int sum = 0;
		
		while(sum > 9 || number	> 0){
			if(number == 0){
				number = sum;
				sum = 0;
			}
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}

	public static void main(String[] args){
		int n = 52725;
		
		System.out.println(find(n));
	}
}