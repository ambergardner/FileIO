import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please answer the following surveyResults on a scale of 1 to 5, where 1 is the worst and 5 is the best:");

        ArrayList<SurveyResult> survey = new ArrayList<>();

        String q1 = "How would you rate your level of service?";
        String a1 = getResponse(q1);
        survey.add(new SurveyResult(q1, a1));

        String q2 = "How would you reate the flavor of the food?";
        String a2 = getResponse(q2);
        survey.add(new SurveyResult(q2, a2));

        String q3 = "How would you rate the atmoshere of the venue?";
        String a3 = getResponse(q3);
        survey.add(new SurveyResult(q3, a3));

        String q4 = "How would you rate cleanliness of the venue?";
        String a4 = getResponse(q4);
        survey.add(new SurveyResult(q4, a4));

        String q5 = "How would you rate the overall cost?";
        String a5 = getResponse(q5);
        survey.add(new SurveyResult(q5, a5));

        System.out.println(survey);
    }

    static String getResponse(String q) throws IOException {
        System.out.println(q);
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }
}


