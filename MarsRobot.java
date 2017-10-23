
public class MarsRobot {
String status;
int speed;
float temperature;
String nomeObjeto;

void checkTemperature(){
	if (temperature < -80 ){
		status = "returning home";
		speed = 5;
	
	}
}
void checkObjets (Object one){
	nomeObjeto = new String ("sobra"); 
	one = nomeObjeto;
	System.out.println(nomeObjeto + " " + one); 
	
}

void showAttributes(){
	System.out.println("Status: " + status );
	System.out.println("Speed: " + speed);
	System.out.println("Temperature: " + temperature);
		
}


}
