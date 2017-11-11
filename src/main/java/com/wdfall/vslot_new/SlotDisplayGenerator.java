package com.wdfall.vslot_new;

import java.util.List;

import com.wdfall.vslot_new.config.SlotConfig;

public class SlotDisplayGenerator {

	ReelGenerator reelGenerator;
	
	public SlotDisplay generate(SlotConfig slotConfig){
		SlotDisplay result = new SlotDisplay();
		List<List<Symbol>> reelCompositionList = slotConfig.getReelComposition();
		for(int reelIndex=0; reelIndex<slotConfig.getReelCount(); reelIndex++) {
			List<Symbol> reelComp = reelCompositionList.get(reelIndex);
			int reelSymbolCount = slotConfig.getReelSymbolCount(reelIndex);
			Reel reel = reelGenerator.generateReel(reelComp, reelSymbolCount); 
			result.addReel(reel);
		}
		return result;
	}
	
}
