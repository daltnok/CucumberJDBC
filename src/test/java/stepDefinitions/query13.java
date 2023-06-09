package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class query13 {
    AllQueries allQueries = new AllQueries();

    @Given("Query13 olusturulur ve dogrulanir")
    public void query13_olusturulur_ve_dogrulanir() {
        List<Object> result = Reusable.getRowList(allQueries.getQuery13());
        Timestamp expectedTimestamp = Timestamp.valueOf("2021-10-25 03:09:11.0");
        List<Object> expectedList = Arrays.asList(3, "VKS Pharmacy", "7546985214", "Vinay Shrivastava", "9754632587", "DFDR555--000", "Andheri, Mumbai", expectedTimestamp);
        Assert.assertEquals(result,expectedList);
    }
}
