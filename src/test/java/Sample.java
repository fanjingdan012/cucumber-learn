import static com.fjd.cucumberlearn.Add.add;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Sample {
    Integer arg0;
    Integer arg1;
    Integer actualAnswer;
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
    public void iGet(Integer arg0) {
        Assert.assertEquals(arg0,actualAnswer);
    }

//    @Given("add {int} to {int}")
//    public void add_to(Integer int1, Integer int2) {
//        this.arg0=int1;
//        this.arg1=int2;
//    }
//    @When("I ask the answer of add")
//    public void i_ask_the_answer_of_add() {
//        actualAnswer = add(arg0,arg1);
//    }
//    @Then("I get {int}")
//    public void i_get(Integer int1) {
//        Assert.assertEquals(int1,actualAnswer);
//    }
}
