package com.lshaw

class Student {

String name
String email
String userName
String password
String studentId
Course course

static hasMany = [bookReviews:BookReview, books:Book]


String toString(){

"$name,$email"

}
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentId blank:false, nullable:false
course blank:false, nullable:false
    }
}
