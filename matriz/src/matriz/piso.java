package matriz;

public class piso {

	private int numeroE;
	private cubiculo[] cubiculitos;

	public piso(int numero) {
		this.numeroE = numero;
		cubiculitos = new cubiculo[numeroE];
	}

	public int getNumeroE() {
		return numeroE;
	}

	public void setNumeroE(int numeroE) {
		this.numeroE = numeroE;
	}

	public cubiculo[] getCubiculitos() {
		return cubiculitos;
	}

	public void setCubiculitos(cubiculo[] cubiculitos) {
		this.cubiculitos = cubiculitos;
	}

	public void addCubiculos(String name, String charges, String eMail, String extension) {

		int i = 0;
		boolean add = false;
		cubiculo addE = new cubiculo(name, charges, eMail, extension);

		while (i < cubiculitos.length && add == false) {
			if (cubiculitos[i] == null) {
				cubiculitos[i] = addE;
				add = true;

			} else {
				i++;
			}
		}
	}

	public boolean isfull() {

		boolean full = false;
		int j = 0;

		for (int i = 0; i < cubiculitos.length; i++) {
			if (cubiculitos[i] != null) {
				j++;
			}
		}

		if (j == cubiculitos.length) {
			full = true;
		}
		return full;
	}
	

	public String recorrido(String name) {
		String ms = "";

		for (int i = 0; i < cubiculitos.length; i++) {
			if (cubiculitos[i].getName().equals(name)) {
				ms = cubiculitos[i].getExtension();
			}
		}

		return ms;
	}
	
	public String recorridoInverso(String name) {
		String ms = "";

		for (int i = cubiculitos.length -1 ; i > -1; i--) {
			if (cubiculitos[i].getName().equals(name)) {
				ms = cubiculitos[i].getExtension();
			}
		}

		return ms;
	}



}
