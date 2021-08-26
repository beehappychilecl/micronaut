package cl.beehappychile.controllers.website;

import cl.beehappychile.toolkit.converter.Converter;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.util.UUID;

@Controller
@Slf4j
public class WebsiteController {

    @Inject
    private Converter converter;

    @Inject
    private WebsiteModule websiteModule;

    @Get ("/hello")
    public String landing (
    @Nullable String uuidParam
    ) {

        UUID uuid = converter.toUUID (uuidParam);

        log.info ("probando");
        return "Hola";
    }

}