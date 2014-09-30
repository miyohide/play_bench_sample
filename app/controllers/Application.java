package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import models.Member;
import play.*;
import play.mvc.*;
import views.html.*;
import play.db.*;

public class Application extends Controller {

    public static Result index() {
        Member m = new Member();
        m.name = "hoge1";
        m.email = "hoge1@example.com";
        m.save();

        List<Member> members = Member.find.all();
        return ok(index.render(members));
    }

}

