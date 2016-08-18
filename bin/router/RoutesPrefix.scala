
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/krishnachaitanya/mapr_connect1/conf/routes
// @DATE:Thu Aug 11 10:12:15 PDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
