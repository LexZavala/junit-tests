import java.util.ArrayList;

public class Student {

<<<<<<< HEAD
    private static String name;
    private static long id;
    private static ArrayList<Integer> grades;


    public Student() {

=======
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade : this.grades) {
            sum += grade;
        }
        return sum / getGrades().size();
>>>>>>> 0f02e99b35dc098ec9732a8207820f163c17de0d
    }
}
