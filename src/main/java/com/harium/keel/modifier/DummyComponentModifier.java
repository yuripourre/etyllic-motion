package com.harium.keel.modifier;

import com.harium.keel.core.strategy.ComponentModifierStrategy;
import com.harium.keel.feature.PointFeature;

public class DummyComponentModifier implements ComponentModifierStrategy {

	@Override
	public PointFeature modifyComponent(PointFeature component) {
		return component;
	}
	
}
