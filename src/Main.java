public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        SavingsAccount savings1 = new SavingsAccount("a", "مهرداد حسن نژاد عارفی", 1000);
        SavingsAccount savings2 = new SavingsAccount("b", "مبین مجیری", 2000);
        SavingsAccount savings3 = new SavingsAccount("c", "آرمان الهیاری", 3000);

        TransactionAccount transaction1 = new TransactionAccount("A", "شیرین شفیعی", 1500);
        TransactionAccount transaction2 = new TransactionAccount("B", "ژینا داداشیان", 2500);
        TransactionAccount transaction3 = new TransactionAccount("C", "ترمه سیف زاده", 3500);

        bank.addAccount(savings1);
        bank.addAccount(savings2);
        bank.addAccount(savings3);
        bank.addAccount(transaction1);
        bank.addAccount(transaction2);
        bank.addAccount(transaction3);

        bank.findAccount("a");
        bank.findAccount("d");

        savings1.deposit(500);
        savings1.withdraw(200);
        transaction1.withdraw(2000);
        transaction2.deposit(-100);

        savings1.calculateInterest();
        transaction1.calculateInterest();

        bank.showAllBalances();
    }
}