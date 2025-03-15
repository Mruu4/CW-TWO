package owners;

public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayOwner() {
        System.out.println("Owner: " + name);
        System.out.println("The car was bought at the price of 1000000$ ");
    }
}