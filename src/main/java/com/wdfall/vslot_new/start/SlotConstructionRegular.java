package com.wdfall.vslot_new.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wdfall.vslot_new.simulator.SlotSimulator;
import com.wdfall.vslot_new.spring.SpringBootstrap;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SlotConstructionRegular {

	
	@Autowired
	SlotSimulator slotSimulator;

	public void springMain() {
		slotSimulator.start();
	}

	
	
	
	public static void main(String[] args) {
		SpringBootstrap.getInstance().getContext().getBean(SlotConstructionRegular.class).springMain();
		SpringBootstrap.getInstance().close();
	}

}
