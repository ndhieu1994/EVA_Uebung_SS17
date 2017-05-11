package de.eva.ClientServerTCP;

/**
 * Schnittstelle fuer Abfrageoptionen.
 * @author Marcel
 * @author Yves
 */
public interface WeatherService {

	public String getWeatherByDay(String day);
	public float getAmountOfRain();
	public int getTemperature(String day, int hour);
}
