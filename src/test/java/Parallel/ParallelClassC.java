package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassC extends BaseTest {
    @Test
    void parallelC(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
