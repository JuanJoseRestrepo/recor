package matriz;

public class edificio {

	private int pisos;

	private piso[] pisitos;

	public edificio(int pisos) {

		this.pisos = pisos;

		pisitos = new piso[pisos];

	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public piso[] getPisitos() {
		return pisitos;
	}

	public void setPisitos(piso[] pisitos) {
		this.pisitos = pisitos;
	}

	public void addCubiculo(String name, String charges, String eMail, String extension) {

		boolean add = false;

		for (int i = 0; i < pisitos.length && add == false; i++) {

			if (pisitos[i].isfull() == false) {
				pisitos[i].addCubiculos(name, charges, eMail, extension);
				add = true;
			}
		}

	}

	public String recorridoZ(String name) {

		String msj = "";

		if (pisitos[0].recorrido(name) != null) {
			msj = pisitos[0].recorrido(name);

		}

		
			int k = 0;
			for (int i = 1; i < pisitos.length; i++) {
				if (pisitos[k].getCubiculitos()[pisitos[k].getCubiculitos().length - i].getName()
						.equals(name) == true) {
					msj = pisitos[k].getCubiculitos()[pisitos[k].getCubiculitos().length - i].getExtension();
				}
				k++;
			}
		

		
			int l = pisitos.length;
			if (pisitos[l-1].recorrido(name) != null) {
				msj = pisitos[l-1].recorrido(name);
			}
		

		return msj;
	}

	public String recorridoL(String name) {

		String msj = "";
		int j = pisitos.length - 1;

		for (int i = 0; i < pisitos.length; i++) {
			if (pisitos[i].getCubiculitos()[0].getName().equals(name) == true) {
				msj = pisitos[i].getCubiculitos()[0].getExtension();
			}
		}

	
			for (int i = 0; i < pisitos[j].getCubiculitos().length; i++) {
				if (pisitos[j].getCubiculitos()[i].getName().equals(name) == true) {
					msj = pisitos[j].getCubiculitos()[i].getExtension();
				}
			}
		

		return msj;
	}

	public String recorridoO(String name) {

		String msj = "";

		for (int i = 0; i < pisitos[0].getCubiculitos().length; i++) {
			if (pisitos[0].getCubiculitos()[i].getName().equals(name) == true) {
				msj = pisitos[0].getCubiculitos()[i].getExtension();
			}
		}

		int l = pisitos.length;
		for (int k = pisitos[l-1].getCubiculitos().length - 1; k > -1; k--) {

			if (pisitos[l-1].getCubiculitos()[k].getName().equals(name) == true) {
				msj = pisitos[l-1].getCubiculitos()[k].getExtension();
			}

		}

		for (int o = 0; o < pisitos.length; o++) {
			int m =  pisitos[o].getCubiculitos().length-1;
			if (pisitos[o].getCubiculitos()[0].getName().equals(name) == true) {
				msj = pisitos[o].getCubiculitos()[0].getExtension();
			} 
			else if (pisitos[o].getCubiculitos()[m].getName().equals(name) == true) {
				msj = pisitos[o].getCubiculitos()[m].getExtension();
			}
		}
		return msj;
	}
	
	public String recorridoE(String name) {
		
		String msj = " ";
		
		for(int i = 0; i < pisitos.length;i++){
			if(i % 2 == 0){
			  for(int j = 0; j < pisitos[i].getCubiculitos().length;j++){
				  
			    if(pisitos[i].getCubiculitos()[j].getName().equals(name)){
			      msj = pisitos[i].getCubiculitos()[j].getExtension();
			    }
			  }
			}else if(i % 2 != 0){
			  for(int k = pisitos[i].getCubiculitos().length-1; k > 0; k--){
			    if(pisitos[i].getCubiculitos()[k].getName().equals(name)){
			      msj = pisitos[i].getCubiculitos()[k].getExtension();
			    }
			  }
			}
			}
			return msj;
		
	}
	
	public String espiral(String charges) {
		
		String msj = "";
		boolean abajoDerecha = false;
		boolean ultimaArriba = false;
		boolean arribaIzquierda = false;
		int sumador = 0;
		int restador = 0;

		for(int i = 0; i < pisitos.length;i++){
			//Abajo
			for(int k = 0; i < pisitos[0].getCubiculitos().length-sumador && k < pisitos.length; k++){
				
				
					if( pisitos[k].getCubiculitos()[i].getCharges().equals(charges)){
					    msj = pisitos[k].getCubiculitos()[i].getCorreo();
					}
				
				
			
			abajoDerecha = true;
		}
		//Abajo derecha
		if(abajoDerecha == true){
			for(int j = 1; j < pisitos[i].getCubiculitos().length-sumador && j < pisitos[pisitos.length-1].getCubiculitos().length; j++){
			
				if(pisitos[pisitos.length-1].getCubiculitos()[j].getCharges().equals(charges)) {
					msj = pisitos[pisitos.length-1].getCubiculitos()[j].getCorreo();
				}
				ultimaArriba = true;
			}		

		}

		if(ultimaArriba == true){
			for(int k = pisitos.length -1 ; k > sumador && k >=  0;k--){
				
				if(pisitos[k].getCubiculitos()[pisitos[k].getCubiculitos().length -1 ].getCharges().equals(charges)) {
					msj = pisitos[k].getCubiculitos()[pisitos[0].getCubiculitos().length -1].getCorreo();
				}
			
				arribaIzquierda = true;
			}
		}

		if(arribaIzquierda == true){
			for (int m = pisitos.length-sumador; m > restador ; m--) {
				if(pisitos[restador].getCubiculitos()[m].getCharges().equals(charges)) {
					msj = pisitos[restador].getCubiculitos()[m].getCorreo();
				}
				
			}
			

		}

	  abajoDerecha = false;
		ultimaArriba = false;
		arribaIzquierda = false;
		sumador++;
		restador++;



		}


		return msj;
	}
	
	public static void main(String[] args) {
		edificio m = new edificio(3);
		
		m.pisitos[0] = new piso(4);
		m.pisitos[1] = new piso(3);
		m.pisitos[2] = new piso(2);
		m.addCubiculo("mendez", "presidente", "mendezqgmail", "123");
		m.addCubiculo("maria", "secretaria", "maraiqgmail", "1563");
		m.addCubiculo("mendezA", "trabajador", "mendezAqgmail", "1234");
		m.addCubiculo("maria nandez", "secretaria presidente", "maria@gmail", "153");
		
		m.addCubiculo("victor", "presidente", "victorqgmail", "100");
		m.addCubiculo("marta", "secretaria", "martaqgmail", "173");
		m.addCubiculo("mandarin", "trabajador", "manAqgmail", "12346");
		
		m.addCubiculo("marta sanchez", "secretaria vice presidente", "martica@gmail", "1539");
		
		m.addCubiculo("mario sanchez", "transportista", "mario@gmail", "15390");
		
		//System.out.println(m.recorridoE("mandarin"));
		
	    //System.out.println(m.recorridoZ("mario sanchez"));
		
		//System.out.println(m.recorridoL("mario sanchez"));
		
		//System.out.println(m.espiral("presidente"));
		
		//System.out.println(m.recorridoO("victor"));
		
	}
	
	 

}
