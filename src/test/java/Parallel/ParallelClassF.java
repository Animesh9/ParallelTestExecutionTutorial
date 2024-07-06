package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassF extends BaseTest {
    @Test
    void parallelF(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
