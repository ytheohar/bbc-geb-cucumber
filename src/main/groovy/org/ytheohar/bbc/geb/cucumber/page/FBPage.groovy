package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class FBPage extends Page {

	String encodedLink

	static at = { driver.currentUrl.contains(encodedLink) }
}
