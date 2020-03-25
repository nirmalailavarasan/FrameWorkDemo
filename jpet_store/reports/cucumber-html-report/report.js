$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/JpetStore.feature");
formatter.feature({
  "line": 1,
  "name": "jpet_app",
  "description": "",
  "id": "jpet-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To check register and add to cart operation",
  "description": "",
  "id": "jpet-app;to-check-register-and-add-to-cart-operation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TC01_Register_and_Addtocart"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch application home page for register",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "To check for registeration",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "select product category",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "select product",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "To check for add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Jpet_App_Register_and_Addtocart_Steps.launchapplicationforregister()"
});
formatter.result({
  "duration": 17346848971,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_App_Register_and_Addtocart_Steps.register()"
});
formatter.result({
  "duration": 7154795893,
  "status": "passed"
});
formatter.match({
  "location": "Jpet_App_Register_and_Addtocart_Steps.select_catogory()"
});
