package ru.circumflex

import java.io._

import _root_.freemarker.template._

/*!# The `ftl` package

Package `ftl` contains rendering methods, `ftl` for use in Circumflex Web Framework and
`ftl2xxx` to render an FTL template into `xxx`. It also maintains Freemarker configuration,
use `ftlConfig` to access it if you need custom operations, or use `ftl.configuration`
configuration parameter to provide your own implementation of FreeMarker `Configuration`.

You should import this package to use Circumflex FreeMarker Helper in your application:

    import ru.circumflex.freemarker._
 */
package object freemarker  {

  val ftlConfig: Configuration = new DefaultConfiguration

  def ftl2string(template: String, root: Any): String = {
    val result = new StringWriter
    ftlConfig.getTemplate(template).process(root, result)
    result.toString
  }

}
