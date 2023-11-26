package com.bnsapa.javapp.services.impl;

import com.bnsapa.javapp.services.BluePrinter;
import com.bnsapa.javapp.services.ColourPrinter;
import com.bnsapa.javapp.services.GreenPrinter;
import com.bnsapa.javapp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {
  private RedPrinter redPrinter;
  private BluePrinter bluePrinter;
  private GreenPrinter greenPrinter;

  public ColourPrinterImpl(
      RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
    this.redPrinter = redPrinter;
    this.bluePrinter = bluePrinter;
    this.greenPrinter = greenPrinter;
  }

  @Override
  public String print() {
    return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
  }
}
