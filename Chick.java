class Chick implements Animal 
{     
  //your code here
  //     class Cow implements Animal {     
  private String myType;     
  private String mySound;
  private double myRandomNum;
  public Chick(String type, String sound1, String sound2) {         
    myRandomNum = Math.random();
    myType = type;         
    if (myRandomNum < .5) {
    mySound = sound1;
    }
    else {
    mySound = sound2;
    }
  }     
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }
}
