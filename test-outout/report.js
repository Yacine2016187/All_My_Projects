$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Yacine/Desktop/CucumberSeleniumFramework-master/src/main/java/com/qa/feature/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Free CRM HomePage Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user eners username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "home page is Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Validate Home Page Title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate Logged UserName",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 1747228500,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 88\nCurrent browser version is 91.0.4472.114 with binary path C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-NI501M3\u0027, ip: \u0027192.168.1.218\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tGetHandleVerifier [0x00E3B963+483]\n\tGetHandleVerifier [0x00E3B941+449]\n\tGetHandleVerifier [0x011E3308+3832712]\n\tGetHandleVerifier [0x011FD69A+3940122]\n\tGetHandleVerifier [0x011F9AFB+3924859]\n\tGetHandleVerifier [0x011F7D9C+3917340]\n\tGetHandleVerifier [0x0121E7FE+4075646]\n\tGetHandleVerifier [0x0121E56C+4074988]\n\tGetHandleVerifier [0x0121B2EB+4062059]\n\tGetHandleVerifier [0x011FED14+3945876]\n\tGetHandleVerifier [0x011FFBCE+3949646]\n\tGetHandleVerifier [0x011FFB59+3949529]\n\tOrdinal0 [0x00DFB5CC+46540]\n\tOrdinal0 [0x00DF9F53+40787]\n\tOrdinal0 [0x00DF9B12+39698]\n\tGetHandleVerifier [0x01101468+2907368]\n\tGetHandleVerifier [0x00F471EE+1096302]\n\tGetHandleVerifier [0x00F03E8D+821005]\n\tGetHandleVerifier [0x00F0396B+819691]\n\tGetHandleVerifier [0x00F03881+819457]\n\tGetHandleVerifier [0x00F2F463+998627]\n\tBaseThreadInitThunk [0x7622FA29+25]\n\tRtlGetAppContainerNamedObjectPath [0x778E7A9E+286]\n\tRtlGetAppContainerNamedObjectPath [0x778E7A6E+238]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.qa.util.TestBase.initialization(TestBase.java:31)\r\n\tat com.qa.StepDefinition.HomePageSteps.user_opens_browser(HomePageSteps.java:12)\r\n\tat ✽.Given user opens browser(C:/Users/Yacine/Desktop/CucumberSeleniumFramework-master/src/main/java/com/qa/feature/freecrm.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_eners_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.user_click_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.home_page_is_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_Home_Page_Title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageSteps.validate_Logged_UserName()"
});
formatter.result({
  "status": "skipped"
});
});