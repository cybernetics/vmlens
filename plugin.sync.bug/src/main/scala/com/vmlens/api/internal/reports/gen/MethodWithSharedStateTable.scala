/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$methodWithSharedStateTable_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scalate_$_context << ( "<div class=\"row text-left\">\n  \n  \n <table class=\"table table-striped\" >\n  <tr>\n    <th>Level</th>\n    <th>Method</th>\n    <th>Shared State</th>\n    <th>Thread Count</th>\n  </tr>\n  \n\n\n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scope_2.section("color") { $_scope_3 =>
          $_scalate_$_context << ( "<tr style=\" background-color: " )
          $_scope_3.renderVariable("color", false)
          $_scalate_$_context << ( " \" >" )
        }
        $_scope_2.invertedSection("color") { $_scope_4 =>
          $_scalate_$_context << ( "<tr>" )
        }
        $_scalate_$_context << ( "<td>" )
        $_scope_2.renderVariable("group", false)
        $_scalate_$_context << ( "</td>\n\n<td>\n    " )
        $_scope_2.section("parentChildLink") { $_scope_5 =>
          $_scalate_$_context << ( "<a   href=\"" )
          $_scope_5.renderVariable("parentChildLink", false)
          $_scalate_$_context << ( "\" >" )
          $_scope_5.renderVariable("name", true)
          $_scalate_$_context << ( "</a> " )
        }
        $_scope_2.invertedSection("parentChildLink") { $_scope_6 =>
          $_scope_6.renderVariable("name", true)
        }
        $_scalate_$_context << ( "</td>\n\n\n\n " )
        $_scope_2.section("textInsteadState") { $_scope_7 =>
          $_scalate_$_context << ( "<td>\n" )
          $_scope_7.section("imagePath") { $_scope_8 =>
            $_scalate_$_context << ( "<img src=\"" )
            $_scope_8.renderVariable("imagePath", true)
            $_scalate_$_context << ( "\" />\n" )
          }
          $_scope_7.renderVariable("textInsteadState", false)
          $_scalate_$_context << ( "\n  </td>\n " )
        }
        $_scope_2.invertedSection("textInsteadState") { $_scope_9 =>
          $_scalate_$_context << ( "<td>\n     " )
          $_scope_9.section("memoryClusterLink") { $_scope_10 =>
            $_scalate_$_context << ( "<a   href=\"" )
            $_scope_10.renderVariable("memoryClusterLink", false)
            $_scalate_$_context << ( "\" >" )
            $_scope_10.partial("state")
            $_scalate_$_context << ( "</a> " )
          }
          $_scope_9.invertedSection("memoryClusterLink") { $_scope_11 =>
            $_scope_11.partial("state")
          }
          $_scalate_$_context << ( "</td>\n    \n " )
        }
        $_scalate_$_context << ( "<td>\n<!-- skipAtCompare -->  " )
        $_scope_2.renderVariable("threadCount", false)
        $_scalate_$_context << ( "\n</td>    \n    \n   \n  </tr>\n\n" )
      }
      $_scalate_$_context << ( "</table>   \n    \n     \n</div>" )
    }
  }
}


class $_scalate_$methodWithSharedStateTable_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$methodWithSharedStateTable_mustache.$_scalate_$render(context)
}
