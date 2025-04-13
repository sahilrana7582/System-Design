public class User {

    private String userId;
    private String userName;
    private String email;
    private Address address;
    private Cart cart;


    public User(String userId, String userName, String email, Address address, Cart cart) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.address = address;
        this.cart = cart;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", cart=" + cart +
                '}';
    }

}
