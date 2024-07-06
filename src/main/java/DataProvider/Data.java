package DataProvider;

import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider(parallel = true )
    public Object[] dataCount() {
        return new Object[] {1,2,3,4,5};
    }
}
