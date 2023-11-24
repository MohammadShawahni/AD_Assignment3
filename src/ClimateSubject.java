import java.util.ArrayList;
import java.util.List;

public class ClimateSubject {
    private List<ClimateObserver> monitors = new ArrayList<>();
    private float temp;
    private float humid;
    private float windVel;
    private String precip;

    public void attachObserver(ClimateObserver monitor) {
        monitors.add(monitor);
    }

    public void detachObserver(ClimateObserver monitor) {
        monitors.remove(monitor);
    }

    public void notifyObservers() {
        for (ClimateObserver monitor : monitors) {
            monitor.notify(temp, humid, windVel, precip);
        }
    }

    public void setMeasurements(float temperature, float humidity, float windVelocity, String precipitation) {
        this.temp = temperature;
        this.humid = humidity;
        this.windVel = windVelocity;
        this.precip = precipitation;
        notifyObservers();
    }
}