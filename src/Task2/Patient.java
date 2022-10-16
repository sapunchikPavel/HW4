package Task2;

public class Patient {
    private int healPlan;
    private String name;

    public int getHealPlan() {
        return healPlan;
    }

    public String getName() {
        return name;
    }

    public Patient(String name, int healPlan) {
        this.healPlan = healPlan;
        this.name = name;
    }
}
