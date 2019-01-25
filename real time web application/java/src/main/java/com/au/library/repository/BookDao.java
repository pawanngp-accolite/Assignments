package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;

@Repository
public class BookDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<Book> All()
	{
		return jdbcTemplate.query("select * from book", (rs,i)->{
			
			return new Book(rs.getString("id"),rs.getString("bookName"),rs.getString("authorName"),rs.getString("Description"),rs.getDouble("Price"));}
		
				);
	}
	public Book get(String id) {
		return jdbcTemplate.query("select * from book where id ="+id, (rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("bookName"),
					rs.getString("authorName"),
					rs.getString("Description"),
					rs.getDouble("Price"));
		}).get(0);
	}
	public Book create(Book book) {
		jdbcTemplate.update("insert into book values(?,?,?,?,?);",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				
				book.getDescription(),
				book.getPrice());
		System.out.println(	book.getId()+
				book.getBookName()+
				book.getAuthorName()+
				
				book.getDescription()+
				book.getPrice());
	
		return book;
		
	}
	public Book createcart(Book book) {
		jdbcTemplate.update("insert into cart values(?,?,?,?,?);",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				
				book.getDescription(),
				book.getPrice());
		System.out.println(	book.getId()+
				book.getBookName()+
				book.getAuthorName()+
				
				book.getDescription()+
				book.getPrice());
	
		return book;
		
	}
	public List<Book> AllInCart()
	{
		return jdbcTemplate.query("select * from cart", (rs,i)->{
			
			return new Book(rs.getString("id"),rs.getString("bookName"),rs.getString("authorName"),rs.getString("Description"),rs.getDouble("Price"));}
		
				);
	}
}
