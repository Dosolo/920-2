import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args){
        new Main();
        JFrame frame = new JFrame("password");
        frame.setSize(600, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel){
        panel.setLayout(null);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,30,80,25);
        panel.add(passwordLabel);
        JPasswordField passwordText = new JPasswordField(8);
        JLabel password=new JLabel("23323456");
        JLabel End =new JLabel("");
        panel.add(End);
        End.setBounds(480,250,600,25);
        passwordText.setBounds(100,30,165,25);
        panel.add(passwordText);

        JButton zeroButton = new JButton("0");
        zeroButton.setBounds(40,80,80,60);
        panel.add(zeroButton);
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==zeroButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText( stArea +"0" );
                }
            }
        });
        JButton oneButton = new JButton("1");
        oneButton.setBounds(130,80,80,60);
        panel.add(oneButton);
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==oneButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText( stArea +"1"  );
                }
            }
        });
        JButton twoButton = new JButton("2");
        twoButton.setBounds(220,80,80,60);
        panel.add(twoButton);
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==twoButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea +"2");
                }
            }
        });
        JButton threeButton = new JButton("3");
        threeButton.setBounds(310,80,80,60);
        panel.add(threeButton);
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==threeButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText( stArea+ "3");
                }
            }
        });
        JButton fourButton = new JButton("4");
        fourButton.setBounds(40,150,80,60);
        panel.add(fourButton);
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==fourButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"4");
                }
            }
        });
        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(130,150,80,60);
        panel.add(fiveButton);
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==fiveButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"5");
                }
            }
        });
        JButton sixButton = new JButton("6");
        sixButton.setBounds(220,150,80,60);
        panel.add(sixButton);
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==sixButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"6");
                }
            }
        });
        JButton sevenButton = new JButton("7");
        sevenButton.setBounds(310,150,80,60);
        panel.add(sevenButton);
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==sevenButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"7");
                }
            }
        });
        JButton eightButton = new JButton("8");
        eightButton.setBounds(40,220,80,60);
        panel.add(eightButton);
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==eightButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"8");
                }
            }
        });
        JButton nineButton = new JButton("9");
        nineButton.setBounds(130,220,80,60);
        panel.add(nineButton);
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==nineButton ||actionEvent.getSource()==passwordText){
                    String area;
                    area = passwordText.getText(); //獲取值
                    String stArea = String.valueOf(area);
                    passwordText.setText(stArea+"9");
                }
            }
        });
        JButton SubmitButton = new JButton("Submit");
        SubmitButton.setBounds(220,220,80,60);
        panel.add(SubmitButton);
        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource()==SubmitButton){
                    //String Password = "23323456";
                    if (passwordText.getText().equals(password.getText())) {
                        //System.out.print("Success");
                        End.setText("Success");

                    }else{
                        //System.out.println("Fail");
                        //System.out.println(password.getText());
                        //System.out.println(passwordText.getText());
                        End.setText("Fail");

                    }

                }
            }
        });
        JButton ExitButton = new JButton("Exit");
        ExitButton.setBounds(310,220,80,60);
        panel.add(ExitButton);
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}