package com.rest.xmlparser.processfile.controller;

import com.rest.xmlparser.processfile.modal.CustomerCreditTransfer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Created By Shameera.A on 1/3/2020
 */
@RestController
@RequestMapping(value = "/api/v1/reader")
public class XmlReadController {

    @PostMapping
    public ResponseEntity<CustomerCreditTransfer> convertXml(@RequestParam("file") MultipartFile file) throws Exception {
        String xmlRequest = new String(file.getBytes());
        String parsedXml = extractXmlElement(xmlRequest, "CstmrCdtTrfInitn");
        StringReader sr = new StringReader(parsedXml);
        JAXBContext jaxbContext = JAXBContext.newInstance(CustomerCreditTransfer.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        CustomerCreditTransfer response = (CustomerCreditTransfer) unmarshaller.unmarshal(sr);

        return ResponseEntity.ok(response);
    }

    private String extractXmlElement(String xmlString, String nodeTagNameElement) {
        Document document = Jsoup.parse(xmlString, "", Parser.xmlParser());
        document.outputSettings().prettyPrint(false);
        Elements elementsByTag = document.getElementsByTag(nodeTagNameElement);
        return elementsByTag.toString();
    }
}
