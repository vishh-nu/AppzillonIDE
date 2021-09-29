package com.appzillon.performancetest

import io.gatling.core.Predef._
import io.gatling.core.structure.{ChainBuilder, ScenarioBuilder}
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder
import scala.concurrent.duration._

class AppzillonIDE extends Simulation {

  val httpProtocol: HttpProtocolBuilder = http
    .baseUrl("http://appzillon-ide.centralindia.cloudapp.azure.com")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

  val headers_0 = Map("Upgrade-Insecure-Requests" -> "1")

  val headers_1 = Map(
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_2 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Access-Control-Allow-Origin" -> "*",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "authorization" -> "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJmaXZNeVhwR2dxR0FxRl9VM1h4YTBYMXd5STFsTDR1bHNhTWhSaW5tTDFJIn0.eyJleHAiOjE2MzEzNDEwNTcsImlhdCI6MTYzMDkwOTA1NywianRpIjoiZWZkMDY2NmMtNzIyYS00ZGZjLTg0NDMtZjc2ZGM5ZjY5YzI1IiwiaXNzIjoiaHR0cHM6Ly93ZWJpZGUta2V5Y2xvYWsuY2VudHJhbGluZGlhLmNsb3VkYXBwLmF6dXJlLmNvbS9hdXRoL3JlYWxtcy9pLWV4Y2VlZCIsImF1ZCI6ImFjY291bnQiLCJzdWIiOiJhZjQ2MjJiYi0yMmFjLTQ0NTAtOTE0OS02ZDg1ZjkxMmJiNjQiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJ3ZWJpZGUiLCJzZXNzaW9uX3N0YXRlIjoiY2I2ZTQ5ZGYtN2U3Ni00OTJhLTlkYWItM2E4ZmQyOWMxNjdlIiwiYWNyIjoiMSIsImFsbG93ZWQtb3JpZ2lucyI6WyIqIiwiaHR0cDovL2FwcHppbGxvbi1pZGUuY2VudHJhbGluZGlhLmNsb3VkYXBwLmF6dXJlLmNvbSJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFjY291bnQiOnsicm9sZXMiOlsibWFuYWdlLWFjY291bnQiLCJtYW5hZ2UtYWNjb3VudC1saW5rcyIsInZpZXctcHJvZmlsZSJdfX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsImNkYiI6IlFPWTVJcGphNk9mOUJ0ZWhacS9QcHc9PSIsImVtYWlsX3ZlcmlmaWVkIjpmYWxzZSwibmFtZSI6IlZpc2hudSBLIiwicHJlZmVycmVkX3VzZXJuYW1lIjoidmlzaG51LmsyMDIxLTA4LTMxdDEyOjQ3OjE3LjQzNTY2OSIsImdpdmVuX25hbWUiOiJWaXNobnUiLCJmYW1pbHlfbmFtZSI6IksiLCJlbWFpbCI6InZpc2hudS5rQGktZXhjZWVkLmNvbSJ9.ZMfYHvB9346-cREblOhMUUKSe9U8oOiJG7fyxCfUpd61pTCQfzbPtJGcq3wsnU6cMUGyJJK_lH23cMFJLzgAT4ysP8B8VuyeDXSO0hnVJ666xnavO6IAM0dg2Kfp19Ewi0RknqRDqRQQOk7MPXmbIkW7drZaksZu1B_SbedIspREK-dE-Fdek8RGcRkTRGVu9QWmuGW38nVktfvs37OJnufatF23NIdtH-col_moc5cwsPt4ze-cjNisYN633HTuz0ghPJ7YT62sxXWngXcHskVHKJ8jeOwjSatxw4U2to_VQS8Oxx7XcPoS0uOUvFo7pQ6hoxKH-OQbGZIsxjhfGQ",
    "tenant" -> "i-exceed")

  val headers_3 = Map("X-Requested-With" -> "XMLHttpRequest")

  val headers_4 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_5 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8")

  val headers_6 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_7 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:31:29 GMT",
    "If-None-Match" -> """W/"6131f981-22d3"""")

