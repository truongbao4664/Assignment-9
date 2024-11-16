import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String studentId;
    private String fullName;
    private String dateOfBirth; // Lưu dưới dạng String để đơn giản hóa việc nhập/xuất
    private String major;
    private float gpa;

    // Constructors
    public Student() {}

    public Student(String studentId, String fullName, String dateOfBirth, String major, float gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    // Methods
    public void enterStudentInfo() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter student ID: ");
        studentId = scanner.nextLine();
        System.out.print("Enter full name: ");
        fullName = scanner.nextLine();
        System.out.print("Enter date of birth (dd/MM/yyyy): ");
        dateOfBirth = scanner.nextLine();
        System.out.print("Enter major: ");
        major = scanner.nextLine();
        System.out.print("Enter GPA: ");
        gpa = scanner.nextFloat();
    }

    public void displayStudentInfo() {
        System.out.printf("ID: %s | Name: %s | DOB: %s | Major: %s | GPA: %.2f%n",
                studentId, fullName, dateOfBirth, major, gpa);
    }
}
