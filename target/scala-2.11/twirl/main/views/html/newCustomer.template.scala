
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newCustomer_Scope0 {
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

class newCustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.insertData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(insertDataForm: Form[models.insertData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Customer")/*4.18*/{_display_(Seq[Any](format.raw/*4.19*/("""
	"""),_display_(/*5.3*/form(action = routes.Customer.insertCustomer())/*5.50*/{_display_(Seq[Any](format.raw/*5.51*/("""
		"""),_display_(/*6.4*/inputText(insertDataForm("row_key"))),format.raw/*6.40*/("""
		"""),_display_(/*7.4*/inputText(insertDataForm("column_Family"))),format.raw/*7.46*/("""
		"""),_display_(/*8.4*/inputText(insertDataForm("cust_Name"))),format.raw/*8.42*/("""
		"""),format.raw/*9.3*/("""<input type="submit" class="btn btn-primary" value="Insert"/>
	""")))}),format.raw/*10.3*/("""
""")))}))
      }
    }
  }

  def render(insertDataForm:Form[models.insertData]): play.twirl.api.HtmlFormat.Appendable = apply(insertDataForm)

  def f:((Form[models.insertData]) => play.twirl.api.HtmlFormat.Appendable) = (insertDataForm) => apply(insertDataForm)

  def ref: this.type = this

}


}

/**/
object newCustomer extends newCustomer_Scope0.newCustomer
              /*
                  -- GENERATED --
                  DATE: Fri Aug 12 15:23:55 PDT 2016
                  SOURCE: C:/Users/krishnachaitanya/mapr_connect1/app/views/newCustomer.scala.html
                  HASH: d12635b4e281c1a89f2be27ae2c5c010cc5a12d2
                  MATRIX: 774->1|925->42|953->62|981->65|1005->81|1043->82|1072->86|1127->133|1165->134|1195->139|1251->175|1281->180|1343->222|1373->227|1431->265|1461->269|1556->334
                  LINES: 27->1|32->1|33->3|34->4|34->4|34->4|35->5|35->5|35->5|36->6|36->6|37->7|37->7|38->8|38->8|39->9|40->10
                  -- GENERATED --
              */
          