  val headers_8 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-None-Match" -> "11YCV9CTFNCDQVEYVN7SV5I22",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_9 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Access-Control-Request-Headers" -> "authorization,content-type",
    "Access-Control-Request-Method" -> "GET",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_10 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-None-Match" -> "55Y9NJ8KPHXBYKK70C2DNR4VE",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_11 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 05:01:19 GMT",
    "If-None-Match" -> "6136f21f-267")

  val headers_12 = Map(
    "If-None-Match" -> "7GIT7UVK7V79G0Y4G682DMJFK",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "content-type" -> "application/json")

  val headers_13 = Map(
    "Accept" -> "*/*",
    "Access-Control-Request-Headers" -> "authorization,content-type",
    "Access-Control-Request-Method" -> "GET",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "Sec-Fetch-Mode" -> "cors")

  val headers_14 = Map(
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "content-type" -> "application/json")

  val headers_15 = Map(
    "If-None-Match" -> "9F6F2J8NWOXU3Z9323FCD4WKK",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "content-type" -> "application/json")

  val headers_16 = Map(
    "If-None-Match" -> "7F7VNIED8KLWK38CNYNQ80HCN",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "content-type" -> "application/json")

  val headers_25 = Map("Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com")

  val headers_26 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 05:01:09 GMT",
    "If-None-Match" -> "6136f215-300")

  val headers_27 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:59:37 GMT",
    "If-None-Match" -> "6136f1b9-50d3")

  val headers_28 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:59 GMT",
    "If-None-Match" -> "6136f11b-88a")

  val headers_29 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:16 GMT",
    "If-None-Match" -> "6136f12c-4f6")

  val headers_30 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:54:01 GMT",
    "If-None-Match" -> """W/"6136f069-22d3"""")

  val headers_31 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:27 GMT",
    "If-None-Match" -> """W/"6136f0bf-670"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_32 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:20 GMT",
    "If-None-Match" -> "6136f0f4-29f6",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_33 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:14 GMT",
    "If-None-Match" -> "6136f12a-c3e")

  val headers_34 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:17 GMT",
    "If-None-Match" -> "6136f12d-146b")

  val headers_35 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:59 GMT",
    "If-None-Match" -> "6136f11b-d7f")

  val headers_36 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:17 GMT",
    "If-None-Match" -> "6136f12d-a29")

  val headers_37 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:11 GMT",
    "If-None-Match" -> "6136f127-7d2")

  val headers_38 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:58 GMT",
    "If-None-Match" -> "6136f11a-3a7a")

  val headers_39 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:22 GMT",
    "If-None-Match" -> "6136f132-5bd")

  val headers_40 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:16 GMT",
    "If-None-Match" -> "6136f12c-95e")

  val headers_41 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:13 GMT",
    "If-None-Match" -> "6136f129-a70")

  val headers_42 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:28 GMT",
    "If-None-Match" -> "6136f138-1e17")

  val headers_43 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:50 GMT",
    "If-None-Match" -> "6136f112-96a")

  val headers_44 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:30 GMT",
    "If-None-Match" -> "6136f13a-b12")

  val headers_45 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:54 GMT",
    "If-None-Match" -> "6136f116-1275")

  val headers_46 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:18 GMT",
    "If-None-Match" -> "6136f12e-c35")

  val headers_47 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:24 GMT",
    "If-None-Match" -> "6136f134-fe1")

  val headers_48 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:55 GMT",
    "If-None-Match" -> "6136f117-29a")

  val headers_49 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:27 GMT",
    "If-None-Match" -> "6136f137-1457")

  val headers_50 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:59 GMT",
    "If-None-Match" -> "6136f11b-104f")

  val headers_51 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:11 GMT",
    "If-None-Match" -> "6136f127-9b5")

  val headers_52 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:47 GMT",
    "If-None-Match" -> "6136f10f-f06")

  val headers_53 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:30 GMT",
    "If-None-Match" -> "6136f0c2-11e9")

  val headers_54 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:21 GMT",
    "If-None-Match" -> "6136f131-1185")

  val headers_55 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:15 GMT",
    "If-None-Match" -> "6136f12b-109a")

  val headers_56 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:47 GMT",
    "If-None-Match" -> "6136f10f-1135")

  val headers_57 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:25 GMT",
    "If-None-Match" -> "6136f135-b2c")

  val headers_58 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:11 GMT",
    "If-None-Match" -> "6136f127-fc9")

  val headers_59 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:23 GMT",
    "If-None-Match" -> "6136f133-1054")

  val headers_60 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:20 GMT",
    "If-None-Match" -> "6136f130-c23")

  val headers_61 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:01 GMT",
    "If-None-Match" -> "6136f11d-b3a")

  val headers_62 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:49 GMT",
    "If-None-Match" -> "6136f111-dbc")

  val headers_63 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:07 GMT",
    "If-None-Match" -> "6136f123-d95")

  val headers_64 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:08 GMT",
    "If-None-Match" -> "6136f124-edb")

  val headers_65 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:29 GMT",
    "If-None-Match" -> "6136f139-136d")

  val headers_67 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:00 GMT",
    "If-None-Match" -> "6136f11c-e93")

  val headers_68 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:11 GMT",
    "If-None-Match" -> "6136f127-cec")

  val headers_69 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:50 GMT",
    "If-None-Match" -> "6136f112-1052")

  val headers_70 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:18 GMT",
    "If-None-Match" -> "6136f12e-e32")

  val headers_71 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:03 GMT",
    "If-None-Match" -> "6136f11f-f7d")

  val headers_72 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:05 GMT",
    "If-None-Match" -> "6136f121-bfe")

  val headers_73 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:24 GMT",
    "If-None-Match" -> "6136f134-c02")

  val headers_74 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:00 GMT",
    "If-None-Match" -> "6136f11c-e92")

  val headers_75 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:12 GMT",
    "If-None-Match" -> "6136f128-ee7")

  val headers_76 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:02 GMT",
    "If-None-Match" -> "6136f11e-ce9")

  val headers_77 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:16 GMT",
    "If-None-Match" -> "6136f12c-e92")

  val headers_78 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:29 GMT",
    "If-None-Match" -> "6136f139-1802")

  val headers_79 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:26 GMT",
    "If-None-Match" -> "6136f136-d4f")

  val headers_80 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:28 GMT",
    "If-None-Match" -> "6136f138-133c")

  val headers_81 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:30 GMT",
    "If-None-Match" -> "6136f13a-150d")

  val headers_82 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:53 GMT",
    "If-None-Match" -> "6136f115-e84")


  val headers_83 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:39 GMT",
    "If-None-Match" -> """W/"6136f0cb-2667"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_84 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:15 GMT",
    "If-None-Match" -> "6136f12b-33b")

  val headers_85 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:03 GMT",
    "If-None-Match" -> "6136f11f-7d8")

  val headers_86 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:09 GMT",
    "If-None-Match" -> "6136f125-53e")

  val headers_87 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:21 GMT",
    "If-None-Match" -> """W/"6136f0f5-4143"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_88 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:24 GMT",
    "If-None-Match" -> "6136f134-d8")

  val headers_89 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:48 GMT",
    "If-None-Match" -> "6136f110-d4")

  val headers_90 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:32 GMT",
    "If-None-Match" -> """W/"6136f0c4-33f3"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_91 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:13 GMT",
    "If-None-Match" -> """W/"6136f0ed-37a6"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_92 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:13 GMT",
    "If-None-Match" -> """W/"6136f0ed-dde"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_93 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:37 GMT",
    "If-None-Match" -> """W/"6136f0c9-1c69"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_94 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:38 GMT",
    "If-None-Match" -> """W/"6136f0ca-20b4"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_95 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:19 GMT",
    "If-None-Match" -> """W/"6136f0f3-56e0"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_96 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:19 GMT",
    "If-None-Match" -> "6136f12f-86")

  val headers_97 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:19 GMT",
    "If-None-Match" -> """W/"6136f0f3-d98"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_98 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:42 GMT",
    "If-None-Match" -> """W/"6136f0ce-11a4"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_99 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:01 GMT",
    "If-None-Match" -> """W/"6136f0e1-4b67"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_100 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:53 GMT",
    "If-None-Match" -> """W/"6136f0d9-17c2"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_101 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:58 GMT",
    "If-None-Match" -> """W/"6136f0de-1e6e"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_102 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:56:03 GMT",
    "If-None-Match" -> """W/"6136f0e3-1ed8"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_103 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:15 GMT",
    "If-None-Match" -> "6136f12b-117e")

  val headers_104 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:57:20 GMT",
    "If-None-Match" -> "6136f130-f7c")

  val headers_105 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Tue, 07 Sep 2021 04:55:37 GMT",
    "If-None-Match" -> """W/"6136f0c9-1c4d"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_106 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:13 GMT",
    "If-None-Match" -> """W/"6131f9ad-3cf7"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_107 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:38 GMT",
    "If-None-Match" -> "6131f9c6-7e0")

  val headers_108 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:08 GMT",
    "If-None-Match" -> """W/"6131f9a8-3bd1"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_109 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:14 GMT",
    "If-None-Match" -> """W/"6131f9ae-3143"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_110 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:12 GMT",
    "If-None-Match" -> """W/"6131f9ac-3855"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_111 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:11 GMT",
    "If-None-Match" -> """W/"6131f9ab-9907"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_112 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:10 GMT",
    "If-None-Match" -> """W/"6131f9aa-70a8"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_113 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:11 GMT",
    "If-None-Match" -> """W/"6131f9ab-421f"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_114 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:13 GMT",
    "If-None-Match" -> """W/"6131f9ad-30e7"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_115 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:11 GMT",
    "If-None-Match" -> """W/"6131f9ab-4aef"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_116 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:09 GMT",
    "If-None-Match" -> """W/"6131f9a9-3f69"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_117 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:07 GMT",
    "If-None-Match" -> """W/"6131f9a7-4c4a"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_118 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:08 GMT",
    "If-None-Match" -> """W/"6131f9a8-9258"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_119 = Map(
    "Accept" -> "text/plain, */*; q=0.01",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "If-Modified-Since" -> "Fri, 03 Sep 2021 10:32:08 GMT",
    "If-None-Match" -> """W/"6131f9a8-4a4f"""",
    "X-Requested-With" -> "XMLHttpRequest")

  val headers_208 = Map(
    "Accept" -> "application/json, text/plain, */*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "Content-Type" -> "application/json;charset=UTF-8",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com")

  val headers_210 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_211 = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com")

  val headers_212 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "E1VHPD3MYD2DDMQDLKERAIJOU",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_213 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "938ZBCKPPYRXY76HO5B20M214",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_219 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "7GWRLO4HXQK5M6D212XKSDS2E",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_220 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "69IVD5YKNH8KJNFUR0DWH6NJ7",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_221 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "6VGTEAU012H6V38UBJULUPCY3",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_222 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "AV9TLG5AU83W567G7U6Z7M961",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val headers_223 = Map(
    "Accept-Encoding" -> "gzip, deflate",
    "Accept-Language" -> "en-GB,en;q=0.9",
    "If-None-Match" -> "BQI1567IVEDSEL7904GBI7IQ4",
    "Origin" -> "http://appzillon-ide.centralindia.cloudapp.azure.com",
    "accept" -> "application/json",
    "content-type" -> "application/json")

  val uri1 = "http://webide-service.centralindia.cloudapp.azure.com/api/api/v1/appzillon/user/authenticate"
  val uri2 = "http://appzillon-ide.centralindia.cloudapp.azure.com"
  val uri3 = "http://devworkspace.centralindia.cloudapp.azure.com:5984/userdb-766973686e752e6b2d692d6578636565642e636f6d"
  val uri4 = "https://cdn.jsdelivr.net/npm/ace-builds@1.4.3/src-noconflict/worker-javascript.js"
  val uri5 = "http://devworkspace.centralindia.cloudapp.azure.com:5984"

    def LaunchPage(): ChainBuilder = {
      exec(http("request_1")
        .get("/")
        .headers(headers_0)
        .resources(http("request_3")
            .get("/Designer/Js/undomanager.js"),
          http("request_4")
            .get("/Scripts/require.js"),
          http("request_5")
            .get("/Editors/css/editor.css"),
          http("request_6")
            .get("/Editors/css/appzilloneditor.css"),
          http("request_7")
            .get("/Editors/css/designerapzillon.css"),
          http("request_8")
            .get("/Editors/css/style.css"),
          http("request_9")
            .get("/Designer/JQuery/Css/jquery-ui.css"),
          http("request_10")
            .get("/Designer/JQuery/Css/jquery.treeview.css"),
          http("request_11")
            .get("/Designer/JQuery/Css/jquery.contextmenu.css"),
          http("request_12")
            .get("/Designer/JQuery/Css/jalert.css"),
          http("request_13")
            .get("/styles/dataTable.css"),
          http("request_14")
            .get("/styles/Designer/designerapzillon.css"),
          http("request_15")
            .get("/static/css/main.f4d0568e.chunk.css"),
          http("request_16")
            .get("/Designer/DesignerUtils.js"),
          http("request_17")
            .get("/Editors/chartstyleeditor.js"),
          http("request_18")
            .get("/Scripts/jquery.js"),
          http("request_19")
            .get("/Editors/js/c3/d3.v5.min.js"),
          http("request_20")
            .get("/Scripts/jquery-ui.js"),
          http("request_21")
            .get("/static/js/main.597d7e7d.chunk.js"),
          http("request_22")
            .get("/styles/themes/appzillon/css/appzillon.css"),
          http("request_23")
            .get("/static/js/179.f84c7fe6.chunk.js")))
        .exec(http("request_24")
          .get("/static/media/bg_image.52123ed3.jpg")
          .resources(http("request_25")
            .get("/styles/fonts/roboto/roboto-regular-webfont.woff2")
            .headers(headers_25),
            http("request_26")
              .get("/styles/fonts/roboto/roboto-medium-webfont.woff2")
              .headers(headers_25),
            http("request_27")
              .get("/Designer/Js/jquery.touchSwipe.min.js"),
            http("request_28")
              .get("/Designer/Js/uibase.js"),
            http("request_29")
              .get("/Designer/Js/carousel.js"),
            http("request_30")
              .get("/Designer/Js/heightutils.js"),
            http("request_31")
              .get("/Designer/Js/jquery.alerts.js"),
            http("request_32")
              .get("/Designer/Js/swiper.min.js"),
            http("request_33")
              .get("/Designer/Js/jquery-migrate-1.2.1.min.js"),
            http("request_34")
              .get("/Designer/Js/modal.js"),
            http("request_35")
              .get("/Designer/Js/popover.js"),
            http("request_36")
              .get("/Designer/Js/alertify.js"),
            http("request_37")
              .get("/Designer/JQuery/Js/jsl.js"),
            http("request_38")
              .get("/Designer/Standalone/standalone.js"),
            http("request_39")
              .get("/Editors/js/ChartStyle.js"),
            http("request_40")
              .get("/Designer/Js/select2.min.js"),
            http("request_41")
              .get("/Designer/JQuery/Js/jquery.treeview.js"),
            http("request_42")
              .get("/Designer/JQuery/Js/jquery.contextmenu.js"),
            http("request_43")
              .get("/Scripts/jquery.dataTables.min.js"),
            http("request_44")
              .get("/Editors/js/jscolor.js"),
            http("request_45")
              .get("/Editors/js/c3/c3.min.js"),
            http("request_46")
              .get("/Editors/js/c3/c3chart.js"),
            http("request_47")
              .get("/Editors/js/c3/c3Visual.js"),
            http("request_48")
              .get("/Editors/js/FusionCharts/FusionCharts.js"),
            http("request_49")
              .get("/Editors/js/Charts/Column2D.js"),
            http("request_50")
              .get("/Editors/js/Charts/Column3D.js"),
            http("request_51")
              .get("/Editors/js/Charts/Area2D.js"),
            http("request_52")
              .get("/Editors/js/Charts/Doughnut2D.js"),
            http("request_53")
              .get("/Editors/js/Charts/Doughnut3D.js"),
            http("request_54")
              .get("/Editors/js/Charts/Bar2D.js"),
            http("request_55")
              .get("/Editors/js/Charts/Pie2D.js"),
            http("request_56")
              .get("/Editors/js/Charts/Pie3D.js"),
            http("request_57")
              .get("/Editors/js/Charts/Line.js"),
            http("request_58")
              .get("/Editors/js/Charts/Pareto2D.js"),
            http("request_59")
              .get("/Editors/js/Charts/Pareto3D.js"),
            http("request_60")
              .get("/Editors/js/Charts/MSColumn2D.js"),
            http("request_61")
              .get("/Editors/js/Charts/MSColumn3D.js"),
            http("request_62")
              .get("/Editors/js/Charts/MSLine.js"),
            http("request_63")
              .get("/Editors/js/Charts/ZoomLine.js"),
            http("request_64")
              .get("/Editors/js/Charts/MSArea.js"),
            http("request_65")
              .get("/Editors/js/Charts/MSBar3D.js"),
            http("request_66")
              .get("/Editors/js/Charts/Marimekko.js"),
            http("request_67")
              .get("/Editors/js/Charts/StackedColumn2D.js"),
            http("request_68")
              .get("/Editors/js/Charts/StackedColumn3D.js"),
            http("request_69")
              .get("/Editors/js/Charts/StackedArea2D.js"),
            http("request_70")
              .get("/Editors/js/Charts/StackedBar2D.js"),
            http("request_71")
              .get("/Editors/js/Charts/StackedBar3D.js"),
            http("request_72")
              .get("/Editors/js/Charts/MSStackedColumn2D.js"),
            http("request_73")
              .get("/Editors/js/Charts/Scatter.js"),
            http("request_74")
              .get("/Editors/js/Charts/Bubble.js"),
            http("request_75")
              .get("/Editors/js/Charts/ScrollColumn2D.js"),
            http("request_76")
              .get("/Editors/js/Charts/ScrollLine2D.js"),
            http("request_77")
              .get("/Editors/js/Charts/ScrollArea2D.js"),
            http("request_78")
              .get("/Editors/js/Charts/ScrollStackedColumn2D.js"),
            http("request_79")
              .get("/Editors/js/Charts/ScrollCombi2D.js"),
            http("request_80")
              .get("/Editors/js/Charts/MSCombi3D.js"),
            http("request_81")
              .get("/Editors/js/Charts/ScrollCombiDY2D.js"),
            http("request_82")
              .get("/Editors/js/Charts/MSCombi2D.js"),
            http("request_83")
              .get("/Editors/js/Charts/MSColumnLine3D.js"),
            http("request_84")
              .get("/Editors/js/Charts/StackedColumn2DLine.js"),
            http("request_85")
              .get("/Editors/js/Charts/StackedColumn3DLine.js"),
            http("request_86")
              .get("/Editors/js/Charts/MSColumn3DLineDY.js"),
            http("request_87")
              .get("/Editors/js/Charts/StackedColumn3DLineDY.js"),
            http("request_88")
              .get("/Editors/js/Charts/MSCombiDY2D.js"),
            http("request_89")
              .get("/Editors/js/Charts/MSStackedColumn2DLineDY.js"),
            http("request_90")
              .get("/Editors/js/Charts/LogMSColumn2D.js"),
            http("request_91")
              .get("/Editors/js/Charts/LogMSLine.js"),
            http("request_92")
              .get("/Editors/js/Charts/Spline.js"),
            http("request_93")
              .get("/Editors/js/Charts/SplineArea.js"),
            http("request_94")
              .get("/Editors/js/Charts/MSSpline.js"),
            http("request_95")
              .get("/Editors/js/Charts/MSSplineArea.js"),
            http("request_96")
              .get("/Editors/js/Charts/ErrorBar2D.js"),
            http("request_97")
              .get("/Editors/js/Charts/ErrorLine.js"),
            http("request_98")
              .get("/Editors/js/Charts/ErrorScatter.js"),
            http("request_99")
              .get("/Editors/js/Charts/InverseMSArea.js"),
            http("request_100")
              .get("/Editors/js/Charts/InverseMSColumn2D.js"),
            http("request_101")
              .get("/Editors/js/Charts/InverseMSLine.js"),
            http("request_102")
              .get("/Editors/js/Charts/DragColumn2D.js"),
            http("request_103")
              .get("/Editors/js/Charts/DragLine.js"),
            http("request_104")
              .get("/Editors/js/Charts/DragArea.js"),
            http("request_105")
              .get("/Editors/js/Charts/Radar.js"),
            http("request_106")
              .get("/Editors/js/Charts/HeatMap.js"),
            http("request_107")
              .get("/Editors/js/Charts/BoxAndWhisker2D.js"),
            http("request_108")
              .get("/Editors/js/Charts/CandleStick.js"),
            http("request_109")
              .get("/Editors/js/Charts/DragNode.js"),
            http("request_110")
              .get("/Editors/js/Charts/MSStepLine.js"),
            http("request_111")
              .get("/Editors/js/Charts/MultiAxisLine.js"),
            http("request_112")
              .get("/Editors/js/Charts/MultiLevelPie.js"),
            http("request_113")
              .get("/Editors/js/Charts/SelectScatter.js"),
            http("request_114")
              .get("/Editors/js/Charts/Waterfall2D.js"),
            http("request_115")
              .get("/Editors/js/Charts/Pyramid.js"),
            http("request_116")
              .get("/Editors/js/Charts/Kagi.js"),
            http("request_117")
              .get("/Editors/js/Charts/Funnel.js"),
            http("request_118")
              .get("/Editors/js/Charts/SparkColumn.js"),
            http("request_119")
              .get("/Editors/js/Charts/SparkLine.js"),
            http("request_120")
              .get("/Editors/js/Charts/SparkWinLoss.js"),
            http("request_121")
              .get("/Editors/js/Charts/SSGrid.js"),
            http("request_122")
              .get("/Editors/js/Charts/Area2DC3.js"),
            http("request_123")
              .get("/Editors/js/Charts/Bar2DC3.js"),
            http("request_124")
              .get("/Editors/js/Charts/Column2DC3.js"),
            http("request_125")
              .get("/Editors/js/Charts/LineC3.js"),
            http("request_126")
              .get("/Editors/js/Charts/Pie2DC3.js"),
            http("request_127")
              .get("/Editors/js/Charts/MSAreaC3.js"),
            http("request_128")
              .get("/Editors/js/Charts/Doughnut2DC3.js"),
            http("request_129")
              .get("/Editors/js/Charts/MSBar2DC3.js"),
            http("request_130")
              .get("/Editors/js/Charts/MSColumn2DC3.js"),
            http("request_131")
              .get("/Editors/js/Charts/MSLineC3.js"),
            http("request_132")
              .get("/Editors/js/Charts/SplineC3.js"),
            http("request_133")
              .get("/Editors/js/helpers.js"),
            http("request_134")
              .get("/Editors/js/appzilloneditor.js"),
            http("request_135")
              .get("/Editors/js/jsl.format.js"),
            http("request_136")
              .get("/Designer/Appzillon/Js/designer.js"),
            http("request_137")
              .get("/Editors/ace/src-noconflict/ace.js"),
            http("request_138")
              .get("/Designer/Appzillon/Js/utils.js"),
            http("request_139")
              .get("/Designer/Appzillon/Js/bridge.js"),
            http("request_140")
              .get("/Designer/Appzillon/Js/data.js"),
            http("request_141")
              .get("/Designer/Appzillon/Js/widgets.js"),
            http("request_142")
              .get("/Designer/Appzillon/Js/layout.js"),
            http("request_143")
              .get("/LayoutTemplates/Js/main.js"),
            http("request_144")
              .get("/Designer/Appzillon/Js/widgetutils.js"),
            http("request_145")
              .get("/LayoutTemplates/Js/bridge.js"),
            http("request_146")
              .get("/LayoutTemplates/Js/template.js"),
            http("request_147")
              .get("/LayoutTemplates/Js/utils.js"),
            http("request_148")
              .get("/Designer/Widgets/portion/body.js"),
            http("request_149")
              .get("/Designer/Widgets/portion/header.js"),
            http("request_150")
              .get("/Designer/Widgets/panel/accordion.js"),
            http("request_151")
              .get("/Designer/Widgets/element/badge/badge.js"),
            http("request_152")
              .get("/Designer/Widgets/container/breadcrumb/breadcrumb.js"),
            http("request_153")
              .get("/Designer/Widgets/element/button/button.js"),
            http("request_154")
              .get("/Designer/Widgets/panel/carousel.js"),
            http("request_155")
              .get("/Designer/Widgets/container/chart/chart.js"),
            http("request_156")
              .get("/Designer/Widgets/element/checkbox/checkbox.js"),
            http("request_157")
              .get("/Designer/Widgets/element/checkboxgroup/checkboxgroup.js"),
            http("request_158")
              .get("/Designer/Widgets/panel/collapsible.js"),
            http("request_159")
              .get("/Designer/Widgets/section/column.js"),
            http("request_160")
              .get("/Designer/Widgets/grid/column.js"),
            http("request_161")
              .get("/Designer/Widgets/section/commoncolumn.js"),
            http("request_162")
              .get("/Designer/Widgets/panelsection/commonpanelsection.js"),
            http("request_163")
              .get("/Designer/Widgets/section/commonrow.js"),
            http("request_164")
              .get("/Designer/Widgets/grid/commoncolumn.js"),
            http("request_165")
              .get("/Designer/Widgets/grid/commonrow.js"),
            http("request_166")
              .get("/Designer/Widgets/container/container/container.js"),
            http("request_167")
              .get("/Designer/Widgets/popup/dialog.js"),
            http("request_168")
              .get("/Designer/Widgets/element/dropdown/dropdown.js"),
            http("request_169")
              .get("/Designer/Widgets/element/dropdownwithinput/dropdownwithinput.js"),
            http("request_170")
              .get("/Designer/Widgets/element/element/element.js"),
            http("request_171")
              .get("/Designer/Widgets/element/filebrowser/filebrowser.js"),
            http("request_172")
              .get("/Designer/Widgets/portion/footer.js"),
            http("request_173")
              .get("/Designer/Widgets/container/form/form.js"),
            http("request_174")
              .get("/Designer/Widgets/element/gauge/gauge.js"),
            http("request_175")
              .get("/Designer/Widgets/container/gauge/gauge.js"),
            http("request_176")
              .get("/Designer/Widgets/element/icon/icon.js"),
            http("request_177")
              .get("/Designer/Widgets/element/image/image.js"),
            http("request_178")
              .get("/Designer/Widgets/element/hyperlink/hyperlink.js"),
            http("request_179")
              .get("/Designer/Widgets/element/inputbox/inputbox.js"),
            http("request_180")
              .get("/Designer/Widgets/element/inputwithbutton/inputwithbutton.js"),
            http("request_181")
              .get("/Designer/Widgets/element/interface/interface.js"),
            http("request_182")
              .get("/Designer/Widgets/element/label/label.js"),
            http("request_183")
              .get("/Designer/Widgets/container/list/list.js"),
            http("request_184")
              .get("/Designer/Widgets/container/menu/menu.js"),
            http("request_185")
              .get("/Designer/Widgets/popup/modal.js"),
            http("request_186")
              .get("/Designer/Widgets/container/navbar/navbar.js"),
            http("request_187")
              .get("/Designer/Widgets/panel/panel/panel.js"),
            http("request_188")
              .get("/Designer/Widgets/panelsection/panelsection.js"),
            http("request_189")
              .get("/Designer/Widgets/popup/popover.js"),
            http("request_190")
              .get("/Designer/Widgets/popup/popup/popup.js"),
            http("request_191")
              .get("/Designer/Widgets/portion/portion/portion.js"),
            http("request_192")
              .get("/Designer/Widgets/element/progressbar/progressbar.js"),
            http("request_193")
              .get("/Designer/Widgets/element/radio/radio.js"),
            http("request_194")
              .get("/Designer/Widgets/section/row.js"),
            http("request_195")
              .get("/Designer/Widgets/grid/row.js"),
            http("request_196")
              .get("/Designer/Widgets/portion/sidebar.js"),
            http("request_197")
              .get("/Designer/Widgets/panel/simple.js"),
            http("request_198")
              .get("/Designer/Widgets/element/slider/slider.js"),
            http("request_199")
              .get("/Designer/Widgets/element/stepper/stepper.js"),
            http("request_200")
              .get("/Designer/Widgets/panel/tab.js"),
            http("request_201")
              .get("/Designer/Widgets/container/table/table.js"),
            http("request_202")
              .get("/Designer/Widgets/element/tags/tags.js"),
            http("request_203")
              .get("/Designer/Widgets/element/text/text.js"),
            http("request_204")
              .get("/Designer/Widgets/element/textarea/textarea.js"),
            http("request_205")
              .get("/Designer/Widgets/element/toggleswitch/toggleswitch.js"),
            http("request_206")
              .get("/Designer/Widgets/childscreen/cf.js"),
            http("request_207")
              .get("/favicon.ico")))
    }

      def LoginPage(): ChainBuilder = {
        exec(http("request_208")
          .post(uri1 + "/")
          .headers(headers_208)
          .body(RawFileBody("bodies/0208_request.json"))
          .resources(http("request_209")
            .get("/static/media/splashLoader.d9ad6f31.png"),
            http("request_210")
              .get(uri5 + "/apz_default/")
              .headers(headers_210)
              .basicAuth("apzdefault", "apzdefaultpwd"),
            http("request_211")
              .get(uri5 + "/")
              .headers(headers_211)
              .basicAuth("apzdefault", "apzdefaultpwd"),
            http("request_212")
              .get(uri5 + "/apz_default/_local/sBbgLQuufzfT6NNLG6DD3Q%3D%3D?")
              .headers(headers_212)
              .basicAuth("apzdefault", "apzdefaultpwd"),
            http("request_213")
              .get(uri5 + "/apz_default/_changes?style=all_docs&since=29-g1AAAACbeJzLYWBgYMpgTmEQTM4vTc5ISXIwNDLXMwBCwxyQVCJDUv3___-zMpgTeXKBAuwGhoYGqYlm2DTgMSaPBUgyNACp_1DTBMGmGSWbGxulJGPTlwUAFRsoWQ&limit=100")
              .headers(headers_213)
              .basicAuth("apzdefault", "apzdefaultpwd"),
            http("request_214")
              .get(uri5 + "/apz_default/_local/sBbgLQuufzfT6NNLG6DD3Q%3D%3D?")
              .headers(headers_212)
              .basicAuth("apzdefault", "apzdefaultpwd"),
            http("request_215")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/")
              .headers(headers_210)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_216")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/")
              .headers(headers_210)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_217")
              .get(uri5 + "/")
              .headers(headers_211)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_218")
              .get(uri5 + "/")
              .headers(headers_211)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_219")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/_local/N6q6s6z7KZ2gQCX2OwtbEg%3D%3D?")
              .headers(headers_219)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_220")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/_local/UhB3Z7B5O8XHxtcHrDjx7Q%3D%3D?")
              .headers(headers_220)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_221")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/_changes?style=all_docs&filter=mainAppReplicationDesign%2FmainAppReplicationFilter&type=MAINAPP%2CUSERDATA%2CDevSettings&since=172-g1AAAABPeJzLYWBgYMxgTmEQTM4vTc5ISXIwNDLXMwBCwxygFFMiQx4Lw38gyMpgTlyTCxRiNzUwMTBOTMWmJQsAKvcVHA&limit=4")
              .headers(headers_221)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_222")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/_local/UhB3Z7B5O8XHxtcHrDjx7Q%3D%3D?")
              .headers(headers_222)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_223")
              .get(uri5 + "/userdb-766973686e752e6b2d692d6578636565642e636f6d/_local/N6q6s6z7KZ2gQCX2OwtbEg%3D%3D?")
              .headers(headers_223)
              .basicAuth("vishnu.k-i-exceed.com", "zBNTI83m88"),
            http("request_224")
              .get("/static/media/iexceedLogo.89645c0b.svg"),
            http("request_225")
              .get("/static/media/New.38ea6546.svg"),
            http("request_226")
              .get("/static/media/open.c274888e.svg"),
            http("request_227")
              .get("/static/media/save.ffd72823.svg"),
            http("request_228")
              .get("/static/media/closeAll.0f884b2e.svg"),
            http("request_229")
              .get("/static/media/logs.7de2faf2.svg"),
            http("request_230")
              .get("/static/media/preview.7f116192.svg"),
            http("request_231")
              .get("/static/media/build.bc4ededa.svg"),
            http("request_232")
              .get("/static/media/start.8827fbef.svg"),
            http("request_233")
              .get("/static/media/debug.de508a09.svg"),
            http("request_234")
              .get("/static/media/buildServer.9b2c55b3.svg"),
            http("request_235")
              .get("/static/media/project_explorer.fded2df9.svg"),
            http("request_236")
              .get("/static/media/github.cc555a69.svg"),
            http("request_237")
              .get("/static/media/fullscreen.ceeabb30.svg"),
            http("request_238")
              .get("/static/media/settings.7c11ed72.svg"),
            http("request_239")
              .get("/static/media/dbConnection.291c6982.svg"),
            http("request_240")
              .get("/static/media/view.1fd05892.svg"),
            http("request_241")
              .get("/static/media/switchTheme.12c0b246.svg"),
            http("request_242")
              .get("/static/media/info.3446784f.svg"),
            http("request_243")
              .get("/static/media/userAccount.261a107e.svg")))
      }

        def OpenBaseApp(): ChainBuilder ={
          exec(http("request_0")
            .get("/api/api/v1/appzillon/project/info/MICROAPP?includedesc=Y")
            .headers(headers_2))
            .pause(3)
            .exec(http("request_1")
              .get(uri2 + "/static/media/ProjectTitle.e93d9879.svg")
              .resources(http("request_2")
                .get(uri2 + "/static/media/staticdata.09da1fce.svg"),
                http("request_3")
                  .get(uri2 + "/static/media/osprefs.3ddc0326.svg"),
                http("request_4")
                  .get(uri2 + "/static/media/lovs.2f61b082.svg"),
                http("request_5")
                  .get(uri2 + "/static/media/interfaces.1111fbc5.svg"),
                http("request_6")
                  .get(uri2 + "/static/media/datafile.fc80e3d6.svg"),
                http("request_7")
                  .get(uri2 + "/static/media/themes.641ad704.svg"),
                http("request_8")
                  .get(uri2 + "/static/media/serverprefs.edcc3acb.svg"),
                http("request_9")
                  .get(uri2 + "/static/media/testing.9ba2fafd.svg"),
                http("request_10")
                  .get("/api/api/v1/appzillon/git/info/25539bd98faa760883f7c1ca57059e7e")
                  .headers(headers_0),
                http("request_11")
                  .get(uri2 + "/Editors/css/sqpurple.gif")))
        }

