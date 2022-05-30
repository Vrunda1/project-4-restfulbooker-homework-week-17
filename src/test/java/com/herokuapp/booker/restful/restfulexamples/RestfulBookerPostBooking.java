package com.herokuapp.booker.restful.restfulexamples;

import com.herokuapp.booker.restful.model.RestfulBookerPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class RestfulBookerPostBooking extends TestBase {
    @Test
    public void createBooking() {
        HashMap<String, Object> bookingDays = new HashMap<>();
        bookingDays.put("checkin", "2018-01-01");
        bookingDays.put("checkout", "2019-01-01");

        RestfulBookerPojo restfulBookingPojo = new RestfulBookerPojo();
        restfulBookingPojo.setFirstname("Jim");
        restfulBookingPojo.setLastname("Brown");
        restfulBookingPojo.setTotalprice(111);
        restfulBookingPojo.setDepositpaid(true);
        restfulBookingPojo.setBookingdates(bookingDays);
        restfulBookingPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(restfulBookingPojo)
                .when()
                .post("/booking");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}





