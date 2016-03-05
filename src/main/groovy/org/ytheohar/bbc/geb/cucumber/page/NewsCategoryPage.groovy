package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class NewsCategoryPage extends Page {

	String category

	static at = {
		selectedCategoryLink.text() == category
	}

	static content = {
		selectedCategoryLink { $("li.selected")[0].$("a") }
		firstVideo { $("div.column--secondary").$("div.condor-item.faux-block-link")[0].$("a.title-link") }
	}

	/**
	 * Selects the first video page link on the right hand 'Watch/Listen'
	 * section
	 *
	 * @return the video page object
	 */
	VideoPage selectFirstVideo() {
		String path = firstVideo.@href
		firstVideo.click();
		browser.page(new VideoPage(baseUrl:path))
	}
}
