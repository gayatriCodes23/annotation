package com.concerto.user_authentication.db_model;

public class JwtResponse {

    private String jwtToken;
    private String username;

    public String getJwtToken() {
        return jwtToken;
    }

    public String getUsername() {
        return username;
    }

    private JwtResponse() {
        // Private constructor to prevent direct instantiation
    }

    public static JwtResponseBuilder builder() {
        return new JwtResponseBuilder();
    }

    public static class JwtResponseBuilder {
        private String jwtToken;
        private String username;

        private JwtResponseBuilder() {
            // Initialize any default values here if needed
        }

        public JwtResponseBuilder jwtToken(String jwtToken) {
            this.jwtToken = jwtToken;
            return this;
        }

        public JwtResponseBuilder username(String username) {
            this.username = username;
            return this;
        }

        public JwtResponse build() {
            JwtResponse response = new JwtResponse();
            response.jwtToken = this.jwtToken;
            response.username = this.username;
            return response;
        }
    }

    @Override
    public String toString() {
        return "JwtResponse [jwtToken=" + jwtToken + ", username=" + username + "]";
    }
}
