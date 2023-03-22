import java.util.Scanner;

public class TaxCalculate {

  String name;
  int empId;
  static double basicPay;
  static double allowance;

  void setData() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name of employee");
    name = sc.nextLine();

    System.out.println("Enter employee id");
    empId = sc.nextInt();

    System.out.println("Enter Basic pay of employee ");
    basicPay = sc.nextFloat();
    System.out.println();
  }

  void getData() {
    System.out.println("Emloyee name : " + name);
    System.out.println("Employee id  : " + empId);
    System.out.println("Basic pay : " + basicPay);
    System.out.println();
  }

  // Calculating the Allowance balance
  void allowance(double basicPay) {
    double DA = basicPay * 0.04;
    double HRA = basicPay * 0.07;
    double MA = basicPay * 0.02;
    double FA = basicPay * 0.02;
    allowance = DA + HRA + MA + FA;
  }

  // Calculating tax under old tax design
  static double oldTax(double totalIncome) {
    double tax = 0.0;
    if (totalIncome < 250000)
      return tax;
    else if (totalIncome < 500000)
      tax = 0.05 * totalIncome;
    else if (totalIncome < 750000)
      tax = 0.1 * totalIncome;
    else if (totalIncome < 100000)
      tax = 0.15 * totalIncome;
    else if (totalIncome < 1250000)
      tax = 0.2 * totalIncome;
    else if (totalIncome < 1500000)
      tax = 0.25 * totalIncome;
    else
      tax = 0.3 * totalIncome;
    return tax;
  }

  // Calculating tax under New tax design
  static double newTax(double totalIncome) {
    double tax = 0.0;
    if (totalIncome < 300000)
      return tax;
    else if (totalIncome < 600000)
      tax = 0.05 * totalIncome;
    else if (totalIncome < 900000)
      tax = 0.1 * totalIncome;
    else if (totalIncome < 1200000)
      tax = 0.15 * totalIncome;
    else if (totalIncome < 1500000)
      tax = 0.2 * totalIncome;
    else
      tax = 0.3 * totalIncome;
    return tax;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    TaxCalculate t = new TaxCalculate();

    t.setData();
    t.getData();

    double Allowance = allowance;
    double totalIncome = (basicPay + Allowance) * 12;

    System.out.print("Enter fund for gratuity: ");
    double fundForGratuity = scan.nextDouble();

    System.out.println('\n' + "Your total income in a year " + totalIncome + '\n');

    double tds = totalIncome * 0.04;

    double totalDeductionsOld = oldTax(totalIncome) + tds + fundForGratuity;
    double netIncomeOld = totalIncome - totalDeductionsOld;
    System.out.println("Net Income under old tax design " + netIncomeOld + '\n');

    double totalDeductionsNew = newTax(totalIncome) + tds + fundForGratuity;
    double netIncomeNew = totalIncome - totalDeductionsNew;
    System.out.println("Net Income under New tax design " + netIncomeNew + '\n');

    if (netIncomeOld >= netIncomeNew) {
      System.out.println("You will have more net income under the old tax design.");
    } else {
      System.out.println("You will have more net income under the new tax design.");
    }
  }
}
