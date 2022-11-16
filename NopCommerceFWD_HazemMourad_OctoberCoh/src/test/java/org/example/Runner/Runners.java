package org.example.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "E:\\FWD_ECommerce\\NopCommerceFWD_HazemMourad_OctoberCoh\\src\\main\\resources\\features",
        glue = {"org.example.StepDefinitions"},
        tags = "@Smoke",
        plugin = { "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"}

)




public class Runners extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return  super.scenarios();
    }




}
