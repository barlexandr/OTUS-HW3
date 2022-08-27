public class Question {
    private String question;
    private Answer[] answers;
    private Answer tryAnswer;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public Question(String question, Answer[] answers, Answer tryAnswer) {
        this.question = question;
        this.answers = answers;
        this.tryAnswer = tryAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public Answer getTryAnswer() {
        return tryAnswer;
    }

    public void setTryAnswer(Answer tryAnswer) {
        this.tryAnswer = tryAnswer;
    }

    public String getAnswersAndTheirNumberInString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Answer answer : this.answers) {
            stringBuilder.append(answer.getAnswerNumberInQuestion()).append(") ").append(answer.getAnswer()).append("\n");
        }
        return String.valueOf(stringBuilder);
    }
}
