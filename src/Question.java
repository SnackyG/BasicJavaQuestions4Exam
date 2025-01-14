import java.util.List;

public class Question {
    private String questionText;
    private List<String> possibleAnswers;
    private int correctAnswerIndex;

    public Question(String questionText, List<String> possibleAnswers, int correctAnswerIndex) {
        this.questionText = questionText;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public boolean isCorrectAnswer(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }
}