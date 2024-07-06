package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassJ extends BaseTest {
    @Test
    void parallelJ(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
