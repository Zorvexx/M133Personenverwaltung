package pdbt;

public class Benutzerrollen extends AbstractPersonDBTable {

	private String rollenName;

	public Benutzerrollen() {
		new Benutzerrollen(0, "", (short) 0);
	}
	public Benutzerrollen(int id, String rollenName, short isDeleted) {
		this.id = id;
		this.isDeleted = isDeleted;
		this.rollenName = rollenName;
	}
	public String getRollenName() {
		return rollenName;
	}
	public void setRollenName(String rollenName) {
		this.rollenName = rollenName;
	}

}
