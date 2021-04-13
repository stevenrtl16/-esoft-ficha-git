import javax.swing.*;

public class Heloworld extends  JFrame{
    private JPanel panel1;

    public Heloworld(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
    }


    public static void main(String[] args){
        new Heloworld().setVisible(true);
    }
}
