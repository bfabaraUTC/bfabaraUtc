package controllers;

import java.util.List;

import models.Orden;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

       public Result index() {
    	   List<Orden> computadoras=Orden.list();
    	   
        return ok(index.render(Orden.list()));
    }

}
