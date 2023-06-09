package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

public class query12 {
    AllQueries allQueries = new AllQueries();

    @Given("Query12 olusturulur ve dogrulanir")
    public void query12_olusturulur_ve_dogrulanir() {
        Object result = Reusable.getCellValue(allQueries.getQuery12());
        System.out.println(result);
        System.out.println(result.getClass());
        Assert.assertEquals(2L, result); //class java.lang.Long
        //Data Long geldiği için Expected 2L olarak karşılaştırıldı.

    }


}
