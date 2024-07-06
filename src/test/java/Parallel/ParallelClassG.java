package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassG extends BaseTest {
    @Test
    void parallelG(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
