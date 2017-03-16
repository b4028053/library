package com.lshaw

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(BookReview)
class BookReviewSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void testMaxSize() {
        when: "A book review has a review"
	
	def reviewOne=new BookReview(review: 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum')

	then: "the method will check how many characters have been entered"

	!reviewOne.validate()
    }
}
