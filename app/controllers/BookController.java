package controllers;

import play.*;
import play.mvc.*;

public class Application extends Controller{
    public Result getAllBooks(String book){
        return ok("It works!");
    }
    public Result createNewBook(){
        return notFound("Page not found");
    }
    public Result changeBook(Long id){
        return badRequest("Error!");
    }
    public Result getBook(Long id){
        return internalServerError("It works!");
    }
    public Result searchBook(){
        return status(488);
    }
    public Result deleteBook(Long id){
        return ok("It works!");
    }

}
