package com.herokuapp.booker.restful.restfulexamples;



import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestfulbookerGetBookingId extends TestBase {
    @Test
    public void getBookingId() {
        Response response = given()
               .pathParam("id", 1346)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }


}
