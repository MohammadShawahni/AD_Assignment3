public class DisplayConditions implements ClimateObserver {
    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        System.out.println("Current Conditions: " + "Temperature: " + temperature + " Humidity: " + humidity + " Wind Velocity: " + windVelocity + " Precipitation: " + precipitation);
    }
}