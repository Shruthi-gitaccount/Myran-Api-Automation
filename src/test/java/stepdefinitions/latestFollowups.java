package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import stepdefinitions.domain.Followup;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class latestFollowups extends InitializeTest {
    @Given("Get a organization details with orgaizationId {int}")
    public void get_a_organization_details_with_orgaizationId(int organizationId) {
        RestAssured.baseURI  =  myranConfig.getBaseUrl();
        response = RestAssured.given().
                request().
                contentType("application/json").request().
                header("Authorization", "bearer "+ accessToken).
                when().get("/followups/latest?organizationId="+ organizationId);

    }

    @Then("Organization should be found and Status_code equals {int}")
    public void organization_should_be_found_and_Status_code_equals(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }
    
    @Then("id equlas to {string}")
    public void id_equlas_to(String id) throws JsonMappingException, JsonProcessingException {
        String jsonString = response.getBody().asString();
        
        ObjectMapper mapper = new ObjectMapper();
        List<Followup> followUps = mapper.readValue(jsonString, new TypeReference<List<Followup>>(){});
        
        for(Followup followUp: followUps) {
        	System.out.println(followUp.getId()+ " : " + followUp.getName());
        }
        Assert.assertEquals(id, JsonPath.from(jsonString).get("id").toString());
    }
    
    @Given("A list of latest followups are available")
    public void a_list_of_latest_followups_are_available() {
    	
    	// Write code here that turns the phrase above into concrete actions
    	
        throw new io.cucumber.java.PendingException();
    }

}
