import chara.matsu.test.test.FooResponse
import chara.matsu.test.test.FooResponse.FooStatus

/*
> run
[info] Running Main
OK
UNRECOGNIZED

[error] (run-main-5) java.lang.ArrayIndexOutOfBoundsException: -1
java.lang.ArrayIndexOutOfBoundsException: -1
	at java.util.Arrays$ArrayList.get(Arrays.java:3841)
	at java.util.Collections$UnmodifiableList.get(Collections.java:1309)
	at com.trueaccord.scalapb.GeneratedEnum.valueDescriptor(GeneratedMessageCompanion.scala:23)
	at com.trueaccord.scalapb.GeneratedEnum.valueDescriptor$(GeneratedMessageCompanion.scala:23)
	at chara.matsu.test.test.FooResponse$FooStatus$Unrecognized.valueDescriptor(FooResponse.scala:103)
	at chara.matsu.test.test.FooResponse.getField(FooResponse.scala:57)
	at com.trueaccord.scalapb.GeneratedMessage.getAllFields(GeneratedMessageCompanion.scala:76)
	at com.trueaccord.scalapb.GeneratedMessage.getAllFields$(GeneratedMessageCompanion.scala:69)
	at chara.matsu.test.test.FooResponse.getAllFields(FooResponse.scala:11)
	at com.trueaccord.scalapb.textformat.Printer$.print(Printer.scala:11)
	at com.trueaccord.scalapb.textformat.Printer$.printToString(Printer.scala:19)
	at com.trueaccord.scalapb.TextFormat$.printToUnicodeString(TextFormat.scala:34)
	at chara.matsu.test.test.FooResponse.toString(FooResponse.scala:62)
	at Main$.delayedEndpoint$Main$1(Main.scala:9)
	at Main$delayedInit$body.apply(Main.scala:4)
	at scala.Function0.apply$mcV$sp(Function0.scala:34)
	at scala.Function0.apply$mcV$sp$(Function0.scala:34)
	at scala.runtime.AbstractFunction0.apply$mcV$sp(AbstractFunction0.scala:12)
	at scala.App.$anonfun$main$1$adapted(App.scala:76)
	at scala.collection.immutable.List.foreach(List.scala:378)
	at scala.App.main(App.scala:76)
	at scala.App.main$(App.scala:74)
	at Main$.main(Main.scala:4)
	at Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
[trace] Stack trace suppressed: run last compile:run for the full output.
java.lang.RuntimeException: Nonzero exit code: 1
	at scala.sys.package$.error(package.scala:27)
[trace] Stack trace suppressed: run last compile:run for the full output.
[error] (compile:run) Nonzero exit code: 1
[error] Total time: 1 s, completed 2017/01/06 22:45:27
*/
object Main extends App {
  println(FooStatus.OK.toString())                              // "OK"
  println(FooStatus.Unrecognized(777).toString())               // "UNRECOGNIZED"
  println(FooResponse(FooStatus.OK).toString())                 // ""
  println(FooResponse(FooStatus.Unrecognized(777)).toString())  // throw ArrayIndexOutOfBoundsException: -1
}
