package br.com.etyllica.keel.filter.validation;

import br.com.etyllica.keel.core.strategy.ComponentValidationStrategy;
import br.com.etyllica.keel.feature.Component;

public class MaxDensityValidation implements ComponentValidationStrategy {

	private int density = 80;
	
	public MaxDensityValidation() {
		super();
	}
	
	public MaxDensityValidation(int density) {
		super();
		
		this.density = density;
	}
	
	@Override
	public boolean validate(Component component) {

		return component.getDensity() <= density;
		
	}
	
}