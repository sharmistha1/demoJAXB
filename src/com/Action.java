package com;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Action {
String url;
String clazz;
String method;
@XmlAttribute
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@XmlAttribute
public String getClazz() {
	return clazz;
}
public void setClazz(String clazz) {
	this.clazz = clazz;
}
@XmlAttribute
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}


}
