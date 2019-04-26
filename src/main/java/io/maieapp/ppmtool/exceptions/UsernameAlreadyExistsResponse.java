package io.maieapp.ppmtool.exceptions;

public class UsernameAlreadyExistsResponse {

    private String username;
    private String password;

    public UsernameAlreadyExistsResponse(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
