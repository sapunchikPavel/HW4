package Task2;

public class Dentist extends Doctor {
    @Override
    public void Heal(Patient patient) {
        System.out.println("Я зубной и я вставил зубы пациенту " + patient.getName());
    }

    public Dentist() {
        this.name = "Алеся Зубочистка";
    }
}
