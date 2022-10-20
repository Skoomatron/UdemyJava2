package VIPCustomer;

public class VIPCustomer {
    private String name;
    private String email;
    private long limit;

    public VIPCustomer() {
        this("Null", "Null", 0);
    }

    public VIPCustomer(String name, String email) {
        this.name = name;
        this.email = email;
        this.limit = 0;
    }
    public VIPCustomer(String name, String email, long limit) {
        this.name = name;
        this.email = email;
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getLimit() {
        return limit;
    }
}
