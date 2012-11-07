trait T
trait U

object C { val c = List(1).map(e => (e, new T with U { def x: this.type = null })) }

object A { val a = C.c }