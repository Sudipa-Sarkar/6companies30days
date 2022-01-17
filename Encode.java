class GfG
 {
	String encode(String str)
	{
          //Your code here
          char ch = str.charAt(0);
          String ans="";
          int f=1;
          for(int i=1;i<str.length();i++)
          {
              if(ch==str.charAt(i))
              {
                  f++;
              }
              else
              {
                  ans=ans+ch+f;
                  ch=str.charAt(i);
                  f=1;
              }
          }
          //if(f==1)
          ans=ans+ch+f;
          return ans;
	}
	
 }
