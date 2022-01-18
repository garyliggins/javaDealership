import java.util.Scanner;

public class DealerShipApp {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Welcome to the Java Dealership");
        System.out.println(" • Select option 'a' to buy a car");
        System.out.println(" • Select option 'b' to sell a car");

        String option = scan.nextLine();
        switch(option){
            case "a": System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 10000) {
                System.out.println("Great a nissan is available");
                System.out.println("\ndo you have insurance? write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\n do you have a license? write 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nwhat is your credit score");
                int creditScore = scan.nextInt();
                if (insurance.equals("yes") && license.equals("yes") && creditScore > 600) {
                    System.out.println("Sold pleasure doing business with you");
                } else {
                    System.out.println("were sorry you are not eligible");
                }

            } else {
                System.out.println("we dont sell cars under $10,000. sorry");
            } break;

            case "b": System.out.println("\nwhat is the value of your car?"); 
            int value = scan.nextInt();
            System.out.println("\nwhat is your selling price");
            int price = scan.nextInt();

            if (value > price && price < 30000){
                System.out.println("\nwe will buy your car");
            } else {
                System.out.println("\nsorry, were not interested");
            }
            break;
            default: System.out.println("\ninvalid option"); break;
        }
        scan.close();
   } 
}

