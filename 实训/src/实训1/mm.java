package 实训1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class mm  {

    public  mm() throws IOException {
        FileWriter fw=new FileWriter("D:\\p.txt");


        JFrame f=new JFrame("本系统由软件工程2022级王淇开发，学号542212320123");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        f.setSize(700,560);
        f.setLocation(450,150);


        Container container=f.getContentPane();
        container.setLayout(null);


        JLabel username=new JLabel("注册用户名");
        username.setBounds(27,15,100,60);
        container.add(username);
        JTextField usernametext=new JTextField();
        usernametext.setBounds(260,21,270,60);
        container.add(usernametext);


        JLabel userpassword=new JLabel("注册密码");
        userpassword.setBounds(27,75,100,60);
        container.add(userpassword);
        JTextField userpasswordtext=new JTextField();
        userpasswordtext.setBounds(260,75,270,60);
        container.add(userpasswordtext);


        JLabel ageclass=new JLabel("就学年级");
        ageclass.setBounds(27,175,100,60);
        container.add(ageclass);
        JComboBox<String>ageSelect=new JComboBox<>();
        ageSelect.addItem("一年级");
        ageSelect.addItem("二年级");
        ageSelect.addItem("三年级");
        ageSelect.addItem("四年级");
        ageSelect.addItem("五年级");
        ageSelect.addItem("六年级");
        ageSelect.setBounds(260,175,270,60);
        container.add(ageSelect);


        JLabel sex=new JLabel("性别");
        sex.setBounds(27,265,100,60);
        container.add(sex);
        JRadioButton male=new JRadioButton("男",false);
        JRadioButton female=new JRadioButton("女",true);
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.setBounds(310,265,50,30);
        female.setBounds(400,265,50,30);
        container.add(male);
        container.add(female);

        JButton zhuce=new JButton("注册用户");
        zhuce.setBounds(27,400,300,60);
        container.add(zhuce);


        JButton quxiao=new JButton("取消");
        quxiao.setBounds(350,400,300,60);
        container.add(quxiao);


        String x=usernametext.getText();
        String y=userpasswordtext.getText();
        zhuce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    fw.write(x);
                    fw.write("\r\n");
                    fw.write(y);
                    new mm4();
                }catch (Exception e1){
                    e1.printStackTrace();
                }
            }
        });

        quxiao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new mm4();
                }catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

    }


}



