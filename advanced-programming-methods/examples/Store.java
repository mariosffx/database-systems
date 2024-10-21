
public class Store {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    String name;
    int count;
    double price;
    double totalPrice;
    double profits = 0;

    // constructor method
    public Store(String name, int count, double price) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.totalPrice = count * price;
    }

    // advertise method
    public void advertise() {
        String advertiseMessage = "Selling " + this.name + "!";
        String priceMessage = "for the fantastic price of: " + this.price;
        String totalMessage = "Total price for " + this.count + " " + this.name + " is: " + this.totalPrice;
        System.out.println(advertiseMessage);
        System.out.println(priceMessage);
        System.out.println(totalMessage);
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public void setProfits() {
        this.profits += this.totalPrice;
    }

    private double getProfits() {
        return this.profits;
    }

    public void printProfits() {
        System.out.println("Your total profits are: " + getProfits());
    }

    public void greetCustomer(String customerName) {
        System.out.println(ANSI_BLUE + "Welcome to the store " + customerName + "!" + ANSI_RESET);
    }

    @Override
    public String toString() {

        String details = """
            Store Details
            ==============
            name: %s
            count: %d
            price: %.2f
            totalPrice %.2f
            """.formatted(this.name, this.count, this.price, this.totalPrice);
        return details;
    }

    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);

        cookieShop.greetCustomer("Marios");

        System.out.println("Cookies Shop:");
        cookieShop.advertise();
        cookieShop.setProfits();
        cookieShop.printProfits();
        cookieShop.setProfits();
        System.out.println("Setting profits x");
        cookieShop.printProfits();
        System.out.println();

        Store biscuitShop = new Store("biscuits", 100, 5);
        biscuitShop.greetCustomer("John");
        biscuitShop.advertise();
        System.out.println();

        System.out.println(biscuitShop);

        System.out.println();

        SavingsAccount mySavings = new SavingsAccount(21000);
        mySavings.checkBalance();
        mySavings.withdraw(500);
        System.out.println(mySavings);

    }

}
