package cl.beehappychile.schedulers.system;

import cl.beehappychile.controllers.system.SystemController;
import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class SystemSchedule {

    @Inject
    private SystemController systemController;

    @Scheduled (fixedRate = "20s")
    public void wakeup () {

        System.out.println ("probando....");

    }

}