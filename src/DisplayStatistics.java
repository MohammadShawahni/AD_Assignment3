public class DisplayStatistics implements ClimateObserver {
    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        System.out.println("Statistics: " + "Average Temperature: " + temperature + " Average Humidity: " + humidity);
    }
}