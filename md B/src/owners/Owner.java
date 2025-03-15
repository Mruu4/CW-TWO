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
    }
}