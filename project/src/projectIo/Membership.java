package projectIo;

import java.io.Serializable;
import java.time.LocalDate;

public class Membership implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1243761536264114074L;
	private int id;
	private String name;
	private LocalDate birthDate;
	private String address;
	private LocalDate membership_start;
	public Membership(int id, String name, LocalDate birthDate, String address, LocalDate membership_start) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.membership_start = membership_start;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getMembership_start() {
		return membership_start;
	}
	public void setMembership_start(LocalDate membership_start) {
		this.membership_start = membership_start;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
