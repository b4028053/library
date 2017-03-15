package com.lshaw

class Course {

String title
String code
String leader
String department
String description
String studyMode

static hasMany = [students:Student]

    static constraints = {
title blank:false, nullable:false
code blank:false, nullable:false
leader blank:false, nullable:false
department blank:false, nullable:false
description blank:false, nullable:false, widget:'textarea'
studyMode blank:false, nullable:false
    }
}
