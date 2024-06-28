package com.shatteredpixel.shatteredpixeldungeon.actors;

import com.watabou.utils.Bundlable;
import com.watabou.utils.Bundle;

public abstract class Actor implements Bundlable {
	
	//TODO: finish Actor class
	
	public static final float TICK = 1f;
	
	private float time;
	
	protected abstract boolean act();

	@Override
	public void restoreFromBundle(Bundle bundle) {
		
	}

	@Override
	public void storeInBundle(Bundle bundle) {
		
	}

}
