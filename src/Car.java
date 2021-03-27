import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        System.out.println("Ви знаходитесь у своєму новенькому автомобілі:");
        System.out.println("Якщо ви хочете завести авто введіть: 1 ");
        System.out.println("Бажаєте заглушити двигун введіть: 2 ");
        System.out.println("Ввімкнути функцію круїз-контроль: 3 ");

        Scanner userInput = new Scanner(System.in);
        String action = userInput.nextLine();
        if (action.equalsIgnoreCase("1")) {
            cruisecontrol();
        } else if (action.equalsIgnoreCase("2")) {
            stopEngine();
        } else if (action.equalsIgnoreCase("3")) {
            startEngine();
        }
    }

    private static void cruisecontrol() {
        System.out.println("Машина завелась - тисніть на газ");
    }

    private static void stopEngine() {
        System.out.println("Двигун заглох.");
    }

    private static void startEngine() {
        System.out.println("Ваша швидкість стабільно становить 60 км/год.");
    }
}
