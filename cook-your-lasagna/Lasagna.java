public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public static int expectedMinutesInOven(){
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public static int remainingMinutesInOven(int actualMinutes){
        int expectedMinutes = expectedMinutesInOven();
        return Math.abs(actualMinutes - expectedMinutes);
    }
    

    // TODO: define the 'preparationTimeInMinutes()' method
    public static int preparationTimeInMinutes(int numberOfLayers){
        return 2*numberOfLayers;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public static int totalTimeInMinutes(int numberOfLayers, int numberOfMinutes){
        return 2*numberOfLayers + numberOfMinutes;
    }
}
