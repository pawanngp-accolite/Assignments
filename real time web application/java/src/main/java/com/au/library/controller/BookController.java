package com.au.library.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.model.Book;
import com.au.library.repository.BookDao;

@RestController
public class BookController {
	@Autowired 
	BookDao bookDao;
	@RequestMapping(value="/books" , method=RequestMethod.GET, produces="application/json")
	public List<Book> getAll()
	{
		List<Book> books=new ArrayList<Book>();
			
				books=bookDao.All();
				return books;
	}
	@RequestMapping(value="/books/{id}/get" , method=RequestMethod.GET,produces="application/json")
	public Book getBookById(@PathVariable(value="id") String id)
	{
	return bookDao.get(id);
		
				
					}
	
	@RequestMapping(value="/books1" , method=RequestMethod.POST,produces="application/json")
	public Book getBookById1(@RequestBody Book book )
	{
		
		System.out.println(	book.getId()+
				book.getBookName()+
				book.getAuthorName()+
				
				book.getDescription()+
				book.getPrice());
	
		
				
				return	bookDao.create(book);	}
	@RequestMapping(value="/bookscart" , method=RequestMethod.POST,produces="application/json")
	public Book cartAdd(@RequestBody Book book )
	{
		
		System.out.println(	book.getId()+
				book.getBookName()+
				book.getAuthorName()+
				
				book.getDescription()+
				book.getPrice());
	
		
				
				return	bookDao.createcart(book);	}
	@RequestMapping(value="/bookscart" , method=RequestMethod.GET, produces="application/json")
	public List<Book> gAll()
	{
		List<Book> books=new ArrayList<Book>();
			
				books=bookDao.AllInCart();
				return books;
	}
	
	
	
	
	
	

}
