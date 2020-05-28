package tp7;

public class EmpleadoTemporario extends Empleado{
	

	public EmpleadoTemporario(Integer horasDeTrabajo, Integer sueldoBasico, boolean hijos, boolean casado,
			Integer cantHijos) {
		super(horasDeTrabajo, sueldoBasico, hijos, casado, cantHijos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Integer sueldo() {
		return ((((5 * this.getHorasDeTrabajo()) + this.getSueldoBasico() + this.tieneFamilia()) * 13) / 100);
	}
	
	public Integer tieneFamilia() {
		if(this.isHijos() || this.isCasado()) {
			return 100;
		}else {
			return 0;
		}
		
	}
	

	
}
