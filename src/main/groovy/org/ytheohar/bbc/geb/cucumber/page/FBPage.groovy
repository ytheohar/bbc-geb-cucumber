package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class FBPage extends Page {

	String encodedLink

	static at = {
		driver.currentUrl.contains(encodedLink) ||
		driver.currentUrl.contains(encodedLink.replaceAll("www.bbc.com", "www.bbc.co.uk"))
	}
}
