public interface Transport {
    String moving();
    default void printMovement(){
        System.out.println(moving());

    }
}
