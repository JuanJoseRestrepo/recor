package matriz;

public class cubiculo {
	
	private String name;
	private String charges;
	private String correo;
	private String extension;
	
	public  cubiculo(String name, String charges, String eMail, String extension) {
		
		this.name = name;
		this.charges = charges;
		this.correo = eMail;
		this.extension = extension;
			
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharges() {
		return charges;
	}

	public void setCharges(String charges) {
		this.charges = charges;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String eMail) {
		this.correo = eMail;
	}
	
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	
}
