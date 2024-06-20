package com.artofcoding.factoryMethod.demo.sharp;

import com.artofcoding.factoryMethod.demo.Controller;
import com.artofcoding.factoryMethod.demo.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
