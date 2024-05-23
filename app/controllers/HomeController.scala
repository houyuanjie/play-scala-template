package controllers

import play.api.mvc.*

import jakarta.inject.*

@Singleton
class HomeController @Inject() (cc: ControllerComponents) extends AbstractController(cc):

  def index(): Action[AnyContent] = Action {
    Ok(views.html.index())
  }
