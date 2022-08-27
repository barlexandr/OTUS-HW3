public class Answer {
    private String answer;
    private int answerNumberInQuestion;

    public Answer() {
    }

    public Answer(String answer, int answerNumberInQuestion) {
        this.answer = answer;
        this.answerNumberInQuestion = answerNumberInQuestion;
    }

    public int getAnswerNumberInQuestion() {
        return answerNumberInQuestion;
    }

    public void setAnswerNumberInQuestion(int answerNumberInQuestion) {
        this.answerNumberInQuestion = answerNumberInQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
