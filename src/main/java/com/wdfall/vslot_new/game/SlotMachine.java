package com.wdfall.vslot_new.game;

import com.wdfall.vslot_new.ICheckPayout;
import com.wdfall.vslot_new.LinePatternList;
import com.wdfall.vslot_new.PayoutTable;
import com.wdfall.vslot_new.SlotDisplay;
import com.wdfall.vslot_new.SlotDisplayGenerator;
import com.wdfall.vslot_new.config.SlotConfig;

/**
 * SlotMachine
 */
public class SlotMachine {
	
	//
	SlotConfig slotConfig;
	SlotDisplayGenerator slotDisplayGenerator;
	ICheckPayout checkPayout;
	
	//
	SlotDisplay slotDisplay;
	SlotGameTotalResult slotGameTotalResult;
	
	/**
	 * 설정 초기화 
	 * @param slotConfig 
	 */
	public void init(SlotConfig slotConfig){
		this.slotConfig = slotConfig;
		this.slotGameTotalResult = new SlotGameTotalResult();
	}
	
	/**
	 * 게임 한번 실행 
	 */
	public SlotGameResult spin(){
		
		generateSlotDisplay();
		
		SlotGameResult result = checkGameResult();
		
		slotGameTotalResult.appendResult(result);
		
		return result;
	}
	
	private void generateSlotDisplay() {
		slotDisplay = slotDisplayGenerator.generate(slotConfig);
	}
	
	private SlotGameResult checkGameResult() {
		PayoutTable payoutTable = slotConfig.getPayoutTable();
		LinePatternList linePatternList  = slotConfig.getLinePattern();
		
		SlotGameResult gameResult = checkPayout.checkPayout(slotDisplay, linePatternList, payoutTable);
		
		return gameResult;
	}
	

	public SlotGameTotalResult getTotalResult() {
		return slotGameTotalResult;
	}

	
}
