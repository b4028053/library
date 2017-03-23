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

    void "checkEmail"() {
	when: "A librarian has an email"
	
	def mary=new Librarian(name: 'Mary Jones', email: 'librarian@gmail.com', office: 'Cantor-9312', username: 'mary123', password: 'password', telephone: '0114567364', library: 'adsetts').save()

	then: "The checkEmail method will check the email is vaild"

	mary.validate()
	
    }
}
