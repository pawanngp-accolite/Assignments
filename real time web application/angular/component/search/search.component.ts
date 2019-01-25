import { Component, OnInit } from '@angular/core';
import{BookService} from 'src/app/provider/book.service';
import { Book } from 'src/app/model/book';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.scss']
})
export class SearchComponent implements OnInit {
  books:any;



  id:string;
  title:string;
  desc:string;
  author:string;
  price:number;


  constructor(private bookService:BookService) { }

  ngOnInit() {
 
             this.bookService.getAllBooks().subscribe((response)=>{
     if(response && response.length>0){
        this.books=response;
       }
      console.log(response)});

      }

   
      checkout(book){
     //   const book=new Book(this.id,this.title,this.desc,this.author,this.price);
        this.bookService.addBookCart(book).subscribe((response)=>{
          console.log(response);
        });
      }
    
  }
