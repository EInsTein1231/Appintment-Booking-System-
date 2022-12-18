import java.util.ArrayList;

public class UserReview extends ArrayList<UserReview> {
    private User user;

    public UserReview(User user, String feedback, Therapist therapist) {
        this.user = user;
        this.feedback = feedback;
        this.therapist = therapist;
    }

    private String feedback;
    private Therapist therapist;

    public UserReview(String firstName, String feedback1, Therapist preferredTherapist) {
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Therapist getTherapist() {
        return therapist;
    }

    public void setTherapist(Therapist therapist) {
        this.therapist = therapist;
    }



}
