import com.example.quickMaths.Series;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int userNum = scan.nextInt();
        scan.nextLine();
        Series series = new Series();
        System.out.println(series.sumOfNumbers(userNum));
        System.out.println(series.factorial(userNum));
        System.out.println(series.fibonacci(userNum));
    }
}
