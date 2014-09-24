package controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import play.*;
import play.mvc.*;
import views.html.*;
import play.db.*;

public class Application extends Controller {

    public static Result index() {
        Connection connection = DB.getConnection();
        try {
            PreparedStatement sql = connection
                    .prepareStatement("SELECT * FROM member");
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ok(index.render("Your new application is ready."));
    }

}
