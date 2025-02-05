
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.epam"


)
public class TestRunner extends AbstractTestNGCucumberTests {


}
