package projectIo;

import java.io.Serializable;
import java.time.LocalDate;

public class Membership implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1243761536264114074L;
	private String name;
	private LocalDate birthDate;
	private String address;
	private LocalDate membership_start;
	public Membership(String name, LocalDate birthDate, String address, LocalDate membership_start) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.address = address;
		this.membership_start = membership_start;
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
	public void setAge(LocalDate birthDate) {
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
	@Override
	public String toString() {
		return "Membership [name=" + name + ", birthDate=" + birthDate + ", address=" + address + ", membership_start="
				+ membership_start + "]";
	}


}
