package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query3  {

    AllQueries allQueries = new AllQueries();
    @Given("Query3 olusturulur ve dogrulanir")
    public void query3_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery3());
        Reusable.printResultSet(resultSet);
    }

}
