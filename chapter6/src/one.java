import java.io.*;

public class one {
    public int countWords(String line) {
        if (line == null || line.isEmpty()) {
            return 0;
        }
        String[] words = line.trim().split(" ");
        return words.length;
    }
    public void doIt(){
        String inputFilePath = "EnglishInit.txt";
        String outputFilePath = "EnglishCount.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int wordCount = this.countWords(line);
                String outputLine = line + " " + wordCount;
                writer.write(outputLine);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
