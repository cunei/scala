object & { def unapply[A <: AnyRef](a: A): Some[(a.type, a.type)] = Some(a, a) }

trait Exp[+T]
case class ArrayApply[T](arr: Exp[Array[T]], idx: Exp[Int]) extends Exp[T]

object Test {
  def f[T <: AnyRef](x: Exp[T]) = x match {
    case (y: ArrayApply[t]) & ArrayApply(x, i) => x
  }
}