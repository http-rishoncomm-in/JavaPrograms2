public class MultiplicationTable {

    public static void main(String[] args) {

        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);					     
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt(
        System.out.println("You entered: " + number);
    }
}

