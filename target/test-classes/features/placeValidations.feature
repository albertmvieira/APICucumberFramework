Feature: Validating Place API's

@AddPlace @Regression
Scenario Outline: Verify if Place is being succesfully added using AddPlaceAPI
	Given Add place Payload with "<name>" "<language>" "<adress>"
	When User calls "addPlaceAPI" with "Post" http request
	Then the Api call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id created maps to "<name>" using "getPlaceAPI"
	
	Examples:
	|name	 		 |language	|adress				|
	|AHouse	 		 |English	|World cross center	|
	|Crystal Palace	 |PT-BR		|Build SP			|

@DeletePlace @Regression	
Scenario: Verify id delete place functionality is working
	Given DeletePlace payload
	When User calls "deletePlaceAPI" with "Post" http request
	Then the Api call got success with status code 200
	And "status" in response body is "OK"