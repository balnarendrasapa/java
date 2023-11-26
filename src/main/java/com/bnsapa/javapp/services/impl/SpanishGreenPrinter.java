package com.bnsapa.javapp.services.impl;

import com.bnsapa.javapp.services.GreenPrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishGreenPrinter implements GreenPrinter {

  @Override
  public String print() {
    return "verde";
  }
}
