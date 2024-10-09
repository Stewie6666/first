package 实训1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


    public class day1 extends JFrame implements KeyListener, ActionListener {
        BufferedReader br = new BufferedReader(new FileReader("D:\\测试.txt"));
        JFrame jf = new JFrame("本系统由IEC软件工程2022级马千翔开发，学号542212320117");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JPanel jp5 = new JPanel();
        JPanel jp6 = new JPanel();
        JLabel jl1 = new JLabel("题目");
        JLabel jl2 = new JLabel("题目");
        JLabel jl3 = new JLabel("题目");
        JLabel jl4 = new JLabel("题目");
        JLabel jl5 = new JLabel("题目");
        JLabel jl16 = new JLabel("当前考试的学生为:" + br.readLine());
        JTextField jt1 = new JTextField(10);
        JTextField jt2 = new JTextField(10);
        JTextField jt3 = new JTextField(10);
        JTextField jt4 = new JTextField(10);
        JTextField jt5 = new JTextField(10);
        JLabel jl6 = new JLabel("正确答案");
        JLabel jl7 = new JLabel("正确答案");
        JLabel jl8 = new JLabel("正确答案");
        JLabel jl9 = new JLabel("正确答案");
        JLabel jl10 = new JLabel("正确答案");
        JLabel jl11 = new JLabel("对错");
        JLabel jl12 = new JLabel("对错");
        JLabel jl13 = new JLabel("对错");
        JLabel jl14 = new JLabel("对错");
        JLabel jl15 = new JLabel("对错");
        JButton bt1 = new JButton("出题");
        JButton bt2 = new JButton("检查");

        public day1() throws HeadlessException, IOException {
            jp6.setLayout(new GridLayout(1,4,1,1));
            jp1.setLayout(new GridLayout(6,1,1,1));
            jp2.setLayout(new GridLayout(6,1,1,1));
            jp3.setLayout(new GridLayout(6,1,1,1));
            jp4.setLayout(new GridLayout(6,1,1,1));
            jp1.add(jl1);jp1.add(jl2);jp1.add(jl3);jp1.add(jl4);jp1.add(jl5);jp1.add(bt1);
            jp2.add(jt1);jp2.add(jt2);jp2.add(jt3);jp2.add(jt4);jp2.add(jt5);jp2.add(bt2);
            jp3.add(jl6);jp3.add(jl7);jp3.add(jl8);jp3.add(jl9);jp3.add(jl10);
            jp4.add(jl11);jp4.add(jl12);jp4.add(jl13);jp4.add(jl14);jp4.add(jl15);
            bt1.addActionListener(this);
            bt2.addActionListener(this);
            jp6.add(jp1);jp6.add(jp2);jp6.add(jp3);jp6.add(jp4);jp5.add(jl16);
            jf.add(jp5,BorderLayout.NORTH);jf.add(jp6);
            jf.setSize(500,500);
            jf.setLocationRelativeTo(null);
            jf.setVisible(true);
        }

        ArrayList<String> list = new ArrayList<>();
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            Object o = actionEvent.getSource();
            if (o == bt1){
                Random r = new Random();
                int a,b,c;
                for(int i = 0 ; ;i++) {
                    a = r.nextInt(10);
                    b = r.nextInt(10);
                    c = r.nextInt(4);
                    switch(i) {
                        case 0:
                            jl1.setText(a+getOp(c)+b);
                            list.add(String.valueOf(calculate(a, b, c)));
                            break;
                        case 1:
                            jl2.setText(a+getOp(c)+b);
                            list.add(String.valueOf(calculate(a, b, c)));
                            break;
                        case 2:
                            jl3.setText(a+getOp(c)+b);
                            list.add(String.valueOf(calculate(a, b, c)));
                            break;
                        case 3:
                            jl4.setText(a+getOp(c)+b);
                            list.add(String.valueOf(calculate(a, b, c)));
                            break;
                        case 4:
                            jl5.setText(a+getOp(c)+b);
                            list.add(String.valueOf(calculate(a, b, c)));
                            break;
                    }
                    if (i == 5) {
                        break;
                    }
                }
            }
            int count = 0;
            if (o == bt2){
                jl6.setText(list.get(0));
                jl7.setText(list.get(1));
                jl8.setText(list.get(2));
                jl9.setText(list.get(3));
                jl10.setText(list.get(4));
                if (jt1.getText().equals(jl6.getText())){
                    jl11.setText("√  正确");
                    count++;
                }else{
                    jl11.setText("×  错误");
                }
                if (jt2.getText().equals(jl7.getText())){
                    jl12.setText("√  正确");
                    count++;
                }else{
                    jl12.setText("×  错误");
                }
                if (jt3.getText().equals(jl8.getText())){
                    jl13.setText("√  正确");
                    count++;
                }else{
                    jl13.setText("×  错误");
                }
                if (jt4.getText().equals(jl9.getText())){
                    jl14.setText("√  正确");
                    count++;
                }else{
                    jl14.setText("×  错误");
                }
                if (jt5.getText().equals(jl10.getText())){
                    jl15.setText("√  正确");
                    count++;
                }else{
                    jl15.setText("×  错误");
                }
                JOptionPane.showMessageDialog(jf,"答题数量为5答对" + count +"题，得分为：" + count*20);
            }
        }
        public static int calculate(int a,int b,int index) {
            int sum = 0;
            switch(index) {
                case 0:
                    sum = a + b;
                    break;
                case 1:
                    sum = a - b;
                    break;
                case 2:
                    sum = a / b;
                    break;
                case 3:
                    sum = a * b;
                    break;

            }
            return sum;
        }
        public static String getOp(int index) {
            String string = "";
            switch(index) {
                case 0:
                    string = "+";
                    break;
                case 1:
                    string = "-";
                    break;
                case 2:
                    string = "/";
                    break;
                case 3:
                    string = "*";
                    break;
            }

            return string;
        }


        @Override
        public void keyTyped(KeyEvent keyEvent) {

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {

        }

        @Override
        public void keyReleased(KeyEvent keyEvent) {

        }
    }


