import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        SurveyResult s = new SurveyResult();
        s.question = "q1, q2, q3, q4, q5";
        s.answer = "a1, a2, a3, a4, a5";
        File f = new File("survey.json");


        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(s);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
        System.out.println("JSON Object Successfully written to the file!!");


    }
}

