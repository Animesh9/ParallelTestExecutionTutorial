package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassD extends BaseTest {
    @Test
    void parallelD(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
