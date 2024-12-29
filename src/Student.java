import java.util.ArrayList;

public class Student extends Person {
    private static int idCounter = 1; // Used to generate unique IDs
    private int studentID;
    private ArrayList<Integer> grades;


    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }


    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }


    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
