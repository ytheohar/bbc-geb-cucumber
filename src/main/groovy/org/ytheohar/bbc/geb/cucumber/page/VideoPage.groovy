package org.ytheohar.bbc.geb.cucumber.page

import geb.Page

class VideoPage extends Page {
	String baseUrl

	static at = { player.displayed }

	static content = {
		player { $("div.player-wrapper") }
		fbIcon { $("li.share__tool.share__tool--facebook") }
	}

	/**
	 * Shares this video page on facebook
	 * 
	 * @return the FB page object
	 */
	FBPage shareOnFacebook() {
		fbIcon.click();
		def link = URLEncoder.encode(baseUrl, "UTF-8");
		browser.page(new FBPage(encodedLink:link));
	}
}
