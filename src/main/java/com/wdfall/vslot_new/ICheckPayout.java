package com.wdfall.vslot_new;

import com.wdfall.vslot_new.game.SlotGameResult;

public interface ICheckPayout {

	public SlotGameResult checkPayout(SlotDisplay slotDisplay, LinePatternList linePatternList,
			PayoutTable payoutTable);
}
