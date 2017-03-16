package com.lshaw

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Book)
class BookSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "checkDate"() {

	def due = "16/03/2017"

        when: "A book has a return date"
	
	def bookOne=new Book(returnDate:'20/03/2017')

	then: "the checkDate method checks that the return date is after todays date"
	
	bookOne.checkDate()>= due
}
}
