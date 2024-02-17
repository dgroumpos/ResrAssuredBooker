package org.dimitris.Tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class BookingTests {

    @Test
    public void GetAllBookings() {
        given()
                .baseUri("https://restful-booker.herokuapp.com/booking")
                .when()
                .get("/")
                .then()
                .statusCode(200);
    }
}

