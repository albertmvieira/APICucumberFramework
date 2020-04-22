package resources;

public class resources {
	
	static String resource;
	
	public static String placePostDataJson() {
		resource = "/maps/api/place/add/json";
		return resource;
	}
	
	public static String placePostDataXML() {
		resource = "/maps/api/place/add/xml";
		return resource;
	}
	
	public static String placeDeleteData() {
		resource = "/maps/api/place/delete/json";
		return resource;
	}
	
	public static String getGoogleAPI() {
		resource = "/maps/api/place/findplacefromtext/json";
		return resource;
	}
	
	public static String getPlaceDetail() {
		resource = "maps/api/place/details/json";
		return resource;
	}

}
