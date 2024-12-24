import javax.swing.*;
import java.awt.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
public class compute {
    JFrame frame1 = new JFrame();
    FlowLayout frame2 = new FlowLayout();
    JTextArea text1;
    JTextArea text2;
    public compute(String s) {
        super();
        text1 = new JTextArea(10, 30);
        text2 = new JTextArea(1, 30);
        frame1.setLayout(frame2);
        frame1.add(text1);
        frame1.add(text2);
        text1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                calculate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                calculate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                calculate();
            }
        });
        frame1.setTitle(s);
        frame1.setSize(300,300);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void calculate() {
        try {
            String n = text1.getText();
            String[] n1 = n.split("\\s+");
            double sum = 0;
            int count = 0;
            for (String number : n1) {
                if (!number.isEmpty()) {
                    sum += Double.parseDouble(number);
                    count++;
                }
            }
            double average = count > 0? sum / count : 0;
            text2.setText("求和: " + sum + "\n平均值: " + average);
        } catch (NumberFormatException ex) {

        }
    }

}
