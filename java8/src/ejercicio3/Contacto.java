package ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Contacto {

	private String nombre;
	private String ciudad;
	private LocalDate fechaDeNacimiento;
	
	public Contacto(String nombre, String ciudad, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Period getAge() {
		return Period.between(fechaDeNacimiento, LocalDate.now());
	}
}
