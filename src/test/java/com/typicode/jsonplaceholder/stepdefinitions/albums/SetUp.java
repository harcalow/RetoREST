package com.typicode.jsonplaceholder.stepdefinitions.albums;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class SetUp {

    protected static final String URL_BASE = "https://jsonplaceholder.typicode.com";
    protected Actor actor;

    private void setUpActor(){
        actor = Actor.named("Harold");
    }

    private void setUpActorAndApi(){
        actor.can(CallAnApi.at(URL_BASE));
    }

    protected void setUp(){
        setUpActor();
        setUpActorAndApi();
    }


}
