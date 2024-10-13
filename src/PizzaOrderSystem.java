import java.util.Scanner;

public class PizzaOrderSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        OrderPizza order = new OrderPizza();
        boolean ordering = true;

        while (ordering) 
        {
            System.out.println("Welcome to the Pizza Ordering System!");
            System.out.println("1. Create a New Pizza");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            if(!scanner.hasNext())
            {
                System.out.println("Invalid input. Please enter a number");
                scanner.next();
                continue;
            }
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Is the pizza vegetarian? (true/false): ");
                    boolean veg = scanner.nextBoolean();
                    System.out.println("Choose Pizza Type:");
                    System.out.println("1. Regular Pizza");
                    System.out.println("2. Deluxe Pizza");
                    if (!scanner.hasNextInt()) 
                    {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); 
                        break;
                    }
                    int type = scanner.nextInt();
                    Pizza pizza;
                    if (type == 1) 
                    {
                        pizza = new Pizza(veg);
                    } 
                    else if(type == 2)
                    {
                        pizza = new DeluxePizza(veg);
                        System.out.println("Deluxe Pizza comes with extra cheese and toppings. No further customization available");
                    }
                    else
                    {
                        System.out.println("Invalid pizza type selected...");
                        break;
                    }
                    if(!(pizza instanceof DeluxePizza))
                    {
                        boolean customizing = true;
                        while (customizing) 
                        {
                            System.out.println("Add Extras:");
                            System.out.println("1. Extra Cheese");
                            System.out.println("2. Extra Toppings");
                            System.out.println("3. Takeaway");
                            System.out.println("4. Done");
                            System.out.print("Choose an option: ");
                            if (!scanner.hasNextInt()) 
                            {
                                System.out.println("Invalid input. Please enter a number.");
                                scanner.next(); 
                                continue;
                            }
                            int extraChoice = scanner.nextInt();
                            switch (extraChoice) 
                            {
                                case 1:
                                    pizza.addExtraCheese();
                                    break;
                                case 2:
                                    pizza.addExtraToppings();
                                    break;
                                case 3:
                                    pizza.addTakeAway();
                                    break;
                                 case 4:
                                    customizing = false;
                                    System.out.println("Thank you for your order!");
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                            }
                        }
                    }
                order.addPizza(pizza);
                System.out.println("PIZZA ADDED TO YOUR ORDER.");
                break;
                case 2:
                    order.getOrderBill();
                    break;
                case 3:
                    ordering = false;
                    System.out.println("Thank you for your order!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a number between 1 to 3");
            }
        }
        scanner.close();
    }
}

