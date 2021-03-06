package ch.heigvd.res.chill.domain.francoisburgener;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PelforthTest {

  @Test
  void thePriceAndNameForPelforthShouldBeCorrect() {
    Pelforth beer = new Pelforth();
    assertEquals(beer.getName(), Pelforth.NAME);
    assertEquals(beer.getPrice(), Pelforth.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForBoxer() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.francoisburgener.Pelforth";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Pelforth.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}