import java.util.Scanner;
public class User {


    private String firstName;
    private String lastName;
    private String username;
    private int birthday;
    private int contactNo;
    private String email;
    private String password;
    private String kin;
    private String medicalHistory;


    public User(String firstName, String lastName, String username, int birthday, int contactNo, String email, String password, String kin, String medicalHistory) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.birthday = birthday;
        this.contactNo = contactNo;
        this.email = email;
        this.password = password;
        this.kin = kin;
        this.medicalHistory = medicalHistory;
    }

    public User(User user, int appointmentDate, Therapist preferredTherapist) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getKin() {
        return kin;
    }

    public void setKin(String kin) {
        this.kin = kin;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public static void editProfile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter username : ");
        String username = scanner.nextLine();

        System.out.println("Enter birthday: ");
        int birthday = scanner.nextInt();

        System.out.println("Enter contact no: ");
        int contactNo = scanner.nextInt();

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();
    }

}
