package hibernate.ejemplos.clase;

public class ClaseTestException
{

	private int n;
	
	public ClaseTestException(int n) {
		if (n<10)
		{
			throw new RunExceptionExample();
		} else
		{
			this.n = n;
		}
	}
	
}
