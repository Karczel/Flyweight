import javax.swing.*;
import java.awt.*;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import java.util.Random;

public class Game extends JFrame {
    private WorldPanel worldPanel = new WorldPanel();
//    private Monster testMonster = new Monster(100, 100);
    private List<Monster> monsters = new ArrayList<Monster>();
//    Monster [] monsters2 = new Monster[];

    public Game(){
        add(worldPanel);
        pack();
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        startSpawningMonsters();
    }

    private void startSpawningMonsters(){
        System.out.println("Start spawning monsters");
        java.util.Timer timer = new java.util.Timer();
        Random random = new Random();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("New monster created!");
                Monster monster = new Monster(
                        random.nextInt(800),
                        random.nextInt(600)
                );
                monsters.add(monster);
                repaint();
            }
        }, 0, 1000);
    }

    class WorldPanel extends JPanel {
        public WorldPanel() {
            setPreferredSize(new Dimension(800, 600));

        }

        @Override
        protected void paintComponent(Graphics g){

            super.paintComponents(g);
            // Example
//        g.setColor(Color.red);
//        g.fillOval(100, 100, 300, 300);
            for(Monster m: monsters) {
                g.drawImage(m.getImage(),
                        m.getX(),
                        m.getY(),
                        100,
                        100,
                        null);
            }
        }
    }



    public static void main(String[] args) {
        new Game();
    }
}