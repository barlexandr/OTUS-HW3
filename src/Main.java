import java.util.Scanner;

/***
 * Написать систему тестирования.
 * На экран выводится вопрос и варианты ответа, с клавиатуры вводится номер ответа.
 * Вопросы и ответы должны быть зашиты в коде, внешнего хранения в файлах или базах данных не нужно.
 * Должно быть три вопроса, каждый с 3-5 вариантами ответов.
 * Все вопросы с одним правильным вариантом ответа.
 * После прохождения теста отображается результат.
 * Использовать только циклы, массивы, условия и другие структуры, которые были пройдены на данный момент в рамках курса.
 * В этом задании не нужно использовать ООП (создавать классы), вопросы и варианты ответов надо хранить в массиве (массивах).
 */

public class Main {
    public static void main(String[] args) {
        var questions = getFillingQuestionsAndAnswer();

        System.out.println("Для ответа на вопрос введите 1 из предложенных цифр.");
        var countOfCorrectAndWrongAnswers = askQuestionsAndGetCountTheNumberOfAnswers(questions);

        System.out.println("Результат: правильно - " + countOfCorrectAndWrongAnswers.getCountOfCorrectAnswers() +
                ", неправильно - " + countOfCorrectAndWrongAnswers.getCountOfWrongAnswers());
    }

    public static ResultOfAnswerToQuestion askQuestionsAndGetCountTheNumberOfAnswers(Question[] questions) {
        var scanner = new Scanner(System.in);
        ResultOfAnswerToQuestion result = new ResultOfAnswerToQuestion();

        for (Question question : questions) {
            var stringQuestion = question.getQuestion();
            System.out.println(stringQuestion);

            var possibleAnswers = question.getAnswersAndTheirNumberInString();
            System.out.println(possibleAnswers);

            var userAnswer = scanner.nextLine();

            if (userAnswer.equals(String.valueOf(question.getTryAnswer().getAnswerNumberInQuestion()))) {
                result.addCorrectAnswer();
                System.out.println("Правильно\n");
            } else {
                result.addWrongAnswer();
                System.out.println("Неправильно\n");
            }
        }
        return result;
    }

    public static Question[] getFillingQuestionsAndAnswer() {
        Question questionNumberOne = new Question("В файл с каким расширением компилируется java файл?");
        Question questionNumberTwo = new Question("С помощью какой команды git можно отправить изменения в репозиторий?");
        Question questionNumberThree = new Question("Какой применяется цикл, когда неизвестно количество итераций?");

        Answer answerOneForQuestionOne = new Answer(".cs", 1);
        Answer answerTwoForQuestionOne = new Answer(".java", 2);
        Answer answerThreeForQuestionOne = new Answer(".class", 3);
        Answer answerFourForQuestionOne = new Answer(".exe", 4);

        questionNumberOne.setAnswers(new Answer[]{answerOneForQuestionOne, answerTwoForQuestionOne, answerThreeForQuestionOne, answerFourForQuestionOne});
        questionNumberOne.setTryAnswer(answerThreeForQuestionOne);

        Answer answerOneForQuestionTwo = new Answer("commit", 1);
        Answer answerTwoForQuestionTwo = new Answer("push", 2);
        Answer answerThreeForQuestionTwo = new Answer("pull", 3);
        Answer answerFourForQuestionTwo = new Answer("copy", 4);

        questionNumberTwo.setAnswers(new Answer[]{answerOneForQuestionTwo, answerTwoForQuestionTwo, answerThreeForQuestionTwo, answerFourForQuestionTwo});
        questionNumberTwo.setTryAnswer(answerThreeForQuestionTwo);

        Answer answerOneForQuestionThree = new Answer("while", 1);
        Answer answerTwoForQuestionThree = new Answer("for", 2);
        Answer answerThreeForQuestionThree = new Answer("loop", 3);

        questionNumberThree.setAnswers(new Answer[]{answerOneForQuestionThree, answerTwoForQuestionThree, answerThreeForQuestionThree});
        questionNumberThree.setTryAnswer(answerOneForQuestionThree);

        return new Question[]{questionNumberOne, questionNumberTwo, questionNumberThree};
    }
}
