package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Day;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DayRepository {
    private static final Map<String, Day> days = new HashMap<>();

	@PostConstruct
	public void initData() {
		Day lunes = new Day();
		lunes.setName("Lunes");
		lunes.setTranslate("Monday");

		days.put(lunes.getName(), lunes);

		Day martes = new Day();
		martes.setName("Martes");
		lunes.setTranslate("Tuesday");

		days.put(martes.getName(), martes);

		Day miercoles = new Day();
		miercoles.setName("Miercoles");
		miercoles.setTranslate("Wednesday");

		days.put(miercoles.getName(), miercoles);

		Day jueves = new Day();
		jueves.setName("Jueves");
		jueves.setTranslate("Tuesday");

		days.put(jueves.getName(), jueves);

		Day viernes = new Day();
		viernes.setName("Viernes");
		viernes.setTranslate("Friday");

		days.put(viernes.getName(), viernes);

		Day sabado = new Day();
		sabado.setName("Sabado");
		sabado.setTranslate("Saturday");

		days.put(sabado.getName(), sabado);

		Day domingo = new Day();
		domingo.setName("Domingo");
		domingo.setTranslate("Sunday");

		days.put(domingo.getName(), domingo);


		
	}


	public Day findDay(String name) {
		Assert.notNull(name, "El nombre del dia no puede ser nulo");
		return days.get(name);
	}
    
}
