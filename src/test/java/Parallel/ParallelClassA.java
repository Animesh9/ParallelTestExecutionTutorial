package Parallel;

import DataProvider.Data;
import Page.BaseTest;
import org.testng.annotations.Test;

public class ParallelClassA extends BaseTest {
    @Test(dataProviderClass = Data.class, dataProvider = "dataCount", threadPoolSize = 2)
    void parallelA(int count){
//        This test case won't close all the browser instances, leaving 4 browsers open.
//        When running in parallel using a data provider, the driver points to the last window opened, causing an exception.
//        "Error communicating with the remote browser. It may have died."
        System.out.println("Test Run " + this.getClass().getSimpleName() + "-----" + count);
    }
}
