package Task2;

public class Therapist extends Doctor {
    @Override
    public void Heal(Patient patient) {
        System.out.println("Я терапевт и я дал аскорбинку пациенту " + patient.getName());
    }

    public Therapist() {
        this.name = "Люба Платочек";

    }
}
