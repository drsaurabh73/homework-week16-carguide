$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cardealer.feature");
formatter.feature({
  "line": 1,
  "name": "Used Care Test",
  "description": "",
  "id": "used-care-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15974781700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user can search used car dealer",
  "description": "",
  "id": "used-care-test;user-can-search-used-car-dealer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on buy+sell tab of car page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I mouse hover on used car tab",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Used Cars  Dealer link  page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see the dealer list",
  "rows": [
    {
      "cells": [
        "3 Point Motors Kew"
      ],
      "line": 11
    },
    {
      "cells": [
        "4WD Specialist Group"
      ],
      "line": 12
    },
    {
      "cells": [
        "777 Pinoy Auto Sales"
      ],
      "line": 13
    },
    {
      "cells": [
        "A\u0026Z QUALITY CARS"
      ],
      "line": 14
    },
    {
      "cells": [
        "ASTORIA HAVAL \u0026 GREAT WALL"
      ],
      "line": 15
    },
    {
      "cells": [
        "Adelaide City Jeep"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BuyCarTest.iAmOnHomepage()"
});
formatter.result({
  "duration": 425157600,
  "status": "passed"
});
formatter.match({
  "location": "BuyCarTest.iMouseHoverOnBuySellTabOfCarPage()"
});
formatter.result({
  "duration": 1270578700,
  "status": "passed"
});
formatter.match({
  "location": "BuyCarTest.iMouseHoverOnUsedCarTab()"
});
formatter.result({
  "duration": 532072700,
  "status": "passed"
});
formatter.match({
  "location": "DealerTest.iClickOnUsedCarsDealerLinkPage()"
});
formatter.result({
  "duration": 2942923600,
  "status": "passed"
});
formatter.match({
  "location": "DealerTest.iSeeTheDealerList(DataTable)"
});
formatter.result({
  "duration": 26522838800,
  "status": "passed"
});
formatter.after({
  "duration": 3055693400,
  "status": "passed"
});
});