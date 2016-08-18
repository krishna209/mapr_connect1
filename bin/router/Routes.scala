
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishnachaitanya/mapr_connect1/conf/routes
// @DATE:Thu Aug 11 10:12:15 PDT 2016

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
  // @LINE:7
  Customer_4: controllers.Customer,
  // @LINE:11
  CountController_0: controllers.CountController,
  // @LINE:13
  AsyncController_2: controllers.AsyncController,
  // @LINE:16
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:7
    Customer_4: controllers.Customer,
    // @LINE:11
    CountController_0: controllers.CountController,
    // @LINE:13
    AsyncController_2: controllers.AsyncController,
    // @LINE:16
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customer/""" + "$" + """id<[^/]+>""", """controllers.Customer.customer_info(id:String)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customerInsert""", """controllers.Customer.insert_customer()"""),
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

  // @LINE:7
  private[this] lazy val controllers_Customer_customer_info1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Customer_customer_info1_invoker = createInvoker(
    Customer_4.customer_info(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "customer_info",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """customer/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Customer_insert_customer2_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customerInsert")))
  )
  private[this] lazy val controllers_Customer_insert_customer2_invoker = createInvoker(
    Customer_4.insert_customer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Customer",
      "insert_customer",
      Nil,
      "PUT",
      """""",
      this.prefix + """customerInsert"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CountController_count3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count3_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_AsyncController_message4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message4_invoker = createInvoker(
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

  // @LINE:16
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
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
  
    // @LINE:7
    case controllers_Customer_customer_info1_route(params) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_Customer_customer_info1_invoker.call(Customer_4.customer_info(id))
      }
  
    // @LINE:8
    case controllers_Customer_insert_customer2_route(params) =>
      call { 
        controllers_Customer_insert_customer2_invoker.call(Customer_4.insert_customer())
      }
  
    // @LINE:11
    case controllers_CountController_count3_route(params) =>
      call { 
        controllers_CountController_count3_invoker.call(CountController_0.count)
      }
  
    // @LINE:13
    case controllers_AsyncController_message4_route(params) =>
      call { 
        controllers_AsyncController_message4_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:16
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_3.versioned(path, file))
      }
  }
}
