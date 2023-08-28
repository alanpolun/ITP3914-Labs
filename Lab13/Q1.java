package Lab13;

import java.util.*;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
    	System.out.print("i?");
    	i = sc.nextInt();
    	System.out.println("F"+i+": "+fibonacci(i));
	}

	public static int fibonacci1( int n ) {
         int ti = 1, ti_1, ti_2;     // T(i), T(i-1) & T(i-2)	  

         //use normal loop to solve the problem

         return ti;
       }	

	public static int fibonacci (int i){
		if (i==1 || i==2){
			return 1;
		} else {
			fibonacci(n-1) + fibonacci(n-2) ;
		}
		
	}
}


