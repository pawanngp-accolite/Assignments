import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http:HttpClient) { }


  getAllBooks():Observable<any>
  {
    return this.http.get('/libraryAngular/books');
  }
  getBookById():Observable<any>
  {
    return this.http.get('/libraryAngular/books/1/get');
  }
  addBook(book:any):Observable<any>
  {
    return this.http.post('/libraryAngular/books1',book);
  }
  addBookCart(book:any):Observable<any>
  {
    return this.http.post('/libraryAngular//bookscart',book);
  }
  getAllCart():Observable<any>
  {
    return this.http.get('/libraryAngular/bookscart');
  }
}
