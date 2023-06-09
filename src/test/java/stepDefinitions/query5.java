package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

public class query5 {
    AllQueries allQueries = new AllQueries();
    @Given("Query5 olusturulur ve dogrulanir")
    public void query5_olusturulur_ve_dogrulanir() {
        Object result = Reusable.getCellValue(allQueries.getQuery5());
        Assert.assertEquals("105",result);
    }
}
