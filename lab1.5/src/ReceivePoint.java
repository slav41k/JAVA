public class ReceivePoint implements Point
{
    private final String address;

    public ReceivePoint(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
