package webDriverInterface;

public interface  WebDriver {
 default int add(int a, int b) {
   
   int c = a+b;
   return c;

}

public void sub();

public void mul();

}
