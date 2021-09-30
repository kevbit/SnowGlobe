/**
 * A tester program for the SnowGlobe class.
 *
 * @author  Kevin Lo
 * @version 2020-09-22
 */
public class SnowGlobeTester
{
    public static void main(String[] args)
    {
        SnowGlobe globe = new SnowGlobe();
        
        double result = globe.getRadius();
        System.out.println(result);
        System.out.println("Expected: 10.0");

        result = globe.getVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 4188.7902");

        result = globe.getSnowVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 837.7580");

        result = globe.getSnowCost();
        System.out.printf("%.2f\n", result);
        System.out.println("Expected: 1047.20");
        
        globe.setRadius(1.0);
        result = globe.getRadius();
        System.out.println(result);
        System.out.println("Expected: 1.0");
        
        result = globe.getVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 4.1888");

        result = globe.getSnowVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 0.8378");

        result = globe.getSnowCost();
        System.out.printf("%.2f\n", result);
        System.out.println("Expected: 1.05");
        
        globe = new SnowGlobe(5);
        result = globe.getRadius();
        System.out.println(result);
        System.out.println("Expected: 5.0");
        
        result = globe.getVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 523.5988");

        result = globe.getSnowVolume();
        System.out.printf("%.4f\n", result);
        System.out.println("Expected: 104.7198");

        result = globe.getSnowCost();
        System.out.printf("%.2f\n", result);
        System.out.println("Expected: 130.90");
    }
}