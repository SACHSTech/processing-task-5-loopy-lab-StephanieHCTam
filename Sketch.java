import processing.core.PApplet;

/*
* Description: A program that draws patterns of squares in 8 different sections.
* Author: Stephanie Tam
*/

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){

    int intX2 = 0;
    int intY2 = 0;
    for(int intRow2 = 0; intRow2 < 300; intRow2 += 10){
      for(int intColumn2 = 0; intColumn2 < 300; intColumn2 += 10){
        intX2 = 300 + 3 + intRow2;
        intY2 = 300 + 3 + intColumn2;
        if(intRow2 % 20 == 0){
          fill(255);
          noStroke();
          rect(intX2, intY2, 5, 5);
        }
        else{
          fill(0);
          noStroke();
          rect(intX2, intY2, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX3 = 0;
    int intY3 = 0;
    for(int intRow3 = 0; intRow3 < 300; intRow3 += 10){
      for(int intColumn3 = 0; intColumn3 < 300; intColumn3 += 10){
        intX3 = 600 + 3 + intRow3;
        intY3 = 300 + 3 + intColumn3;
        if(intColumn3 % 20 == 0){
          fill(0);
          noStroke();
          rect(intX3, intY3, 5, 5);
        }
        else{
          fill(255);
          noStroke();
          rect(intX3, intY3, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX4 = 0;
    int intY4 = 0;
    for(int intRow4 = 0; intRow4 < 300; intRow4 += 10){
      for(int intColumn4 = 0; intColumn4 < 300; intColumn4 += 10){
        intX4 = 900 + 3 + intRow4;
        intY4 = 300 + 3 + intColumn4;

        if((intColumn4 % 20) != 0 && (intRow4 % 20) == 0){
          fill(255);
          noStroke();
        }
        else{
          fill(0);
        }
        noStroke();
        rect(intX4, intY4, 5, 5);
      }
    }

  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX5 = 0;
    int intY5 = 0;

    for(int intRow5 = 0; intRow5 < 300; intRow5 += 10){
      for(int intColumn5 = 300 - intRow5; intColumn5 < 300; intColumn5 += 10){
        intX5 = 3 + intRow5;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY5 = 3 + intColumn5; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX5, intY5, 5, 5);

      }
    }
  }

  public void draw_section6(){
    int intX5 = 0;
    int intY5 = 0;

    for(int intRow5 = 0; intRow5 < 300; intRow5 += 10){
      for(int intColumn5 = intRow5; intColumn5 < 300; intColumn5 += 10){
        intX5 = 300 + 3 + intRow5;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY5 = 3 + intColumn5; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX5, intY5, 5, 5);

      }
    }

  }

  public void draw_section7(){
    int intX7 = 0;
    int intY7 = 0;

    for(int intRow7 = 0; intRow7 < 300; intRow7 += 10){
      for(int intColumn7 = 300 - intRow7; intColumn7 > 0; intColumn7 -= 10){
        intX7 = 600 + 3 + intRow7;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY7 = 3 + intColumn7 - 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX7, intY7, 5, 5);
      }
    }


  }
  
  public void draw_section8(){

  }






}
