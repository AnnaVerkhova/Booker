package adapter;

import constants.Endpoints;
import model.User;

public class AuthAdapter extends BaseAdapter {

    public static final String TOKEN_PATH = "token";

    public AuthAdapter() {
        super(Endpoints.AUTH_URN);
    }

    public String getToken() {
        String adminGson = gson.toJson(new User("admin", "password123"));
        return post(adminGson)
                .extract()
                .path(TOKEN_PATH);
    }
}