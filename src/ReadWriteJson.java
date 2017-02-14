//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
//import jodd.json.JsonParser;
//import jodd.json.JsonSerializer;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class ReadWriteJson {
//    public static void main(String[] args) throws IOException {
//
//
//        File f = new File("question.json");
//
//        // write json
//        JsonSerializer serializer = new JsonSerializer();
//        String json = serializer.serialize(c);
//        FileWriter fw = new FileWriter(f);
//        fw.write(json);
//        fw.close();
//
//        // read json
//        Scanner s = new Scanner(f);
//        s.useDelimiter("\\Z");
//        String contents = s.next();
//        s.close();
//        JsonParser parser = new JsonParser();
//        SurveyResult p2 = parser.parse(contents, SurveyResult.class);
//
//        System.out.println(p2);
//    }
//}
