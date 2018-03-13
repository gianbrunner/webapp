
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NTB/IuK_2/Webtech/iuk_ii_w/conf/routes
// @DATE:Tue Mar 06 15:31:02 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:10
  class ReverseBookController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def changeBook(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:11
    def createNewBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/books/")
    }
  
    // @LINE:10
    def getAllBooks(q:String = null): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/books" + play.core.routing.queryString(List(if(q == null) None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("q", q)))))
    }
  
    // @LINE:14
    def deleteBook(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "api/books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def getBook(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:8
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
