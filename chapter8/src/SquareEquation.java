import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.sqrt;
public class SquareEquation extends JFrame{
    JLabel label1,label2,label3;
    JTextField field1,field2,field3;
    JTextArea area;
    JButton button;
    public SquareEquation(String s){
        label1 =new JLabel("二次项系数");
        label2=new JLabel("一次项系数");
        label3=new JLabel("常数项系数");
        field1=new JTextField(5);
        field2=new JTextField(5);
        field3=new JTextField(5);
        button=new JButton("确定");;
        area=new JTextArea(10,40);
        setLayout(new FlowLayout());
        add(label1);
        add(field1);
        add(label2);
        add(field2);
        add(label3);
        add(field3);
        add(button);
        add(area);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a1= Integer.parseInt(field1.getText());
                int b= Integer.parseInt(field2.getText());
                int c= Integer.parseInt(field3.getText());
                if(b*b<4*a1*c){
                    area.setText("NoRealRootException:没有实根");
                }
                else{
                    double n1=(-b+sqrt(b*b-(4*a1*c)))/2*a1;
                    double n2=(-b-sqrt(b*b-(4*a1*c)))/2*a1;
                    area.setText("根："+n1+"根："+n2);
                }
            }
        });
        setVisible(true);
        setSize(500,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(s);
    }

}
