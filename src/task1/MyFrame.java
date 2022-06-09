package task1;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public static final int width = 400;
    public static final int height = 400;

    private Bird bird;
    private BirdsTeam birds;

    public MyFrame(Bird bird){
        start();
        this.bird = bird;
    }

    public MyFrame(BirdsTeam birds){
        start();
        this.birds = birds;
    }

    private void start(){
        this.setSize(width, height);
        this.setTitle("Birds");
        this.setLocation(200, 200);
        this.setVisible(true); // --> paint(g)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        g.translate(width/2, height/2);
        g.drawLine(-width/2, 0, width/2, 0);
        g.drawLine(0, height/2, 0, -height/2);

        birds.draw(g);


    }
}