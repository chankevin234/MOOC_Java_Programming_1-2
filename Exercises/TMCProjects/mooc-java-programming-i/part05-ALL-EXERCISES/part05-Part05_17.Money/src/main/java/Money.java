public class Money {
    //final means that the value of this variable can't be changed after initialization in constructor
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    /*
     returns a new money object that is worth the total amount
     of the object that was called + object that is receiving the parameter
     */
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (cents > 99) {
            newCents = cents - 100;
            newEuros = euros + 1;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    /*/
    returns true if the money-object on which the method is called on has a lesser value than the money object given as a parameter
     */
    public boolean lessThan(Money compared) {
        int totalThisCents = this.euros * 100 + this.cents;
        int totalComparedCents = compared.euros * 100 + compared.cents;
        if (totalThisCents < totalComparedCents) {
            return true;
        }
        return false;
    }

    /*/
    returns a new money object worth the difference of the object whose method was called and the object received as the parameter.
    If the difference would be negative, the worth of the created money object is set to 0.
     */
    public Money minus(Money decreaser) {
        int totalThisCents = this.euros * 100 + this.cents;
        int totalDecreaserCents = decreaser.euros * 100 + decreaser.cents;
        int diff = totalThisCents - totalDecreaserCents;

        if (diff < 0) {
            Money difference = new Money(0, 0);
            return difference;
        }
        int diffEuros = diff / 100;
        int diffCents = diff - diffEuros * 100;

        Money difference = new Money(diffEuros, diffCents);
        return difference;

        /*/
        alt solution:

        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }

        // if the value becomes negative, return zero
        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
         */
    }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
