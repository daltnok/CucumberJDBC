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

public class query7 {
    AllQueries allQueries = new AllQueries();
    @Given("Query7 olusturulur ve dogrulanir")
    public void query7_olusturulur_ve_dogrulanir() throws SQLException {
        List<String> expected = Arrays.asList("Charu","Rohit","Nicky","Reyana","child");
        sort(expected); // Assert Equal kullanabilmek için her iki listi de sortlamak gerekir.
        ResultSet result = Reusable.executeQuery(allQueries.getQuery7());
        List<String> actual = new ArrayList<>();
        while (result.next()) {
            actual.add(result.getString("child_name"));
        }
        sort(actual);
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }

}
