package blatt6.aufgabe15;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StapelTest {

  private Stapel<String> stapel1;
  private Stapel<Integer> stapel2;

  @BeforeEach
  public void init(){
    stapel1 = new Stapel<>();
    stapel2 = new Stapel<Integer>();

  }

  @Test
  public void isEmptyTrue(){
    assertTrue(stapel1.isEmpty());
    assertTrue(stapel2.isEmpty());
  }

  @Test
  public void isEmptyFalse(){
    stapel1.push("item1");
    stapel2.push(1);
    assertFalse(stapel1.isEmpty());
    assertFalse(stapel2.isEmpty());
  }

  @Test
  public void pushTest() throws StackIstLeerException {
    stapel1.push("item1");
    stapel2.push(1);
    assertEquals("item1", stapel1.peek());
    assertEquals(1, stapel2.peek());
  }

  @Test
  public void popTestSucc() throws StackIstLeerException {
    stapel1.push("item1");
    stapel1.push("item2");
    stapel2.push(1);
    stapel2.push(2);

    assertEquals("item2", stapel1.pop());
    assertEquals(2, stapel2.pop());
    assertEquals("item1", stapel1.peek());
    assertEquals(1, stapel2.peek());
  }
  @Test
  public void popTestFail() {
    assertThrows(StackIstLeerException.class,() -> stapel1.pop());
    assertThrows(StackIstLeerException.class, ()->stapel2.pop());
  }

  @Test
  public void peekSucc() throws StackIstLeerException {
    stapel1.push("item1");
    stapel1.push("item2");
    stapel2.push(1);
    stapel2.push(2);

    assertEquals("item2", stapel1.peek());
    assertEquals(2, stapel2.peek());
  }

  @Test
  public void reverse() throws StackIstLeerException {
    stapel1.push("item1");
    stapel1.push("item2");
    stapel1.push("item3");
    stapel2.push(1);
    stapel2.push(2);
    stapel2.push(3);

    stapel1.reverse();
    stapel2.reverse2();

    assertEquals("item1", stapel1.pop());
    assertEquals("item2", stapel1.pop());
    assertEquals("item3", stapel1.pop());
    assertEquals(1, stapel2.pop());
    assertEquals(2, stapel2.pop());
    assertEquals(3, stapel2.pop());
  }
}
