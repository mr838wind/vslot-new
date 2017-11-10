package com.wdfall.vslot_new.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.wdfall.vslot_new.spring.qualifier.MyTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestObj {
	
	/*
	 * << @Autowired vs @Resource>>
	 * @Resource: 	
	 * 	1. defalut by name 
	 * 	2. 하나일때 by type도 가능 
	 * 	3. 여러개일때 name을 지정
	 * @Autowired: 	
	 * 	1. defalut by type 
	 * 	2. 하나일때 ok
	 * 	3. 여러개일때 @qualifier(by name) 가능.
	 *  4. custom qualifier(@MyTest)를 만들어 쓸수 있다. 
	 * ====================================
	 * 
	 */
	
	
	@Autowired
	//@Resource
	private MySingle testSingle;
	
	@Autowired @MyTest
	//@Autowired @Qualifier("myMultipleB")
	//@Resource(name = "myMultipleA")
	private MyMultiple testMultiple;
	
	
	public void sayHello(String msg) {
		testSingle.call();
		testMultiple.call();
		log.info(" sayHello: {}", msg);
	}
	
	
	public static void main(String[] args) {
		SpringBootstrap.getInstance().getContext().getBean(TestObj.class).sayHello("===sdfsdf===");
		SpringBootstrap.getInstance().close();
	}
	
}


interface MySingle {
	void call();
}

@Slf4j
@Component
class MySingleA implements MySingle {
	@Override
	public void call() {
		log.info("MySingleA");
	}
}


interface MyMultiple {
	void call();
}

@Slf4j
@Component
class MyMultipleA implements MyMultiple {
	@Override
	public void call() {
		log.info("MyMultipleA");
	}
}

@Slf4j
@Component
@MyTest
class MyMultipleB implements MyMultiple {
	@Override
	public void call() {
		log.info("MyMultipleB");
	}
}

