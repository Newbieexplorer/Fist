import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:/JavaLesson/TXT.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:/JavaLesson/TXT1.txt"));

        StringBuffer r = new StringBuffer();
        StringBuffer r1 = new StringBuffer();
        String buffer;
        while ((buffer = reader.readLine()) != null) {
            for (int i =0;i<buffer.length();i++){
               if(Character.isDigit(buffer.charAt(i))){
                    r1.append(buffer.charAt(i));
                }
            }
            if(!r1.toString().isEmpty()) writer.write(r1.toString()+"\r\n");writer.write(r1.toString() + "\r\n");
            System.out.println(r1.toString());
            r1.setLength(0);
            writer.flush();
        }
        writer.close();
        reader.close();
    }
}
