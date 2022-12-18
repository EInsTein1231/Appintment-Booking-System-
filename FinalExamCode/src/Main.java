import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instantiate Therapist
        Therapist therapist1 = new Therapist("Psychologist", "Therapy, social awareness", "Medical Therapy", Therapist.getTherapistReviews());

        //instantiate User
        User user1 = new User("ADAM", "LIM", "ADAM", 030403, 143868436, "aedamjung@gmail.com", "ILOVE123", "Jane", "No medical history");
        UserReview user_review0 = new UserReview("User", "Good", therapist1);
        ReviewsList.addList(user_review0);

        //instantiate Appointment
        Appointment app0 = new Appointment(user1, 1, therapist1);

        int again = 2;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter [1] patient or [2] therapist: ");
            int user_type = scanner.nextInt();

            switch (user_type) {
                case 1:
                    // print patient profile (add yours )

                    System.out.println("Welcome patient, select [1] Book Appointment or [2] Login or [3] view Reviews [4] view Therapist info");
                    int patient_movement = scanner.nextInt();
                    switch (patient_movement) {
                        case 1:

                            //create appointment
                            Appointment.createAppointment();
                            Appointment app1 = new Appointment(user1, Appointment.getAppointmentDate(), Appointment.getPreferredTherapist());
                            System.out.println(app1);

                            // print confirmation
                            Confirmation confirm1 = new Confirmation("Congratulations \n You have successfully booked an Appointment\n", app1);
                            System.out.println(confirm1);

                            // ASk user to print a feedback
                            System.out.println("Enter feedback on the session: ");
                            String feedback1 = scanner.nextLine();
                            UserReview user_review1 = new UserReview(user1.getFirstName(), feedback1, app1.preferredTherapist);
                            System.out.println(user_review1);
                            ReviewsList.addList(user_review1);


                        case 2:
                            //edit profile
                            User.editProfile();

                            //print out new profile
                            System.out.println("-------------------------");
                            System.out.printf("New profile: ");
                            System.out.printf("First Name : %s\n", user1.getFirstName());
                            System.out.printf("Last Name : %s\n", user1.getLastName());
                            System.out.printf("Username : %s\n", user1.getUsername());
                            System.out.printf("Birthday : %d\n", user1.getBirthday());
                            System.out.printf("Contact No : %d\n", user1.getContactNo());
                            System.out.printf("Email Address : %s\n", user1.getEmail());
                            System.out.println("-------------------------");
                        case 3:
                            // print reviews
                            ReviewsList reviewList1 = new ReviewsList(ReviewsList.printReviewList());
                            reviewList1.displayReviewList();


                        case 4:
                            //view therapist info
                            Therapist therapist2 = new Therapist("Name : Adam ", "Psychology", "Therapy", user_review0);
                            System.out.println(therapist2);

                    }
                    break;

                case 2:
                    System.out.println("Welcome Therapist, select [1] edit Therapist Profile [2] view appointment bookings ");
                    int therapist_movement = scanner.nextInt();
                    switch (therapist_movement) {
                        case 1:
                            // edit therapist profile
                            Therapist.editTherapistProfile();

                        case 2:
                            // view appointment booking made by user
                            Appointment appointment1 = new Appointment(user1, 11, therapist1);
                            System.out.println(appointment1);
                    }

                    System.out.println("Continue Surfing? [1] yes [0] no");
                    again = scanner.nextInt();
                    switch (again) {
                        case 1:
                            System.out.println("Continue");
                        case 0:
                            break;

                        default:
                            throw new IllegalStateException("Unexpected value: " + again);
                    } // end of switch - patient or therapist

                    break;
            }
        }while (again != 0) ;
    }
}