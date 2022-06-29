package org.company;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\src\\test\\resources\\HotelTesting.feature",
glue="org.company",
monochrome=true,
plugin="html:C:\\Users\\admin\\eclipse-workspace\\AntifactHotelTesting\\target"
)
public class HotelBooking {

}