//  def OpenMicroapp()={
//
//  }
//
//  def CreateScreen()={
//
//  }
//
//  def CreateDesign()={
//
//  }

  def DesignsPageSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/portion/header.html")
          .headers(headers_3),
        http("request_5")
          .get("/Designer/Widgets/portion/header.html")
          .headers(headers_3)))
      .pause(5)
      .exec(http("request_6")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_7")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_9")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_10")
            .get("/Designer/Widgets/portion/sidebar.html")
            .headers(headers_3),
          http("request_11")
            .get("/Designer/Widgets/portion/sidebar.html")
            .headers(headers_3),
          http("request_12")
            .get("/Designer/Widgets/panelsection/panelsection.html")
            .headers(headers_3),
          http("request_13")
            .get("/Designer/Widgets/panel/simple.html")
            .headers(headers_3),
          http("request_14")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_15")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_16")
            .get("/Designer/Widgets/section/column.html")
            .headers(headers_3),
          http("request_17")
            .get("/Designer/Widgets/section/row.html")
            .headers(headers_3),
          http("request_18")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_19")
            .get("/Designer/Widgets/element/button/button.html")
            .headers(headers_3),
          http("request_20")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_21")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_22")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(6)
      .exec(http("request_23")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_24")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_25")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_26")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_27")
            .get("/Designer/Widgets/portion/footer.html")
            .headers(headers_3),
          http("request_28")
            .get("/Designer/Widgets/portion/footer.html")
            .headers(headers_3)))
  }

  def DesignsPopupSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/popup/modal.html")
          .headers(headers_4),
        http("request_5")
          .get("/Designer/Widgets/popup/modal.html")
          .headers(headers_3)))
      .pause(2)
      .exec(http("request_6")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_7")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_9")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_10")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_4),
          http("request_11")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_12")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_13")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_14")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_15")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_16")
            .get("/Designer/Widgets/popup/popover.html")
            .headers(headers_4),
          http("request_17")
            .get("/Designer/Widgets/popup/popover.html")
            .headers(headers_3)))
  }

  def DesignsPanelSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(3)
      .exec(http("request_5")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_7")
            .get("/Designer/Widgets/panel/simple.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_8")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_9")
          .get("/Designer/Widgets/panel/tab.html")
          .headers(headers_4),
          http("request_10")
            .get("/Designer/Widgets/panel/tab.html")
            .headers(headers_3),
          http("request_11")
            .get("/styles/Designer/images/plus.png")
            .headers(headers_5)))
      .pause(3)
      .exec(http("request_12")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_13")
          .get("/Designer/Widgets/panel/accordion.html")
          .headers(headers_4),
          http("request_14")
            .get("/Designer/Widgets/panel/accordion.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_15")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_16")
          .get("/Designer/Widgets/panel/carousel.html")
          .headers(headers_4),
          http("request_17")
            .get("/Designer/Widgets/panel/carousel.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_18")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_19")
          .get("/Designer/Widgets/panel/collapsible.html")
          .headers(headers_4),
          http("request_20")
            .get("/Designer/Widgets/panel/collapsible.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_21")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_22")
          .get("/Designer/Widgets/panelsection/panelsection.html")
          .headers(headers_3)))
  }

  def DesignsContainerSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(3)
      .exec(http("request_5")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_7")
            .get("/styles/Designer/images/breadcrumbs.png")
            .headers(headers_5),
          http("request_8")
            .get("/Designer/Widgets/container/breadcrumb/breadcrumb.html")
            .headers(headers_4),
          http("request_9")
            .get("/Designer/Widgets/container/breadcrumb/breadcrumb.html")
            .headers(headers_3)))
      .pause(18)
      .exec(http("request_10")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_11")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_12")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_13")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_14")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_15")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_16")
          .get("/styles/Designer/images/chartsel.png")
          .headers(headers_5),
          http("request_17")
            .get("/Designer/Widgets/section/row.html")
            .headers(headers_3),
          http("request_18")
            .get("/Designer/Widgets/container/chart/chart.html")
            .headers(headers_4),
          http("request_19")
            .get("/Designer/Widgets/container/chart/chart.html")
            .headers(headers_3),
          http("request_20")
            .get("/styles/Designer/images/charts.png")
            .headers(headers_5)))
      .pause(3)
      .exec(http("request_21")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_22")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_23")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_24")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_25")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_26")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_27")
          .get("/styles/Designer/images/formsel.png")
          .headers(headers_5),
          http("request_28")
            .get("/Designer/Widgets/section/row.html")
            .headers(headers_3),
          http("request_29")
            .get("/Designer/Widgets/container/form/form.html")
            .headers(headers_4),
          http("request_30")
            .get("/Designer/Widgets/container/form/form.html")
            .headers(headers_3)))
      .pause(5)
      .exec(http("request_31")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_32")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_33")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_34")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_35")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_36")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_37")
          .get("/styles/Designer/images/gaugesel.png")
          .headers(headers_5),
          http("request_38")
            .get("/Designer/Widgets/section/row.html")
            .headers(headers_3),
          http("request_39")
            .get("/Designer/Widgets/container/gauge/gauge.html")
            .headers(headers_4),
          http("request_40")
            .get("/Designer/Widgets/container/gauge/gauge.html")
            .headers(headers_3)))
      .pause(6)
      .exec(http("request_41")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_42")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_43")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_44")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_45")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(7)
      .exec(http("request_46")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_47")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_48")
            .get("/styles/Designer/images/listsel.png")
            .headers(headers_5),
          http("request_49")
            .get("/Designer/Widgets/container/list/list.html")
            .headers(headers_4),
          http("request_50")
            .get("/Designer/Widgets/container/list/list.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_51")
        .get("/Designer/Widgets/container/menu/menu.html")
        .headers(headers_4)
        .resources(http("request_52")
          .get("/styles/Designer/images/menusel.png")
          .headers(headers_5),
          http("request_53")
            .get("/Designer/Widgets/container/menu/menu.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_54")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_55")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_56")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_57")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_58")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_59")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_60")
            .get("/styles/Designer/images/tablesel.png")
            .headers(headers_5),
          http("request_61")
            .get("/Designer/Widgets/container/table/table.html")
            .headers(headers_4),
          http("request_62")
            .get("/Designer/Widgets/container/table/table.html")
            .headers(headers_3)))
  }

  def DesignsElementSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(4)
      .exec(http("request_5")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_7")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_9")
        .get("/Designer/Widgets/element/badge/badge.html")
        .headers(headers_4)
        .resources(http("request_10")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_11")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_12")
            .get("/Designer/Widgets/element/badge/badge.html")
            .headers(headers_3),
          http("request_13")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_14")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_15")
        .get("/Designer/Widgets/element/button/button.html")
        .headers(headers_3)
        .resources(http("request_16")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_17")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_18")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_19")
            .get("/Designer/Widgets/element/button/button.html")
            .headers(headers_3),
          http("request_20")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_21")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_22")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_23")
        .get("/Designer/Widgets/element/gauge/gauge.html")
        .headers(headers_4)
        .resources(http("request_24")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_25")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_26")
            .get("/Designer/Widgets/element/gauge/gauge.html")
            .headers(headers_3),
          http("request_27")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_28")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_29")
            .get("/src/styles/Designer/images/gauge2.png")
            .headers(headers_5)))
      .pause(3)
      .exec(http("request_30")
        .get("/Designer/Widgets/element/checkbox/checkbox.html")
        .headers(headers_4)
        .resources(http("request_31")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_32")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_33")
            .get("/Designer/Widgets/element/checkbox/checkbox.html")
            .headers(headers_3),
          http("request_34")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_35")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(14)
      .exec(http("request_36")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_37")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_38")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_39")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_40")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(7)
      .exec(http("request_41")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_42")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_43")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_44")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_45")
        .get("/Designer/Widgets/element/dropdown/dropdown.html")
        .headers(headers_4)
        .resources(http("request_46")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_47")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_48")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_49")
            .get("/Designer/Widgets/element/dropdown/dropdown.html")
            .headers(headers_3),
          http("request_50")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_51")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_52")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_53")
        .get("/Designer/Widgets/element/image/image.html")
        .headers(headers_4)
        .resources(http("request_54")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_55")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_56")
            .get("/Designer/Widgets/element/image/image.html")
            .headers(headers_3),
          http("request_57")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_58")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_59")
            .get("/styles/Designer/images/avatar2.png")
            .headers(headers_5)))
      .pause(2)
      .exec(http("request_60")
        .get("/Designer/Widgets/element/hyperlink/hyperlink.html")
        .headers(headers_4)
        .resources(http("request_61")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_62")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_63")
            .get("/Designer/Widgets/element/hyperlink/hyperlink.html")
            .headers(headers_3),
          http("request_64")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_65")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_66")
        .get("/Designer/Widgets/element/icon/icon.html")
        .headers(headers_4)
        .resources(http("request_67")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_68")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_69")
            .get("/Designer/Widgets/element/icon/icon.html")
            .headers(headers_3),
          http("request_70")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_71")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(6)
      .exec(http("request_72")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_73")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_74")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_75")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_76")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_77")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_78")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_79")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_80")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_81")
        .get("/Designer/Widgets/element/filebrowser/filebrowser.html")
        .headers(headers_4)
        .resources(http("request_82")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_83")
            .get("/Designer/Widgets/element/filebrowser/filebrowser.html")
            .headers(headers_3),
          http("request_84")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_85")
        .get("/Designer/Widgets/element/inputbox/inputbox.html")
        .headers(headers_4)
        .resources(http("request_86")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_87")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_88")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_89")
            .get("/Designer/Widgets/element/inputbox/inputbox.html")
            .headers(headers_3),
          http("request_90")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_91")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_92")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_93")
        .get("/Designer/Widgets/element/textarea/textarea.html")
        .headers(headers_4)
        .resources(http("request_94")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_95")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_96")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_97")
            .get("/Designer/Widgets/element/textarea/textarea.html")
            .headers(headers_3),
          http("request_98")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_99")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_100")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_101")
        .get("/Designer/Widgets/element/tags/tags.html")
        .headers(headers_4)
        .resources(http("request_102")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_103")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_104")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_105")
            .get("/Designer/Widgets/element/tags/tags.html")
            .headers(headers_3),
          http("request_106")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_107")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_108")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_109")
        .get("/Designer/Widgets/element/label/label.html")
        .headers(headers_4)
        .resources(http("request_110")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_111")
            .get("/Designer/Widgets/element/label/label.html")
            .headers(headers_3),
          http("request_112")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_113")
        .get("/Designer/Widgets/element/radio/radio.html")
        .headers(headers_4)
        .resources(http("request_114")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_115")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_116")
            .get("/Designer/Widgets/element/radio/radio.html")
            .headers(headers_3),
          http("request_117")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_118")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_119")
        .get("/Designer/Widgets/element/progressbar/progressbar.html")
        .headers(headers_4)
        .resources(http("request_120")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_121")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_122")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_123")
            .get("/Designer/Widgets/element/progressbar/progressbar.html")
            .headers(headers_3),
          http("request_124")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_125")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_126")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_127")
        .get("/Designer/Widgets/element/slider/slider.html")
        .headers(headers_4)
        .resources(http("request_128")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_129")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_130")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_131")
            .get("/Designer/Widgets/element/slider/slider.html")
            .headers(headers_3),
          http("request_132")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_133")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_134")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_135")
        .get("/Designer/Widgets/element/text/text.html")
        .headers(headers_4)
        .resources(http("request_136")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_137")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_138")
            .get("/Designer/Widgets/element/text/text.html")
            .headers(headers_3),
          http("request_139")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_140")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_141")
        .get("/Designer/Widgets/element/toggleswitch/toggleswitch.html")
        .headers(headers_4)
        .resources(http("request_142")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_143")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_144")
            .get("/Designer/Widgets/element/toggleswitch/toggleswitch.html")
            .headers(headers_3),
          http("request_145")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_146")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(6)
      .exec(http("request_147")
        .get("/Designer/Widgets/element/inputwithbutton/inputwithbutton.html")
        .headers(headers_4)
        .resources(http("request_148")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_149")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_150")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_151")
            .get("/Designer/Widgets/element/inputwithbutton/inputwithbutton.html")
            .headers(headers_3),
          http("request_152")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_153")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_3),
          http("request_154")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
      .pause(9)
      .exec(http("request_155")
        .get("/Designer/Widgets/element/stepper/stepper.html")
        .headers(headers_4)
        .resources(http("request_156")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_3),
          http("request_157")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3),
          http("request_158")
            .get("/Designer/Widgets/element/stepper/stepper.html")
            .headers(headers_3),
          http("request_159")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_3),
          http("request_160")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_3)))
  }

  def DesignsLayoutSection(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
  }

