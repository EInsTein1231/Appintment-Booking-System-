import java.util.ArrayList;
import java.util.Scanner;

public class Therapist {
    private String about;
    private String specialities;

    public Therapist(String about, String specialities, String serviceOffered, ArrayList<UserReview> therapistReviews) {
        this.about = about;
        this.specialities = specialities;
        this.serviceOffered = serviceOffered;
        this.therapistReviews = therapistReviews;
    }

    private String serviceOffered;
    private static ArrayList<UserReview> therapistReviews = new ArrayList<>();

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String specialities) {
        this.specialities = specialities;
    }

    public String getServiceOffered() {
        return serviceOffered;
    }

    public void setServiceOffered(String serviceOffered) {
        this.serviceOffered = serviceOffered;
    }

    public static ArrayList<UserReview> getTherapistReviews() {
        return therapistReviews;
    }

    public void setTherapistReviews(ArrayList<UserReview> therapistReviews) {
        this.therapistReviews = therapistReviews;
    }


    public static void editTherapistProfile() {

        //edit therapist profile
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter about: ");
        String about = scanner.nextLine();
        System.out.println("Enter specialities: ");
        String specialities = scanner.nextLine();
        System.out.println("Enter service offered: ");
        String serviceOffered = scanner.nextLine();
        System.out.println(therapistReviews);
        System.out.println("----------------------");


        //print out new therapist profile
        System.out.println("----------------------");
        System.out.println("NEW THERAPIST PROFILE");
        System.out.println("----------------------");
        System.out.println(about);
        System.out.println(specialities);
        System.out.println(serviceOffered);
        System.out.println(therapistReviews);
        System.out.println("----------------------");



    }



}
