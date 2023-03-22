import java.util.Scanner;

public class SavingsRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your investment amount: ");
        int investmentAmount = input.nextInt();
        System.out.println("Enter the time frame for investment (in years): ");
        int timeFrame = input.nextInt();

        String savingsScheme = "";
        if (age < 30 && investmentAmount < 100000) {
            savingsScheme = "National Savings Certificate (NSC)";
        } else if (age >= 30 && age < 40 && investmentAmount >= 100000 && investmentAmount < 500000) {
            savingsScheme = "Public Provident Fund (PPF)";
        } else if (age >= 40 && investmentAmount >= 500000) {
            System.out.println("Enter your risk tolerance (1 for low risk, 2 for moderate risk, 3 for high risk): ");
            int riskTolerance = input.nextInt();
            if (riskTolerance == 1) {
                savingsScheme = "Senior Citizen Savings Scheme (SCSS)";
            } else if (riskTolerance == 2 && timeFrame >= 5) {
                savingsScheme = "Unit Linked Insurance Plan (ULIP)";
            } else {
                savingsScheme = "Equity Linked Savings Scheme (ELSS)";
            }
        }
        System.out.println(
                "Based on your details, we recommend investing in the following savings scheme in the public sector: "+'\n'
                        + savingsScheme);
    }
}
