import java.util. Scanner;
public class CustomerSavingsInterest {
    public static void SavingsInterestCalculator() {
        Scanner ami = new Scanner(System.in);

        System.out.println("enter customer name");
        String customerName = ami.nextLine();

        System.out.println("enter the customer deposits");
        int customerDeposits = ami.nextInt();

        double interestRate = 0.055;

        System.out.println("   DEMONSTRATING CONVERSION AND ACCURACY");

        double calculatedInterest = customerDeposits * interestRate;
        double totalBalance = customerDeposits + calculatedInterest;

        int roundedInterest = (int)(calculatedInterest + 0.5);
        int roundedTotal = (int)(totalBalance + 0.5);
    }
}
