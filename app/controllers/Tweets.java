package controllers;

import actors.UserActor;
import com.fasterxml.jackson.databind.JsonNode;
import play.libs.F.Promise;
import play.libs.ws.WS;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

public class Tweets extends Controller {


    public static Result index() {
        return ok(views.html.index.render("TweetMap"));
    }


}
