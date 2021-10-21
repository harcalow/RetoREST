package com.typicode.jsonplaceholder.runner.albums.photos;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src\\test\\resources\\albums.photos\\photos.feature"},
        glue = {"com\\typicode\\jsonplaceholder\\stepdefinitions\\albums\\photos"}

)
public class PhotosWithCucumberTest {

}
