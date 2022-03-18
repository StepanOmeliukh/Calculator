import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Double[] values = insert(scanner);
            Integer choice = choice(scanner);

            switch (choice) {
                case 1:
                    calculator.sum(values[0], values[1]);
                    break;
                case 2:
                    calculator.sub(values[0], values[1]);
                    break;
                case 3:
                    calculator.div(values[0], values[1]);
                    break;
                case 4:
                    calculator.mul(values[0], values[1]);
                    break;
            }
        }
    }

    private static Double[] insert(Scanner scanner){
        Double[] array = new Double[2];

        System.out.println("Enter values for calculation:");

        System.out.print("\tFirst value: ");
        Double first = scanner.nextDouble();

        System.out.print("\tSecond value: ");
        Double second = scanner.nextDouble();

        array[0] = first;
        array[1] = second;

        return array;
    }
    private static Integer choice(Scanner scanner) {
        Integer choice = 0;
        do {
            System.out.println("Choise the action");
            System.out.println("\t1. Sum");
            System.out.println("\t2. Sub");
            System.out.println("\t3. Div");
            System.out.println("\t4. Mul");
            System.out.print("Your choise: ");
            choice = scanner.nextInt();
            if (choice < 1 && choice > 4)
                System.out.println("Choose");
        } while (choice < 1 && choice > 4);
        return choice;
    }
}
