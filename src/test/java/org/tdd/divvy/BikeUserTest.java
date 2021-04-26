package org.tdd.divvy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeUserTest {

    @Test

    public void rideHistoryEmptyUponNewUserCreation() {
        //Arrange
        BikeUser testBikeUser = new BikeUser();
        //Act

        //Assert
        assertTrue(testBikeUser.rideHistory == 0);
    }

}

