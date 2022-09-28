//Subsequences 
import java.util.*;

public class IMPQ {
  public static void Subsequence (String str ,int idx ,String newstr)
  {
    if(idx==str.length())
    {
        System.out.println(newstr);
        return;
    }

    char currchar = str.charAt(idx);
    //char want to come
Subsequence(str, idx+1, newstr+currchar);

    //not want to come 
Subsequence(str, idx+1, newstr);

  }  
  public static void main(String[] args){
    String str = "abc";
    Subsequence(str, 0, "");
    
}
}