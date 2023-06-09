package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class query11 {
    AllQueries allQueries = new AllQueries();

    @Given("Query11 olusturulur ve dogrulanir")
    public void query11_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet result = Reusable.executeQuery(allQueries.getQuery11());
        List<Object> actualList = new ArrayList<>();
        while (result.next()) {
            actualList.add(result.getTimestamp("created_at"));
            // Otomatik tür dönüşümü yapmaması için getTimestamp kullandık
        }
        Timestamp expectedTimestamp1 = Timestamp.valueOf("2021-10-28 04:48:56");
        Timestamp expectedTimestamp2 = Timestamp.valueOf("2023-05-03 13:34:59");
        List<Object> expectedList = Arrays.asList(expectedTimestamp1, expectedTimestamp2);
        Assert.assertEquals(actualList, expectedList);

    }
}
