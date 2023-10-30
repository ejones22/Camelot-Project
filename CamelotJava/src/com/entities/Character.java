package com.entities;

public class Character<BodyType> implements IEntity, IThing {
	
	
	private String name;
	private BodyType bodyType;
	private Clothing clothing;
	private HairStyle hairStyle;
	
	public enum BodyType{
		A, B, C, D, E, F, G
	}
	
	public enum HairStyle{
		Long, Spiky, Short
	}
	
	public enum Clothing{
		Bandit, Beggar, HeavyArmour, LightArmour, Merchant, Noble, Naked, Peasant, Priest, Queen, Witch, King, Warlock
	}
	
	public Character(String name){
		this.name = name;
	}
	
	public Character(String name, BodyType bodyType) {
		this.name = name;
		this.bodyType = bodyType;
	}
	
	public Character(String name, BodyType bodyType, Clothing clothing) {
		this.name = name;
		this.bodyType = bodyType;
		this.clothing = clothing;
	}
	
	public Character(String name, BodyType bodyType, Clothing clothing, HairStyle hairStyle) {
		this.name = name;
		this.bodyType = bodyType;
		this.clothing = clothing;
		this.hairStyle = hairStyle;
	}
	
	@Override
	public Object getTemplate() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Clothing getClothing() {
		// TODO Auto-generated method stub
		return clothing;
	}
	
	public BodyType getBodyType() {
		return bodyType;
	}

}
