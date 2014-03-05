package com.kaiwalya.scandl

import org.scalatest._;

class ExampleSpec extends FlatSpec{
	"Quandl" can "be constructed with an string apiKey" in {
		val a = new com.kaiwalya.scandl.Quandl("test")
	}
}