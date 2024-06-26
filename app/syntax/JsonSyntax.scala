package syntax

import play.api.libs.json.*

import scala.language.implicitConversions

object JsonSyntax:
  given autoToJson[T](using Writes[T]): Conversion[T, JsValue] = Json.toJson
  extension [T](o: T)(using Writes[T]) def toJson: JsValue     = Json.toJson(o)
