package pdbt;

public class Ort extends AbstractPersonDBTable {

	private String ortName;
	
	public Ort() {
		new Ort(0, "", (short) 0);
	}
	
	public Ort(int id, String ortName, short isDeleted){
		this.ortName = ortName;
	}
	
	public String getOrtName() {
		return ortName;
	}
	
	public void setOrtName(String ortName) {
		this.ortName = ortName;
	}

}
