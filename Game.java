import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 300;
    public static final int HEIGHT = WIDTH / 16 * 9;
    public static final int SCALE = 4;
    public static final String TITLE = "MarioGame";

    private Thread thread;
    private boolean running = false;

    public synchronized void start(){
        System.out.println("jjjjjjj");
    }

    public synchronized void stop(){

    }

    @Override
    public void run() {

    }

    public Game(){
        Dimension size = new Dimension(WIDTH * SCALE, HEIGHT * SCALE);
        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
    }

    public static void main(String[] args) {
        Game game = new Game();
        JFrame frame = new JFrame(TITLE);
        frame.add(game);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        game.start();
    }

}
