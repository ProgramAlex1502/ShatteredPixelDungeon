package com.shatteredpixel.shatteredpixeldungeon.actors.blobs;

import com.shatteredpixel.shatteredpixeldungeon.actors.Actor;
import com.shatteredpixel.shatteredpixeldungeon.effects.BlobEmitter;
import com.shatteredpixel.shatteredpixeldungeon.levels.Level;

public class Blob extends Actor {
	
	//TODO: finish Blob class
	public static final int LENGTH = Level.LENGTH;
	
	public int volume = 0;
	
	public int[] cur;
	protected int[] off;
	
	public BlobEmitter emitter;

	@Override
	protected boolean act() {
		//TODO: finish "Blob.act()" method
		return false;
	}
	
	public void use(BlobEmitter emitter) {
		this.emitter = emitter;
	}

}
