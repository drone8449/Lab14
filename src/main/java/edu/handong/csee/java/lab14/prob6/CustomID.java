package edu.handong.csee.java.lab14.prob6;   // package name

public class CustomID extends Exception {   // inheritance from Exception
	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"};   // declare string array having race value
	private String name = "";   // declare string having name value 
	private int age = 0;   // declare integer having age value
	private String race = "";   // declare string having race value
	private int state = 0;   // declare integer

	public void set_name(String str) throws Exception {   // method having parameter str and throwing Exception
	   if(str.length() < 5) {   // name's length is lower than 5
		   state = 0;   // initialize state value
		   throw new Exception("Your name is short! Try again!");   // set error message
	} else {   // else
		this.name = str;   // name is str
		System.out.println("Name is valid");   // print message
		System.out.println("Name: " + this.name);   // print name
		state++;   // state increase by 1
	}
  }
    public void set_age(int num) throws Exception {   // method having parameter num and throwing Exception
	   if(num < 18) {   // if age is lower than 18
		   state = 1;   // state is 1
		   throw new Exception("You are too young! Try again!");   // set error message
	} else {   // else
		this.age = num;  // num is age
		System.out.println("Age is valid");   // print message
		System.out.println("Age: " + this.age);   // print age
		state++;   // state increase by 1
	}
}

    public void set_race(String race) throws Exception{   // method having parameter race and throwing Exception
	   for(int i = 0; i < races.length; i++) {   // repeat races's length
		   if(races[i].equals(race)) {   // if race is same with one of races string array values 
			  this.race = races[i];   // set race value
			  System.out.println("Race is valid");   // print message
			  System.out.println("Race: " + races[i]);   // print race
			  state = 0;   // initialize state value
			  return;   // return
            }
        }
        state = 2;   // state is 2
        throw new Exception("Human! Try again.");   // set error message
}

    public int getState() {   // method name
       return state;  // return state
    }
}
