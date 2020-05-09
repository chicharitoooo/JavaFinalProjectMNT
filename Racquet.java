import java.awt.*;
import java.awt.event.KeyEvent;

public class Racquet {
    private static final int Y = 550;
    private static final int WIDTH = 80;
    private static final int HEIGHT = 10;

    private MiniTennis game;
    private int x;
    private int xspd;
    public Racquet(MiniTennis game) {
        this.game = game;
    }

    public void move() {
        if (x + xspd > 0 && x + xspd < game.getWidth()- WIDTH)
            x = x + xspd;
    }

    public void paint(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(x, Y, WIDTH, HEIGHT);
    }

    public void keyReleased(KeyEvent e) {
        xspd = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xspd = -game.speed;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xspd = game.speed;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, Y, WIDTH, HEIGHT);
    }

    public int getY() {
        return Y;
    }
}
