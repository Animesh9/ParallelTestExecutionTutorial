package Parallel;

import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassH extends BaseTest {
    @Test
    void parallelH(){
        System.out.println("Test Run " + this.getClass().getSimpleName());
    }
}
