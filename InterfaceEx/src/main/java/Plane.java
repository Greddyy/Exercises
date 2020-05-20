public class Plane implements Transport{

    Transport transport;

    public Plane(Transport transport) {
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
         return "Plane is flying in the sky";

    }
}
