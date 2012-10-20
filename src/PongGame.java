import javax.swing.*;

public class PongGame extends JComponent {

    public static void main(String[] args) {
        JFrame window = new JFrame("Pong Game by Aaron");
        PongGame game = new PongGame();
        window.add(game);
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

}
