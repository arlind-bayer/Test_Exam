package exam;

/**
 * A simple thermostat. The temperature must always stay within the
 * valid range of 10 to 30 degrees.
 *
 * DO NOT CHANGE THIS FILE.
 */
public class Thermostat {

	private int temperature;

	public Thermostat(int initialTemp) {
		this.temperature = initialTemp;
	}

	public int getTemperature() {
		return temperature;
	}

	public boolean isHeating() {
		return temperature < 18;
	}

	public void setTemperature(int temp) throws IllegalArgumentException {
		if (temp < 10 || temp > 30) {
			throw new IllegalArgumentException("Temperature out of range.");
		}
		this.temperature = temp;
	}

	public void increase(int delta) {
		setTemperature(temperature + delta);
	}
}
