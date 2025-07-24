package Raju;

public class AustralianTraffic implements CentralTraffic,contitentalTraffic{

	public static void main(String[] args) 
	{
		
		CentralTraffic a=new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.flashYellow();
		
		AustralianTraffic t=new AustralianTraffic();
		t.walkonsymbol();
		
		contitentalTraffic r=new AustralianTraffic ();
		r.Trainsymbol();
		
	}

	@Override
	public void greenGo() 
	{
		// TODO Auto-generated method stub
		System.out.println("green means go");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red means go");

	}
	public void walkonsymbol()
	{
		System.out.println("wallking");

		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash means strat");

	}

	@Override
	public void Trainsymbol() 
	{
		// TODO Auto-generated method stub
		System.out.println("train symbol");
        
		
	}

}
