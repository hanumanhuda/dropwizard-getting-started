package com.hhuda.dgs.app;

import com.hhuda.dgs.conf.DGSConfig;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import java.util.logging.Logger;

public class DGSApplication extends Application<DGSConfig> {
    public static void main(String[] args) throws Exception {
        new DGSApplication().run(args);
    }
    public void run(DGSConfig dgsConfig, Environment environment) {
        System.out.println("started");
    }
}
