
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishnachaitanya/mapr_connect1/conf/routes
// @DATE:Tue Aug 16 15:09:29 PDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:24
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseCustomer(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def getCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Customer.getCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getCustomer"})
        }
      """
    )
  
    // @LINE:16
    def insertCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Customer.insertCustomer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "customerInsert"})
        }
      """
    )
  
    // @LINE:20
    def deleteCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Customer.deleteCustomer",
      """
        function(id0,colFam1) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteCustomer" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("colFam", colFam1)])})
        }
      """
    )
  
    // @LINE:10
    def viewCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Customer.viewCustomer",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customer/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", encodeURIComponent(id0))})
        }
      """
    )
  
    // @LINE:11
    def viewCustomers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Customer.viewCustomers",
      """
        function(from0,to1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "customers" + _qS([(from0 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("from", from0)), (to1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("to", to1))])})
        }
      """
    )
  
  }


}
