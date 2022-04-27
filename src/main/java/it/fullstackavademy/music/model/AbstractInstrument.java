package it.fullstackavademy.music.model;

public abstract class AbstractInstrument implements Musical_Instrument { 
	private String strument_name; 
	
	protected AbstractInstrument (String strument_name) { 
		this.strument_name = strument_name; 
	}
	@Override
	public void playinstrument() { 
		
		System.out.println("I am playing" + strument_name);
	}
	
}
