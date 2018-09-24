package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExercicesIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExercicesIntroTesting.findLast(new int []{2, 3, 5}, 2);
        assertEquals(result, 0);
    }

    @Test
    public void testLastZero(){
        final int result = ExercicesIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive(){
        final int result = ExercicesIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }

    //NOUS TESTOS RE:

    @Test
    public void testFindLastRE(){
        final int result = ExercicesIntroTesting.findLast(new int []{2, 1, 5}, 1);
        assertEquals(result, 1);
    }

    @Test
    public void testLastZeroRe(){
        final int result = ExercicesIntroTesting.lastZero(new int []{12134245, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositiveRe(){
        final int result = ExercicesIntroTesting.countPositive(new int []{-4, 2, 6, 2, 9, -1});
        assertEquals(result, 4);
    }

    @Test
    public void testOddOrPosRe(){
        final int result = ExercicesIntroTesting.oddOrPos(new int []{1,2,-2,0,7});
        assertEquals(result, 3);
    }

}
