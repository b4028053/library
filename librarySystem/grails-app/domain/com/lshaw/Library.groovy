package com.lshaw

class Library {

String name/building
String address
String openingHours
String location
int studySpaces

    static constraints = {
name/building blank:false, nullable:false
address blank:false, nullable:false
openingHours blank:false, nullable:false
location blank:false, nullable:false
studySpaces blank:false, nullable:false

    }
}
