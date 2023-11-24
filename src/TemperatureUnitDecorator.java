public class TemperatureUnitDecorator extends ClimateDecorator {
    public TemperatureUnitDecorator(ClimateObserver decoratedMonitor) {
        super(decoratedMonitor);
    }

    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        super.notify(temperature, humidity, windVelocity, precipitation);
    }
}