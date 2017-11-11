package com.wdfall.vslot_new;

import com.wdfall.vslot_new.game.SlotGameResult;

public class CheckPayout implements ICheckPayout {

	public SlotGameResult checkPayout(SlotDisplay slotDisplay, LinePatternList linePatternList,
			PayoutTable payoutTable) {
		
		SlotGameResult result = new SlotGameResult();
		
		checkNonScatterPay(slotDisplay, linePatternList, result);
		
		checkScatterPay(result);
		
		return result;
	}

	private void checkScatterPay(SlotGameResult result) {
		// TODO Auto-generated method stub
		
	}

	private void checkNonScatterPay(SlotDisplay slotDisplay, LinePatternList linePatternList, SlotGameResult result) {
		// TODO Auto-generated method stub
		
	}

}
