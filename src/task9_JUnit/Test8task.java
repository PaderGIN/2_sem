package task9_JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task8.Calc;

public class Test8task {
    @Test
    public void testCompile1() {
        String toComp = "10*900+6";
        int ans = 9006;
        Calc testCalc = new Calc();

        testCalc.compile(toComp.toCharArray());
        toComp = "*50=";
        testCalc.compile(toComp.toCharArray());
        Assertions.assertEquals(ans, Calc.temp);
    }
    @Test
    public void testCompile2() {
        int ans = 31;
        Calc testCalc = new Calc();
        String toComp = "80/3";
        testCalc.compile(toComp.toCharArray());
        toComp = "+5";
        testCalc.compile(toComp.toCharArray());
        toComp = "=";
        testCalc.compile(toComp.toCharArray());
        Assertions.assertEquals(ans, Calc.temp);
    }
    @Test
    public void testCompile3() {
        int ans = 3;
        Calc testCalc = new Calc();
        String toComp = "80/3";
        testCalc.compile(toComp.toCharArray());
        toComp = "+5";
        testCalc.compile(toComp.toCharArray());
        toComp = "=";
        testCalc.compile(toComp.toCharArray());
        toComp = "=";
        testCalc.compile(toComp.toCharArray());
        Assertions.assertNotEquals(ans, Calc.temp);
    }
}