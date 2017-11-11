package com.wdfall.vslot_new.config;

import java.util.List;

import com.wdfall.vslot_new.LinePatternList;
import com.wdfall.vslot_new.PayoutTable;
import com.wdfall.vslot_new.Symbol;

public class SlotConfig {

	public int getReelCount() {
		return 3;
	}
	
	public int getReelSymbolCount(int reelIndex) {
		return 3;
	}
	
	public List<List<Symbol>> getReelComposition() {
		return null;
	}
	
	
	public PayoutTable getPayoutTable() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public LinePatternList getLinePattern() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
