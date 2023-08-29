$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel In Adactin Website",
  "description": "",
  "id": "booking-hotel-in-adactin-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "booking-hotel-in-adactin-website;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Adactin Applicaton",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The Username In Username In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Adactin_Applicaton()"
});
formatter.result({
  "duration": 6959351200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Username_In_Username_In_Username_Field()"
});
formatter.result({
  "duration": 229391500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 100676700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1083182200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Searching Hotel",
  "description": "",
  "id": "booking-hotel-in-adactin-website;searching-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user Select The Location In Select Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user The Hotel In Select Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Select The Room Type In Select Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Select Number Of Rooms In Drop Down",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Enter Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Enter Adult Per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter Children Per Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click On The Search Button And It Naviagate To Select Hoetel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_Select_Location_Field()"
});
formatter.result({
  "duration": 226732600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_The_Hotel_In_Select_Hotel_Field()"
});
formatter.result({
  "duration": 171734500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_Select_Room_Type_Field()"
});
formatter.result({
  "duration": 122433700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Rooms_In_Drop_Down()"
});
formatter.result({
  "duration": 124072100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 151132200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_Out_Date()"
});
formatter.result({
  "duration": 153621200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Adult_Per_Rooms()"
});
formatter.result({
  "duration": 116619000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Children_Per_Rooms()"
});
formatter.result({
  "duration": 178060000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_It_Naviagate_To_Select_Hoetel_Page()"
});
formatter.result({
  "duration": 1397313500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Select Hotel",
  "description": "",
  "id": "booking-hotel-in-adactin-website;select-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user Click On The Radio Button Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Continue Button It Navigate To Hotel Review Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Radio_Button_Select_Field()"
});
formatter.result({
  "duration": 131051800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_It_Navigate_To_Hotel_Review_Page()"
});
formatter.result({
  "duration": 504556800,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Hotel Review",
  "description": "",
  "id": "booking-hotel-in-adactin-website;hotel-review",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "user Enter The First Name In User Field",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Enter The Last Name In User Field",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select Expiry Date And Expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Cvv",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click On The Book Now Button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_User_Field()"
});
formatter.result({
  "duration": 446145900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_User_Field()"
});
formatter.result({
  "duration": 105484400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address()"
});
formatter.result({
  "duration": 167956100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number()"
});
formatter.result({
  "duration": 129325300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Card_Type()"
});
formatter.result({
  "duration": 154470500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Expiry_Date_And_Expiry_Year()"
});
formatter.result({
  "duration": 359485400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Cvv()"
});
formatter.result({
  "duration": 119168900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button()"
});
formatter.result({
  "duration": 84746900,
  "status": "passed"
});
});