package com.pokumars.countrylist.model

import org.junit.Test

import org.junit.Assert.*

class CountryTest {

    @Test
    fun countryToStringReturnsCorrectSentence() {
        // Create a country
        val country1 = Country("Colombia", listOf(".co"), listOf("57"),"Bogota",
            "56468435","Colombian",  listOf("Bra","Arg", "Chi"),"123","")

        val expectedString = "Colombia, capital- Bogota, 56468435 people are Colombian. The call code is +57"
        // Call your function
        val sentence = country1.toString()

        // Check the result
        assertEquals(sentence,expectedString)
    }
}