# First Rest Api Spring


* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [More detailed information about modules](#more-detailed-information-about-modules)
* [Usage](#usage)


## General info
<p>Hi!👋 This is <b>First Rest Api Spring application</b>.<br>
It's a CRUD application<br>
It's developed in Java and it uses Spring Framework.<br>
This Application is developed for:
</p>
<ul>
<li><b>creating</b> products with names</li>
<li><b>reading</b> created products</li>
<li>update</b> products</li>
<li><b>delete</b> products</li>
</ul>
<p>
Products are stored in local database, which is created after running application.
<b>Note that, all data are deleted after shutting down the application</b>

</p>

## Technologies
<ul>
<li>Java</li>
<li>Spring Framework</li>
<li>Hibernate Framework</li>
</ul>

## Setup
1. Download and set up a Java. Project developed in version 23.
2. Download and pen a project in your environment.
3. The project created with Maven. Import all dependencies from pom.xml.
4. Compile code and run application.
5. For usage the web browser is needed. You can use software to testing APIs is needed.
6. To set up database open url http://localhost:8080/console in browser.<br>
   Change value of DBC URL to jdbc:h2:mem:testdb and click connect. 
   The Rest Api is ready to use.

## More detailed information about classes and packages in project
Application consists of packages and classes. <br>
I will describe them to explain how application work.<br>
1. In the <b>domain</b> package is a class <b>Product</b> with attributes.<br>
   In this application we will do all operations on objects from this class.<br>
2. In the <b>api</b> package there's a ProductController, <br>
   that manage with incoming requests and with sending responds.<br>
   ProductController use other classes from project to working properly.<br>
   There are two other packages in <b>domain</b> package.<br>
   First is <b>request</b> with <b>ProductRequest</b> and <b>UpdateProductRequest</b> classes.<br>
   These classes are used during receiving requests. <br>
   In the <b>response</b> package there is a <b>ProductResponse</b>, that is used during sending responses.<br>
3. In the <b>repository</b> package there is <b>ProductRepository</b> class that is used to store objects of <b>Product</b> classs created.<br>
4. In the <b>service</b> package there is a <b>ProductService</b> class, that handle operation on each object of <b>Product</b> class.<br>
5. In the <b>support</b> package there is a <b>ProductMapper</b> class to mapping objects from on to other one.<br>
   In the <b>support</b> package there are also classes to handle <b>exceptions</b>.

## Usage
The Application handle POST, GET, PUT, DELETE http methods.
I will show how to use them below.
<ul>
<li><b>POST</b> method: <br>
     go to endpoint http://localhost:8080/api/v1/products and<br>
      send body<br>
{ "name" : "nameOfProduct"}<br>
change the value of name to your own name,<br>
It will add Product to Repository and return the Product in response</li>
<li><b>GET</b> method:  <br>
     there are two endpoints here:<br>
     1.  Go to endpoint http://localhost:8080/api/v1/products and send request.<br>
It will return a list of created objects.<br>
2. Go to endpoint http://localhost:8080/api/v1/products/number and<br> 
replace the string number by Product's number, that you are looking for.<br> 
It will return a Product in response
</li>
<li><b>PUT</b> method:  <br>
Go to endpoint http://localhost:8080/api/v1/products/number and<br> 
replace the string number by Product's number, that you want change.<br>
Send body { "name" : "nameOfProduct"} with new value of name<br>
It will change product in Repository and return a Product, that was changed
</li>
<li><b>Delete</b> method: 
Go to endpoint http://localhost:8080/api/v1/products/number and<br>
replace the string number by Product's number, that you want delete.<br>
It will delete Product from Repository and return a Product's id, that was deleted.
</li>
</ul><br>
In the application there's implemented software SWAGGER UI to test API,<br>
that u can use during running application. The endpoint is:<br>
http://localhost:8080/swagger-ui/index.html<br>
<br>
You can see also case studies without running app in documentation generated with Postman:<br>


