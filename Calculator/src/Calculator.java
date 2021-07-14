import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JMenuBar menuBar;
    private JMenu file;
    private JMenu edit;
    private JMenu help;
    private JMenuItem close;
    private JMenuItem copy;
    private JMenuItem view;
    private JMenuItem about;

    private JTextField display;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            System.out.println("Could not load System look.");
        }
        new Calculator();
        }
    public Calculator (){
        super("Calculator");
        sendMenuBar();
        sendDisplay();
        sendUI(this);
    }

    private void sendMenuBar() {
        menuBar= new JMenuBar();
        file = new JMenu(" File ");
        edit = new JMenu(" Edit ");
        help = new JMenu(" Help ");
        close = new JMenuItem("Close");
        copy = new JMenuItem("Copy");
        view = new JMenuItem("View Help");
        about = new JMenuItem("About Calculator");
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);


        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String display = "";
                StringSelection string = new StringSelection(display);
                Clipboard system = Toolkit.getDefaultToolkit().getSystemClipboard();
                //System.setContents(string, string);
                }
            });
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "There are currently no help topics to view",
                        "Calculator", JOptionPane.OK_OPTION );
            }
        });
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null  , " Designed by SAIF ALI (c) 2021 ",
                        "Calculator", JOptionPane.OK_OPTION );
            ;
            }
        });


        file.add(close);
        edit.add(copy);
        help.add(view);
        help.add(about);
    }

    private void sendDisplay() {
        display= new JTextField("0");
        display.setBounds(10,10,315,40);
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setEditable(false);
        add(display);
    }

    private void sendUI(Calculator app){
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350,400);
        app.setResizable(false);
        app.setLayout(null);
        app.setLocationRelativeTo(null);
        app.setVisible(true);

}







}
