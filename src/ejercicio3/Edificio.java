package ejercicio3;

public class Edificio {
	
private double superficie;

public Edificio(int superficie) {
	this.superficie = superficie;
}

public double getSuperficie() {
	return superficie;
}

public void setSuperficie(double superficie) {
	this.superficie = superficie;
}

@Override
public String toString() {
	return "Edificio [superficie=" + superficie + "]";
}
	

}
