package stepdefinitions.config;

public class MyranConfig {

    private String baseUrl;
    private String userName;
    private String password;
    private String grantType;
    private String clientId;

    public MyranConfig(
            String baseUrl, String userName, String password, String grantType, String clientId
    ) {
        this.baseUrl = baseUrl;
        this.userName = userName;
        this.password = password;
        this.grantType = grantType;
        this.clientId = clientId;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getClientId() {
        return clientId;
    }
}

