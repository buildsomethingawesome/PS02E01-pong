import java.awt.*;

public class Ball {
    public int x = 400;
    public int y = 150;
    public int xSpeed;
    public int ySpeed;
    public int size = 30;

    public Ball(int levelXSpeed, int levelYSpeed) {
        xSpeed = levelXSpeed;
        ySpeed = levelYSpeed;
    }

    public void draw(Graphics g) {
        g.setColor(new Color(155, 93, 169));
        g.fillOval(x, y, size, size);
    }
}
