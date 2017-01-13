package com.logistics.cfg;

import com.jfinal.config.*;
import com.logistics.controller.HelloController;

/**
 * Created by dl on 2017-01-13.
 */
public class JFWebConfig extends JFinalConfig{


    @Override
    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    @Override
    public void configRoute(Routes routes) {
        routes.add("/hello", HelloController.class);
    }

    @Override
    public void configPlugin(Plugins plugins) {

    }

    @Override
    public void configInterceptor(Interceptors interceptors) {

    }

    @Override
    public void configHandler(Handlers handlers) {

    }
}
