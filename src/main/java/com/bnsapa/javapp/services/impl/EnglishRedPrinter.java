package com.bnsapa.javapp.services.impl;

import com.bnsapa.javapp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {
    return "red";
  }
}
