import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameHaveDialog extends JFrame {
    private JTextArea textArea;
    public FrameHaveDialog() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        textArea = new JTextArea("Java语言程序设计教程");
        JButton openDialogButton = new JButton("设置字体");
        openDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FontDialog fontDialog = new FontDialog(FrameHaveDialog.this);
                fontDialog.setVisible(true);
                String selectedFont = fontDialog.getSelectedFont();
                textArea.setFont(new Font(selectedFont,Font.PLAIN,20));
            }
        });
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(openDialogButton, BorderLayout.NORTH);
        setSize(400, 300);
    }
}
