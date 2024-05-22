package daos

import databases.DefaultDB
import io.getquill.*
import jakarta.inject.*
import models.User

@Singleton
class UserDao @Inject() (ctx: DefaultDB) {
  import ctx.*

  private inline def users = quote(querySchema[User]("users"))
  private inline def createUser = quote(querySchema[User.Create]("users"))

  def findAll(): List[User] = run {
    users
  }

  def findById(id: Long): Option[User] = run {
    users
      .filter(_.id == lift(id))
      .take(1)
  }.headOption

  def insert(user: User.Create): Boolean = run {
    createUser
      .insertValue(lift(user))
  } > 0

  def updateById(user: User): Boolean = run {
    users
      .filter(_.id == lift(user.id))
      .updateValue(lift(user))
  } > 0

}
