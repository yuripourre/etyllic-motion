package br.com.etyllica.motion.filter.color;

import br.com.etyllica.linear.Ellipse;
import br.com.etyllica.motion.filter.SoftPixelStrategy;

public class SkinColorEllipticStrategy extends SimpleToleranceStrategy implements SoftPixelStrategy {
		
	public static final Ellipse SKIN_ELLIPSE = new Ellipse(140, 140, 123, 26, 316);
	public static final Ellipse SKIN_STRONG_ELLIPSE = new Ellipse(140, 140, 123, 18, 316);
	
	public SkinColorEllipticStrategy() {
		super();
	}
	
	public SkinColorEllipticStrategy(int tolerance) {
		super(tolerance);
	}

	@Override
	public boolean validateColor(int rgb) {
		return inEllipse(SKIN_ELLIPSE, rgb);
	}
	
	@Override
	public boolean strongValidateColor(int baseColor, int rgb) {
		return inEllipse(SKIN_STRONG_ELLIPSE, rgb);
	}
	
	private boolean inEllipse(Ellipse ellipse, int rgb) {
		int r = ColorStrategy.getRed(rgb);
		int g = ColorStrategy.getGreen(rgb);
		int b = ColorStrategy.getBlue(rgb);
		
		int px = r;
		int py = b+(g-b);
		
		return ellipse.contains(px, py);
	}
}
