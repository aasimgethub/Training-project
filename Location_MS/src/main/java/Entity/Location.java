package Entity;

public class Location {

	public Location(String locId, String locname) {
		super();
		this.locId = locId;
		this.locname = locname;
	}
	private String locId;
	private String locname;
	public String getLocId() {
		return locId;
	}
	public void setLocId(String locId) {
		this.locId = locId;
	}
	public String getLocname() {
		return locname;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
}
