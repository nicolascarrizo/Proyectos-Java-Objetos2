package tp7;

public abstract class Empleado {
	
	private Integer horasDeTrabajo;
	private Integer sueldoBasico; 
	private boolean hijos;
	private boolean casado;
	private Integer cantHijos;
		
	public Integer getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(Integer cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	public Empleado(Integer horasDeTrabajo, Integer sueldoBasico, boolean hijos, boolean casado, Integer cantHijos) {
		super();
		this.horasDeTrabajo = horasDeTrabajo;
		this.sueldoBasico = sueldoBasico;
		this.hijos = hijos;
		this.casado = casado;
		this.cantHijos = cantHijos;
	}

	public Integer getHorasDeTrabajo() {
		return horasDeTrabajo;
	}

	public void setHorasDeTrabajo(Integer horasDeTrabajo) {
		this.horasDeTrabajo = horasDeTrabajo;
	}

	public Integer getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public boolean isHijos() {
		return hijos;
	}

	public void setHijos(boolean hijos) {
		this.hijos = hijos;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public abstract Integer sueldo();
	

	
}
