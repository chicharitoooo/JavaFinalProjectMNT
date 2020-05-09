import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;//с кнопками «Свернуть», «Во весь экран» и «Закрыть»). Оно может изменять размеры и перемещаться по экрану.
import javax.swing.JPanel;// представляющий собой прямоугольное пространство, на котором можно размещать другие элементы
import javax.swing.JOptionPane;

public class MiniTennis extends JPanel{ //расширяет возможности JPanel
    Racquet racquet = new Racquet(this);
    Ball ball = new Ball(this);
    int speed = 1;

    private int getScore() {

        return speed -1 ;
    }
    public MiniTennis() {
        addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e) {
                racquet.keyPressed(e);
            }

            public void keyReleased(KeyEvent e) {
                racquet.keyReleased(e);
            }
        });
        setFocusable(true); //не устанавливает фокус сам по себе, он просто дает возможность потенциально сосредоточиться на компонент
    }

    public static void main(String[] args) throws InterruptedException { //выбрасывает ошибки в методе
        MainGame();
    }
    public static void MainGame() throws InterruptedException {
        Music.Music("C:\\Users\\Murok\\mini-tennis-game\\Main\\music\\background.wav");
        MiniTennis game = new MiniTennis();
        JFrame frame = new JFrame();
        frame.add(game);
        frame.setSize(500, 600);
        frame.setVisible(true);//makes the frame appear onscreen
        //frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        while (true) {
            game.move();
            game.repaint();
            Thread.sleep(13);
        }
    }

    public void paint(Graphics g) {//Графический контекст отвечает за любой рисунок в игре
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        ball.paint(g2d);
        racquet.paint(g2d);

        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Tahoma", Font.BOLD, 30));
        g2d.drawString(String.valueOf(getScore()), 10, 30);

    }

    private void move() {
        ball.move();
        racquet.move();
    }

    public void gameOver() {
        int n = JOptionPane.showConfirmDialog(
                this,
                "Would you like to play again?",
                "Game is end",
                JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            ball.yspd = 0;
        } else {
            System.exit(ABORT);
        }
    }

}
