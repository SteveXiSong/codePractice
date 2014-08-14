public class Roman_to_Integer{
   public static void main(String [] args){
      System.out.println("I"+romanToInt("I"));
      System.out.println("III"+romanToInt("III"));
      System.out.println("IV"+romanToInt("IV"));
      System.out.println("VI"+romanToInt("VI"));
      System.out.println("IIX"+romanToInt("IIX"));
      System.out.println("XII"+romanToInt("XII"));
   }

   public static int romanToInt(String s){
      //I=1, V=5, X=10, L=50, C=100, D=500, M=1000
      int lastVal = 0;
      int sumVal  = 0;
      int curVal  = 0;

      for( int i = s.length()-1; i >= 0; i--){
         switch ( s.charAt(i)){
            case 'I':   curVal = 1; break;
            case 'V':   curVal = 5; break;
            case 'X':   curVal = 10; break;
            case 'L':   curVal = 50; break;
            case 'C':   curVal = 100; break;
            case 'D':   curVal = 500; break;
            case 'M':   curVal = 1000; break;
            default :   curVal = 0; break;
         }
         if( curVal >= lastVal){
            sumVal+=curVal;
            lastVal = curVal;
         }
         else {
            sumVal -= curVal;
            lastVal = curVal; 
         }
      }
      return sumVal;
   }
}
