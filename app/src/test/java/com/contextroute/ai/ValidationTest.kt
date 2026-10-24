package com.contextroute.ai
import org.junit.Assert.*
import org.junit.Test
class ValidationTest { @Test fun identicalPlacesAreRejected() { assertFalse(validateTrip("A", "A")) }; @Test fun distinctPlacesAreAccepted() { assertTrue(validateTrip("A", "B")) } }
