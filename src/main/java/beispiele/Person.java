package beispiele;

import java.util.HashSet;
import lombok.Data;

@Data
public class Person {
  private final String name;
  private final int alter;
  private final HashSet<String> hobbies;

}
