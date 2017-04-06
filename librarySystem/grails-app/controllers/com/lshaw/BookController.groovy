package com.lshaw

import grails.converters.*

class BookController {

   static allowedMethods = [index:"GET", show:"GET", post:"SAVE"]

   def scaffold = Book

   /*def index(Book book){
      if (book == null){
         render "There are currently no book details in the database"
      }
      else{
        render Book.list() as JSON
      }
   }*/


   def index(Book book){
        render Book.list() as JSON
      }


   def show(Book book){
      if(params.id && Book.exists(params.id)){
           if (book.overdue == true){
               render Book.findById(params.id) as JSON
           }
           else{
               render "This book is not overdue"
           }
      }
           else{
               render Book.list() as JSON
         }
   }


  def save = {
      def book = new Book(params['book'])
      
      if(book.save()){
        render Book as JSON
      }
      else{
         render "the book was not saved"
      }
   }


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