//  def ProjectProperties()={
//
//  }

  def BodyProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/src/styles/Designer/images/arrow-u.png")
      .resources(http("request_1")
        .get("/src/styles/Designer/images/arrow-d.png"),
        http("request_2")
          .get("/src/styles/Designer/images/remove-icon-small.png"),
        http("request_3")
          .get("/Designer/Html/icons.html")
          .headers(headers_6)))
      .pause(1)
      .exec(http("request_4")
        .get("/Designer/Widgets/widgets.data")
        .headers(headers_6)
        .resources(http("request_5")
          .get("/Designer/Appzillon/Js/loadworker.js"),
          http("request_6")
            .get("/Designer/Html/icons.html")
            .headers(headers_6),
          http("request_7")
            .get("/Designer/Widgets/portion/body.html")
            .headers(headers_6)))
      .pause(23)
      .exec(http("request_8")
        .get("/Editors/js/arrow.gif")
        .resources(http("request_9")
          .get("/Editors/js/cross.gif"),
          http("request_10")
            .get("/Editors/css/img/hs.png")
            .headers(headers_5),
          http("request_11")
            .get("/styles/Designer/designerapzillon.css")))
      .pause(21)
      .exec(http("request_12")
        .get("/Designer/JQuery/Css/images/ui-bg_flat_75_ffffff_40x100.png")
        .headers(headers_7)
        .resources(http("request_13")
          .get("/Designer/JQuery/Css/images/ui-bg_glass_65_ffffff_1x400.png")
          .headers(headers_5)))
  }

  def PageSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/static/media/layout.8ddd76ee.svg")
      .headers(headers_26))
      .pause(4)
      .exec(http("request_1")
        .get("/static/js/44.89c5f8bb.chunk.js")
        .headers(headers_27)
        .resources(http("request_2")
          .get("/styles/Designer/images/undo.svg")
          .headers(headers_28),
          http("request_3")
            .get("/styles/Designer/images/redo.svg")
            .headers(headers_29),
          http("request_4")
            .get("/src/styles/Designer/images/arrow-u.png")
            .headers(headers_30),
          http("request_5")
            .get("/src/styles/Designer/images/arrow-d.png")
            .headers(headers_30),
          http("request_6")
            .get("/src/styles/Designer/images/remove-icon-small.png")
            .headers(headers_30),
          http("request_7")
            .get("/Designer/Html/icons.html")
            .headers(headers_31)))
      .pause(1)
      .exec(http("request_8")
        .get("/Designer/Widgets/widgets.data")
        .headers(headers_32)
        .resources(http("request_9")
          .get("/styles/Designer/images/icon-hierarchymodel.svg")
          .headers(headers_33),
          http("request_10")
            .get("/styles/Designer/images/icon-layoutdesignermo.svg")
            .headers(headers_34),
          http("request_11")
            .get("/styles/Designer/images/icon-businessmodel.svg")
            .headers(headers_35),
          http("request_12")
            .get("/styles/Designer/images/subnav-arrow2.svg")
            .headers(headers_36),
          http("request_13")
            .get("/styles/Designer/images/subnav-arrow.svg")
            .headers(headers_37),
          http("request_14")
            .get("/styles/Designer/images/subnav1.png")
            .headers(headers_38),
          http("request_15")
            .get("/styles/Designer/images/prop_uarrow.svg")
            .headers(headers_39),
          http("request_16")
            .get("/styles/Designer/images/header.svg")
            .headers(headers_40),
          http("request_17")
            .get("/Editors/css/images/tab-unsel.png")
            .headers(headers_4),
          http("request_18")
            .get("/styles/Designer/images/sidebar.svg")
            .headers(headers_41),
          http("request_19")
            .get("/styles/Designer/images/modal.svg")
            .headers(headers_42),
          http("request_20")
            .get("/styles/Designer/images/footer.svg")
            .headers(headers_43),
          http("request_21")
            .get("/styles/Designer/images/dialog.svg")
            .headers(headers_44),
          http("request_22")
            .get("/styles/Designer/images/contextmenu.svg")
            .headers(headers_45),
          http("request_23")
            .get("/styles/Designer/images/row.svg")
            .headers(headers_46),
          http("request_24")
            .get("/styles/Designer/images/tabs.svg")
            .headers(headers_47),
          http("request_25")
            .get("/styles/Designer/images/breadcrumb.svg")
            .headers(headers_48),
          http("request_26")
            .get("/styles/Designer/images/carousel.svg")
            .headers(headers_49),
          http("request_27")
            .get("/styles/Designer/images/menu.svg")
            .headers(headers_50),
          http("request_28")
            .get("/styles/Designer/images/panelsection.svg")
            .headers(headers_51),
          http("request_29")
            .get("/styles/Designer/images/list.svg")
            .headers(headers_52),
          http("request_30")
            .get("/Designer/Appzillon/Js/loadworker.js")
            .headers(headers_53),
          http("request_31")
            .get("/styles/Designer/images/gauge.svg")
            .headers(headers_54),
          http("request_32")
            .get("/styles/Designer/images/planepane.svg")
            .headers(headers_56),
          http("request_33")
            .get("/styles/Designer/images/accordion.svg")
            .headers(headers_57),
          http("request_34")
            .get("/styles/Designer/images/collapse.svg")
            .headers(headers_58),
          http("request_35")
            .get("/styles/Designer/images/form.svg")
            .headers(headers_59),
          http("request_36")
            .get("/styles/Designer/images/chart.svg")
            .headers(headers_60),
          http("request_37")
            .get("/styles/Designer/images/column.svg")
            .headers(headers_61),
          http("request_38")
            .get("/styles/Designer/images/button.svg")
            .headers(headers_62),
          http("request_39")
            .get("/styles/Designer/images/badge.svg")
            .headers(headers_63),
          http("request_40")
            .get("/styles/Designer/images/navbar.svg")
            .headers(headers_64),
          http("request_41")
            .get("/styles/Designer/images/table.svg")
            .headers(headers_65),
          http("request_42")
            .get("/styles/Designer/images/checkbox.svg")
            .headers(headers_67),
          http("request_43")
            .get("/styles/Designer/images/dropdown.svg")
            .headers(headers_68),
          http("request_44")
            .get("/styles/Designer/images/image.svg")
            .headers(headers_69),
          http("request_45")
            .get("/styles/Designer/images/hyperlink.svg")
            .headers(headers_70),
          http("request_46")
            .get("/styles/Designer/images/fileBrowser.svg")
            .headers(headers_71),
          http("request_47")
            .get("/styles/Designer/images/textarea.svg")
            .headers(headers_72),
          http("request_48")
            .get("/styles/Designer/images/planepane1.svg")
            .headers(headers_73),
          http("request_49")
            .get("/styles/Designer/images/input.svg")
            .headers(headers_74),
          http("request_50")
            .get("/styles/Designer/images/tags.svg")
            .headers(headers_75),
          http("request_51")
            .get("/styles/Designer/images/progress.svg")
            .headers(headers_76),
          http("request_52")
            .get("/styles/Designer/images/slider.svg")
            .headers(headers_77),
          http("request_53")
            .get("/styles/Designer/images/label.svg")
            .headers(headers_78),
          http("request_54")
            .get("/styles/Designer/images/radio.svg")
            .headers(headers_79),
          http("request_55")
            .get("/styles/Designer/images/text.svg")
            .headers(headers_80),
          http("request_56")
            .get("/styles/Designer/images/stepper.svg")
            .headers(headers_81),
          http("request_57")
            .get("/styles/Designer/images/inputwithbutton.svg")
            .headers(headers_82),
          http("request_58")
            .get("/styles/Designer/images/toggle.svg")
            .headers(headers_83),
          http("request_59")
            .get("/Designer/Html/icons.html")
            .headers(headers_32),
          http("request_60")
            .get("/Designer/Widgets/portion/body.html")
            .headers(headers_84),
          http("request_61")
            .get("/styles/Designer/images/prop_uarrow2.svg")
            .headers(headers_85),
          http("request_62")
            .get("/styles/Designer/images/prop_darrow.svg")
            .headers(headers_86),
          http("request_63")
            .get("/styles/Designer/images/prop_darrow2.svg")
            .headers(headers_87),
          http("request_64")
            .get("/Editors/js/hs.png")
            .headers(headers_30),
          http("request_65")
            .get("/Editors/js/cross.gif")
            .headers(headers_30),
          http("request_66")
            .get("/Editors/js/arrow.gif")
            .headers(headers_30)))
      .pause(5)
      .exec(http("request_67")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_88)
        .resources(http("request_68")
          .get("/styles/Designer/images/rowbg.png")
          .headers(headers_89),
          http("request_69")
            .get("/styles/Designer/images/colbg.png")
            .headers(headers_90),
          http("request_70")
            .get("/Designer/Widgets/panel/simple.html")
            .headers(headers_91),
          http("request_71")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_92),
          http("request_72")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_93),
          http("request_73")
            .get("/Designer/Widgets/portion/header.html")
            .headers(headers_94),
          http("request_74")
            .get("/Designer/Widgets/portion/header.html")
            .headers(headers_32),
          http("request_75")
            .get("/Designer/JQuery/Css/images/ui-bg_flat_75_ffffff_40x100.png")
            .headers(headers_30)))
      .pause(21)
      .exec(http("request_76")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_32)
        .resources(http("request_77")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_32),
          http("request_78")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_32),
          http("request_79")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_32),
          http("request_80")
            .get("/Designer/Widgets/portion/sidebar.html")
            .headers(headers_95),
          http("request_81")
            .get("/Designer/Widgets/portion/sidebar.html")
            .headers(headers_32),
          http("request_82")
            .get("/Designer/Widgets/panelsection/panelsection.html")
            .headers(headers_32),
          http("request_83")
            .get("/Designer/Widgets/panel/simple.html")
            .headers(headers_32),
          http("request_84")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_32),
          http("request_85")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_32),
          http("request_86")
            .get("/Designer/Widgets/section/column.html")
            .headers(headers_96),
          http("request_87")
            .get("/styles/Designer/images/navsel.png")
            .headers(headers_97),
          http("request_88")
            .get("/Designer/Widgets/section/row.html")
            .headers(headers_98),
          http("request_89")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_99),
          http("request_90")
            .get("/Designer/Widgets/element/button/button.html")
            .headers(headers_100),
          http("request_91")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_101),
          http("request_92")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_102),
          http("request_93")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_103),
          http("request_94")
            .get("/styles/Designer/images/settingsmo.svg")
            .headers(headers_104),
          http("request_95")
            .get("/styles/Designer/images/database.svg")
            .headers(headers_105)))
      .pause(2)
      .exec(http("request_96")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_32))
      .pause(4)
      .exec(http("request_97")
        .get("/Designer/Widgets/grid/row.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_98")
        .get("/Designer/Widgets/grid/row.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_99")
        .get("/Designer/Widgets/portion/header.html")
        .headers(headers_32))
      .pause(3)
      .exec(http("request_100")
        .get("/Designer/Widgets/grid/row.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_101")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_102")
        .get("/Designer/Widgets/element/button/button.html")
        .headers(headers_32)
        .resources(http("request_103")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_32),
          http("request_104")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_32),
          http("request_105")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_32)))
      .pause(1)
      .exec(http("request_106")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_32))
      .pause(2)
      .exec(http("request_107")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_32))
      .pause(2)
      .exec(http("request_108")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_32))
      .pause(2)
      .exec(http("request_109")
        .get("/Designer/Widgets/portion/header.html")
        .headers(headers_32))
      .pause(6)
      .exec(http("request_110")
        .get("/Designer/Widgets/portion/header.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_111")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_32))
      .pause(1)
      .exec(http("request_112")
        .get("/Designer/Widgets/grid/row.html")
        .headers(headers_32))
      .pause(7)
      .exec(http("request_113")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_32)
        .resources(http("request_114")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_32),
          http("request_115")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_32),
          http("request_116")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_32),
          http("request_117")
            .get("/Designer/Widgets/portion/footer.html")
            .headers(headers_104),
          http("request_118")
            .get("/Designer/Widgets/portion/footer.html")
            .headers(headers_32)))
  }

  def PopupSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/popup/modal.html")
          .headers(headers_3),
        http("request_5")
          .get("/Designer/Widgets/popup/modal.html")
          .headers(headers_3)))
      .pause(2)
      .exec(http("request_6")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_7")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_9")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_10")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_3),
          http("request_11")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_3)))
      .pause(2)
      .exec(http("request_12")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_13")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_14")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_15")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_16")
            .get("/Designer/Widgets/popup/popover.html")
            .headers(headers_3),
          http("request_17")
            .get("/Designer/Widgets/popup/popover.html")
            .headers(headers_3)))
      .pause(12)
      .exec(http("request_18")
        .get("/Designer/Widgets/popup/dialog.html")
        .headers(headers_3))
      .pause(8)
      .exec(http("request_19")
        .get("/Designer/Widgets/popup/dialog.html")
        .headers(headers_3))
      .pause(2)
      .exec(http("request_20")
        .get("/Designer/Widgets/popup/dialog.html")
        .headers(headers_3))
      .pause(5)
      .exec(http("request_21")
        .get("/Designer/Widgets/popup/modal.html")
        .headers(headers_3))
      .pause(6)
      .exec(http("request_22")
        .get("/Designer/Widgets/popup/modal.html")
        .headers(headers_3))
      .pause(1)
      .exec(http("request_23")
        .get("/Designer/Widgets/popup/modal.html")
        .headers(headers_3))
      .pause(20)
      .exec(http("request_24")
        .get("/Designer/Widgets/popup/modal.html")
        .headers(headers_3)
        .resources(http("request_25")
          .get("/Designer/Widgets/popup/modal.html")
          .headers(headers_3),
          http("request_26")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_3),
          http("request_27")
            .get("/Designer/Widgets/popup/dialog.html")
            .headers(headers_3),
          http("request_28")
            .get("/Designer/Widgets/portion/body.html")
            .headers(headers_3),
          http("request_29")
            .get("/Designer/Widgets/portion/body.html")
            .headers(headers_3),
          http("request_30")
            .get("/Designer/Widgets/portion/body.html")
            .headers(headers_3)))
  }

  def PanelSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(4)
      .exec(http("request_5")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_7")
            .get("/Designer/Widgets/panel/simple.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_8")
        .get("/Designer/Widgets/panel/accordion.html")
        .headers(headers_4)
        .resources(http("request_9")
          .get("/Designer/Widgets/panel/accordion.html")
          .headers(headers_3)))
      .pause(1)
      .exec(http("request_10")
        .get("/Designer/Widgets/panel/carousel.html")
        .headers(headers_3)
        .resources(http("request_11")
          .get("/Designer/Widgets/panel/carousel.html")
          .headers(headers_3)))
      .pause(4)
      .exec(http("request_12")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3)
        .resources(http("request_13")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3)))
      .pause(14)
      .exec(http("request_14")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_15")
          .get("/Designer/Widgets/panel/tab.html")
          .headers(headers_4),
          http("request_16")
            .get("/Designer/Widgets/panel/tab.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_17")
        .get("/Designer/Widgets/panel/carousel.html")
        .headers(headers_3)
        .resources(http("request_18")
          .get("/Designer/Widgets/panel/carousel.html")
          .headers(headers_3)))
      .pause(4)
      .exec(http("request_19")
        .get("/Designer/Widgets/panel/tab.html")
        .headers(headers_3)
        .resources(http("request_20")
          .get("/Designer/Widgets/panel/tab.html")
          .headers(headers_3)))
      .pause(11)
      .exec(http("request_21")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_22")
          .get("/Designer/Widgets/panel/accordion.html")
          .headers(headers_3),
          http("request_23")
            .get("/Designer/Widgets/panel/accordion.html")
            .headers(headers_3)))
      .pause(23)
      .exec(http("request_24")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_25")
          .get("/Designer/Widgets/panel/carousel.html")
          .headers(headers_3),
          http("request_26")
            .get("/Designer/Widgets/panel/carousel.html")
            .headers(headers_3)))
      .pause(15)
      .exec(http("request_27")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_28")
          .get("/Designer/Widgets/panel/collapsible.html")
          .headers(headers_4),
          http("request_29")
            .get("/Designer/Widgets/panel/collapsible.html")
            .headers(headers_3)))
      .pause(18)
      .exec(http("request_30")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_31")
          .get("/Designer/Widgets/panelsection/panelsection.html")
          .headers(headers_3)))
  }

  def ContainerSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(7)
      .exec(http("request_5")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_7")
            .get("/Designer/Widgets/container/breadcrumb/breadcrumb.html")
            .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/container/breadcrumb/breadcrumb.html")
            .headers(headers_3)))
      .pause(7)
      .exec(http("request_9")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_10")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_11")
            .get("/Designer/Widgets/container/chart/chart.html")
            .headers(headers_3),
          http("request_12")
            .get("/Designer/Widgets/container/chart/chart.html")
            .headers(headers_3)))
      .pause(10)
      .exec(http("request_13")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_14")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_15")
            .get("/Designer/Widgets/container/form/form.html")
            .headers(headers_3),
          http("request_16")
            .get("/Designer/Widgets/container/form/form.html")
            .headers(headers_3)))
      .pause(10)
      .exec(http("request_17")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_18")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_19")
            .get("/Designer/Widgets/container/gauge/gauge.html")
            .headers(headers_3),
          http("request_20")
            .get("/Designer/Widgets/container/gauge/gauge.html")
            .headers(headers_3)))
      .pause(10)
      .exec(http("request_21")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_22")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_23")
            .get("/Designer/Widgets/container/list/list.html")
            .headers(headers_3),
          http("request_24")
            .get("/Designer/Widgets/container/list/list.html")
            .headers(headers_3)))
      .pause(11)
      .exec(http("request_25")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_26")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_27")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3),
          http("request_28")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_3)))
      .pause(3)
      .exec(http("request_29")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_3)
        .resources(http("request_30")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_3),
          http("request_31")
            .get("/styles/Designer/images/tablesel.png")
            .headers(headers_5),
          http("request_32")
            .get("/Designer/Widgets/container/table/table.html")
            .headers(headers_4),
          http("request_33")
            .get("/Designer/Widgets/container/table/table.html")
            .headers(headers_3)))
  }

  def ElementSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_6)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_6),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_6),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_6),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_6)))
      .pause(2)
      .exec(http("request_5")
        .get("/Designer/Widgets/section/column.html")
        .headers(headers_6)
        .resources(http("request_6")
          .get("/Designer/Widgets/section/row.html")
          .headers(headers_6),
          http("request_7")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_6),
          http("request_8")
            .get("/Designer/Widgets/container/navbar/navbar.html")
            .headers(headers_6)))
      .pause(4)
      .exec(http("request_9")
        .get("/Designer/Widgets/element/badge/badge.html")
        .headers(headers_6)
        .resources(http("request_10")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_11")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_12")
            .get("/Designer/Widgets/element/badge/badge.html")
            .headers(headers_6),
          http("request_13")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_14")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(9)
      .exec(http("request_15")
        .get("/Designer/Widgets/element/button/button.html")
        .headers(headers_6)
        .resources(http("request_16")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_17")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_18")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_19")
            .get("/Designer/Widgets/element/button/button.html")
            .headers(headers_6),
          http("request_20")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_21")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_22")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(9)
      .exec(http("request_23")
        .get("/Designer/Widgets/element/gauge/gauge.html")
        .headers(headers_6)
        .resources(http("request_24")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_25")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_26")
            .get("/Designer/Widgets/element/gauge/gauge.html")
            .headers(headers_6),
          http("request_27")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_28")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_29")
            .get("/src/styles/Designer/images/gauge2.png")))
      .pause(13)
      .exec(http("request_30")
        .get("/Designer/Widgets/element/checkbox/checkbox.html")
        .headers(headers_6)
        .resources(http("request_31")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_32")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_33")
            .get("/Designer/Widgets/element/checkbox/checkbox.html")
            .headers(headers_6),
          http("request_34")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_35")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(8)
      .exec(http("request_36")
        .get("/Designer/Widgets/element/dropdown/dropdown.html")
        .headers(headers_6)
        .resources(http("request_37")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_38")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_39")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_40")
            .get("/Designer/Widgets/element/dropdown/dropdown.html")
            .headers(headers_6),
          http("request_41")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_42")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_43")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(11)
      .exec(http("request_44")
        .get("/Designer/Widgets/element/image/image.html")
        .headers(headers_106)
        .resources(http("request_45")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_46")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_47")
            .get("/Designer/Widgets/element/image/image.html")
            .headers(headers_6),
          http("request_48")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_49")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_50")
            .get("/styles/Designer/images/avatar2.png")
            .headers(headers_107)))
      .pause(13)
      .exec(http("request_51")
        .get("/Designer/Widgets/element/hyperlink/hyperlink.html")
        .headers(headers_108)
        .resources(http("request_52")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_53")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_54")
            .get("/Designer/Widgets/element/hyperlink/hyperlink.html")
            .headers(headers_6),
          http("request_55")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_56")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(9)
      .exec(http("request_57")
        .get("/Designer/Widgets/element/icon/icon.html")
        .headers(headers_109)
        .resources(http("request_58")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_59")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_60")
            .get("/Designer/Widgets/element/icon/icon.html")
            .headers(headers_6),
          http("request_61")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_62")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(15)
      .exec(http("request_63")
        .get("/Designer/Widgets/element/filebrowser/filebrowser.html")
        .headers(headers_110)
        .resources(http("request_64")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_65")
            .get("/Designer/Widgets/element/filebrowser/filebrowser.html")
            .headers(headers_6),
          http("request_66")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6)))
      .pause(11)
      .exec(http("request_67")
        .get("/Designer/Widgets/element/inputbox/inputbox.html")
        .headers(headers_111)
        .resources(http("request_68")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_69")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_70")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_71")
            .get("/Designer/Widgets/element/inputbox/inputbox.html")
            .headers(headers_6),
          http("request_72")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_73")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_74")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(10)
      .exec(http("request_75")
        .get("/Designer/Widgets/element/textarea/textarea.html")
        .headers(headers_112)
        .resources(http("request_76")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_77")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_78")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_79")
            .get("/Designer/Widgets/element/textarea/textarea.html")
            .headers(headers_6),
          http("request_80")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_81")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_82")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(16)
      .exec(http("request_83")
        .get("/Designer/Widgets/element/tags/tags.html")
        .headers(headers_113)
        .resources(http("request_84")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_85")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_86")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_87")
            .get("/Designer/Widgets/element/tags/tags.html")
            .headers(headers_6),
          http("request_88")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_89")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_90")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(3)
      .exec(http("request_91")
        .get("/Designer/Widgets/element/label/label.html")
        .headers(headers_114)
        .resources(http("request_92")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_93")
            .get("/Designer/Widgets/element/label/label.html")
            .headers(headers_6),
          http("request_94")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6)))
      .pause(2)
      .exec(http("request_95")
        .get("/Designer/Widgets/element/radio/radio.html")
        .headers(headers_115)
        .resources(http("request_96")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_97")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_98")
            .get("/Designer/Widgets/element/radio/radio.html")
            .headers(headers_6),
          http("request_99")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_100")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(6)
      .exec(http("request_101")
        .get("/Designer/Widgets/element/text/text.html")
        .headers(headers_116)
        .resources(http("request_102")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_103")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_104")
            .get("/Designer/Widgets/element/text/text.html")
            .headers(headers_6),
          http("request_105")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_106")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(5)
      .exec(http("request_107")
        .get("/Designer/Widgets/element/toggleswitch/toggleswitch.html")
        .headers(headers_117)
        .resources(http("request_108")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_109")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_110")
            .get("/Designer/Widgets/element/toggleswitch/toggleswitch.html")
            .headers(headers_6),
          http("request_111")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_112")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(9)
      .exec(http("request_113")
        .get("/Designer/Widgets/element/inputwithbutton/inputwithbutton.html")
        .headers(headers_118)
        .resources(http("request_114")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_115")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_116")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_117")
            .get("/Designer/Widgets/element/inputwithbutton/inputwithbutton.html")
            .headers(headers_6),
          http("request_118")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_119")
            .get("/Designer/Widgets/element/commonresponsive.html")
            .headers(headers_6),
          http("request_120")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
      .pause(6)
      .exec(http("request_121")
        .get("/Designer/Widgets/element/stepper/stepper.html")
        .headers(headers_119)
        .resources(http("request_122")
          .get("/Designer/Widgets/element/common.html")
          .headers(headers_6),
          http("request_123")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6),
          http("request_124")
            .get("/Designer/Widgets/element/stepper/stepper.html")
            .headers(headers_6),
          http("request_125")
            .get("/Designer/Widgets/element/common.html")
            .headers(headers_6),
          http("request_126")
            .get("/Designer/Widgets/element/interface/interface.html")
            .headers(headers_6)))
  }

  def LayoutSectionProperties(): ChainBuilder ={
    exec(http("request_0")
      .get("/Designer/Widgets/panelsection/panelsection.html")
      .headers(headers_3)
      .resources(http("request_1")
        .get("/Designer/Widgets/panel/simple.html")
        .headers(headers_3),
        http("request_2")
          .get("/Designer/Widgets/grid/column.html")
          .headers(headers_3),
        http("request_3")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3),
        http("request_4")
          .get("/Designer/Widgets/grid/row.html")
          .headers(headers_3)))
      .pause(23)
      .exec(http("request_5")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3)
        .resources(http("request_6")
          .get("/Designer/Widgets/panel/simple.html")
          .headers(headers_3),
          http("request_7")
            .get("/Designer/Widgets/grid/column.html")
            .headers(headers_3),
          http("request_8")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3),
          http("request_9")
            .get("/Designer/Widgets/grid/row.html")
            .headers(headers_3)))
      .pause(4)
      .exec(http("request_10")
        .get("/Designer/Widgets/panelsection/panelsection.html")
        .headers(headers_3))
      .pause(1)
      .exec(http("request_11")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_3))
      .pause(4)
      .exec(http("request_12")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_3))
      .pause(1)
      .exec(http("request_13")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_3))
      .pause(2)
      .exec(http("request_14")
        .get("/Designer/Widgets/grid/column.html")
        .headers(headers_3))
  }

