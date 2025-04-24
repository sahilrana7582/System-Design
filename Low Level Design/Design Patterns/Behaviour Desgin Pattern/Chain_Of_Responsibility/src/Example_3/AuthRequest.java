package Example_3;

public class AuthRequest {

    private String username;
    private String password;
    private String role;

    public AuthRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

}
