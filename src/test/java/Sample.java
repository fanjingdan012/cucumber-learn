import static com.fjd.cucumberlearn.Add.add;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Sample {
    int arg0;
    int arg1;
    int actualAnswer;
    @Given("^add (\\d+) to (\\d+)$")
    public void addTo(int arg0, int arg1) {
        this.arg0=arg0;
        this.arg1=arg1;
    }

    @When("^I ask the answer of add$")
    public void iAskTheAnswerOfAdd() {
        actualAnswer = add(arg0,arg1);
    }

    @Then("^I get (\\d+)$")
    public void iGet(int arg0) {
        Assert.assertEquals(arg0,actualAnswer);
    }
}
