package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query14 {
    AllQueries allQueries = new AllQueries();

    @Given("Query14 olusturulur ve dogrulanir")
    public void query14_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery14());
        while (resultSet.next()) {
            System.out.println(resultSet.getString("account_title"));
        }
    }
}
