package syntax

object OptionSyntax {
  given autoToOption[A]: Conversion[A, Option[A]] = Option.apply
  extension [A](a: A) def toOption: Option[A] = Option.apply(a)
}
