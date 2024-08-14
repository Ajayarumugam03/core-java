package aug14;
import java.util.*;
public class math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first,second,result=0;
		Scanner scan=new Scanner(System.in);
		char operation;
		System.out.println("Enter +, - , *,/: ");
        operation = scan.next().charAt(0);
		System.out.println("Enter the first number: ");
        first = scan.nextInt();
        System.out.println("Enter the second number: ");
        second =scan.nextInt();
        switch (operation) 
        {
        case '+':
            result = first + second;
            break;
        case '-':
            result = first - second;
            break;
        case '*':
            result = first * second;
            break;
        case '/':
            result = first / second;
            break;
        default:
            System.out.println("Please enter a valid symbol!");
            return;
    }

    System.out.printf("%d %c %d = %d", first, operation, second, result);
	}

}

       /* 

        Scanner scanner = new Scanner(System.in);

        
        
}*/

