
import java.util.ArrayList;
import java.util.List;
public class Patient {
    private String name;
    private List<String> history;

    public Patient(String name) {
        this.name = name;
        this.history = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHistoryRecord(Doctor doctor, String note) {
        history.add("Consulted by Dr. " + doctor.getName() + ": " + note);
    }

    public void printHistory() {
        System.out.println("Patient history for " + name + ":");
        for (String record : history) {
            System.out.println("- " + record);
        }
    }
}
