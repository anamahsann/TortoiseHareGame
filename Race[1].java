package race;

/*Class Race will have a tortoise designated with 'T' race a hare designated with 'H'
*The tortoise and hare move at different paces 
*The paces are dependent on the random number generated between 1-10
*The class will evaluate if the tortoise won, hare won, or if it was tie 
*The finish line is at the 50th position
*/

public class Race {

	public static void main(String[] args) {
      
	   //Character Array of blank spaces will be the race course for the tortoise and hare
	   char [] spaceArray = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',
            ' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
          
      int t = 0; //Integer variable to calculate tortoise pace/position
      int h = 0; //Integer variable to calculate hare pace/position
      int randomNumber; //Integer variable to calculate random number
      boolean end=true; //Boolean variable to determine end of race
      
      System.out.print("AND WE'RE OFF!" + "\n\n"); //Print for start of race
      
      //This while loop will run until the race is completed by tortoise and/or hare
      while (end) {
      
      randomNumber = (int) (10 * Math.random() ) + 1; //Generate random number
      
         //Switch statement evaluate random number to calculate pace/position for tortoise and hare 
         switch (randomNumber) {
            case 1:
               h += 9;
               t += 3;  
               //If statement ensures position within race course
               if (t <= 49 && h<=49) {
                  //If statement for when tortoise and hare not in same position
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';}
                  //If statement for when tortoise and hare in same position 
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
                       
            case 2:
               h += 9;
               t += 3; 
               //If statement ensures position within race course
               if (t <= 49 && h<=49) {
                  //If statement for when tortoise and hare not in same position
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position 
                  if (t == h) {                 
                  spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                  System.out.println(spaceArray);
                  spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
               System.out.print("IT'S A TIE!!");
               end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
               System.out.print("HARE WINS!!");
               end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
               System.out.print("TORTOISE WINS!!");
               end = false;
               }
            break; 

            case 3:
               h += 1;
               t += 3;
               //If statement ensures position within race course
               if (t <= 49 && h <= 49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position 
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
            
            case 4:
               h += 1;
               t += 3;
               //If statement ensures position within race course
               if (t <= 49 && h <= 49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position 
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
            
            case 5:
               h += 1;
               t += 3;
               //If statement ensures position within race course
               if (t <= 49 && h <= 49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
            
            case 6:
               //Ensure that hare does not move back to outside of race course
               if (h >= 12 ) {
                  h -=12; 
               }
            
               t +=1; 
               //If statement ensures position within race course
               if (t<= 49 && h<=49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
            
            case 7:
               //Ensure that hare does not move backwards to outside of race course
               if (h >= 2 ) {
                  h -=2; 
               }
            
               t +=1;
               //If statement ensures position within race course
               if (t<= 49 && h<= 49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
            //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;  
            
            case 8: 
               //Ensure that hare does not move backwards to outside of race course
               if (h >= 2 ) {
                  h -=2; 
               }
            
               t +=1;
               //If statement ensures position within race course
               if (t<= 49 && h<= 49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;  
            
            case 9:
            case 10:
               //Ensure that tortoise does not move backwards to outside of race course
               if (t >= 6 ) {
                  t -=6; 
               }
               //If statement ensures position within race course
               if (t <= 49 && h<=49) {
                  //If statement for when tortoise and hare not in same position 
                  if (t != h) {
                     spaceArray[t] = 'T';
                     spaceArray[h] = 'H';
                     System.out.println(spaceArray);
                     spaceArray[t] = ' ';
                     spaceArray[h] = ' ';
                  }
                  //If statement for when tortoise and hare in same position
                  if (t == h) {                 
                     spaceArray[t] = 'O'; spaceArray[t+1] = 'U'; spaceArray[t+2] = 'C'; spaceArray[t+3] = 'H'; spaceArray[t+4] = '!';                 
                     System.out.println(spaceArray);
                     spaceArray[t] = ' '; spaceArray[t+1] = ' '; spaceArray[t+2] = ' '; spaceArray[t+3] = ' '; spaceArray[t+4] = ' '; 
                  }
               }
               //If statement if race is a tie 
               if (t == 49 && h == 49) {
                  System.out.print("IT'S A TIE!!");
                  end = false;
               }
               //If statement if hare wins race
               if (h >= 49) {
                  System.out.print("HARE WINS!!");
                  end = false;
               }
               //If statement if tortoise wins race
               if (t >= 49) {
                  System.out.print("TORTOISE WINS!!");
                  end = false;
               }
            break;
         } //end of Switch ()
	   }//end of while ()
	} //end of main()
}//end of Class Race


