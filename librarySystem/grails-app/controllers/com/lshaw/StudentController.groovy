package com.lshaw

class StudentController {

   def scaffold = Student

def login(){

}

def validate(){
	def user = Student.findByUserName(params.username)

	if (user && user.password == params.password){
		session.user = user
		render view:'studenthome'
	}
	else{
	 	flash.message = "invalid username and password."
	 	render view:'login'
	}
}

def logout = {
	session.user = null
	redirect(uri:'/')
}


def advSearch(){

}

def advResults(){
	def studentProps = Student.metaClass.properties*.name
	
	def students = Student.withCriteria {
	"${params.queryType}" {
		params.each {field, value ->
		if (studentProps.grep(field) && value) {
			ilike(field, value)
			}
		}
	
	}
}

	[students:students]
}

}
