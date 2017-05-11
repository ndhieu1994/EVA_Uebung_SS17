package de.eva.RMI;

/// TODO: Schnittstelle zu einem RemoteInterface vervollstaendigen!
public interface WeatherService{

	public String getWeatherByDay(String day);
	public float getAmountOfRain();
	public int getTemperature(String day, int hour);
}
