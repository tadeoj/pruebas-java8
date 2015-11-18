package ejercicio3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public class Launcher {

	public static void main(String[] args) {
		PhoneCallLog phoneCallLog = new PhoneCallLog();
		
		Contacto contacto = new Contacto("Maria", "Castellon", LocalDate.of(1986, 10, 22));
		System.out.println(contacto.getAge().getYears());
		Contacto contacto2 = new Contacto("Tadeo", "Castellon", LocalDate.of(1986, 2, 6));

		PhoneCall phoneCall = new PhoneCall(LocalDateTime.of(2015, 11, 18, 10, 00, 00), Duration.ofMinutes(15), contacto);
		System.out.println(phoneCall.howLongAgo());
		System.out.println(phoneCall.getHoraFinalizacion());
		
		PhoneCall phoneCall1 = new PhoneCall(LocalDateTime.of(2015, 5, 18, 18, 00, 00), Duration.ofMinutes(15), contacto2);
		PhoneCall phoneCall2 = new PhoneCall(LocalDateTime.of(2015, 11, 18, 16, 00, 00), Duration.ofMinutes(20), contacto);
		PhoneCall phoneCall3 = new PhoneCall(LocalDateTime.of(2015, 11, 18, 12, 00, 00), Duration.ofMinutes(30), contacto2);
		PhoneCall phoneCall4 = new PhoneCall(LocalDateTime.of(2015, 5, 18, 10, 00, 00), Duration.ofMinutes(60), contacto);
		PhoneCall phoneCall5 = new PhoneCall(LocalDateTime.of(2015, 11, 18, 11, 00, 00), Duration.ofMinutes(10), contacto2);
		
		phoneCallLog.addPhoneCall(phoneCall);
		phoneCallLog.addPhoneCall(phoneCall1);
		phoneCallLog.addPhoneCall(phoneCall2);
		phoneCallLog.addPhoneCall(phoneCall3);
		phoneCallLog.addPhoneCall(phoneCall4);
		phoneCallLog.addPhoneCall(phoneCall5);

		System.out.println(phoneCallLog.getMonthContacts(Month.NOVEMBER).size());
		System.out.println(phoneCallLog.getDurationBeetwen(LocalDateTime.of(2015, 11, 18, 00, 00, 00), LocalDateTime.of(2015, 11, 19, 00, 00, 00)));
		System.out.println(phoneCallLog.getTheLongestCall().getFechaLlamada());
	}

}
