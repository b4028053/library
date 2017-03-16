package com.lshaw

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "checkLength"() {
	when: "A librarian has a name and telephone number"
	
	def mary=new Librarian(name: 'Mary Jones', telephone: '011412345')

	then: "The checkLength method will check the length of the number"

	mary.validate()
	
    }
}
