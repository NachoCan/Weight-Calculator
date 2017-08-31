public class WeightCalculator
{
	public static void main (String[] args)
	{
		int a = Integer.parseInt (args [0]);
		
		double b = Double.parseDouble (args[0]);
		
		//output//
		System.out.println(a);
		
		System.out.println("Mars:" + a * 0.38);
		
		System.out.println("Jupiter:" + b * 2.36);
		
		System.out.println("Venus:" + a *0.91);
		
		System.out.println("Saturn:" + b * 1.06);
	}
}