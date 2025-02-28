import java.lang.Math;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double earthRadius = 6378;

        double volumeInCubicKilometers = (4/3)*Math.PI*Math.pow(earthRadius,3);

        double volumeInCubicMiles = volumeInCubicKilometers * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is "+ volumeInCubicKilometers + " and cubic miles is " + volumeInCubicMiles);
    }
}
