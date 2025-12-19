public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String time;
    private boolean completed;

    public Appointment(Patient patient, Doctor doctor, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
        this.completed = false;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Appointment with Dr. " + doctor.getName() +
                " at " + time +
                " | Status: " + (completed ? "Completed" : "Not completed");
    }
}

