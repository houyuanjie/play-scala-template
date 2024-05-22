package controllers

import jakarta.inject.*
import play.api.mvc.*

@Singleton
class HomeController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {

  def index(): Action[AnyContent] = Action {
    Ok(views.html.index())
  }

}
