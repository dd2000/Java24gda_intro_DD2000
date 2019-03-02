package pl.sda._JAVA_gda24_intro.stat;

public class Vehicle {
    //static field - one for all objects
    private static int count;
    //ordinary not static field - separate for each object
    private int vehicleId;
    private String name;

    //not-static initialize block - run every time new object is created
    {
        System.out.println("-------------------------------");
        System.out.println("non-static initialization block");
        if(count == 2) {
            System.out.println("skip id for vehicle");
            count++;
        }
    }

    //static initialize block - run once - when class is called for the first time
    static {
        System.out.println("static initialization block");
        System.out.println("-------------------------------");
    }

    public Vehicle(String name) {
        System.out.println("constructor");
        this.name = name;
        this.vehicleId = ++count;
    }

    public static int getCount() {
        return count;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Vehicle.getCount() = " + Vehicle.getCount());

        Vehicle vehicle1 = new Vehicle("tractor");
        System.out.println("vehicle1 = " + vehicle1);

        Vehicle vehicle2 = new Vehicle("bicycle");
        System.out.println("vehicle2 = " + vehicle2);

        Vehicle vehicle3 = new Vehicle("car");
        System.out.println("vehicle3 = " + vehicle3);

        System.out.println("-------------------------------");
        System.out.println("Vehicle.getCount() = " + vehicle1.getCount());
    }
}
