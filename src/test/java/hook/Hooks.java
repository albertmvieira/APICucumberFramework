package hook;

import java.io.IOException;

import io.cucumber.java.Before;
import stepDefinitions.PlaceValidationSteps;

public class Hooks {
	
	PlaceValidationSteps m = new PlaceValidationSteps();
	
	@Before("@deletePlace")
	public void beforeScenario() throws IOException {
		
		if (PlaceValidationSteps.place_id == null) {
			m.add_place_Payload("Covidson", "Brazil", "South America");
			m.user_calls_with_http_request("addPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Covidson", "getPlaceAPI");
		}

	}

}
