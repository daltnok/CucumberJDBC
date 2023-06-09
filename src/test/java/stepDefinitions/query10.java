package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

public class query10 {
    AllQueries allQueries = new AllQueries();

    @Given("Query10 olusturulur ve dogrulanir")
    public void query10_olusturulur_ve_dogrulanir() {
        Object result = Reusable.getCellValue(allQueries.getQuery10());
        Assert.assertEquals("Kane Stark",result);
    }
}
