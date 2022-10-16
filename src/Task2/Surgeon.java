package Task2;

public class Surgeon extends Doctor {
    @Override
    public void Heal(Patient patient) {
        System.out.println("Я хирург и я удалил ребра пациенту " + patient.getName());
    }

    public Surgeon() {
        this.name = "Вася Костолом";
    }
}
