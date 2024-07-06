package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassI extends BaseTest {
    @Test
    void parallelI(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
