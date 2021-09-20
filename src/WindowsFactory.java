// WindowsFactory with methods to instantiate a windows phone or windows laptop product

public class WindowsFactory implements AbstractDeviceFactory{

    public Laptop createLaptop() {
        return new WindowsLaptop();

    }

    public Phone createPhone() {
        return new WindowsPhone();
    }
}
