package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassB extends BaseTest {
    @Test
    void parallelB(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
