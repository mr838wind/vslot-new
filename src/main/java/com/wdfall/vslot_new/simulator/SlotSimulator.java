package com.wdfall.vslot_new.simulator;

import java.io.File;

import org.springframework.stereotype.Component;

import com.wdfall.vslot_new.config.SlotConfig;
import com.wdfall.vslot_new.config.SlotConfigLoader;
import com.wdfall.vslot_new.game.SlotGameTotalResult;
import com.wdfall.vslot_new.game.SlotMachine;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SlotSimulator {
	
	SlotConfigLoader slogConfigLoader;
	SlotConfig slotConfig;
	SlotMachine slotMachine;
	
	public void init(File file) {
		slotConfig = slogConfigLoader.loadConfig(file);
		slotMachine.init(slotConfig);
	}
	
	public void start() {
		log.info("{} --> start", "SlotSimulator");
		
		// run game by simulator config
		SlotGameTotalResult totalResult = runSlotMachine();
		
		reportResult(totalResult);
	}

	private SlotGameTotalResult runSlotMachine() {
		
		//by slotConfig
		slotMachine.spin();
		slotMachine.spin();
		
		SlotGameTotalResult totalResult = slotMachine.getTotalResult();
		totalResult.appendTotalResult(totalResult);
		
		return totalResult;
	}
	
	
	public void reportResult(SlotGameTotalResult totalResult) {
		
	}
	
}
