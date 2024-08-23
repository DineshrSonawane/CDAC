class Result {
    public static void main(String[] args) {
      int m1 =42;
	  int m2=33;
	  int m3=44;
	  int a= m1+m2+m3;
	  
	  if(a>120)
	  {
      switch(a/10) {
        case 1:
        case 2:
		case 3:
		case 4:
           System.out.println("Result = Fail");
		break;
        default:
           System.out.println("Grade = pass");
           break;
      }
	  else 
		 System.out.println("Grade = pass"); 
		  
		  
	  }
      
   }

}