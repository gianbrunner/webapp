
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NTB/IuK_2/Webtech/iuk_ii_w/conf/routes
// @DATE:Tue Feb 27 21:52:58 CET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

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

  // @LINE:10
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def changeBook(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def getAllBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/books")
    }
  
    // @LINE:11
    def createNewBook(): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "api/books/")
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


}
