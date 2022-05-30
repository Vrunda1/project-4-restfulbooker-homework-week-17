package com.herokuapp.booker.restful.restfulexamples;


import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestfulBookerGetBooking extends TestBase {
    @Test
    public void getBookingList() {
        Response response = given()
                .pathParam("id", 2934)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        System.out.println("Booking 2934 is deleted");
        response.prettyPrint();



    }
}
