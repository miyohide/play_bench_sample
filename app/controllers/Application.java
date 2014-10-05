package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import models.Member;
import models.Posts;
import play.*;
import play.mvc.*;
import views.html.*;
import play.db.*;

public class Application extends Controller {

    public static Result index() {
        /* Member m = new Member(); */
        /* m.name = "hoge1"; */
        /* m.email = "hoge1@example.com"; */
        /* m.save(); */

        Posts p = new Posts();
        p.title = "post1";
        p.body = "post1\npost1";
        p.save();

        List<Posts> posts = Posts.find.all();
        return ok(index.render(posts));
    }

}

