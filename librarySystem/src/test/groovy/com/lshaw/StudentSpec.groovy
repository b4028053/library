package com.lshaw

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
        when: "A student has a name and email"
	
	def laura=new Student(name:'Laura Shaw', email: 'lshaw@gmail.com')

	then: "the toString method will merge them"
	
	laura.toString()=='Laura Shaw,lshaw@gmail.com'

    }
}
