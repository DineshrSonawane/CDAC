class Stringsrev {
    public static void main (String[] args) {
      
        String str= "hello", newstr="";
        char ch;
      
      System.out.println("hello");
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        newstr= ch+newstr; 
      }
      System.out.println("Reversed word: "+ newstr);
    }
}