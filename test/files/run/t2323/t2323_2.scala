object Test extends App {
  val x = A.a
  println(x.length) // only print length -- want to make sure we access A.a, but don't show its contents (as it's not stable across runs)
}