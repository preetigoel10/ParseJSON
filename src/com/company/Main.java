package com.company;


import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.BindException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        System.out.println("Hello world");
        String object ="{\n" +
                "\"key1\" : \"value1\",\n" +
                "\"key2\" :\"value2\"\n" +
                "}\n";
        JSONObject jsonObject = new JSONObject(object);
        System.out.println(jsonObject.get("key1"));
        jsonObject.get("key2");
        jsonObject.put("desc","Sample description");
        System.out.println(jsonObject.get("key1"));

        String sampleXML="<note>\n" +
                "<to>Tove</to>\n" +
                "<from>Jani</from>\n" +
                "<heading>Reminder</heading>\n" +
                "<body>Don't forget me this weekend!</body>\n" +
                "</note>";
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        ByteArrayInputStream is = new ByteArrayInputStream(sampleXML.getBytes());
        DocumentBuilder documentBuilder=factory.newDocumentBuilder();
        Document doc =  documentBuilder.parse(is);
        System.out.println(doc.getElementsByTagName("note").item(0).getTextContent());

    }

    }

