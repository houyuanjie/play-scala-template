package controllers

import daos.UserDao
import jakarta.inject.*
import models.User
import play.api.libs.json.*
import play.api.mvc.*
import syntax.JsonSyntax.toJson
import syntax.OptionSyntax.autoToOption

@Singleton
class UserController @Inject() (cc: ControllerComponents, userRepo: UserDao) extends AbstractController(cc) {

  def list(): Action[AnyContent] = Action {
    val users = userRepo.findAll()
    Ok(users.toJson)
  }

  def init(): Action[AnyContent] = Action {
    val initUsers = Seq(
      User.Create("Alice", "Alice's info"),
      User.Create("Bob", None),
      User.Create("Charlie", "Charlie's info"),
      User.Create("David", None)
    )
    for (user <- initUsers) {
      userRepo.insert(user)
    }
    Ok("Initialized")
  }

}
