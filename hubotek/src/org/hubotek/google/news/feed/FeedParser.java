package org.hubotek.google.news.feed;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.hubotek.HubotekException;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class FeedParser {

	DocumentBuilderFactory documentBuilderFactory;
	
	public FeedParser(){
		prepare();
	}

	private void prepare() {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
	}
	
	public Document parseFeed (InputSource inputSource)
	{
		try {
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			return documentBuilder.parse(inputSource);
		} catch (Exception e) {
			throw new HubotekException(e);
		}
	}
}
