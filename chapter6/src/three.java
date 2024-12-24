import java.io.*;
public class three {
    String path = "scoreOrigin.txt";
    String print="scoreHandled.txt";
    public void Student(){
        try(BufferedReader r=new BufferedReader(new FileReader(path));
            BufferedWriter w=new BufferedWriter(new FileWriter(print))){
            String line;
            while ((line=r.readLine())!=null) {
                int sum = 0;
                StringBuilder numberBuilder = new StringBuilder();
                for (char c : line.toCharArray()) {
                    if (Character.isDigit(c)) {
                        numberBuilder.append(c);
                    } else if (numberBuilder.length() > 0) {
                        sum += Integer.parseInt(numberBuilder.toString());
                        numberBuilder = new StringBuilder();
                    }
                }
                if (numberBuilder.length() > 0) {
                    sum += Integer.parseInt(numberBuilder.toString());
                }
                w.write(line + "总分 " + sum + ".0分");
                w.newLine();
            }
            r.close();
            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
