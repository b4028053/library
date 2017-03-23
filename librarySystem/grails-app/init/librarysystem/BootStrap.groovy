package com.lshaw

class BootStrap {

    def init = { servletContext ->

	def BScomputing = new Course(
	title:'BSc Hons Computing',
	code:'BSC1',
	leader:'Lynee Dawson',
	department:'Computing',
	description:'This is a computing course',
	studyMode:'Full-time',
	tuitionFees:9000
	).save()

	def ComScience = new Course(
	title:'Computer Science',
	code:'CS2',
	leader:'John Smith',
	department:'Computing',
	description:'This is a computing course',
	studyMode:'Full-time',
	tuitionFees:9000
	).save()

	def Laura = new Student(
	name:'Laura Shaw',
	email:'b4028053@my.shu.ac.uk',
	userName:'b4028053',
	password:'password',
	studentId:'b4028053',
	course:BScomputing
	).save()

	def Sam = new Student(
	name:'Sam Jones',
	email:'b123456@my.shu.ac.uk',
	userName:'b123456',
	password:'password1',
	studentId:'b123456',
	course:ComScience
	).save()

	def TATE = new Book(
	title:'The Answers to Everything',
	subject:'Science',
	author:'Brian Cox',
	isbn:'123456789',
	dateBorrowed:new Date('22/03/2017'),
	returnDate:new Date('22/04/2017'),
	student:Laura,
	overdue:'False'
	).save()
	
	def TTOFU = new Book(
	title:'The Theory of The Universe',
	subject:'Science',
	author:'Stephen Hawking',
	isbn:'987654321',
	dateBorrowed:new Date('10/03/2017'),
	returnDate:new Date('10/04/2017'),
	student:Sam,
	overdue:'False'
	).save()

	def TATEreview = new BookReview(
	book:TATE,
	dateMade:new Date('22/04/2017'),
	student:Laura,
	review:'''Lorum ipsum dolor sit amet'''
	).save()

	def TTOFUreview = new BookReview(
	book:TTOFU,
	dateMade:new Date('10/04/2017'),
	student:Sam,
	review:'''Lorum ipsum dolor sit amet'''
	).save()

	def adsetts = new Library(
	name:'Adsetts',
	address:'Arundel Gate',
	openingHours:'7:00 - 23:00',
	location:'Sheffield',
	studySpaces:300,
	).save()

	def cantor = new Library(
	name:'Cantor',
	address:'Arundel Street',
	openingHours:'7:00 - 23:00',
	location:'Sheffield',
	studySpaces:200,
	).save()

	def mary = new Librarian(
	name:'Mary Jones',
	email:'librarian1@gmail.com',
	office:'Cantor-9312',
	userName:'mary123',
	password:'password1',
	telephone:'0114987654',
	library:adsetts
	).save()

	def emily = new Librarian(
	name:'Emily Scott',
	email:'librarian2@gmail.com',
	office:'Cantor-9313',
	userName:'emily123',
	password:'password2',
	telephone:'0114456123',
	library:cantor
	).save()

	adsetts.addToBooks(TATE)
	adsetts.addToBooks(TTOFU)
	adsetts.addToStudents(Laura)
	adsetts.addToStudents(Sam)

	cantor.addToBooks(TATE)
	cantor.addToBooks(TTOFU)
	cantor.addToStudents(Laura)
	cantor.addToStudents(Sam)


    }
    def destroy = {
    }
}
