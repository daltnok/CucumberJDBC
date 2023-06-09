package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
              "html:target/html-reports/cucumber.html"
        } ,
        features="src/test/resources",
        glue="stepDefinitions",
        tags="(@Query1 or @Query2 or @Query3 or @Query4 or @Query5 or @Query6 or @Query7 or @Query8 or @Query9 or @Query10 or @Query11 or @Query12 or @Query13 or @Query14 or @Query15 )",
        dryRun = false
)






public class Runner {
}
