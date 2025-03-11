package cscd212classes.AirplaneClass;

import Interfaces.FlyStrategy;

public abstract class Airplane
{
    /**
     * String representing the model of the airplane
     */
    private String model;
    /**
     * int representing the number of rows in the airplane
     */
    private int rows;
    /**
     * int representing the number of seats per row
     */
    private int seatsPerRow;
    /**
     * The FlyStrategy variable representing the fly strategy
     */
    private FlyStrategy flyStrategy;

    /**
     * Constructs an Airplane with model, rows, seatsPerRow and flyStrategy
     * @param model String representing the model of the airplane
     * @param rows int representing the rows in the Airplane
     * @param seatsPerRow int representing the seats per row
     * @param flyStrategy FlyStrategy representing the fly strategy
     */

    public Airplane(String model, int rows, int seatsPerRow, FlyStrategy flyStrategy)
    {
        this.model = model;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.flyStrategy = flyStrategy;

    }

    /**
     * Returns the model of the airplane
     * @return String representing the model of the airplane
     */

    public String getModel()
    {
        return this.model;
    }

    /**
     * returns the total number of seats in the airplane
     * @return rows multiplied by the number of seats per row
     */

    public int getTotalSeats()
    {
        return this.rows * this.seatsPerRow;
    }

    /**
     * Executes the flying strategy associated with this airplane
     * @return String representing the flying behavior
     */

    public String fly()
    {
        return flyStrategy.fly();
    }

    /**
     * toString() returns the representation of the Airplane
     * @return String in format "model (flying behavior)"
     */

    @Override
    public String toString() {
        return String.format("%s (%s)", model, fly());
    }

}
