package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	private String text;


	public void setText(String text){
		this.text=text;
	}

	public String getText(){



		return null;
	}

	@Override
	public void notify(Object object){

	}
}
