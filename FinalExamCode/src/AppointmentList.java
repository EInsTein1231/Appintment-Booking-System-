
import java.util.ArrayList;

public class AppointmentList {
    private ArrayList<Appointment> appointment_list = new ArrayList<>();

    public AppointmentList(ArrayList<Appointment> appointment_list) {
        this.appointment_list = appointment_list;
    }

    public ArrayList<Appointment> getAppointment_list() {
        return appointment_list;
    }

    public void setAppointment_list(ArrayList<Appointment> appointment_list) {
        this.appointment_list = appointment_list;
    }

    public void displayAppointmentList() {
        for (Appointment a : appointment_list) {
            System.out.printf("user: %s\n appointment date: %d\n preferred therapist: %s \n", a.getUser(), a.getAppointmentDate(), a.getPreferredTherapist());
        }
    }

}
