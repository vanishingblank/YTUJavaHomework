import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ComputerFrame extends JFrame
{
    JButton button1,button2;
    JTextField text1,text2,text3;
    JLabel label1,label2,label3;
    public ComputerFrame(String s){
        super();
        button1=new JButton("获取题目");
        button2=new JButton("确认答案");
        setLayout(new FlowLayout());
        add(button1);
        Teacher teach=new Teacher();
        text1=new JTextField(5);
        text1.setEditable(false);
        label1=new JLabel("+");
        text2=new JTextField(5);
        text2.setEditable(false);
        label2=new JLabel("=");
        text3=new JTextField(10);
        label3=new JLabel("你还没有回答呢");
        add(text1);
        add(label1);
        add(text2);
        add(label2);
        add(text3);
        add(button2);
        add(label3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                teach.answer();
                text1.setText(String.valueOf(teach.getNum1()));
                text2.setText(String.valueOf(teach.getNum2()));
                label1.setText(String.valueOf(teach.getWay()));add(text1);
                add(label1);
                add(text2);
                add(label2);
                add(text3);
                add(button2);
                add(label3);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ans= Integer.parseInt(text3.getText());
                if(teach.getAns()==ans){
                    label3.setText("你回答正确");
                }
                else{
                    label3.setText("你回答错误");
                }
            }
        });
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(s);
    }

}
