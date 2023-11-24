Observer Pattern:

ClimateObserver Interface:
Represents an observer in the Observer pattern.
Declares a notify method that concrete observers implement to receive and display weather data.

ClimateSubject Class:
Serves as the subject in the Observer pattern.
Maintains a list of observers (ClimateObserver) and allows attaching, detaching, and notifying them.
setMeasurements method updates the weather data and triggers the notification of attached observers.

DisplayConditions Class:
A concrete observer that displays the current weather conditions.
Implements the ClimateObserver interface.
The notify method is implemented to print the current weather conditions.

DisplayStatistics Class:
Another concrete observer that displays statistical information about the weather.
Implements the ClimateObserver interface.
The notify method is implemented to print average temperature and humidity.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Decorator Pattern:

ClimateDecorator Abstract Class:
Serves as the base decorator class in the Decorator pattern.
Implements the ClimateObserver interface, providing a common interface for concrete decorators.
Contains a reference to a ClimateObserver object to be decorated.

TemperatureUnitDecorator Class:
A concrete decorator that allows users to switch between Celsius and Fahrenheit.
Extends ClimateDecorator.
Overrides the notify method to include temperature unit conversion.

WindVelocityDecorator Class:
A concrete decorator that adds information about wind speed to the displayed weather data.
Extends ClimateDecorator.
Overrides the notify method to include wind speed information.

PrecipitationDecorator Class:
A concrete decorator that adds information about precipitation (rain, snow, ..........).
Extends ClimateDecorator.
Overrides the notify method to include precipitation information.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Integration:

WeatherSystem Class (Main Class):
Creates instances of ClimateSubject as the weather data subject.
Creates instances of basic observers (DisplayConditions, DisplayStatistics) and attaches them to the subject.
Simulates weather updates by calling setMeasurements on the subject.
Creates instances of decorated observers (TemperatureUnitDecorator, WindVelocityDecorator, PrecipitationDecorator) and attaches them to the subject.
Simulates weather updates with decorators.

![Class Digram drawio](https://github.com/MohammadShawahni/AD_Assignment3/assets/92360594/c563fd34-4d43-4f06-a933-da09a18fb96c)
