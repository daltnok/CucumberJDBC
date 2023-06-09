package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query1 {
    AllQueries allQueries=new AllQueries();
    @Given("Database baglantisi kurulur.")
    public void database_baglantisi_kurulur() {
        Reusable.createConnection();
    }
    @Given("Query olusturulur ve dogrulanir")
    public void query_olusturulur_ve_dogrulanir() throws SQLException {
        Object result=Reusable.getCellValue(allQueries.getQuery1());
        Assert.assertEquals("yes",result);

    }
    @Given("Database baglantisi kapatilir")
    public void database_baglantisi_kapatilir() {
        Reusable.closeConnection();

    }
}
