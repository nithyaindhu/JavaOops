package com.oops;

class Circle {
	private double _radius = 1.0;
	private String  _color = "red";
	
	public Circle() {
		super();
	}

	public Circle(double _radius) {
		super();
		this._radius = _radius;
	}
	
	public Circle(double _radius, String _color) {
		super();
		this._radius = _radius;
		this._color = _color;
	}

	protected double get_radius() {
		return _radius;
	}

	protected void set_radius(double _radius) {
		this._radius = _radius;
	}

	protected String get_color() {
		return _color;
	}

	protected void set_color(String _color) {
		this._color = _color;
	}

	public double calculateArea()
	{
		//System.out.println("Area is "+(double)( (22/7)*_radius*_radius));
		return (double)( (22/7)*_radius*_radius);
	}

	@Override
	public String toString() {
		return "Circle [radius = " + _radius + ", color = " + _color + ", Area = " + calculateArea() + "]";
	}
	
	
}
