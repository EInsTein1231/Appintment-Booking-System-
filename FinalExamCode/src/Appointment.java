import java.util.Scanner;

public class Appointment extends User {

    private User user;
    public static int appointmentDate;
    public static Therapist preferredTherapist;

    public Appointment(User user, int appointmentDate, Therapist preferredTherapist) {
        super(user, appointmentDate, preferredTherapist);
        this.user = user;
        this.appointmentDate = appointmentDate;
        this.preferredTherapist = preferredTherapist;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static int getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(int appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public static Therapist getPreferredTherapist() {
        return preferredTherapist;
    }

    public void setPreferredTherapist(Therapist preferredTherapist) {
        this.preferredTherapist = preferredTherapist;
    }

    public static void createAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Appointment Date: ");
        int appointmentDate = scanner.nextInt();

        System.out.println("Enter Preferred Therapist: ");
        int preferredTherapist = scanner.nextInt();
    }


}
