package Task2;

import java.util.ArrayList;

public class Clinic {

    public void HealPatient(Patient patient){
        switch  (patient.getHealPlan()){
            case 1 ->{
                Surgeon surgeon = new Surgeon();
                System.out.println(surgeon.name + " приступил к работе");
                surgeon.Heal(patient);
            }
            case 2 ->{
                Dentist dentist  = new Dentist();
                System.out.println(dentist.name + " приступил к работе");
                dentist.Heal(patient);
            }
            default -> {
                Therapist therapist = new Therapist();
                System.out.println(therapist.name + " приступил к работе");
                therapist.Heal(patient);
            }
        }

        System.out.println("Надеюсь помогло...");
        System.out.println();
    }

    public Clinic() {
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
    }
}
