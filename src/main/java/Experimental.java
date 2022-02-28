import javax.swing.*;

public class Experimental {
    private JPanel panel1;
    private JLabel lblMensagem;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Experimental");
        frame.setContentPane(new Experimental().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
