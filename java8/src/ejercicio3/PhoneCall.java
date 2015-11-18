package ejercicio3;

import java.time.Duration;
import java.time.LocalDateTime;

public class PhoneCall {

	private LocalDateTime fechaLlamada;
	private Duration duracion;
	private Contacto contacto;
	
	public PhoneCall(LocalDateTime fechaLlamada, Duration duracion, Contacto contacto) {
		super();
		this.fechaLlamada = fechaLlamada;
		this.duracion = duracion;
		this.contacto = contacto;
	}
	
	public Duration howLongAgo() {
		return Duration.between(fechaLlamada, LocalDateTime.now());
	}
	
	public LocalDateTime getHoraFinalizacion() {
		return fechaLlamada.plus(duracion);
	}

	public LocalDateTime getFechaLlamada() {
		return fechaLlamada;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public Contacto getContacto() {
		return contacto;
	}
	
}
