import java.util.*;

class Customer {
    String name;
    int age;
    String dob;
    String mobileNumber;

    public Customer(String name, int age, String dob, String mobileNumber) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

class Account {
    Customer customer;
    String accountNumber;
    double balance;
    String bankName;

    public Account(Customer customer, String bankName) {
        this.customer = customer;
        this.bankName = bankName;
        Random rand = new Random();
        this.accountNumber = String.format("%016d", rand.nextInt(1000000000));
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
}

class RBI {
    protected double minimumInterestRate;

    public RBI(double minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

    public double getMinimumInterestRate() {
        return minimumInterestRate;
    }

    public void setMinimumInterestRate(double minimumInterestRate) {
        this.minimumInterestRate = minimumInterestRate;
    }

    public double calculateInterest(double balance) {
        return balance * minimumInterestRate / 100;
    }
}

class SBI extends RBI {
    public SBI() {
        super(4.0);
    }
}

class ICICI extends RBI {
    public ICICI() {
        super(4.25);
    }
}

class PNB extends RBI {
    public PNB() {
        super(4.5);
    }
}

public class Banking_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<Account>();

        while (true) {
            System.out.println("Welcome to our bank. Please select an option:");
            System.out.println("1. Open account");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Deposit money");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter your name: ");
                    String name = sc.next();
                    System.out.println("Enter your age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter your date of birth (dd/mm/yyyy): ");
                    String dob = sc.next();
                    System.out.println("Enter your mobile number: ");
                    String mobileNumber = sc.next();
                    System.out.println("Select a bank to open an account in:");
                    System.out.println("1. SBI");
                    System.out.println("2. ICICI");
                    System.out.println("3. PNB");
                    int bankChoice = sc.nextInt();
                    String bankName = "";
                    RBI bank = null;
                    switch (bankChoice) {
                        case 1:
                            bankName = "SBI";
                            bank = new SBI();
                            break;
                        case 2:
                            bankName = "ICICI";
                            bank = new ICICI();
                            break;
                        case 3:
                            bankName = "PNB";
                            bank = new PNB();
                            break;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    Customer customer = new Customer(name, age, dob, mobileNumber);
                    Account account = new Account(customer, bankName);
                    accounts.add(account);
                    System.out.println("Your account has been created successfully in " + bankName
                            + " with account number " + account.getAccountNumber());
                    break;
                case 2:
                    System.out.println("Enter your name or account number: ");
                    String input = sc.next();
                    for (Account acc : accounts) {
                        if (acc.customer.getName().equals(input) || acc.getAccountNumber().equals(input)) {
                            System.out.println("Your balance is " + acc.getBalance());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter your name or account number: ");
                    String input2 = sc.next();
                    for (Account acc : accounts) {
                        if (acc.customer.getName().equals(input2) || acc.getAccountNumber().equals(input2)) {
                            System.out.println("Enter the amount you want to withdraw: ");
                            double amount = sc.nextDouble();
                            acc.withdraw(amount);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter your name or account number: ");
                    String input3 = sc.next();
                    for (Account acc : accounts) {
                        if (acc.customer.getName().equals(input3) || acc.getAccountNumber().equals(input3)) {
                            System.out.println("Enter the amount you want to deposit: ");
                            double amount = sc.nextDouble();
                            acc.deposit(amount);
                            break;
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
