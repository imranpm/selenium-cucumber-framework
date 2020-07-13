$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newrequirment.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Selenium - Cucumber Assignment by Imran peenamajidsab"
    }
  ],
  "line": 3,
  "name": "to register and send mail after successfull validation of profile",
  "description": "",
  "id": "to-register-and-send-mail-after-successfull-validation-of-profile",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@registration"
    },
    {
      "line": 2,
      "name": "@profilevalidation"
    },
    {
      "line": 2,
      "name": "@email"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "to register an user",
  "description": "",
  "id": "to-register-and-send-mail-after-successfull-validation-of-profile;to-register-an-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "the website is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Engilsh is selected as Language on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user wants to register",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "mandatory fields are populated",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "email",
        "username",
        "password"
      ],
      "line": 11
    },
    {
      "cells": [
        "imran",
        "pm",
        "pmimran7@gmail.com",
        "imran",
        "imran123"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Clicking on the Register button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "display the valid message if registered successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Verrifysignupstep.the_website_is_loaded()"
});
formatter.result({
  "duration": 13258524300,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.engilsh_is_selected_as_Language_on_the_home_page()"
});
formatter.result({
  "duration": 114100,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.user_wants_to_register()"
});
formatter.result({
  "duration": 2832235300,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.mandatory_fields_are_populated(DataTable)"
});
formatter.result({
  "duration": 1920373600,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.clicking_on_the_Register_button()"
});
formatter.result({
  "duration": 2107040100,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.display_the_valid_message_if_registered_successfully()"
});
formatter.result({
  "duration": 80730700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "to validate name and email",
  "description": "",
  "id": "to-register-and-send-mail-after-successfull-validation-of-profile;to-validate-name-and-email",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@profilevalidation"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user registered successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "clicked on profile dropdown at top right corner",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "display profile details such as name and email",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate name and email of the user.",
  "keyword": "And "
});
formatter.match({
  "location": "Verrifysignupstep.user_registered_successfully()"
});
formatter.result({
  "duration": 146700,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.clicked_on_profile_dropdown_at_top_right_corner()"
});
formatter.result({
  "duration": 161512300,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.display_profile_details_such_as_name_and_email()"
});
formatter.result({
  "duration": 173500,
  "status": "passed"
});
formatter.match({
  "location": "Verrifysignupstep.validate_name_and_email_of_the_user()"
});
formatter.result({
  "duration": 191830100,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "to check user is able to send mail",
  "description": "",
  "id": "to-register-and-send-mail-after-successfull-validation-of-profile;to-check-user-is-able-to-send-mail",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@email"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user wants to send an message to other user",
  "keyword": "Given "
});
formatter.match({
  "location": "Verrifysignupstep.user_wants_to_send_an_message_to_other_user()"
});
formatter.result({
  "duration": 23807626900,
  "status": "passed"
});
});