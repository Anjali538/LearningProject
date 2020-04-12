package com.basic.designpattern.creation.singlton;

import java.io.Serializable;

public class SerializedSinglton implements Serializable{
	private static final long serialVersionUID = -7604766932017737115L;
	private SerializedSinglton() {}
	
	 private static class SingletonHelper{
	        private static final SerializedSinglton instance = new SerializedSinglton();
	    }
	    
	    public static SerializedSinglton getInstance(){
	        return SingletonHelper.instance;
	    }
}
