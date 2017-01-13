package com.logistics.controller;


import com.jfinal.core.Controller;

/**
 * Created by dl on 2017-01-13.
 */
public class HelloController extends Controller {
    public void index(){
        renderText("Hello World");
    }
}
