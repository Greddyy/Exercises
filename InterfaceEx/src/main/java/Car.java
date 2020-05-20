public class Car implements Transport {
    Transport transport;

    public Car(Transport transport) {
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
        return "car is rolling on the street";
    }
}

