import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
        System.out.println("حساب شماره " + account.getAccountNumber() + " به لیست اضافه شد.");
    }

    public void showAllBalances() {
        for (BankAccount account : accountsList) {
            System.out.println("نام صاحب حساب: " + account.getAccountHolderName() + "، شماره حساب: " + account.getAccountNumber() + "، موجودی: " + account.getBalance());
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                System.out.println("حساب پیدا شد: " + account.getAccountHolderName() + "، شماره حساب: " + account.getAccountNumber() + "، موجودی: " + account.getBalance());
                return account;
            }
        }
        System.out.println("حساب با شماره " + accountNumber + " یافت نشد.");
        return null;
    }
}