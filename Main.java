import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

// This program is an example of using ActionListeners on a JButton

public class Main extends JFrame {
    private static JLabel label1;
    private static JLabel label2;

    public static void main(String[] args)
    {
        final int FRAME_WIDTH = 640;
        final int FRAME_HEIGHT = 480;
        GridLayout glayout = new GridLayout(3,3);
        JFrame frame = new Main();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setTitle("Almost TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GameState gstate = new GameState();
        panel.setLayout(glayout);
        for(int i=1;i<10;i++) {
            GameButton button = new GameButton(i);
            panel.add(button);
            button.addActionListener(new ClickListener(gstate,button));

        }
        gstate.setPlayer("X");
        frame.add(panel);

        frame.setVisible(true);
    }
}
