package com.learnJava;

import java.util.List;

public interface Saveable {

	List<String> write();
	List read(List<String> savedValues);
}
