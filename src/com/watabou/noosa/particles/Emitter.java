package com.watabou.noosa.particles;

public class Emitter {
	
	//TODO: finish Emitter class
	
	public void start(Factory factory, float interval, int quantity) {
		//TODO: finish "Emitter.start(Factory, float, int)" method
	}
	
	abstract public static class Factory {
		abstract public void emit(Emitter emitter, int index, float x, float y);
		
		public boolean lightMode() {
			return false;
		}
	}

}
