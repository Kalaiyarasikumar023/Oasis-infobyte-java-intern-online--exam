import java.util.List;
import java.util.Scanner;

class Exam {
    private List<Question> questions;
    private int score;

    public Exam(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void conductExam() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getText());
            List<String> options = currentQuestion.getOptions();

            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer (enter the option number): ");
            int userAnswerIndex = scanner.nextInt() - 1;

            if (userAnswerIndex == currentQuestion.getCorrectOptionIndex()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " +
                        options.get(currentQuestion.getCorrectOptionIndex()) + "\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + questions.size());
    }
}

public class ExamConductanceSystem {
    public static void main(String[] args) {
        // Assume you have a list of questions created as in the previous example
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                List.of("Berlin", "Madrid", "Paris", "Rome"), 2));
        questions.add(new Question("Which programming language is this example written in?",
                List.of("Java", "Python", "C++", "JavaScript"), 0));

        // Conduct the exam
        Exam exam = new Exam(questions);
        exam.conductExam();
    }
}
