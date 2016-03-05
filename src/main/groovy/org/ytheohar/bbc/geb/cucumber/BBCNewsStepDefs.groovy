package org.ytheohar.bbc.geb.cucumber

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.*
import geb.Browser
import geb.binding.BindingUpdater

import java.util.concurrent.TimeUnit

import org.ytheohar.bbc.geb.cucumber.page.HomePage
import org.ytheohar.bbc.geb.cucumber.page.NewsPage

def fbPage

Before() {
	bindingUpdater = new BindingUpdater(binding, new Browser())
	bindingUpdater.initialize()
	browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
}

After() { bindingUpdater.remove() }

Given(~/^the user is landed at the home page$/) { -> to HomePage }

When(~/^the user selects 'Latest News'$/) {
	->
	page.selectLatestNews()
	at NewsPage
}

When(~/^the user selects "([^"]*)"$/) {  String category ->
	def newsCategoryPage = page.selectCategory(category)
	at newsCategoryPage
}

When(~/^the user selects the first video on the 'Watch-Listen' section$/) {
	->
	def selectFirstVideo = page.selectFirstVideo()
	at selectFirstVideo
}

When(~/^the user shares the video page on facebook$/) {
	-> fbPage = page.shareOnFacebook()
}

Then(~/^the facebook page loads having a url that includes the video page url$/) { -> at fbPage }

