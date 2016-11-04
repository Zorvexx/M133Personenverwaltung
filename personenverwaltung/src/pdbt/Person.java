package pdbt;

public class Person extends AbstractPersonDBTable {

	private String vorname;
	private String nachname;
	private Ort ort;
	private String strasse;
	private String hausnummer;
	private String email;
	private String telefonMobile;
	private String telefonFestnetz;
	private Byte[] image;

	public Person() {
		
	}
	
	public Person(int id, String vorname, String nachname) {
		
	}

}
