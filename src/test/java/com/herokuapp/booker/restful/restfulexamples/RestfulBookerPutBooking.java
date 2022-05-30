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
public class RestfulBookerPutBooking extends TestBase {
    @Test
    public void updatingBooking() {
        HashMap<String, Object> bookingDays = new HashMap<>();
        bookingDays.put("checkin", "2018-01-01");
        bookingDays.put("checkout", "2019-01-01");

        RestfulBookerPojo restfulBookingPojo = new RestfulBookerPojo();
        restfulBookingPojo.setFirstname("James");
        restfulBookingPojo.setLastname("Brown");
        restfulBookingPojo.setTotalprice(111);
        restfulBookingPojo.setDepositpaid(false);
        restfulBookingPojo.setBookingdates(bookingDays);
        restfulBookingPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type", "application/json")
                .auth().preemptive().basic("admin","password123")
                .body(restfulBookingPojo)
                .when()
                .put("/booking/2674");
        response.prettyPrint();
        response.then().statusCode(200);
    }
}





