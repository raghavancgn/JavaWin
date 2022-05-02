package OOPYpk;
/* A java scenario to demonstrate method overriding */
//Create parent class
class Bank {
	int getRateOfInterest() {
		return 0;
	}
}
//Create a child class
	 class SBI extends Bank {
		int getRateOfInterest() {
			return 8;
		}
	}
	 class ICICI extends Bank {
		int getRateOfInterest() {
			return 7;
		}
	}
	 class AXIS extends Bank {
		int getRateOfInterest() {
			return 9;
		}
	}

//Test class to create objects and call methods
public class DemoOverride {
	public static void main(String[] args) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of interest " + s.getRateOfInterest());
		System.out.println("ICICI Rate of interest " + i.getRateOfInterest());
		System.out.println("AXIS Rate of interest " + a.getRateOfInterest());
	}

}
