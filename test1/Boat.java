/**
 * 
 */
package test1;

import java.util.HashSet;

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
		this.crew = new HashSet<Person>();
	}
	
	/**
	 * @param name
	 * @param country
	 * @param size
	 * @param owner
	 */
	public Boat(String name, String country, int size, Person owner) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
		this.owner = owner;
		this.crew = new HashSet<Person>();
	}
	
	/**
	 * @param name
	 * @param country
	 * @param size
	 * @param owner
	 * @param captain
	 */
	public Boat(String name, String country, int size, Person owner, Person captain) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
		this.owner = owner;
		this.captain = captain;
		this.crew = new HashSet<Person>();
	}
	
	/**
	 * @param name
	 * @param country
	 * @param size
	 * @param owner
	 * @param captain
	 * @param crew
	 */
	public Boat(String name, String country, int size, Person owner, Person captain, HashSet<Person> crew) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
		this.owner = owner;
		this.captain = captain;
		this.crew = crew;
	}
	
	/**
	 * @param name
	 * @param country
	 * @param size
	 * @param owner
	 * @param crew
	 */
	public Boat(String name, String country, int size, Person owner, HashSet<Person> crew) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
		this.owner = owner;
		this.crew = crew;
	}
	
	/**
	 * @param name
	 * @param country
	 * @param size
	 * @param crew
	 */
	public Boat(String name, String country, int size, HashSet<Person> crew) {
		super();
		this.speed = 0;
		this.name = name;
		this.country = country;
		this.size = size;
		this.crew = crew;
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
	 * the owner of the boat.
	 */
	protected Person owner;
	/**
	 * the captain of the boat.
	 */
	protected Person captain;
	/**
	 * the crew of the boat
	 */
	protected HashSet<Person> crew;
	/**
	 * the marina the boat is currently in
	 */
	protected Marina currentMarina;
	
	/**
	 * @return the marina the boat is moored in
	 */
	public Marina getCurrentMarina(){
		return currentMarina;
	}
	/**
	 * @param m the marina to moor the boat in
	 */
	public void setCurrentMarina(Marina m){
		currentMarina = m;
	}
	/**
	 * @return the owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Person owner) {
		this.owner = owner;
	}

	/**
	 * @return the captain
	 */
	public Person getCaptain() {
		return captain;
	}

	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(Person captain) {
		for(Person p : crew){
			if (captain.equals(p)){
				return;
			}
		}
		this.captain = captain;
	}

	/**
	 * @return the crew
	 */
	public HashSet<Person> getCrew() {
		return crew;
	}

	/**
	 * @param crew the crew to set
	 */
	public void setCrew(HashSet<Person> crew) {
		for (Person p : crew){
			if (p.equals(captain)){
				return;
			}
		}
		this.crew = crew;
	}
	/**
	 * Checks if crew member is not captain, adds them to crew if so.
	 * @param sailor the crew member to be added
	 */
	public void addCrewMember(Person sailor){
		if (!sailor.equals(captain)){
			crew.add(sailor);
		}
	}	
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
