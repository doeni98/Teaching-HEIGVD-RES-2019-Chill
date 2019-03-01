package ch.heigvd.res.chill.domain.francoisburgener;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Leffe implements IProduct {

  public final static String NAME = "Leffe";
  public final static BigDecimal PRICE = new BigDecimal(5.2);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
