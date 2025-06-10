package JavaKeyWords;
//Có hai cách sử dụng assert:
// assert condition;
// assert condition : message;
// condition: Một biểu thức boolean. Nếu false, chương trình sẽ ném AssertionError.

// message: Một thông điệp tùy chọn để mô tả lỗi.
public class assertEx {
    public static void main(String[] args) {
            // Enable assertions
    ClassLoader loader = ClassLoader.getSystemClassLoader();//assert mac dinh bi tat
    loader.setDefaultAssertionStatus(true);
    
    // Run the assert example
    AssertExample example = new AssertExample();
    example.run();
    }
}


class AssertExample {
    public void run() {
      int a = 12;
      try {
        assert a == 12; // Assertion without a fail message
        assert a == 12 : "a is not 12";
        assert a == 15 : "a is not 15";
      } catch (AssertionError e) {
        System.out.println(e.getMessage());
      }
    }
  } 