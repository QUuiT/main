public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient, Appointment appointment) {
        if (appointment.isCompleted()) {
            System.out.println("Cannot consult: appointment already completed.");
            return;
        }

        if (appointment.getPatient() != patient || appointment.getDoctor() != this) {
            System.out.println("Invalid consultation: wrong patient or doctor.");
            return;
        }

        System.out.println("Dr. " + name + " is consulting " + patient.getName());
        patient.addHistoryRecord(this, "General consultation");
    }
}

