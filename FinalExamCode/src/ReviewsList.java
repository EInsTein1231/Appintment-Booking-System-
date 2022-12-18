import java.util.ArrayList;

public class ReviewsList {


    private static ArrayList<UserReview> reviewList = new ArrayList<>();

    public ArrayList<UserReview> getReviewList() {
        return reviewList;
    }

    public void setReviewList(ArrayList<UserReview> reviewList) {
        this.reviewList = reviewList;
    }

    public ReviewsList(ArrayList<UserReview> reviewList) {
        this.reviewList = reviewList;
    }

    public static void addList(UserReview item) {
        reviewList.add(item);

    }
    public String deleteItem(UserReview item) {
        return String.format("You have removed the item %s", item);
    }

    public static ArrayList<UserReview> printReviewList() {
        return reviewList;
    }

    public void displayReviewList() {
        for (UserReview ur : reviewList) {
            System.out.printf("Username %s\n feedback: %s\n Therapist: %s \n", ur.getUser(), ur.getFeedback(), ur.getFeedback());
        }
    }
}
