import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener{
    JLabel label ;
    JFrame frame;
    JButton button;
    public Quiz() {
        ImageIcon image = new ImageIcon("C:\\Users\\MSI\\IdeaProjects\\Quiz\\src\\download.jpg");
        frame = new JFrame("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(650, 650);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(image.getImage());


        label=new JLabel();

        Border border=BorderFactory.createLineBorder(Color.GREEN,10);

        label.setText("Bienvenue dans le Quiz");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV BOLI",Font.PLAIN,40));
        label.setIconTextGap(20);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(40,25,540,450);
        frame.add(label);




        button  =new JButton();
        button.setBounds(260,510,100,70);

        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);


        button.setText("Jouer");
        button.setFocusable(false);


        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Ink Free", Font.BOLD,20));
        button.addActionListener(this);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.GREEN);
        button.setBorder(BorderFactory.createEtchedBorder());
        frame.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            NewWindow newWindow=new NewWindow();
        }

        }
    }

