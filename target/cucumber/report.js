$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/placeValidations.feature");
formatter.feature({
  "name": "Validating Place API\u0027s",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify if Place is being succesfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Add place Payload with \"\u003cname\u003e\" \"\u003clanguage\u003e\" \"\u003cadress\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "User calls \"addPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the Api call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify place_id created maps to \"\u003cname\u003e\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "language",
        "adress"
      ]
    },
    {
      "cells": [
        "AHouse",
        "English",
        "World cross center"
      ]
    },
    {
      "cells": [
        "Crystal Palace",
        "PT-BR",
        "Build SP"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if Place is being succesfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Add place Payload with \"AHouse\" \"English\" \"World cross center\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.add_place_Payload(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"addPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Api call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.the_Api_call_got_success_with_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify place_id created maps to \"AHouse\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.verify_place_id_created_maps_to_using(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if Place is being succesfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "Add place Payload with \"Crystal Palace\" \"PT-BR\" \"Build SP\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.add_place_Payload(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User calls \"addPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.user_calls_with_http_request(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Api call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.the_Api_call_got_success_with_status_code(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.in_response_body_is(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify place_id created maps to \"Crystal Palace\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.PlaceValidationSteps.verify_place_id_created_maps_to_using(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});