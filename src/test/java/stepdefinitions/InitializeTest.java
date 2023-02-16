package stepdefinitions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import stepdefinitions.config.MyranConfig;

import java.io.IOException;

import static stepdefinitions.config.MyranConfiguration.getBaseConfiguration;

public class InitializeTest {
    protected static MyranConfig myranConfig;
    protected RequestSpecification request;
    protected static Response response;
    protected static  String  accessToken;

    static {
        try {
            myranConfig = getBaseConfiguration();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
