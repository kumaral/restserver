package com.example.restServ;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.DEFINED_PORT, classes=RestServApplication.class)
public class StepDefinitions {
    String url = null;
	double result = 0;
	
	@Given("rest api {string}")
	public void restApi(String url) {
	    this.url =url;
	}

	@When("I invoke api")
	public void iInvokeApi() {
	    RestTemplate restApi = new RestTemplate();
	    result= restApi.getForObject(url, Double.class);
	}

	@Then("expected result {double}")
	public void expectedResult(Double expectedResult) {
	   assertEquals(expectedResult,result,0.001); 

	}
}
