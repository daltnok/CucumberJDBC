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

public class query15 {

    AllQueries allQueries = new AllQueries();
    List<String> obj1 = new ArrayList<>();
    List<String> obj2 = new ArrayList<>();

    @Given("Query151 olusturulur")
    public void query151_olusturulur() throws Exception {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery15_1());

        while (resultSet.next()) {
            obj1.add(resultSet.getString("vehicle_no"));
        }
    }

    @Given("Query152 olusturulur")
    public void query152_olusturulur() throws SQLException {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery15_2());

        while (resultSet.next()) {
            obj2.add(resultSet.getString("vehicle_no"));
        }
    }

    @Given("Her iki query sonucu karsilastirilir")
    public void her_iki_query_sonucu_karsilastirilir() {
        boolean result = false;
        int rowsize = obj1.size();
        for (int i = 0; i < rowsize; i++) {
            if (obj1.get(i).equals(obj2.get(i))) {
                result = true;
                break;
            }
        }
        Assert.assertTrue(result);
    }
}
