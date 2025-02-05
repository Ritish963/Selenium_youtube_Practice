package stepDefintion;

import base.TestBase;
import org.junit.After;
import org.junit.Before;

import static sun.io.Win32ErrorMode.initialize;


public class Hooks extends TestBase {
    @Before
    public void setup()
    {
        initialize();
    }

}
