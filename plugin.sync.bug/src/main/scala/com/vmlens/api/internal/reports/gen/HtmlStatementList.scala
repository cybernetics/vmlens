/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlStatementList_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\n\n\n<div class=\"" )
      $_scope_1.renderVariable("containerTyp", false)
      $_scalate_$_context << ( "\">\n \n\n\n \n \n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row text-left\">  \n  \n\n" )
        $_scope_2.renderVariable("name", false)
        $_scalate_$_context << ( "\n\n\n  \n </div> \n\n\n\n  \n  \n    \n" )
      }
      $_scalate_$_context << ( "</div>\n\n\n\n\n" )
      $_scope_1.partial("footer")
      $_scalate_$_context << ( "\n\n\n\n\n" )
    }
  }
}


class $_scalate_$htmlStatementList_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlStatementList_mustache.$_scalate_$render(context)
}
