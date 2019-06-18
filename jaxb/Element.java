package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"value1", "value2", "children"})
public class Element {

	@XmlElement(required = false)
	private List<Element> children;
	@XmlElement(name = "v1")
	private String value1;
	@XmlElement(name = "v2")
	private String value2;
	@XmlAttribute
	private int number;
	
	public Element() {
		children = new ArrayList<>();
		number = -1;
	}

	public List<Element> getChildren() {
		return children;
	}

	public void setChildren(List<Element> children) {
		this.children = children;
	}

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Element [children:" + children.size() + ", value1=" + value1 + ", value2=" + value2 + ", number=" + number + "]";
	}
	
}
