package com.typicode.jsonplaceholder.questions;

import com.typicode.jsonplaceholder.models.Photo;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetPhotoQuestion implements Question {

    @Override
    public Photo[] answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(Photo[].class);
    }

}
