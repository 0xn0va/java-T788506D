
//  Game.java  (c) 2004 Kari Laitinen

//  http://www.naturalprogramming.com

//  2003-10-02  File created.
//  2004-11-06  Last modification.

import java.util.* ;
import java.util.Random;

class Game
{
   public static void main( String[] not_in_use )
   {
      Scanner  keyboard  =  new  Scanner( System.in ) ;

      int  integer_from_keyboard ;
      int  one_larger_integer ;

      System.out.print(
          "\n This program is a computer game. Please, type in "
        + "\n an integer in the range  1 ... 2147483646 : " ) ;

      integer_from_keyboard  =  keyboard.nextInt() ;

      // one_larger_integer  =  integer_from_keyboard  +  1 ;
      int random = (int )(Math.random() * 2147483646 + 1);
      one_larger_integer  =  random ;

      System.out.print( "\n You typed in " + integer_from_keyboard + "."
                     +  "\n My number is " + one_larger_integer    + "."
                     +  "\n Sorry, you lost. I won. The game is over.\n") ;
   }
}
