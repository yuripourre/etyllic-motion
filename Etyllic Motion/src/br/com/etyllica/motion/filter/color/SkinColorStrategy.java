package br.com.etyllica.motion.filter.color;

public class SkinColorStrategy extends ToleranceStrategy{
	
	public SkinColorStrategy() {
		super();
	}

	@Override
	public boolean validateColor(int rgb) {
		return isSkin(rgb, tolerance);
	}
	
	private boolean isSkin(int rgb, int tolerance){

		int r = getRed(rgb);
		int g = getGreen(rgb);
		int b = getBlue(rgb);

		float x = r;
		float y = b+(g-b);

		float maxTolerance = tolerance;
		float minTolerance = tolerance;
		
		float my=(8*x)/9-40/9;

		if(x>105&&x<175){
			minTolerance = tolerance*1.3f;
		}

		return x>40&&x<230&&(y>my-minTolerance&&y<my+maxTolerance);

	}
	
}