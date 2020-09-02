/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$header_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scalate_$_context << ( "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n<meta charset=\"UTF-8\">\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n<title>vmlens Report</title>\n\n<!-- Bootstrap -->\n<link href=\"" )
      $_scope_1.renderVariable("root", false)
      $_scalate_$_context << ( "css/bootstrap.css\" rel=\"stylesheet\">\n<link href=\"" )
      $_scope_1.renderVariable("root", false)
      $_scalate_$_context << ( "css/report.css\" rel=\"stylesheet\">\n<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n<!--[if lt IE 9]>\n      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n    <![endif]-->\n</head>\n<body>\n\n\n" )
      $_scope_1.section("showHeader") { $_scope_2 =>
        $_scalate_$_context << ( "<header class=\"navbar navbar-static-top\">\n  <div class=\"container\" style=\"padding-top: 10px\">\n    <div class=\"navbar-header\">\n\t  </div>   \t \n   \t   <ul class=\"nav navbar-nav navbar-right\" style=\"padding-top: 10px\">\n   \t \t " )
        $_scope_2.section("headerList") { $_scope_3 =>
          $_scalate_$_context << ( "<li " )
          $_scope_3.section("active") { $_scope_4 =>
            $_scalate_$_context << ( "class=\"active\" " )
          }
          $_scalate_$_context << ( "> <a  href=\"" )
          $_scope_3.renderVariable("root", false)
          $_scope_3.renderVariable("href", false)
          $_scalate_$_context << ( "\" >" )
          $_scope_3.renderVariable("name", false)
          $_scalate_$_context << ( "</a> </li>  \n   \t \t " )
        }
        $_scalate_$_context << ( "</ul>\t \n\t\n\t</div>\n\n</header>\n\n" )
      }
      $_scope_1.section("title") { $_scope_5 =>
        $_scalate_$_context << ( "<div class=\"container-fluid\">\n  <div class=\"row\">\n    <div class=\"col-md-6 col-md-offset-3\">\n  <div class=\"text-center\">    <h1   style=\"display: inline;\"  >\n " )
        $_scope_5.section("titlePrefix") { $_scope_6 =>
          $_scalate_$_context << ( "<strong style=\" color: #cc0000;\" >" )
          $_scope_6.renderVariable("titlePrefix", false)
          $_scalate_$_context << ( "</strong>\n " )
        }
        $_scope_5.renderVariable("title", true)
        $_scalate_$_context << ( "  </h1>\n    \t<a href =\"" )
        $_scope_5.renderVariable("helpLink", false)
        $_scalate_$_context << ( "\"><img  src=\"" )
        $_scope_5.renderVariable("root", false)
        $_scalate_$_context << ( "img/help.png\" />Help</a>   </span>  </div>  \n    </div>\n  </div>\n  <hr>\n</div>\n" )
      }
    }
  }
}


class $_scalate_$header_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$header_mustache.$_scalate_$render(context)
}
