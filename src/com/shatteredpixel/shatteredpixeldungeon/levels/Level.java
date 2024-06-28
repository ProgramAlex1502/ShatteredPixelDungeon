package com.shatteredpixel.shatteredpixeldungeon.levels;

import com.shatteredpixel.shatteredpixeldungeon.items.Heap;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.watabou.utils.Bundlable;
import com.watabou.utils.Bundle;
import com.watabou.utils.SparseArray;

public class Level implements Bundlable {
	
	//TODO: finish Level class
	
	public static enum Feeling {
		NONE,
		CHASM,
		WATER,
		GRASS
	};
	
	public static final int WIDTH = 32;
	public static final int HEIGHT = 32;
	public static final int LENGTH = WIDTH * HEIGHT;
	
	public SparseArray<Heap> heaps;

	@Override
	public void restoreFromBundle(Bundle bundle) {
		//TODO: finish "Level.restoreFromBundle(Bundle)" method
	}

	@Override
	public void storeInBundle(Bundle bundle) {
		//TODO: finish "Level.storeInBundle(Bundle)" method
	}
	
	public Heap drop(Item item, int cell) {
		//TODO: finish "Level.drop(Item, int)" method
		return null;
	}

}
