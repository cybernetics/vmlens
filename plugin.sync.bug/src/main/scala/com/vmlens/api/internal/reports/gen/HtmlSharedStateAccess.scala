/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlSharedStateAccess_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\n\n " )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scope_2.section("access") { $_scope_3 =>
          $_scalate_$_context << ( "<div class=\"" )
          $_scope_3.renderVariable("containerTyp", false)
          $_scalate_$_context << ( "\">\n \n \n   <div class=\"row\">\n    <div>\n      <h2 class=\"text-left\">" )
          $_scope_3.renderVariable("name", false)
          $_scalate_$_context << ( "</h1>\n    </div>\n  </div>\n \n\n \n" )
          $_scope_3.partial("parentTable")
          $_scalate_$_context << ( "\n  \n \n\n</div>\n\n" )
        }
        $_scope_2.section("detail") { $_scope_4 =>
          $_scope_4.partial("sharedStateList")
          $_scalate_$_context << ( "\n\n\n" )
        }
        $_scalate_$_context << ( "\u00b4\n" )
      }
      $_scope_1.partial("footer")
    }
  }
}


class $_scalate_$htmlSharedStateAccess_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlSharedStateAccess_mustache.$_scalate_$render(context)
}
