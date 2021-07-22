package PERTEMUAN15;

public class MainClass {
    public static void main(String[] args) {
        IObserver conditionsMonitor = new ConditionsMonitor();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(conditionsMonitor);

        // A change in any values in subject leads to observer triggering updateValue method
        // and printing updated values.
        weatherStation.setHumidity(125.0);
        weatherStation.setPressure(30.0);
        weatherStation.setTemperature(21.0);
    }
}

