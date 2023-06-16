package pe.edu.idat.dsw1soapJ19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetDaysRequest;
import io.spring.guides.gs_producing_web_service.GetDaysResponse;

@Endpoint
public class DayEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private DayRepository dayRepository;

	@Autowired
	public DayEndpoint(DayRepository dayRepository) {
		this.dayRepository = dayRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDaysRequest")
	@ResponsePayload
	public GetDaysResponse getDay(@RequestPayload GetDaysRequest request) {
		GetDaysResponse response = new GetDaysResponse();
		response.setDay(dayRepository.findDay(request.getName()));

		return response;
	}
}
