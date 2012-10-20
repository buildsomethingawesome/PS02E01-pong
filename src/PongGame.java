import javax.swing.*;
import java.awt.*;

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

    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // draw the sky
        g.setColor(new Color(178, 223, 224));
        g.fillRect(0, 0, 800, 600);

        // draw the paddle
        g.setColor(new Color(110, 61, 23));
        g.fillRect(0, 510, 150, 15);

        // draw the ball
        g.setColor(new Color(155, 93, 169));
        g.fillOval(400, 150, 30, 30);
    }

}
