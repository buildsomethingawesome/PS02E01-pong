import java.awt.*;

public class Paddle {
    public int x = 0;
    public int y = 510;
    public int width = 150;
    public int height = 15;

    public void draw(Graphics g) {
        g.setColor(new Color(110, 61, 23));
        g.fillRect(x, y, width, height);
    }
}
