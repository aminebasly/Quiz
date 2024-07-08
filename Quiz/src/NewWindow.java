import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NewWindow implements ActionListener {

    String[] questions = {
            "What is the capital of France?",
            "Which continent is Mount Everest located in?",
            "Who painted the Mona Lisa?",
            "Which country is the largest in the world by land area?",
            "Which year was Java created?"

    };


    String[][] options = {
            {"Paris", "Lyon", "Marseille", "Bordeaux"},
            {"Africa", "South America", "North America", "Asia"},
            {"Leonardo da Vinci", "Michelangelo", "Vincent van Gogh", "Claude Monet"},
            {"Canada", "China", "Russia", "United States"},
            {"1991", "1995", "2000", "2005"}
    };
    char[] answers = {
            'A',
            'D',
            'A',
            'C',
            'B'
    };

    char answer;
    int index;
    int index1;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    JFrame frame;
    JTextField textfield = new JTextField();
    JTextArea textarea = new JTextArea();
    JButton next = new JButton();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();
    JButton exit=new JButton();


    public NewWindow() {

        ImageIcon image = new ImageIcon("C:\\Users\\MSI\\IdeaProjects\\Quiz\\src\\download.jpg");
        frame = new JFrame("Quiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(650, 650);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setIconImage(image.getImage());


        textfield.setBounds(0, 0, 650, 50);
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 30));
        textfield.setBorder(BorderFactory.createBevelBorder(1));
        textfield.setHorizontalAlignment(JTextField.CENTER);
        textfield.setEditable(false);

        textarea.setBounds(0, 50, 650, 50);
        textarea.setLineWrap(true);
        textarea.setWrapStyleWord(true);
        textarea.setBackground(new Color(25, 25, 25));
        textarea.setForeground(new Color(0, 217, 255));
        textarea.setFont(new Font("MV Boli", Font.BOLD, 22));
        textarea.setBorder(BorderFactory.createBevelBorder(1));
        textarea.setEditable(false);


        buttonA.setBounds(0, 100, 100, 100);
        buttonA.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        buttonB.setBounds(0, 200, 100, 100);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        buttonC.setBounds(0, 300, 100, 100);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        buttonD.setBounds(0, 400, 100, 100);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 35));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        ImageIcon icon = new ImageIcon("C:\\Users\\MSI\\IdeaProjects\\Quiz\\src\\189253.png");
        Image imageicon = icon.getImage();
        int newWidth = 25;
        int newHeight = 25;
        Image resizedImage = imageicon.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        next.setIcon(resizedImageIcon);

        next.setBounds(550, 550, 90, 50);
        next.setFont(new Font("Ink Free", Font.BOLD, 12));
        next.setFocusable(false);
        next.addActionListener(this);
        next.setText("Next");
        next.setHorizontalTextPosition(JButton.RIGHT);
        next.setVerticalTextPosition(JButton.CENTER);



        ImageIcon icon1 = new ImageIcon("C:\\Users\\MSI\\IdeaProjects\\Quiz\\src\\e.jpg");
        Image imageicon1 = icon1.getImage();
        int newWidth1 = 25;
        int newHeight1 = 25;
        Image resizedImage1 = imageicon1.getScaledInstance(newWidth1, newHeight1, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon1 = new ImageIcon(resizedImage1);
        exit.setIcon(resizedImageIcon1);
        exit.setBounds(280, 470, 90, 50);

        exit.setFocusable(false);
        exit.setFont(new Font("MV Boli", Font.BOLD, 10));
        exit.addActionListener(this);
        exit.setText("EXIT");
        exit.setHorizontalTextPosition(JButton.RIGHT);
        exit.setVerticalTextPosition(JButton.CENTER);
        exit.setBackground(Color.white);


        answer_labelA.setBounds(125, 100, 500, 100);
        answer_labelA.setBackground(new Color(50, 50, 50));
        answer_labelA.setForeground(new Color(25, 255, 0));
        answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 35));

        answer_labelB.setBounds(125, 200, 500, 100);
        answer_labelB.setBackground(new Color(50, 50, 50));
        answer_labelB.setForeground(new Color(25, 255, 0));
        answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 35));

        answer_labelC.setBounds(125, 300, 500, 100);
        answer_labelC.setBackground(new Color(50, 50, 50));
        answer_labelC.setForeground(new Color(25, 255, 0));
        answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 35));

        answer_labelD.setBounds(125, 400, 500, 100);
        answer_labelD.setBackground(new Color(50, 50, 50));
        answer_labelD.setForeground(new Color(25, 255, 0));
        answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 35));


        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(25, 25, 25));
        number_right.setForeground(new Color(25, 255, 0));
        number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(25, 25, 25));
        percentage.setForeground(new Color(25, 255, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(next);
        frame.add(textarea);
        frame.add(textfield);
        nextQuestion();



    }

    public void nextQuestion() {

        if (index >= total_questions) {
            results();
        } else {
            next.setEnabled(false);
            textfield.setText("Question " + (index + 1));
            textarea.setText(questions[index]);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (e.getSource() == buttonA) {
            answer = 'A';

            next.setEnabled(true);
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonB) {
            answer = 'B';

            next.setEnabled(true);
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonC) {
            answer = 'C';

            next.setEnabled(true);
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == buttonD) {
            answer = 'D';

            next.setEnabled(true);
            if (answer == answers[index]) {
                correct_guesses++;
            }
        }
        if (e.getSource() == next) {
            answer = ' ';
            buttonA.setEnabled(true);
            buttonB.setEnabled(true);
            buttonC.setEnabled(true);
            buttonD.setEnabled(true);
            index++;
            nextQuestion();

        }
        //displayAnswer();
        if (e.getSource() == exit) {
            System.exit(0);
        }

    }



    /*public void displayAnswer() {
        index1=index;



        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if(answers[index1] != 'A')
            answer_labelA.setForeground(new Color(255,0,0));
        if(answers[index1] != 'B')
            answer_labelB.setForeground(new Color(255,0,0));
        if(answers[index1] != 'C')
            answer_labelC.setForeground(new Color(255,0,0));
        if(answers[index1] != 'D')
            answer_labelD.setForeground(new Color(255,0,0));

        Timer pause = new Timer(2000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                answer_labelA.setForeground(new Color(25,255,0));
                answer_labelB.setForeground(new Color(25,255,0));
                answer_labelC.setForeground(new Color(25,255,0));
                answer_labelD.setForeground(new Color(25,255,0));





            }

        });
        index1++;*/

    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        result = (int) ((correct_guesses / (double) total_questions) * 100);

        textfield.setText("RESULTS!");
        textarea.setText("");
        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("(" + correct_guesses + "/" + total_questions + ")");
        percentage.setText(result + "%");
        frame.add(exit);
        frame.add(number_right);
        frame.add(percentage);
        next.setEnabled(false);

    }
}







