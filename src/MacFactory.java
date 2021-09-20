public class MacFactory implements AbstractDeviceFactory{

    public Laptop createLaptop() {
        return new MacLaptop();
    }

    public Phone createPhone() {
        return new MacPhone();
    }
}
