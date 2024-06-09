package RunnerPackage;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\kumar\\eclipse-workspace\\FitaCucumberWeekend\\src\\test\\java\\Features\\MakeMytripSearchwithMultipleData.feature","C:\\Users\\kumar\\eclipse-workspace\\FitaCucumberWeekend\\src\\test\\java\\Features\\MakeMytripSearch.feature"},
glue={"StepDefenition"},monochrome=true,publish=true)
public class TestRunner {

}