package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Book;
import play.*;
import play.libs.Json;
import play.mvc.*;
import services.DefaultBookService;

public class BookController extends Controller{

    public BookController(){
        DefaultBookService bookService = new DefaultBookService();
    }

    public Result getAllBooks(String book){
        JsonNode json = Json.toJson(book);
        return ok(json);
    }
    public Result createNewBook(){
        final JsonNode json = request().body().asJson();
        final Book book = Json.fromJson(json, Book.class);
        return ok("CreateNewBooks works!");
    }
    public Result changeBook(Long id){
        if(id==5){
            return badRequest("Error!");
        }
        return ok("Change Works!");
    }
    public Result getBook(Long id){
        if(id==5){
            return internalServerError("Error!");
        }
        return ok("getBook Works!");

    }
    public Result searchBook(){
        return status(488);
    }
    public Result deleteBook(Long id){
        if(id==5){
            return internalServerError("Error!");
        }
        return ok("deleteBook Works!");
    }

}
