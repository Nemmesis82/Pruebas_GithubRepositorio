package evaluacion.primera;

public class regiones 
{

	private int REGION_ID;
	private String REGION_NAME;

	public regiones(String region, int id) 
	{
		this.REGION_ID = id;
		this.REGION_NAME = region;
				
	}

	@Override
	public String toString() {
		return "regiones [REGION_ID=" + REGION_ID + ", REGION_NAME="
				+ REGION_NAME + "]";
	}
		
	

	
}
