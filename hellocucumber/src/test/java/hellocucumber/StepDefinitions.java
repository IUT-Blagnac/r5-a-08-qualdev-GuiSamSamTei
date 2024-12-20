package hellocucumber;

import io.cucumber.java.en.*;
import io.cucumber.java.lu.a;

import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefinitions {

    String today;
    String actualAnswer;

    @Given("today is {string}")
    public void today_is(String day) {
        today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Non";
    }
}