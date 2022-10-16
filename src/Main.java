import Task1.CreditCard;
import Task1.CreditCardSystem;
import Task2.Clinic;
import Task2.Patient;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        card1.getInfo();

        CreditCard card2 = new CreditCard(300);
        card2.getInfo();

        CreditCard card3 = new CreditCard(150);
        card3.getInfo();

        card1.fillCardBalance(card1.getAccountNumber(), 200);
        card1.getInfo();

        card2.fillCardBalance(card2.getAccountNumber(),1000);
        card2.getInfo();

        card3.withdrawMoney(card3.getAccountNumber(),100);
        card3.getInfo();

        //проверка неверного номера карты
        CreditCardSystem cardSystem = new CreditCardSystem();
        cardSystem.fillCardBalance("dadad6617dsada", 200);
        cardSystem.getInfo("dadad6617dsada");

        //если номер карты верный
        cardSystem.fillCardBalance(card1.getAccountNumber(),1000000);
        cardSystem.getInfo(card1.getAccountNumber());


        Clinic clinic = new Clinic();
        Patient patient1 = new Patient("Александр",1);
        Patient patient2 = new Patient("Владимир",2);
        Patient patient3 = new Patient("Адольф",10);
        clinic.HealPatient(patient1);
        clinic.HealPatient(patient2);
        clinic.HealPatient(patient3);

    }
}
