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

        int numberOfCorrectAnswers = 0;
        int numberOfWrongAnswers = 0;
        String[][] questions = {
                {"В файл с каким расширением компилируется java файл?\n"},
                {"С помощью какой команды git можно отправить изменения в репозиторий?\n"},
                {"Какой применяется цикл, когда неизвестно количество итераций?\n"}
        };
        String[][] answers = {
                {"1) .cs", "2) .java", "3) .class", "4) .exe"},
                {"1) commit", "2) push", "3) pull", "4) copy"},
                {"1) while", "2) for", "3) loop"}
        };
        String[] correctAnswers = {"3", "3", "1"};

        System.out.println("Для ответа на вопрос введите 1 из предложенных цифр.");

        for (int i = 0; i < 3; i++) {
            System.out.print(questions[i][0]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println(answers[i][j]);
            }

            Scanner scanner = new Scanner(System.in);
            String answerOfUser = scanner.nextLine();
            if (answerOfUser.equals(correctAnswers[i])) {
                numberOfCorrectAnswers++;
                System.out.println("Правильно\n");
            } else {
                numberOfWrongAnswers++;
                System.out.println("Неправильно\n");
            }
        }
        System.out.println("Результат: правильно - " + numberOfCorrectAnswers + ", неправильно - " + numberOfWrongAnswers);
    }
}
