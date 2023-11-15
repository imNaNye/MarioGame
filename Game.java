import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable{
    public static final int WIDTH = 300;
    public static final int HEIGHT = WIDTH / 16 * 9;
    public static final int SCALE = 4;
    public static final String TITLE = "MarioGame";

    private Thread thread;
    private boolean running = false;

    private synchronized void start(){
        if(running) return;
        running = true;
        thread = new Thread(this, "t1");
        thread.start();

    }

    private synchronized void stop(){
        if (!running)  return;
        running = false;
        try{
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();
        double delta = 0.0;
        double ns = 1000000000.0 / 60.0; //나노초 단위
        int frames = 0; //프레임단위
        int ticks = 0; //업데이트단위
        while(running){ //프로그램 작동 중 실행코드
            long now = System.nanoTime();
            delta += (now-lastTime)/ns;
            lastTime = now;
            while (delta >= 1){
                tick();
                ticks++;
                delta--;
            }
            render();
            frames++;
            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println(frames + " frame per second " + ticks + " updates per second");
                frames = 0;
                ticks = 0;
            }
        }
        stop();
    }

    public void render(){ // 렌더링

    }

    public void tick(){ // update

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
