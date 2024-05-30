import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
        score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());

            List<String> answers = question.getPossibleAnswers();
            for (int i = 0; i < answers.size(); i++) {
                System.out.println((i + 1) + ": " + answers.get(i));
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt() - 1;

            if (question.isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        System.out.println("Quiz over! Your final score is: " + score + "/" + questions.size());
    }
}