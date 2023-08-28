import java.util.*;
public class WhileLoopExample {
	public static void main(String [ ] args) {
		Scanner kb = new Scanner(System.in);
		int	i=0, n, value, sum=0;
		System.out.print("How many? ");
		n = kb.nextInt();
		while (i < n) {
			System.out.print("value? ");
			value = kb.nextInt();
			sum += value;
			i++;
		}
		System.out.println("Sum = " + sum); 
	}
}
