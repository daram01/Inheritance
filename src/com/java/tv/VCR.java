package com.java.tv;

public class VCR {
	boolean power;
	int counter = 0;

	void power() {power = !power;}
	void play() {} // 시작하기
	void stop() {} // 멈추기
	void rew() {} // 뒤로감기
	void ff() {} // 앞으로감기
}
