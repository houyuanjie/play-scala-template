package models

import play.api.libs.json.*

case class User(id: Long, name: String, info: Option[String])

object User {
  given OFormat[User] = Json.format[User]

  case class Create(name: String, info: Option[String])
}
