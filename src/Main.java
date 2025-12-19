public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic("City Clinic");
        Doctor doctor = new Doctor("Smith");
        Patient patient = new Patient("Aisultan");

        Appointment appointment =
                clinic.scheduleAppointment(patient, doctor, "10:00 AM");

        doctor.consult(patient, appointment);
        clinic.complete(appointment);

        System.out.println(appointment);
        patient.printHistory();
    }
}
//grgr
