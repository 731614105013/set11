# set11
import java.io.*;
import java.util.*;
public class Reverse
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s=br.readLine();
      int l=s.length();
      char ch;
      String ans="";
      for(int i=0;i<l;i++)
      {
        ch=s.charAt(i);
        if(ch!=' ')
        ans=ans+ch;
        s=s.replace(ch,' ');
        }
        System.out.println(ans);
        }
        }
