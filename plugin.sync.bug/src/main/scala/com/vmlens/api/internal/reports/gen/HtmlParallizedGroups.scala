/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlParallizedGroups_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\n\n<!-- htmlParallizedGroups.mustache -->\n\n<div class=\"" )
      $_scope_1.renderVariable("containerTyp", false)
      $_scalate_$_context << ( "\">\n   \n <table class=\"table table-striped\" >\n  <tr>\n    <th>#</th>\n    <th>Result</th>\n    <th>Name</th>\n    <th>Count</th>\n   \n  </tr>\n\n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<tr>\n    <td> <a   href=\"" )
        $_scope_2.renderVariable("link", false)
        $_scalate_$_context << ( "\" >  " )
        $_scope_2.renderVariable("index", false)
        $_scalate_$_context << ( "  </a> </td>\n     <td>   <a   href=\"" )
        $_scope_2.renderVariable("link", false)
        $_scalate_$_context << ( "\" > <img src=\"" )
        $_scope_2.renderVariable("imagePath", true)
        $_scalate_$_context << ( "\" /> " )
        $_scope_2.renderVariable("resultText", false)
        $_scalate_$_context << ( " </a> </td>\n     <td> <a   href=\"" )
        $_scope_2.renderVariable("link", false)
        $_scalate_$_context << ( "\" >" )
        $_scope_2.renderVariable("name", true)
        $_scalate_$_context << ( "</a>  </td>\n <!-- skipAtCompare -->      <td>  <a   href=\"" )
        $_scope_2.renderVariable("link", false)
        $_scalate_$_context << ( "\" >   " )
        $_scope_2.renderVariable("count", false)
        $_scalate_$_context << ( " </a>  </td>\n  </tr>\n\n\n\n\n" )
      }
      $_scalate_$_context << ( "</table>   \n\n\n</div>\n\n\n\n\n" )
      $_scope_1.partial("footer")
    }
  }
}


class $_scalate_$htmlParallizedGroups_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlParallizedGroups_mustache.$_scalate_$render(context)
}
