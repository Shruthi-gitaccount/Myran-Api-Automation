package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

public class AuthorizeSteps extends InitializeTest {

    @Given("Post Login API")
    public void post_Login_API() {
        RestAssured.baseURI  =  "https://myran-idp-test.azurewebsites.net";
        request  =  RestAssured.given();
        request.header("Content-Type",  "application/x-www-form-urlencoded");
    }

    @When("Provide Valid Credential")
    public void provide_Valid_Credential() {
        String payload = "userName="  +  myranConfig.getUserName()  +  "&password="  +  myranConfig.getPassword()  +  "&" +
                "grant_type="  +  myranConfig.getGrantType()  +  "&client_id="  +  myranConfig.getClientId();
        response  =  request.body(payload)
                .post("/connect/token");
    }

    @Then("Status_code equals {int}")
    public void status_code_equals(int statusCode) {
        if(response.getStatusCode() == 200) {
            String jsonString = response.getBody().asString();
            accessToken = JsonPath.from(jsonString).get("access_token").toString();
            System.out.println(accessToken);
        }
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @And("Response contains message equals {string}")
    public void response_contains_message_equals(String message) {
        Assert.assertEquals(message, getJsonPath(response, "error_description"));
    }

    @When("Provide different combinations to {string}, {string}")
    public void provide_different_combinations_to(String email, String password) {
        String payload = "userName="  +  email  +  "&password="  +  password  +  "&" +
                "grant_type="  +  myranConfig.getGrantType() +  "&client_id="  +  myranConfig.getClientId();
        response  =  request.body(payload)
                .post("/connect/token");
    }

    public String getJsonPath(Response response, String key) {
        String resp = response.asString();
        JsonPath js = new JsonPath(resp);
        return js.get(key).toString();
    }
}
