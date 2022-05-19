package templateMethod;

public abstract class Empleado {
	
	public final double sueldo() {
		return this.sueldoNeto(this.sueldoBasico() + this.pagoHoras() + this.plusHijos()); 
	}
	
	protected abstract double plusHijos();

	protected abstract double pagoHoras();

	protected abstract double sueldoBasico();

	public double sueldoNeto(double sueldoBruto) {
		return sueldoBruto * 0.87;
	}
}
