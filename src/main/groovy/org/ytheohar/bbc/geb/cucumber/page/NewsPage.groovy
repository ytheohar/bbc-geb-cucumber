package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class NewsPage extends Page {

	static url = "http://www.bbc.co.uk/news"

	static at = { news.displayed }

	static content = {
		news { $("#brand").$("svg", "aria-label": "BBC News") }
		categoryLink { title -> $("a.navigation-wide-list__link", text: title) }
	}

	/**
	 * Selects the specified category
	 * 
	 * @param category the category to select
	 * @return the news category page
	 */
	NewsCategoryPage selectCategory(String category) {
		categoryLink(category).click()
		browser.page(new NewsCategoryPage(category: category))
	}
}
