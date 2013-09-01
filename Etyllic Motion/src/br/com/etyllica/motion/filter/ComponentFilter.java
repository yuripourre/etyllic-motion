package br.com.etyllica.motion.filter;

public abstract class ComponentFilter extends FilterImpl{
	
	protected int w;
	protected int h;
	
	public ComponentFilter(int w, int h){
		super();
		
		this.w = w;
		this.h = h;
	}

}