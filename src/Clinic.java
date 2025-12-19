import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private List<Appointment> appointments;

    public Clinic(String name) {
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public Appointment scheduleAppointment(Patient patient, Doctor doctor, String time) {
        Appointment appointment = new Appointment(patient, doctor, time);
        appointments.add(appointment);
        System.out.println("Appointment scheduled.");
        return appointment;
    }

    public void complete(Appointment appointment) {
        appointment.markCompleted();
        System.out.println("Appointment marked as completed.");
    }
}

