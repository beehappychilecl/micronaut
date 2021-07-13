package cl.beehappychile.controllers.website;

import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller
public class WebsiteController {

    @Inject
    private WebsiteModule websiteModule;

    @Get ("/hello")
    public String landing (
    @Nullable String uuidParam
    ) {
        //log.info ("probando");
        return "Hola";
    }

}