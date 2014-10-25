package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import models.Member;
import models.Posts;
import play.*;
import play.mvc.*;
import views.html.*;
import play.db.*;

public class Application extends Controller {

    public static Result index() {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        List<Integer> list2 = Collections.synchronizedList(new ArrayList<>());

        for (int i = 0; i < 300; i++ ) {
            list.add(i);
        }

        Collections.shuffle(list);

        for (int i = 0; i < 100; i++) {
            list2.add(list.get(i));
        }

        List<Posts> posts = Posts.find
            .where().in("id", list2).findList();

        return ok(index.render(posts));
    }

}

