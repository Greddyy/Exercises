public interface Transport {
    void moving();
    default void printMovement(){
        moving();
    }
}
