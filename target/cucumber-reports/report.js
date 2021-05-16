$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2EndTest.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End test",
  "description": "Purpose of this feature is to test End 2 End integration",
  "id": "automated-end2end-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Customer place the order by purchasing the item from online",
  "description": "",
  "id": "automated-end2end-test;customer-place-the-order-by-purchasing-the-item-from-online",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is at Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he searches for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves the check out from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters the \"\u003ccustomer\u003e\" details in checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify order details",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "automated-end2end-test;customer-place-the-order-by-purchasing-the-item-from-online;",
  "rows": [
    {
      "cells": [
        "customer"
      ],
      "line": 15,
      "id": "automated-end2end-test;customer-place-the-order-by-purchasing-the-item-from-online;;1"
    },
    {
      "cells": [
        "Lakshay"
      ],
      "line": 16,
      "id": "automated-end2end-test;customer-place-the-order-by-purchasing-the-item-from-online;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 12741574255,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Customer place the order by purchasing the item from online",
  "description": "",
  "id": "automated-end2end-test;customer-place-the-order-by-purchasing-the-item-from-online;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is at Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he searches for \"dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "moves the check out from mini cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "enters the \"Lakshay\" details in checkout page",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "place the order",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify order details",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.user_is_at_Home_page()"
});
formatter.result({
  "duration": 12583508544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dress",
      "offset": 17
    }
  ],
  "location": "HomePageStep.he_searches_for_dress(String)"
});
formatter.result({
  "duration": 6053984025,
  "status": "passed"
});
formatter.match({
  "location": "ProductListingPageStep.choose_to_buy_the_first_item()"
});
formatter.result({
  "duration": 24712863031,
  "status": "passed"
});
formatter.match({
  "location": "CartPageStep.moves_the_check_out_from_mini_cart()"
});
formatter.result({
  "duration": 25100168725,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lakshay",
      "offset": 12
    }
  ],
  "location": "CheckoutPageStep.enters_the_details_in_checkout_page(String)"
});
formatter.result({
  "duration": 15688550973,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutPageStep.place_the_order()"
});
formatter.result({
  "duration": 5058563767,
  "status": "passed"
});
formatter.match({
  "location": "ConfirmationPageStep.verify_order_details()"
});
formatter.result({
  "duration": 154239539,
  "error_message": "java.util.NoSuchElementException: No value present\r\n\tat java.util.Optional.get(Optional.java:135)\r\n\tat stepDefinations.ConfirmationPageStep.verify_order_details(ConfirmationPageStep.java:22)\r\n\tat ✽.Then verify order details(End2EndTest.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 426435771,
  "status": "passed"
});
formatter.after({
  "duration": 3168958637,
  "status": "passed"
});
});