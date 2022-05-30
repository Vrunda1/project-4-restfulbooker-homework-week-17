package com.herokuapp.booker.restful.restfulexamples;


import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestfulBookerDeleteBooking extends TestBase {
    @Test
    public void deleteBooking() {
        Response response = given()
                .auth().preemptive().basic("admin", "password123")
                .pathParam("id", 3259)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
