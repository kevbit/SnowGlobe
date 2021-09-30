
/**
 * A class that constructs a Snow Globe.
 *
 * @author Kevin Lo
 * @version 2020-09-16
 */
public class SnowGlobe
{
    //Declaring and initializing constants
    public static final double VOLUME_COEFFICIENT = 4 / 3.0;
    public static final double COST_PER_CUBIC_CENTIMETER = 1.25;
    public static final double SNOW_PERCENTAGE = 0.2;
    private double radius;
    private double volume;

    /**
     * Default constructor for objects of class SnowGlobe
     */
    public SnowGlobe()
    {
        radius = 10.0;

    }

    /**
     * Constructor for objects of class SnowGlobe
     *
     * @param  inputRadius  The radius of the snowglobe in centimeters.
     */
    public SnowGlobe(double inputRadius)
    {
        radius = inputRadius;
    }

    /**
     * Sets a new radius.
     * 
     * @param newRadius The new radius of the Snow Globe.
     * 
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;

    }

    /**
     * Returns the radius.
     * 
     * @return radius The current value of the radius.
     * 
     */
    public double getRadius()
    {
        return radius; 
    }

    /**
     * Calculates and returns the volume of the sphere in cubic centimeters.
     * 
     * @return volume The volume of the sphere in cubic centimeters.
     * 
     */
    public double getVolume()
    {
        volume = VOLUME_COEFFICIENT * Math.PI * Math.pow(radius, 3);
        return volume;

    }

    /**
     * Gets the volume of the snow in cubic centimeters.
     * 
     * @return volumeOfSnow The volume of the snow in the snowglobe
     * 
     */
    public double getSnowVolume()
    {
        double volumeOfSnow = this.getVolume() * SNOW_PERCENTAGE;
        return volumeOfSnow;

    }

    /**
     * Gets the cost of the snow needed in this globe.
     * 
     * @return snowCost the cost of the snow in the snowglobe
     */
    public double getSnowCost()
    {
        double snowCost = this.getSnowVolume() * COST_PER_CUBIC_CENTIMETER;
        return snowCost;

    }

}
