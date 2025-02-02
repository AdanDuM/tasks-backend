package br.ce.wcaquino.taskbackend.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;
import org.junit.Test;

public class DateUtilsTest {

  @Test
  public void deveRetornarTrueParaDatasFuturas() {
    final LocalDate date = LocalDate.of(2030, 01, 01);
    assertTrue(DateUtils.isEqualOrFutureDate(date));
  }

  @Test
  public void deveRetornarFalseParaDatasPassadas() {
    final LocalDate date = LocalDate.of(2010, 01, 01);
    assertFalse(DateUtils.isEqualOrFutureDate(date));
  }

  @Test
  public void deveRetornarTrueParaDataAtual() {
    final LocalDate date = LocalDate.now();
    assertTrue(DateUtils.isEqualOrFutureDate(date));
  }

}
