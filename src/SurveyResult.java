
public class SurveyResult {
    String question;
    String answer;



    public SurveyResult(String question, String answer) {

        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return (question + " " + "(" + answer + ")");

    }



}

