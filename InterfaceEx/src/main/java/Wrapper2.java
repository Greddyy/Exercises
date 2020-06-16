public class Wrapper2<T> {

    private T transport;

    public Wrapper2(T transport) {
        this.transport = transport;
    }

    public void setTransport(T transport){
        this.transport = transport;
    }

    public T getTransport(){
        return transport;
    }


}
