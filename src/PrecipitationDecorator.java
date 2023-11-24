public class PrecipitationDecorator extends ClimateDecorator {
    public PrecipitationDecorator(ClimateObserver decoratedMonitor) {
        super(decoratedMonitor);
    }

    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        super.notify(temperature, humidity, windVelocity, precipitation);
    }
}