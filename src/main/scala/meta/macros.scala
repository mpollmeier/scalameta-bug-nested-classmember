package meta

import scala.annotation.StaticAnnotation

class foo extends StaticAnnotation {
  inline def apply(defn: Any): Any = meta {
    defn
  }
}
