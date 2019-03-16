package CH4Singelton;

public class AccountDriver {

    public static void main(String[] args) {

        System.out.println("\n\nBank Account Number Generation System");

        // create new account
        CreateBankAccount account1 = CreateBankAccount.getNewAccount();

        // create second account
        CreateBankAccount account2 = CreateBankAccount.getNewAccount();
    }
}
