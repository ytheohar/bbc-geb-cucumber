package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class HomePage extends Page {

	static url = "http://www.bbc.co.uk/"

	static at = { latestNews.displayed }

	static content = {
		latestNews { $("a.top-stories__link-title")[0] }
	}

	/**
	 * Selects 'Latest news'
	 *
	 * @return the news page object
	 */
	NewsPage selectLatestNews() {
		latestNews.click();
		browser.page(NewsPage)
	}
}
