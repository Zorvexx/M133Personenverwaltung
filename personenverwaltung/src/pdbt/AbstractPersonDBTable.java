package pdbt;

public abstract class AbstractPersonDBTable {

	protected int id;
	protected short isDeleted;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public short getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(short isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
