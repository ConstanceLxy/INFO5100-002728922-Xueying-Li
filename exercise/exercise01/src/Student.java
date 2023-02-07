import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Integer> quizzes = new ArrayList<>(15);

    public Student(String name) {
        this.name = name;
    }

    public void addQuizScore(int score) {
        quizzes.add(score);
    }

    public void showScores() {
        System.out.println("Student name: " + name);
        System.out.println("Quiz scores: " + quizzes);
    }
}

class FullTimeStudent extends Student {
    int exam1Score;
    int exam2Score;

    public FullTimeStudent(String name, int exam1Score, int exam2Score) {
        super(name);
        this.exam1Score = exam1Score;
        this.exam2Score = exam2Score;
    }

    @Override
    public void showScores() {
        super.showScores();
        System.out.println("Exam 1 score: " + exam1Score);
        System.out.println("Exam 2 score: " + exam2Score);
    }
}

class PartTimeStudent extends Student {
    public PartTimeStudent(String name) {
        super(name);
    }
}



