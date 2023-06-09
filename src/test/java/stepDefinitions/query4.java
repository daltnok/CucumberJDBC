package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query4 {
    AllQueries allQueries = new AllQueries();
    @Given("Query4 olusturulur ve dogrulanir")
    public void query4_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet result = Reusable.getStatement().executeQuery(allQueries.getQuery4());
        result.next();
        String actual = result.getString("is_active");
        Assert.assertEquals("yes",actual);
    }
}
