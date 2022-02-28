package exercise.weather.com;

public class ExerciseFunction {
	
	public void weatherCheck(int weather) {
		
		if(weather >= 90 &&  weather <= 100) {
			System.out.println("Its hot");
		}else if (weather >= 50 && weather < 90) {
			System.out.println("its cold");
		}else if (weather < 50)
		{
			System.out.println("its freezing");
		}else {
			System.out.println("Invalid Weather");
		}
		
		
	}
	
	
	public void doWhile(int num) {
		
		do {
		System.out.println("number less than 10");
		num++;
		}
		while(num<11);
		
		
	}
	
	public void FizzBuzz(int value) {
		
		 if(value % 3 == 0  && value % 5 ==0) {
			System.out.println("Fizz Buzz");
		 }
		 else if(value % 3 == 0) {
			System.out.println("Fizz");
		}else if(value % 5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println("Number is not divisible by 3 or 5");
		}
		
	}
	public void swapValues(int x, int y) {
		System.out.println("X Before Swapping "+x);
		System.out.println("Y Before Swapping "+y);
		y = y-x; 
		x = x+y; 
		y = x-y;
		
		System.out.println("After Swapping X is "+x );
		System.out.println("After Swapping Y is "+y);
		
		
	}
	
	public void findFactorial(	int value) {
		
		int sum = 1;
		
		for (int i = 1; i <= value; i++ ) {
			sum = sum * i;
		
		}
		System.out.println(sum);
		
		
		
	}
	
	
	public void fibonacciSequence(int counter) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		//= 5;
		System.out.println(n1+" "+n2);
		//0,1,1,2,3,5,8,13,21,34,55
		for(int i =2; i< counter; i++) {
			n3 = n1+ n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;
			
		}
		
	}
	
	
	
	
	
	

}
