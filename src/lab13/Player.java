package lab13;

public abstract class Player {
private String name;
private int roshombo;
 public abstract int generateRoshambo() ;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoshombo() {
	return roshombo;
}
public void setRoshombo(int roshombo) {
	
	this.roshombo = roshombo;
	
	
	
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

 
}
