import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];
    Scanner sc = new Scanner(System.in);

    public QuestionService() {
        questions[0] = new Question(1,
                "Which keyword is used to define a class in Java?",
                "class",
                "Class",
                "define",
                "new",
                "class");

        questions[1] = new Question(2,
                "Which method is the entry point of a Java program?",
                "start()",
                "run()",
                "main()",
                "init()",
                "main()");

        questions[2] = new Question(3,
                "Which data type is used to store whole numbers in Java?",
                "float",
                "char",
                "int",
                "boolean",
                "int");

        questions[3] = new Question(4,
                "Which symbol is used to end a statement in Java?",
                ".",
                ",",
                ":",
                ";",
                ";");

        questions[4] = new Question(5,
                "Which of the following is used to print output in Java?",
                "System.out.print()",
                "Console.write()",
                "print()",
                "output()",
                "System.out.print()");
    }

    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("***********************************************");

            System.out.println("Question Number: " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());
            System.out.print("Type Answer: ");
            selection[i] = sc.nextLine();
            i++;
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String actualAnswer = questions[i].getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score = score + 1;
            }

        }
        System.out.println("*******************************************");
        System.out.println("Your Score is : " + score);
        if (score == 5) {
            System.out.println("Excellent!");
        }
        System.out.println("*******************************************");

    }

}
