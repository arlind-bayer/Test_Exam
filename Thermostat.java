package exam;

/**
 * A simple thermostat. The temperature must always stay within the
 * valid range of 10 to 30 degrees.
 *
 * DO NOT CHANGE THIS FILE.
 */
public class Thermostat {

	private int temperature;

	/**
	 * Creates a thermostat set to the given initial temperature.
	 * @param initialTemp the initial temperature
	 */
	public Thermostat(int initialTemp) {
		this.temperature = initialTemp;
	}

	/**
	 * @return the current temperature in degrees
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * @return true if the thermostat is heating (temperature below 18 degrees),
	 *         false otherwise
	 */
	public boolean isHeating() {
		return temperature < 18;
	}

	/**
	 * Sets the temperature. Valid values are 10 to 30 degrees.
	 * @param temp the new temperature
	 * @throws IllegalArgumentException if temp is outside the range 10 to 30.
	 *         Exception message: "Temperature out of range."
	 */
	public void setTemperature(int temp) throws IllegalArgumentException {
		if (temp < 10 || temp > 30) {
			throw new IllegalArgumentException("Temperature out of range.");
		}
		this.temperature = temp;
	}

	/**
	 * Increases the temperature by the given amount, respecting the valid range.
	 * @param delta the number of degrees to add (may be negative)
	 */
	public void increase(int delta) {
		setTemperature(temperature + delta);
	}
}
