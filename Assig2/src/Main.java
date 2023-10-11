import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a coffee:");
            System.out.println("1. Raf");
            System.out.println("2. Macchiato");
            System.out.println("3. Latte");

            int choice = sc.nextInt();
            Coffee coffee;

            switch (choice) {
                case 1:
                    coffee = new Raf();
                    break;
                case 2:
                    coffee = new Macchiato();
                    break;
                case 3:
                    coffee = new Latte();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            sc.nextLine();

            while (true) {
                System.out.println("Choose a decorator:");
                System.out.println("1. Nut Syrup");
                System.out.println("2. Sugar");
                System.out.println("3. Almond Milk");
                System.out.println("4. Finish and show order");

                int decoratorChoice = sc.nextInt();
                sc.nextLine();

                switch (decoratorChoice) {
                    case 1:
                        coffee = new NutSyrup(coffee);
                        break;
                    case 2:
                        coffee = new Sugar(coffee);
                        break;
                    case 3:
                        coffee = new AlmondMilk(coffee);
                        break;
                    case 4:
                        System.out.println("Final order:");
                        System.out.println("Description: " + coffee.getDescription());
                        System.out.println("Cost: $" + coffee.cost());
                        break;
                    default:
                        System.out.println("Error :( ");
                        continue;
                }

                System.out.println("Added " + coffee.getDescription());
                if (decoratorChoice == 4) {
                    break;
                }
            }

            System.out.println("Would you like to choose another coffee? (yes/no)");
            String anotherCoffee = sc.nextLine();

            if (!anotherCoffee.equalsIgnoreCase("yes")) {
                break;
            }
        }

        sc.close();
    }
}
