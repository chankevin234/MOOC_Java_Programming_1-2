
public interface TacoBox {
    //In Interfaces, any defined functions here, must be used by the class implenting this interface

    int tacosRemaining(); //return the number of tacos remaining in the box.

    void eat(); //reduces the number of tacos remaining by one. The number of tacos remaining can't become negative.
}
