Spring Boot Redis Demo Project With Validation 

Requests
1. Create User POST : http://localhost:8080/user/

{
 "id":7535565,
 "firstName":"Brijesh",
 "lastName":"Gupta",
 "emailId": "brijeshbiet90gmail.com",
 "mobile" : 97426931253,
 "age":32

}


2. Get All Users
GET http://localhost:8080/user

3. Get User By id :
GET http://localhost:8080/user/3

4. Delete User By Id
DELETE :http://localhost:8080/user/3