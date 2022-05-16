package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {
        Double sum = 0.0;
        int i = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            sum+=temperature.getValue();
            i++;
        }
        return sum/i;
    }
    public Double CalculateMedianTemperature() {
        int length = 0;
        List<Double> temperaturesList = new ArrayList<>();
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            temperaturesList.add(temperature.getValue());
            length++;
        }
        Collections.sort(temperaturesList);
        int medianNumber = (length / 2);     // Definicja mediany wyniku przy nieparzystej liczbie obiektów w mapie
        if ((length % 2) != 0) {
            return temperaturesList.get(medianNumber);
        } else {                                 //Obsługa przypadku parzystej liczby obiektów w mapie
            return (temperaturesList.get(medianNumber) + temperaturesList.get(medianNumber - 1))/2;
        }
    }
}