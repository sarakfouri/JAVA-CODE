
class MarsApplication {
public static void main (String[] args){
	MarsRobot spirit = new MarsRobot();
	spirit.status = "exploring";
	spirit.speed = 2;
	spirit.temperature = -60;
	//change declaration
	MarsRobot nam = new MarsRobot();
	nam.status =  new String ("In home");
	nam.speed = new Integer (0) ;
	nam.temperature = 0;
	nam.checkTemperature();
	nam.showAttributes();
	//finish
	spirit.checkTemperature();
	spirit.showAttributes();
	System.out.println("increasing speed to 3");
	spirit.speed = 3;
	System.out.println("change temperature to  -90");
	spirit.temperature = -90;
	spirit.showAttributes();
	System.out.println ("checking temperature");
	spirit.checkTemperature();
	spirit.showAttributes();
	// exercise one
		MarsRobot opportunity = new MarsRobot();
		opportunity.status = "searching water";
		opportunity.speed = 4;
		opportunity.temperature = -66;
		opportunity.checkTemperature();
		opportunity.showAttributes();
		opportunity.checkObjets(nam.nomeObjeto);
		
	//end
	
}
}
