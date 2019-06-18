package jaxb;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.bind.JAXBException;

public class JaxbTest {
	
	public static void main(String[] args) throws JAXBException {
		JaxbStore store = new JaxbStore();
//		Element e0 = generate();
		Element e0 = store.read();
		
		e0.getChildren().get(1).getChildren().add(generate());
		store.write(e0);
	}
	
	private static Element generate() {
		Element elem = new Element();
		elem.setValue1("Wert 1");
		elem.setValue2(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
		elem.setNumber(ThreadLocalRandom.current().nextInt(1, 10));
		return elem;
	}
}
