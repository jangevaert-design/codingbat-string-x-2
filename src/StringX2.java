public class StringX2 {
  public String stringX(String str) {

    if (str.length() <= 2) {
      return str;
    }

    char start = str.charAt(0) ;
    char end = str.charAt(str.length() - 1);

    str = str.substring(1,str.length()-1).replace("x", "");
    return start + str + end;
  }
}
