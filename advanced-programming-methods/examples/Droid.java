
public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;

    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = 10;
    }

    @Override
    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void energyReport() {
        System.out.println("Current energy is at: " + batteryLevel);

    }

    public static void main(String[] args) {
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid.name);
        System.out.println(myDroid);
        myDroid.performTask("dance");
        System.out.println(myDroid.batteryLevel);
    }

}
