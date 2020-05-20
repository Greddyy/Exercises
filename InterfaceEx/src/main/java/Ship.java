public class Ship implements Transport {
    Transport transport;

    public Ship(Transport transport) {
        this.transport = transport;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String moving() {
        return "Ship is sailing on in the ocean";
    }
}
