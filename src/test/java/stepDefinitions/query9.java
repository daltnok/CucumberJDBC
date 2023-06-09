package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;

public class query9 {
    AllQueries allQueries = new AllQueries();

    @Given("Query9 olusturulur ve dogrulanir")
    public void query9_olusturulur_ve_dogrulanir() throws SQLException {

        List<Integer> expected = Arrays.asList(6,7);
        ResultSet result = Reusable.executeQuery(allQueries.getQuery9());
        List<Integer> actual = new ArrayList<>();
        while (result.next()) {
            actual.add(Integer.valueOf(result.getString("charge_type_id")));
        }
        sort(actual);
        sort(expected);
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);

    }

}
