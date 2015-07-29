package struts3;



import java.util.HashSet;
import java.util.Set;


public class Countries implements java.io.Serializable {

	private String countryId;
	private Regions regions;
	private String countryName;
	private Set locationses = new HashSet(0);

	public Countries() {
	}

	public Countries(String countryId) {
		this.countryId = countryId;
	}

	public Countries(String countryId, Regions regions, String countryName,
			Set locationses) {
		this.countryId = countryId;
		this.regions = regions;
		this.countryName = countryName;
		this.locationses = locationses;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public Regions getRegions() {
		return this.regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Set getLocationses() {
		return this.locationses;
	}

	public void setLocationses(Set locationses) {
		this.locationses = locationses;
	}

	@Override
	public String toString() {
		return regions + "el nombre del pais " + countryName + ", locationses="
				+ locationses + "]";
	}

	
	
}
