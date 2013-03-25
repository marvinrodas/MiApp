package controllers;

import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;
import views.html.home.*;

import models.*;

public class Home extends Controller {

    public static Result index() {
      return ok(index.render());
    }

    
    public static Result acerca_de() {
      return ok(acerca_de.render());
    }

    public static Result salir() {
        session().clear();
        return redirect(routes.Home.index());
      }


    public static Result acceso_denegado() {
      return ok(acceso_denegado.render());
    }

    

}
