package test.java.hello;
/*comment git test*/
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;
import main.java.hello.*;

import org.junit.Test;

public class GreeterTest {

  private Greeter greeter = new Greeter();

  @Test
  public void greeterSaysHello() {
    assertThat(greeter.sayHello(), containsString("Hello"));
  }

}