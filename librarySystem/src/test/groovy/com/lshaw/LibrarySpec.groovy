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

    void checkLength() {
        when: "A library has a name"
	
	def libraryOne=new Library(name: 'Adsetts')

	then: "The checkLength method will check the length of the name"

	!libraryOne.validate()
    }
}
