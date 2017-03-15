package com.lshaw

class Library {

String name
String address
String openingHours
String location
int studySpaces

static hasMany = [books:Book, librarians:Librarian, students:Student]

    static constraints = {
name blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false

    }
}
