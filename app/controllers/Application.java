package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.setFlash;

public class Application extends Controller {

    public Result index() {
        response().setCookie("HELLO", "WORLD");

        return ok(index.render("Your new application is ready."));
    }

    public Result setFlash() {
        flash().put("sample", "value");

        return redirect(routes.Application.index());
    }

}
