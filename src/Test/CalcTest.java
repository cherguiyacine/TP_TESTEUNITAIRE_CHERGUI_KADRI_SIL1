package Test;

import Model.Calc;

import static org.junit.Assert.*;
public class CalcTest {

    @org.junit.Test
    public void add() {
        assertEquals(2,new Calc().add(2,0));
    }
}