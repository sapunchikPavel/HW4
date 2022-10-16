package Task1;

public class CreditCard extends CreditCardSystem {
    private long currentBalance;
    private String accountNumber;

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public CreditCard() {
        accountNumber = super.setCardNumber();
        super.cards.add(this);
    }

    public CreditCard(long currentBalance) {
        accountNumber = super.setCardNumber();
        this.currentBalance = currentBalance;
        super.cards.add(this);
    }

    public void getInfo() {
        System.out.println("Номер карты: " + this.getAccountNumber());
        System.out.println("Текущий баланс карты: " + this.getCurrentBalance());
        System.out.println();
    }
}

