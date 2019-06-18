package jaxb;

import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbStore {
	private static final String path = "jaxb.xml";
	
	public Element read() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Element.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Element read = (Element) unmarshaller.unmarshal(Paths.get(path).toFile());
		return read;
	}
	
	public void write(Element toWrite) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Element.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshaller.marshal(toWrite, Paths.get(path).toFile());
	}
}
