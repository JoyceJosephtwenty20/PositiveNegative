import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Test Data \nEnter a number: ");
        int input = sc.nextInt();
        if (input > 0 ){
            System.out.println(input + " is positive.");
        }
        else {
            System.out.println(input + " is negative");
        }



    }
}
