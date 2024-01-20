public class ViewQuestions {
    public static void main(String[] args) {
        // Assume you have a list of questions created as in the previous example
        Question question1 = new Question("What is the capital of France?",
                List.of("Berlin", "Madrid", "Paris", "Rome"), 2);

        Question question2 = new Question("Which programming language is this example written in?",
                List.of("Java", "Python", "C++", "JavaScript"), 0);

        // Display questions
        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getText());
            List<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }
            System.out.println();
        }
    }
}
