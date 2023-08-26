package test;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
		

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOn(){
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(canal>=1 && canal<120 && estado==true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if(canal>1 && canal<=120 && estado==true) {
			canal--;
		}
	}
	
	public void volumenUp() {
		if(volumen>=0 && volumen<7 && estado==true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if(volumen>0 && volumen<=7 && estado==true) {
			volumen--;
		}
	}
}
