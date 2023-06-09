package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query6 {
    AllQueries allQueries = new AllQueries();
    @Given("Query6 olusturulur ve dogrulanir")
    public void query6_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery6());
        resultSet.next();
        int expected = resultSet.getInt("normalbabies");
        Assert.assertEquals( expected, 6);

    }

}
