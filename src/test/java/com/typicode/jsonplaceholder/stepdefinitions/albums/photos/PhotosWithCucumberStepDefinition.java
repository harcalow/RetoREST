package com.typicode.jsonplaceholder.stepdefinitions.albums.photos;

import com.typicode.jsonplaceholder.questions.ResponseCode;
import com.typicode.jsonplaceholder.stepdefinitions.albums.SetUp;
import com.typicode.jsonplaceholder.tasks.GetPhotos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.CoreMatchers.equalTo;

public class PhotosWithCucumberStepDefinition  extends SetUp {
    @Given("El usuario ha definido que quiere obtener la información de sus fotos")
    public void elUsuarioHaDefinidoQuiereObtenerLaInformaciónDeSusFotos() {
        setUp();
    }
    @When("El usuario envía la solicitud")
    public void elUsuarioEnvíaLaSolicitud() {
        actor.attemptsTo(
                GetPhotos.page()
        );
    }
    @Then("El deberá obtener todos los datos solicitados.")
    public void elDeberáObtenerTodosLosDatosSolicitados() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );
    }

}
