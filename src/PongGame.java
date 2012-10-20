import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongGame extends JComponent implements ActionListener {

    private int ballX = 400;
    private int ballY = 150;

    public static void main(String[] args) {
        JFrame window = new JFrame("Pong Game by Aaron");
        PongGame game = new PongGame();
        window.add(game);
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Timer t = new Timer(100, game);
        t.start();
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
        g.fillOval(ballX, ballY, 30, 30);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ballX = ballX + 5;
        ballY = ballY + 7;
        repaint();
    }

}
