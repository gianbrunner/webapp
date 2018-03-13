
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NTB/IuK_2/Webtech/iuk_ii_w/conf/routes
// @DATE:Tue Mar 06 15:31:02 CET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_1: controllers.HomeController,
  // @LINE:8
  Assets_2: controllers.Assets,
  // @LINE:10
  BookController_0: controllers.BookController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_1: controllers.HomeController,
    // @LINE:8
    Assets_2: controllers.Assets,
    // @LINE:10
    BookController_0: controllers.BookController
  ) = this(errorHandler, HomeController_1, Assets_2, BookController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_2, BookController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.getAllBooks(q:String ?= null)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""", """controllers.BookController.createNewBook()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""" + "$" + """id<[^/]+>""", """controllers.BookController.changeBook(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""" + "$" + """id<[^/]+>""", """controllers.BookController.getBook(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""" + "$" + """id<[^/]+>""", """controllers.BookController.deleteBook(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
 An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BookController_getAllBooks2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_getAllBooks2_invoker = createInvoker(
    BookController_0.getAllBooks(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getAllBooks",
      Seq(classOf[String]),
      "GET",
      this.prefix + """api/books""",
      """Routes for Book Project""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BookController_createNewBook3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/")))
  )
  private[this] lazy val controllers_BookController_createNewBook3_invoker = createInvoker(
    BookController_0.createNewBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "createNewBook",
      Nil,
      "POST",
      this.prefix + """api/books/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BookController_changeBook4_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_changeBook4_invoker = createInvoker(
    BookController_0.changeBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "changeBook",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """api/books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BookController_getBook5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_getBook5_invoker = createInvoker(
    BookController_0.getBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getBook",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """api/books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BookController_deleteBook6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_deleteBook6_invoker = createInvoker(
    BookController_0.deleteBook(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "deleteBook",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """api/books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_BookController_getAllBooks2_route(params@_) =>
      call(params.fromQuery[String]("q", Some(null))) { (q) =>
        controllers_BookController_getAllBooks2_invoker.call(BookController_0.getAllBooks(q))
      }
  
    // @LINE:11
    case controllers_BookController_createNewBook3_route(params@_) =>
      call { 
        controllers_BookController_createNewBook3_invoker.call(BookController_0.createNewBook())
      }
  
    // @LINE:12
    case controllers_BookController_changeBook4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_changeBook4_invoker.call(BookController_0.changeBook(id))
      }
  
    // @LINE:13
    case controllers_BookController_getBook5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_getBook5_invoker.call(BookController_0.getBook(id))
      }
  
    // @LINE:14
    case controllers_BookController_deleteBook6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_deleteBook6_invoker.call(BookController_0.deleteBook(id))
      }
  }
}
