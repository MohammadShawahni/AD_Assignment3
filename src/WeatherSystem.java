public class WeatherSystem {
    public static void main(String[] args) {
        ClimateSubject climateData = new ClimateSubject();

        ClimateObserver conditionsDisplay = new DisplayConditions();
        ClimateObserver statisticsDisplay = new DisplayStatistics();

        climateData.attachObserver(conditionsDisplay);
        climateData.attachObserver(statisticsDisplay);

        climateData.setMeasurements(25, 60, 10, "Rain");

        ClimateObserver tempDecorator = new TemperatureUnitDecorator(conditionsDisplay);
        ClimateObserver windVelocityDecorator = new WindVelocityDecorator(conditionsDisplay);
        ClimateObserver precipitationDecorator = new PrecipitationDecorator(conditionsDisplay);

        climateData.attachObserver(tempDecorator);
        climateData.attachObserver(windVelocityDecorator);
        climateData.attachObserver(precipitationDecorator);

        climateData.setMeasurements(30, 50, 15, "Snow");
    }
}