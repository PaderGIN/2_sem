package task1;

public class Main {
    public static void main(String[] args){ // точка входа в программу

        Bird b1 = new Parrot();
        Bird b2 = new Penguin();

        BirdsTeam team = new BirdsTeam();
        team.Add(b1);
        team.Add(b2);

        MyFrame mf = new MyFrame(team);

        Parrot.printCount();
        Penguin.printCount();
        Sparrow.printCount();
    }
}