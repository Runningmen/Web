package com.liu.servlet;

public class CheckBean {
String name ;
public void setname(String name){
	this.name =name ;
}
public String getnmae(String name){
	return name ;
}
//��֤name
public boolean isvalidata(){
	if(name ==null||"".equals(name))
		return false ;
	else
		return true ;
}
}
