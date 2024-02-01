/*package jeni;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class loginpage implements ActionListener {
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        JTextField UserIDField=new JTextField();
        JButton button=new JButton("click me");
        public loginpage(){
            UserIDField.setBounds(100,10,200,20);
            button.setBounds(100,40,200,20);
            button.addActionListener(this);
            label.setBounds(100,50,200,20);
            frame.add(label);
            frame.add(UserIDField);
            frame.add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setSize(null);
            frame.setVisible(true);
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String text;
            if (e.getSource() == button) {
                text = UserIDField.getText();
                label.setText(text);
                int data = Integer.parseInt(text);
                System.out.println(data +data);
                new loginpage();
            }
        }
}*/
