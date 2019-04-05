@Test
public void GetWeatherStatusLine()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/Hyderabad");
	
	// Get the status line from the Response and store it in a variable called statusLine
	String statusLine = response.getStatusLine();
	Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");
}