//This is a test for Java usage

//Import your favorite package below
import java.util.Scanner;

public class test{
    //Here you can define your functions
    public static int plusone(final int x) {
        return x + 1;
    }

    public static void main(final String[] args) {
        System.out.println("==========The Beginning==========\n");
        //Marking the beginning of the program

        final int a = 3, b = 4;
        System.out.println("Hello world!");
        System.out.println("The sum of a + b is " + Integer.toString(a + b));
        System.out.println(test.plusone(12));
        System.out.printf("You have a good job to solve a times b: %d", a * b);

        final Scanner input = new Scanner(System.in);
        System.out.printf("\nPut your integer here: ");
        final int c = input.nextInt();
        System.out.println(Integer.toString(c));

        //Marking the end of the program
        System.out.println("\n=============The End=============");
    }
}