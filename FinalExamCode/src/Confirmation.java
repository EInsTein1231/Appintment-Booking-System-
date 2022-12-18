public class Confirmation {

    private String confirmation;
    private Appointment appointment;



    public Confirmation(String confirmation, Appointment appointment) {
        this.confirmation = confirmation;
        this.appointment = appointment;
    }



    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }



}
