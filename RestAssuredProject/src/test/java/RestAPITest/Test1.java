package RestAPITest;

import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Test1 {
	@Test
	public void Test() {

		given()
		.when()
		.get("http://zippopotam.us/us/90210")
		.then()
		.assertThat().body("places[0].'place name'",equalTo("Beverly Hills")).statusCode(201);
		}
}
