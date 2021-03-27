import java.util.Scanner;

public class Circle {


    public static void main(String[] args) {
        double square, result = 0;
        System.out.println("Введіть радіус кола в сантиметрах:");
        Scanner userInput = new Scanner(System.in);
        square = userInput.nextDouble();
        AreaCircle(square, result);
        userInput.close();

    }

    public static void AreaCircle(double square, double result) {

        result = square * Math.PI;
        System.out.println("Площа кола= " + result + " см.");
        return;
    }
}