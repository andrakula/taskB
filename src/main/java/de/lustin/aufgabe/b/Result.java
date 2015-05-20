package de.lustin.aufgabe.b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class Result {

	@XmlElement(name = "sum")
	public long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}	
}
