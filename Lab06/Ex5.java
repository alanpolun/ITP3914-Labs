import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int x = 0;

        System.out.print("a: ");
        a = scan.nextInt();

        if (a==1)
            x += 3;
        else if (a==2)
	        x +=5;
        else if (a==3)
	        x += 7;
        else 
	        x += 10;

        System.out.println("x = " + x);
    }
}
