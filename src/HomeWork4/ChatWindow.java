package HomeWork4;

import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {
    private JTextField field;
    private final JTextArea jta;
    private JButton button;

    public ChatWindow(){
        setTitle("Simple chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());

        jta = new JTextArea();
        jta.setLineWrap(true);
        JScrollPane jsp = new JScrollPane(jta);
        jp.add(jsp, BorderLayout.CENTER);

        JPanel bottomJp = new JPanel();
        bottomJp.setLayout(new BorderLayout());

        addTextField();
        bottomJp.add(field, BorderLayout.CENTER);

        addButton();
        bottomJp.add(button, BorderLayout.SOUTH);
        jp.add(bottomJp, BorderLayout.SOUTH);
        add(jp);

        setVisible(true);
        field.grabFocus();
    }

    private void sendMessage(){
        if(!field.getText().isEmpty()){
            jta.append(field.getText()+"\n");
            field.setText("");
            field.grabFocus();
        }
    }

    private void addTextField(){
        field = new JTextField();
        field.addActionListener(e -> sendMessage());
    }

    private void addButton(){
        button = new JButton("Отправить");
        button.addActionListener(e -> sendMessage());
    }

}
