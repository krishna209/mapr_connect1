
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listCustomers_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class listCustomers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(CustomersListF : ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("customers")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
	"""),format.raw/*4.2*/("""<h1>list of customers are</h1>
	<ul>
	"""),_display_(/*6.3*/for(customer <- CustomersListF) yield /*6.34*/{_display_(Seq[Any](format.raw/*6.35*/("""
		"""),format.raw/*7.3*/("""<li>"""),_display_(/*7.8*/customer),format.raw/*7.16*/("""</li>
	""")))}),format.raw/*8.3*/("""
	"""),format.raw/*9.2*/("""</ul>
""")))}))
      }
    }
  }

  def render(CustomersListF:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(CustomersListF)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (CustomersListF) => apply(CustomersListF)

  def ref: this.type = this

}


}

/**/
object listCustomers extends listCustomers_Scope0.listCustomers
              /*
                  -- GENERATED --
                  DATE: Mon Aug 15 08:55:07 PDT 2016
                  SOURCE: C:/Users/krishnachaitanya/mapr_connect1/app/views/listCustomers.scala.html
                  HASH: 9c34c72e0fdc4b9a10ecc39ce53e5a6f072c773a
                  MATRIX: 772->1|903->37|933->42|958->59|996->60|1025->63|1091->104|1137->135|1175->136|1205->140|1235->145|1263->153|1301->162|1330->165
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|38->7|38->7|39->8|40->9
                  -- GENERATED --
              */
          