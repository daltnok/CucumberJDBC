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

public class query2 {
    AllQueries allQueries = new AllQueries();

    @Given("Query2 olusturulur ve dogrulanir")
    public void query2_olusturulur_ve_dogrulanir() throws SQLException {
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 16, 20, 21, 23);
        ResultSet result = Reusable.getStatement().executeQuery(allQueries.getQuery2());
        List<Integer> actual = new ArrayList<>();
        while (result.next()) {
            actual.add(Integer.valueOf(result.getString("patient_id")));
        }
        sort(actual);
        sort(expected);
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
}
