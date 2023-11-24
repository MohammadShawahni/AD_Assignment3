public interface ClimateObserver {
    void notify(float temperature, float humidity, float windVelocity, String precipitation);
}