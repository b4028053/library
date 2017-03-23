package com.lshaw

class Student {

String name
String email
String userName
String password
String studentId
Course course
Library library

String toString() {
"$name"
}


static hasMany = [bookReviews:BookReview, books:Book]



String tooString(){

"$name,$email"

}
    static constraints = {
name blank:false, nullable:false
email blank:false, nullable:false, email:true
userName blank:false, nullable:false, unique:true
password blank:false, nullable:false
studentId blank:false, nullable:false
course blank:false, nullable:false
library blank:false, nullable:false
    }
}
