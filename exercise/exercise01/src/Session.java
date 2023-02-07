import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Session {
    private List<Student> students = new ArrayList<>(20);
    private Random random = new Random();

    public void addStudent(Student student) {
        students.add(student);
    }

    public double calculateAverageQuizScore() {
        int totalScore = 0;
        int totalQuizzes = 0;
        for (Student student : students) {
            totalScore += student.quizzes.stream().mapToInt(Integer::intValue).sum();
            totalQuizzes += student.quizzes.size();
        }
        return totalScore / (double) totalQuizzes;
    }

    public void printQuizScoresInAscendingOrder() {
        List<Integer> allQuizzes = new ArrayList<>();
        for (Student student : students) {
            allQuizzes.addAll(student.quizzes);
        }
        Collections.sort(allQuizzes);
        System.out.println("Quiz scores in ascending order: " + allQuizzes);
    }

    public void printPartTimeStudentNames() {
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println("Part-time student name: " + student.name);
            }
        }
    }

    public void printFullTimeStudentExamScores() {
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                FullTimeStudent fullTimeStudent = (FullTimeStudent) student;
                System.out.println("Full-time student name: " + fullTimeStudent.name);
                System.out.println("Exam 1 score: " + fullTimeStudent.exam1Score);
                System.out.println("Exam 2 score: " + fullTimeStudent.exam2Score);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = new String[]{
                "Nancy", "Lily", "Lucy", "Amy", "Lisa", "Rae", "Ray", "Paul",
                "David", "Ben", "Tony", "Mike", "Zoe", "Miya", "Eileen", "Peter",
                "Vicki", "Brenda", "Harry", "Pai"
        };
        Session session = new Session();
        for (int i = 0; i < 10; i++) {
            session.addStudent(new FullTimeStudent(names[i], 85 + session.random.nextInt(15), 90 + session.random.nextInt(15)));
        }
        for (int i = 10; i < 20; i++) {
            PartTimeStudent partTime = new PartTimeStudent(names[i]);
            for (int j = 0; j < 15; j++) {
                partTime.addQuizScore(j * 5 + session.random.nextInt(15));
            }
            session.addStudent(partTime);
        }
        System.out.println("Average quiz score: " + session.calculateAverageQuizScore());
        session.printQuizScoresInAscendingOrder();
        session.printPartTimeStudentNames();
        session.printFullTimeStudentExamScores();
    }
}




