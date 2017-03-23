package com.lshaw

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test"() {
        when: "A library has a name"
	
	def adsetts=new Library(name: 'Adsetts', address: '', location: 'sheffield', studySpaces: 200, openingHours: '1:00 - 6:00').save()

	then: "The checkLength method will check the length of the name"

	adsetts.validate()
    }
}
