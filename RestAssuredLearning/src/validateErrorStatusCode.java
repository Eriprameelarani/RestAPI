import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class SimpleGetTest {
 
@Test
public void GetWeatherDetailsInvalidCity()
{
 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 RequestSpecification httpRequest = RestAssured.given();
 Response response = httpRequest.get("/78789798798");
 int statusCode = response.getStatusCode();
 Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, "Correct status code returned");
}