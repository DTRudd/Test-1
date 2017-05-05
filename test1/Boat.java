/**
 * 
 */
package test1;

/**
 * @author Sophie Rudd
 *
 */
public class Boat implements Vehicle {

	/**
	 * @param name
	 * @param country
	 * @param size
	 */
	public Boat(String name, String country, int size) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
	}
	
	/**
	 * the boat's speed.
	 */
	protected int speed;
	/**
	 * the name of the boat.
	 */
	protected String name;
	/**
	 * the country from which the boat originates.
	 */
	protected String country;
	/**
	 * the abstract size of the boat.
	 */
	protected int size;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the speed of the boat
	 */
	@Override
	public int getSpeed() {
		return speed;
	}

	/**
	 * increases the boat's speed by 1
	 */
	@Override
	public void accelerate() {
		speed++;
	}

	/**
	 * decreases the boat's speed by 1
	 */
	@Override
	public void decelerate() {
		speed--;
	}

}
