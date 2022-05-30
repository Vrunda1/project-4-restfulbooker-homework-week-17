package com.herokuapp.booker.restful.restfulexamples;

import com.herokuapp.booker.restful.model.RestfulBookerPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestfulBookerPostAuthCreation extends TestBase {
    @Test
    public void createBookingToken() {

        RestfulBookerPojo restfulBookingPojo = new RestfulBookerPojo();
        restfulBookingPojo.setUsername("admin");
        restfulBookingPojo.setPassword("password123");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restfulBookingPojo)
                .when()
                .post("/auth");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}





