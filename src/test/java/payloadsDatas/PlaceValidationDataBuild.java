package payloadsDatas;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlacePojo;
import pojo.LocationPojo;

public class PlaceValidationDataBuild {
	
	public AddPlacePojo addPlacePayload(String name, String language, String adress) {
		
		//Instanciando objeto da classe AddPlace que contem getter/setter (criando java Object)
				AddPlacePojo p = new AddPlacePojo();
				p.setAccuracy(50);
				p.setAddress(adress);
				p.setLanguage(language);
				p.setPhone_number("(+91) 983 893 3937");
				p.setWebsite("https://google.com");
				p.setName(name);
				
				//Criando uma lista de string e adicionando a variavel para passar ao metodo setTypes
				List<String> myList = new ArrayList<String>();
				myList.add("show park");
				myList.add("shop");
				
				p.setTypes(myList);
				
				//Instaciando LocationPojo, para poder passar informações de latitude e longitude
				LocationPojo l = new LocationPojo();
				l.setLat(-38.383494);
				l.setLng(-33.427362);
				
				p.setLocation(l);
				
				return p;
		
	}
	
	//criando body para o payload delete
	public String deletePlacePayload(String placeId) {
		
		return "{\r\n    \"place_id\":\""+ placeId +" \"\r\n}";
	}

}
