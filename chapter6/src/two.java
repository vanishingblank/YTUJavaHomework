import java.io.*;
import java.util.Scanner;

public class two {
    public void test(){
        String filePath="test.txt";
        Scanner s= new Scanner(System.in);
        try(BufferedReader r=new BufferedReader(new FileReader(filePath))){
            String line;
            String problem="";
            String[] options = new String[1000];
            int score=0;
            int num=0;
            while ((line = r.readLine())!= null) {
                if (line.startsWith("----")) {
                    char answer=line.charAt(line.length()-5);
                    System.out.println(problem);
                    for (int i = 0; i < 4; i++) {
                        System.out.println(options[i]);
                    }
                    System.out.print("输入选择的答案：");
                    char ans = s.next().charAt(0);
                    if (ans == answer) {
                        score++;
                    }
                    problem="";
                    num=0;
                } else {
                    if (problem.isEmpty()) {
                        problem = line;
                    }
                    else{
                        options[num++]=line;
                    }
                }
            }
            System.out.println("最后的得分:"+score);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
