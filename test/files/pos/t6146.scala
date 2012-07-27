trait Companion {
   sealed trait Super
   object Subs {
      case object Decimal extends Super
      case object Integer extends Super
      case class Time(t: String) extends Super
   }
}
object Outer extends Companion


class Test {
   def test(f: Outer.Super) = f match {
      case Outer.Subs.Integer => "Int"
      case Outer.Subs.Time(_) => "Time"
      case Outer.Subs.Decimal => "Dec"
   }
}