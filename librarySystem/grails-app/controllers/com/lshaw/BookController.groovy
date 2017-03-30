package com.lshaw

class BookController {

   def scaffold = Book

def advSearch(){

}

def advResults(){
	def bookProps = Book.metaClass.properties*.name
	
	def books = Book.withCriteria {
	"${params.queryType}" {
		params.each {field, value ->
		if (bookProps.grep(field) && value) {
			ilike(field, value)
			}
		}
	
	}
}

	[books:books]
}

}
