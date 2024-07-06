package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassE extends BaseTest {
    @Test
    void parallelE(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
