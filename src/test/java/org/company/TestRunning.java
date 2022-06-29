package org.company;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\src\\test\\resources\\Facebook.feature",
glue="org.company",
monochrome=true,
dryRun=false,
//plugin="html:C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\target"
//plugin="junit:C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\target\\samplefacebook.json"
plugin="junit:C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\target\\abc.xml")
public class TestRunning {

}
