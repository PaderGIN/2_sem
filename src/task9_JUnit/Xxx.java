package task9_JUnit;

public class Xxx {
    private int _attr;

    public Xxx(int attr){
        _attr=attr;
    }

    public int get_attr() {
        return _attr;
    }

    public static int min(int a, int b, int c){
        int min=a;
        if (b<min) min=b;
        if (c<min) min=c;
        return min;
    }

    public int div(int a){
        return  this._attr/a;
    }

}
