package ejercicio3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class PhoneCallLog {

	private List<PhoneCall> llamadas;

	public PhoneCallLog() {
		llamadas = new ArrayList<>();
	}

	public void addPhoneCall(PhoneCall phoneCall) {
		llamadas.add(phoneCall);
	}

	public List<Contacto> getMonthContacts(Month month) {

		return llamadas.stream().filter(llamada -> llamada.getFechaLlamada().getMonth() == month)
				.map(llamada -> llamada.getContacto()).distinct().collect(Collectors.toList());

	}

	public Long getDurationBeetwen(LocalDateTime startDate, LocalDateTime endDate) {
		return llamadas.stream()
				.filter(llamada -> llamada.getFechaLlamada().isBefore(endDate)
						&& llamada.getFechaLlamada().isAfter(startDate))
				.map(PhoneCall::getDuracion).collect(Collectors.summingLong(Duration::getSeconds));
	}

	public PhoneCall getTheLongestCall() {

//		Comparator<PhoneCall> comparator = (PhoneCall d1, PhoneCall d2) -> Long.compare(d1.getDuracion().getSeconds(),
//				d2.getDuracion().getSeconds());

		return llamadas.stream().sorted(Comparator.comparing(PhoneCall::getDuracion).reversed()).limit(1).collect(Collectors.toList()).get(0);
	}

}
