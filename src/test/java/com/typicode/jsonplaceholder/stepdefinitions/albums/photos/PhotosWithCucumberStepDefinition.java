package com.typicode.jsonplaceholder.stepdefinitions.albums.photos;
import com.typicode.jsonplaceholder.models.Photo;
import com.typicode.jsonplaceholder.questions.GetPhotoQuestion;
import com.typicode.jsonplaceholder.questions.ResponseCode;
import com.typicode.jsonplaceholder.stepdefinitions.albums.SetUp;
import com.typicode.jsonplaceholder.tasks.GetPhotos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.apache.http.HttpStatus.SC_OK;


public class PhotosWithCucumberStepDefinition  extends SetUp {
    Integer idUser;

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
    @Then("El deberá obtener todos los datos solicitados con el codigo de respuesta 200.")
    public void elDeberáObtenerTodosLosDatosSolicitados() {
        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );
    }


    @Given("El usuario ha definido quiere verificar el titulo de id {int}")
    public void elUsuarioHaDefinidoQuiereVerificarElTituloDeId(Integer int1) {
        setUp();
        idUser =int1;
    }

    @Then("El deberá obtener el título {string}")
    public void elDeberaObtenerElTítulo(String title) {
        Photo[] photos = new GetPhotoQuestion().answeredBy(actor);

        actor.should(
                seeThat("el codigo de respuesta", ResponseCode.was(),equalTo(SC_OK))
        );

        for (Photo photo:photos){
            if (photo.getId()==idUser){
                actor.should(
                        seeThat("el titulo debe coincidir",act ->photo.getTitle(),equalTo(title))
                );
                break;
            }
        }

    }
}