//  def ScriptAdd()={
//
//  }

  def ScriptEdit(): ChainBuilder ={
    exec(http("request_0")
      .get("/Editors/ace/src-noconflict/theme-theme.js")
      .resources(http("request_1")
        .get(uri4)))
      .pause(62)
      .exec(http("request_2")
        .get(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D?")
        .headers(headers_8)
        .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88")
        .resources(http("request_3")
          .options(uri3 + "/_changes?style=all_docs&feed=longpoll&heartbeat=10000&filter=mainAppReplicationDesign%2FmainAppReplicationFilter&type=MAINAPP%2CUSERDATA%2CDevSettings&since=162-g1AAAABPeJzLYWBgYMxgTmEQTM4vTc5ISXIwNDLXMwBCwxygFFMiQx4Lw38gyMpgTlyUCxRiNzUwMTBOTMWmJQsAKaMVEg&limit=2")
          .headers(headers_9),
          http("request_4")
            .put(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D")
            .headers(headers_210)
            .body(RawFileBody("bodies/0004_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_5")
            .get(uri3 + "/_local/XU_U2P5sPNLo0M4bb4oYcw%3D%3D?")
            .headers(headers_10)
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_6")
            .put(uri3 + "/_local/XU_U2P5sPNLo0M4bb4oYcw%3D%3D")
            .headers(headers_210)
            .body(RawFileBody("bodies/0006_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88")))
  }

//  def InterfaceAdd()={
//
//  }
//
//  def InterfaceEdit()={
//
//  }

  def InterfaceRename(): ChainBuilder ={
    exec(http("request_0")
      .get("/static/media/properties.22245dc9.svg")
      .resources(http("request_1")
        .get("/static/media/rename.4a523e8d.svg"),
        http("request_2")
          .get("/static/media/delete.193954e6.svg"),
        http("request_3")
          .get("/static/media/litcodes.9260e753.svg")))
      .pause(7)
      .exec(http("request_4")
        .post(uri3+"/_revs_diff")
        .headers(headers_210)
        .body(RawFileBody("bodies/0005_request.json"))
        .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"))
  }

  def InterfaceDelete(): ChainBuilder ={
    exec(http("request_0")
      .get("/static/media/properties.22245dc9.svg"))
      .pause(8)
      .exec(http("request_1")
        .get("/static/media/properties.22245dc9.svg")
        .resources(http("request_2")
          .get("/static/media/rename.4a523e8d.svg"),
          http("request_3")
            .get("/static/media/delete.193954e6.svg")))
  }

//  def CreateDesign()={
//
//  }

  def StaticDataLITcode(): ChainBuilder ={
    exec(http("request_0")
      .get("/static/media/languages.cd55379a.svg")
      .resources(http("request_1")
        .get("/static/media/currencies.f93e02b9.svg"),
        http("request_2")
          .get("/static/media/litcodes.9260e753.svg"),
        http("request_3")
          .get("/static/media/messages.83d18e6c.svg"),
        http("request_4")
          .get("/static/media/files.b3fb03d1.svg"),
        http("request_5")
          .get("/static/media/environmentvariable1.a15f4ac7.svg")))
  }

  def ServerPreferenceEdit(): ChainBuilder ={
    exec(http("request_0")
      .get("/static/media/extension.7bcb9aad.svg")
      .headers(headers_11))
      .pause(23)
      .exec(http("request_1")
        .get(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D?")
        .headers(headers_12)
        .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88")
        .resources(http("request_2")
          .options(uri3 + "/_changes?style=all_docs&feed=longpoll&heartbeat=10000&filter=mainAppReplicationDesign%2FmainAppReplicationFilter&type=MAINAPP%2CUSERDATA%2CDevSettings&since=172-g1AAAABPeJzLYWBgYMxgTmEQTM4vTc5ISXIwNDLXMwBCwxygFFMiQx4Lw38gyMpgTlyTCxRiNzUwMTBOTMWmJQsAKvcVHA&limit=4")
          .headers(headers_13),
          http("request_3")
            .put(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D")
            .headers(headers_14)
            .body(RawFileBody("bodies/0003_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_4")
            .get(uri3 + "/_local/XU_U2P5sPNLo0M4bb4oYcw%3D%3D?")
            .headers(headers_15)
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_5")
            .post(uri3 + "/_revs_diff")
            .headers(headers_14)
            .body(RawFileBody("bodies/0002_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_6")
            .put(uri3 + "/_local/XU_U2P5sPNLo0M4bb4oYcw%3D%3D")
            .headers(headers_14)
            .body(RawFileBody("bodies/0007_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_7")
            .get(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D?")
            .headers(headers_16)
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88"),
          http("request_8")
            .put(uri3 + "/_local/6fmnDawd.HrsbNyKcQ8r_w%3D%3D")
            .headers(headers_14)
            .body(RawFileBody("bodies/0008_request.json"))
            .basicAuth("vishnu.k-i-exceed.com","zBNTI83m88")))
  }

        def LogoutPage(): ChainBuilder = {
          exec(http("request_245")
              .get("/Editors/css/sqpurple.gif"))
            .exec(http("request_246")
              .get("/static/media/bg_image.52123ed3.jpg"))
        }


  val scn: ScenarioBuilder = scenario("Launch")
                            .group("Launch"){exec(LaunchPage())}
                            .pause(5)
                            .group("Login"){exec(LoginPage())}
                            .pause(5)
                            .group("OpenBaseApp"){exec(OpenBaseApp())}
                            .pause(5)
//                            .group("OpenMicroApp"){exec(OpenMicroApp())}
//                            .pause(5)
//                            .group("CreateScreen"){exec(CreateScreen())}
//                            .pause(5)
//                            .group("CreateDesign"){exec(CreateDesign())}
//                            .pause(5)
                            .group("DesignsPageSection"){exec(DesignsPageSection())}
                            .pause(5)
                            .group("DesignsPopupSection"){exec(DesignsPopupSection())}
                            .pause(5)
                            .group("DesignsPanelSection"){exec(DesignsPanelSection())}
                            .pause(5)
                            .group("DesignsContainerSection"){exec(DesignsContainerSection())}
                            .pause(5)
                            .group("DesignsElementSection"){exec(DesignsElementSection())}
                            .pause(5)
                            .group("DesignsLayoutSection"){exec(DesignsLayoutSection())}
                            .pause(5)
//                            .group("ProjectProperties"){exec(ProjectProperties())}
//                            .pause(5)
                            .group("BodyProperties"){exec(BodyProperties())}
                            .pause(5)
                            .group("PageSectionProperties"){exec(PageSectionProperties())}
                            .pause(5)
                            .group("PopupSectionProperties"){exec(PopupSectionProperties())}
                            .pause(5)
                            .group("PanelSectionProperties"){exec(PanelSectionProperties())}
                            .pause(5)
                            .group("ContainerSectionProperties"){exec(ContainerSectionProperties())}
                            .pause(5)
                            .group("ElementSectionProperties"){exec(ElementSectionProperties())}
                            .pause(5)
                            .group("LayoutSectionProperties"){exec(LayoutSectionProperties())}
                            .pause(5)
//                            .group("ScriptAdd"){exec(ScriptAdd())}
//                            .pause(5)
                            .group("ScriptEdit"){exec(ScriptEdit())}
                            .pause(5)
//                            .group("InterfaceAdd"){exec(InterfaceAdd())}
//                            .pause(5)
//                            .group("InterfaceEdit"){exec(InterfaceEdit())}
//                            .pause(5)
                            .group("InterfaceRename"){exec(InterfaceRename())}
                            .pause(5)
                            .group("InterfaceDelete"){exec(InterfaceDelete())}
                            .pause(5)
//                            .group("ThemeStylesheet"){exec(ThemeStylesheet())}
//                            .pause(5)
                            .group("StaticDataLITcode"){exec(StaticDataLITcode())}
                            .pause(5)
                            .group("ServerPreferenceEdit"){exec(ServerPreferenceEdit())}
                            .pause(5)
                            .group("Logout"){exec(LogoutPage())}

  setUp(scn.inject(
//    atOnceUsers(1)
    rampConcurrentUsers(1) to 10 during 10.seconds,
    constantConcurrentUsers(10) during 300.seconds,
    rampConcurrentUsers(10) to 1 during 10.seconds
  ).protocols(httpProtocol))
}