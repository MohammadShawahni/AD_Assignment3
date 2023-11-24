public class WindVelocityDecorator extends ClimateDecorator {
    public WindVelocityDecorator(ClimateObserver decoratedMonitor) {
        super(decoratedMonitor);
    }

    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        super.notify(temperature, humidity, windVelocity, precipitation);
    }
}