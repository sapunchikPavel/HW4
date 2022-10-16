package Task1;

import java.util.ArrayList;
import java.util.Random;

public class CreditCardSystem {
    public static ArrayList<CreditCard> cards = new ArrayList<CreditCard>();

    protected String setCardNumber() {
        Random rand = new Random();
        String cardNumber = " ";
        for (int i = 0; i < 16; i++) {
            switch (rand.nextInt(3)) {
                case 0 -> cardNumber += (char) (rand.nextInt(26) + (byte) 'a');
                case 1 -> cardNumber += (char) (rand.nextInt(26) + (byte) 'A');
                case 2 -> cardNumber += (char) (rand.nextInt(9) + (byte) '0');
            }
        }
        return cardNumber;
    }

    private CreditCard isVerifiedCard(String cardNum) {
        for (CreditCard curCard : cards) {
            if (curCard.getAccountNumber() == cardNum) {
                return curCard;
            }
        }
        return null;
    }

    public void fillCardBalance(String cardNum, long money) {
        CreditCard card = isVerifiedCard(cardNum);
        if (card != null) {
            card.setCurrentBalance(card.getCurrentBalance() + money);
            System.out.println("Баланс пополнен на карте: " + card.getAccountNumber());
        } else {
            System.out.println("Введен неверный номер");
        }
    }

    public void withdrawMoney(String cardNum, long money) {
        CreditCard card = isVerifiedCard(cardNum);
        if (card != null) {
            card.setCurrentBalance(card.getCurrentBalance() - money);
            System.out.println("Деньги сняты с карты: " + card.getAccountNumber());
        } else {
            System.out.println("Введен неверный номер");
        }
    }

    public void getInfo(String cardNum){
        CreditCard card;
        card = isVerifiedCard(cardNum);
        if (card != null){
            System.out.println("Номер карты: " + card.getAccountNumber());
            System.out.println("Текущий баланс карты: " + card.getCurrentBalance());
        }else{
            System.out.println("Введен неверный номер");
        }
        System.out.println();
    }

}
