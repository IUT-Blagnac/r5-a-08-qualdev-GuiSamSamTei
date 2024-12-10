package dojo;

import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {

    private Order order;

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String person) {
         order = new Order();
         order.declareOwner(person);
    }

    @When("an order is declared for {string}")
           public void an_order_is_declared_for(String target) {
            order.declareTarget(target);
    }

    @Then("there is {int} cocktail in the order")
    public void there_is_cocktail_in_the_order(int count) {
        List<String> cocktails =  order.getCocktails();
        assertEquals(count, cocktails.size());
    }
    
}

class Order{
    private String owner;
    private String target;
    private List<String> cocktails = new ArrayList<String>();

    public void declareOwner(String owner){
        this.owner = owner;
    }

    public void declareTarget(String target){
        this.target = target;
    }

    public List<String> getCocktails(){
        return cocktails;
    }
}
