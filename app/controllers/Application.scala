package controllers

import play.api._
import play.api.mvc._
import controllers.user.UserController
import repositories.user.UserRepositoryComponentImpl
import services.user.UserServiceComponentImpl

object Application extends Controller
                   with UserServiceComponentImpl
                   with UserRepositoryComponentImpl {

/*   def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }*/

}