
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishnachaitanya/mapr_connect1/conf/routes
// @DATE:Tue Aug 16 15:09:29 PDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:10
  Customer_4: controllers.Customer,
  // @LINE:24
  CountController_0: controllers.CountController,
  // @LINE:26
  AsyncController_2: controllers.AsyncController,
  // @LINE:29
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:10
    Customer_4: controllers.Customer,
    // @LINE:24
    CountController_0: controllers.CountController,
    // @LINE:26
    AsyncController_2: controllers.AsyncController,
    // @LINE:29
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_1, Customer_4, CountController_0, AsyncController_2, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Customer_4, CountController_0, AsyncController_2, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/""" + "$" + """id<[^/]+>""", """controllers.Customer.viewCustomer(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.Customer.viewCustomers(from:String ?= null, to:String ?= null)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getCustomer""", """controllers.Customer.getCustomer()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerInsert""", """controllers.Customer.insertCustomer()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteCustomer""", """controllers.Customer.deleteCustomer(id:String, colFam:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Customer_viewCustomer1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Customer_viewCustomer1_invoker = createInvoker(
    Customer_4.viewCustomer(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "viewCustomer",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """customer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Customer_viewCustomers2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_Customer_viewCustomers2_invoker = createInvoker(
    Customer_4.viewCustomers(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "viewCustomers",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """customers"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Customer_getCustomer3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getCustomer")))
  )
  private[this] lazy val controllers_Customer_getCustomer3_invoker = createInvoker(
    Customer_4.getCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "getCustomer",
      Nil,
      "GET",
      """""",
      this.prefix + """getCustomer"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Customer_insertCustomer4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerInsert")))
  )
  private[this] lazy val controllers_Customer_insertCustomer4_invoker = createInvoker(
    Customer_4.insertCustomer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "insertCustomer",
      Nil,
      "POST",
      """""",
      this.prefix + """customerInsert"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Customer_deleteCustomer5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteCustomer")))
  )
  private[this] lazy val controllers_Customer_deleteCustomer5_invoker = createInvoker(
    Customer_4.deleteCustomer(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "deleteCustomer",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """deleteCustomer"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CountController_count6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count6_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_AsyncController_message7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message7_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:10
    case controllers_Customer_viewCustomer1_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Customer_viewCustomer1_invoker.call(Customer_4.viewCustomer(id))
      }
  
    // @LINE:11
    case controllers_Customer_viewCustomers2_route(params) =>
      call(params.fromQuery[String]("from", Some(null)), params.fromQuery[String]("to", Some(null))) { (from, to) =>
        controllers_Customer_viewCustomers2_invoker.call(Customer_4.viewCustomers(from, to))
      }
  
    // @LINE:15
    case controllers_Customer_getCustomer3_route(params) =>
      call { 
        controllers_Customer_getCustomer3_invoker.call(Customer_4.getCustomer())
      }
  
    // @LINE:16
    case controllers_Customer_insertCustomer4_route(params) =>
      call { 
        controllers_Customer_insertCustomer4_invoker.call(Customer_4.insertCustomer())
      }
  
    // @LINE:20
    case controllers_Customer_deleteCustomer5_route(params) =>
      call(params.fromQuery[String]("id", None), params.fromQuery[String]("colFam", None)) { (id, colFam) =>
        controllers_Customer_deleteCustomer5_invoker.call(Customer_4.deleteCustomer(id, colFam))
      }
  
    // @LINE:24
    case controllers_CountController_count6_route(params) =>
      call { 
        controllers_CountController_count6_invoker.call(CountController_0.count)
      }
  
    // @LINE:26
    case controllers_AsyncController_message7_route(params) =>
      call { 
        controllers_AsyncController_message7_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:29
    case controllers_Assets_versioned8_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
