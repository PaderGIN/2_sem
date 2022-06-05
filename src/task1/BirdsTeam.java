package task1;
import java.awt.*;
import java.util.ArrayList;

public class BirdsTeam extends ArrayList<Bird> {

    public BirdsTeam(){
        super();
    }

    public void Add(Bird b){
        add(b);
    }

    public void draw(Graphics g){
        for(int i = 0; i < this.size(); i++){
            this.get(i).draw(g);
        }
    }
}