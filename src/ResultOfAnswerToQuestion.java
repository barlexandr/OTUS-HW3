public class ResultOfAnswerToQuestion {
    private int countOfCorrectAnswers;
    private int countOfWrongAnswers;

    public void addCorrectAnswer() {
        this.countOfCorrectAnswers++;
    }

    public void addWrongAnswer() {
        this.countOfWrongAnswers++;
    }

    public int getCountOfCorrectAnswers() {
        return countOfCorrectAnswers;
    }

    public void setCountOfCorrectAnswers(int countOfCorrectAnswers) {
        this.countOfCorrectAnswers = countOfCorrectAnswers;
    }

    public int getCountOfWrongAnswers() {
        return countOfWrongAnswers;
    }

    public void setCountOfWrongAnswers(int countOfWrongAnswers) {
        this.countOfWrongAnswers = countOfWrongAnswers;
    }
}
