package com.bnsapa.javapp.services.impl;

import com.bnsapa.javapp.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {

  @Override
  public String print() {
    return "azul";
  }
}
