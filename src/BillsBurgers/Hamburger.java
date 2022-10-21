package BillsBurgers;

public class Hamburger {
//
//    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", "White", 3.56);
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
//
//        DeluxeBurger db = new DeluxeBurger();
//        db.addHamburgerAddition3("Should not do this", 50.53);
//        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
//    }
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    private String addition1Name;
    private double addition1Price = 0;
    private String addition2Name;
    private double addition2Price = 0;
    private String addition3Name;
    private double addition3Price = 0;
    private String addition4Name;
    private double addition4Price = 0;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    public Hamburger(){

    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
    }
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + " on a " + this.breadRollType + " roll "
                + "with " + this.meat + ", price is "  + this.price);
        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}
