name := "tostring_unrecognized_scalapb"

version := "1.0"

scalaVersion := "2.12.1"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)
