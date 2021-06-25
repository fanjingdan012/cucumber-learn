import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@simpleDemo",
        features = {"src/test/java/"},
        glue = {},
        plugin = {"SamplePlugin"}
        )
public class CucumberTest {

    public void before(){
        System.out.println("before");
    }
}