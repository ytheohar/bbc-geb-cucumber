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

Given(~/^I am on the home page$/) { -> to HomePage }

When(~/^I select 'Latest News'$/) {
	->
	page.selectLatestNews()
	at NewsPage
}

When(~/^I select "([^"]*)"$/) {  String category ->
	def newsCategoryPage = page.selectCategory(category)
	at newsCategoryPage
}

When(~/^I select the first video on the 'Watch-Listen' section$/) {
	->
	def selectFirstVideo = page.selectFirstVideo()
	at selectFirstVideo
}

When(~/^I share the video page on facebook$/) {
	-> fbPage = page.shareOnFacebook()
}

Then(~/^the facebook page loads with the video page url$/) { -> at fbPage }

