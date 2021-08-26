package cl.beehappychile.controllers.system;

import com.fasterxml.jackson.databind.JsonNode;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class SystemController {

    @Get (uri = "/wakeup")
    public JsonNode wakeup () {

        return null;

    }

}