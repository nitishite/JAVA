import java.lang.*;

public class StringBufferExample {

  public static void main(String[] args) {

    StringBuffer sb = new StringBuffer("Goodmorning");

    // append()
    sb.append(" Friends");
    System.out.println(sb);

    // insert()
    sb.insert(0, "Hello :");
    System.out.println(sb);

    // replace()
    sb.replace(0, 4, "Hi");
    System.out.println(sb);

    // delete()
    sb.delete(0, 5);
    System.out.println(sb);

    // charAt()
    char ch = sb.charAt(0);
    System.out.println(ch);

    // setCharAt()
    sb.setCharAt(0, 'H');
    System.out.println(sb);

    // length()
    int len = sb.length();
    System.out.println(len);

    // capacity()
    int cap = sb.capacity();
    System.out.println(cap);

    // ensureCapacity()
    sb.ensureCapacity(50);
    System.out.println(sb.capacity());

    // toString()
    String str = sb.toString();
    System.out.println(str);

    // substring()
    String sub1 = sb.substring(2);
    System.out.println(sub1);

    String sub2 = sb.substring(2, 5);
    System.out.println(sub2);
  }
}
