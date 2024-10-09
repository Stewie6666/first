package 实训1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class mm4 {
    public mm4() throws IOException {

        JFrame f = new JFrame("本系统由软件工程2022级王淇开发，学号542212320123");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(700, 560);
        f.setLocation(450, 150);
        Container container = f.getContentPane();
        container.setLayout(null);

        JLabel username = new JLabel("输入用户名");
        username.setBounds(27, 15, 100, 60);
        container.add(username);
        JTextField usernametext = new JTextField();
        usernametext.setBounds(210, 21, 270, 60);
        container.add(usernametext);


        JLabel userpassword = new JLabel("输入密码");
        userpassword.setBounds(27, 100, 100, 60);
        container.add(userpassword);
        JTextField userpasswordtext = new JTextField();
        userpasswordtext.setBounds(210, 100, 270, 60);
        container.add(userpasswordtext);

        JButton zhuce = new JButton("用户登录");
        zhuce.setBounds(27, 350, 300, 60);
        container.add(zhuce);


        JButton quxiao = new JButton("注册新用户");
        quxiao.setBounds(350, 350, 300, 60);
        container.add(quxiao);

        FileWriter fw=new FileWriter("D:\\p.txt");
        BufferedReader br = new BufferedReader(new FileReader("D:\\p.txt"));

        zhuce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==zhuce){try {

                    JOptionPane.showMessageDialog(f,"登录成功，跳转到考试页面");
                    new mm1();

                }catch (Exception e1) {
                    e1.printStackTrace();
                }}
            }
        });

        quxiao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==quxiao)  { try {
                    new mm();
                }catch (Exception e1) {
                    e1.printStackTrace();
                }}
            }
        });
    }

}

