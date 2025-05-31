public class User {
    private String username;
    private String email;
    private String password;
    private String role;
    private boolean isLoggedIn;

    public User(String username, String email, String password, String role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.isLoggedIn = false;
    }

    public boolean logIn(String enteredEmail, String enteredPassword) {
        if (this.email.equals(enteredEmail) && this.password.equals(enteredPassword)) {
            this.isLoggedIn = true;
            System.out.println("Login successful for user: " + this.username);
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    public void logOut() {
        if (this.isLoggedIn) {
            this.isLoggedIn = false;
            System.out.println("User " + this.username + " has logged out.");
        } else {
            System.out.println("User " + this.username + " is not logged in.");
        }
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
