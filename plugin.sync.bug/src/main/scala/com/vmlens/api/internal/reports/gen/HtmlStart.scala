/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlStart_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\n\n\n<div class=\"container-fluid\">\n \n<h1>Run a test</h1> \n \n\n <p>To run a Junit test use the junit vmlens shortcut:</p> \n \n<img src=\"img/launch_short_cut.png\" class=\"center-block\" style=\"padding-bottom:50px;\" />\n \n<p>To run a different type of application use the \"vmlens All Applications\" run configuration, as <a href=\"" )
      $_scope_1.renderVariable("apacheRoot", false)
      $_scalate_$_context << ( "/help/manual/#all-other-applications\">described here</a>. \nHow to configure a Junit test run is <a href=\"" )
      $_scope_1.renderVariable("apacheRoot", false)
      $_scalate_$_context << ( "/help/manual/#run-configuration\">described here</a>.</p>  \n \n \n \n<p><span style=\"font-weight: bold;\">Next:</span> After the test run finished vmlens shows you all found race conditions and deadlocks, as <a href=\"" )
      $_scope_1.renderVariable("apacheRoot", false)
      $_scalate_$_context << ( "/help/manual/#the-report\">described here</a>.</p> \n \n </div>\n\n\n\n\n" )
      $_scope_1.partial("footer")
      $_scalate_$_context << ( "\n" )
    }
  }
}


class $_scalate_$htmlStart_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlStart_mustache.$_scalate_$render(context)
}
