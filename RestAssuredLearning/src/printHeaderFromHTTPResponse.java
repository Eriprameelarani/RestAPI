public void IteratingOverHeaders()
{
 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 RequestSpecification httpRequest = RestAssured.given();
 Response response = httpRequest.get("/Hyderabad");
 
 // Get all the headers. Return value is of type Headers.
 // Headers class implements Iterable interface, hence we
 // can apply an advance for loop to go through all Headers
 // as shown in the code below
 Headers allHeaders = response.headers();
 
 // Iterate over all the Headers
 for(Header header : allHeaders)
 {
 System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
 }
}