package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.AllQueries;
import utilities.Reusable;

import java.sql.ResultSet;
import java.sql.SQLException;

public class query8 {
    AllQueries allQueries = new AllQueries();

    @Given("Query8 olusturulur ve dogrulanir")
    public void query8_olusturulur_ve_dogrulanir() throws SQLException {
        ResultSet resultSet = Reusable.executeQuery(allQueries.getQuery8());
        boolean result = false;
        String expectedName = "Maria";
        String expectedDoB = "2001-03-02";
        String expectedGender = "Female";
        String expectedFathername = "Jhonson";
        String expectedAddress = "England";
        resultSet.next();
        String actualName = resultSet.getString("donor_name");
        String actualDoB = resultSet.getString("date_of_birth");
        String actualGender = resultSet.getString("gender");
        String actualFathername = resultSet.getString("father_name");
        String actualAddress = resultSet.getString("address");
        if (actualName.equals(expectedName) &&
            actualFathername.equals(expectedFathername) &&
            actualDoB.equals(expectedDoB) &&
            actualGender.equals(expectedGender) &&
            actualAddress.equals(expectedAddress)) {
            result = true;
        }

        Assert.assertTrue(result);


    }

}
