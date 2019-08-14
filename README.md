# Spring-API-CRUD


1. To add a new user use the http://localhost:8080/user/add URL, select the POST method, set Content-Type="application/json" in the Headers tab, select raw in Body tab and paste the following code.

{
   "userName": "Alex Wibowo",
   "userType": "12345",
   "countryPopulation": 100
}

2. To fetch all user list use the http://localhost:8080/user/all URL with GET request.

3. Similarly, you can perform the update and delete operation. For update, use PUT and delete use DELETE request.

4. To fetch 1 user use the http://localhost:8080/user/${userID} URL with GET request.

5. To fetch  user menu list use the http://localhost:8080/user/usermenu/${userID} URL with GET request.
