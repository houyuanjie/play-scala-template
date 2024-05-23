package controllers

import daos.UserDao
import models.User
import syntax.JsonSyntax.toJson
import syntax.OptionSyntax.autoToOption

import play.api.libs.json.*
import play.api.mvc.*

import jakarta.inject.*

@Singleton
class UserController @Inject() (cc: ControllerComponents, userRepo: UserDao) extends AbstractController(cc):

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
    for user <- initUsers do userRepo.insert(user)
    Ok("Initialized")
  }
