public abstract class ClimateDecorator implements ClimateObserver {
    protected ClimateObserver decoratedMonitor;

    public ClimateDecorator(ClimateObserver decoratedMonitor) {
        this.decoratedMonitor = decoratedMonitor;
    }

    @Override
    public void notify(float temperature, float humidity, float windVelocity, String precipitation) {
        decoratedMonitor.notify(temperature, humidity, windVelocity, precipitation);
    }
}