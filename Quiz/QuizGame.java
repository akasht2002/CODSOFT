package CodeSoft;

import java.util.*;
public class QuizGame {
    private List<QuizQuestion> questions;
    private int score;
    private Scanner scanner;

    public QuizGame(List<QuizQuestion> questions) {
        this.questions = questions;
        this.score = 0;
        this.scanner = new Scanner(System.in);
    }

    public void startQuiz() {
        System.out.println("Welcome to the Quiz Game!");

        for (int i = 0; i < questions.size(); i++) {
            QuizQuestion currentQuestion = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + currentQuestion.getQuestion());
            List<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Enter your answer (1-" + options.size() + "): ");
            int userAnswerIndex = scanner.nextInt();

            if (userAnswerIndex >= 1 && userAnswerIndex <= options.size()) {
                if (userAnswerIndex - 1 == currentQuestion.getCorrectAnswerIndex()) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect!");
                }
            } else {
                System.out.println("Invalid input! Skipping question...");
            }
        }

        showResult();
    }

    private void showResult() {
        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        int correctAnswers = score;
        int incorrectAnswers = questions.size() - score;

        System.out.println("Summary:");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + incorrectAnswers);
    }

    public static void main(String[] args) {
        List<QuizQuestion> quizQuestions = new ArrayList<>();
        quizQuestions.add(new QuizQuestion("What is the capital of France?", Arrays.asList("Paris", "London", "Berlin", "Rome"), 0));
        quizQuestions.add(new QuizQuestion("What is 2 + 2?", Arrays.asList("3", "4", "5", "6"), 1));
        quizQuestions.add(new QuizQuestion("Who wrote 'To Kill a Mockingbird'?", Arrays.asList("Harper Lee", "J.K. Rowling", "Stephen King", "Mark Twain"), 0));

        QuizGame quizGame = new QuizGame(quizQuestions);
        quizGame.startQuiz();
    }
}
