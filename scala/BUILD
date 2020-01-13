load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/example/myproject/*.java"]),
    deps = ["@maven//:com_google_guava_guava"],
)

java_binary(
    name = "java-maven",
    main_class = "com.example.myproject.App",
    runtime_deps = [":java-maven-lib"],
)

java_test(
    name = "app",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    test_class = "com.example.myproject.AppTest",
    tags = [],
    deps = [
        ":java-maven-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)

java_test(
    name = "my",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    test_class = "com.example.myproject.MyTest",
    deps = [
        ":java-maven-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)


test_suite(
    name = "alltests",
)

# This auto-generates java_test rules
load("//:alltests.bzl", "alltests")
alltests(
    name = "qqq",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    package = "com.example.myproject",
    deps = [
        ":java-maven-lib",
        "@maven//:com_google_guava_guava",
        "@maven//:junit_junit",
    ],
)



load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

#### SCALA
# run with
# build --strategy=Scalac=worker
# build --worker_sandboxing
scala_binary(
    name = "scala-app",
    deps = [":scala-lib"],
    main_class = "com.myp.OneApp"
)

scala_library(
   name = "scala-lib",
   srcs = glob(["src/main/scala/com/myp/*.scala"]) + glob(["src/main/scala/com/myp/*.java"]),
   deps = [
       ":java-maven-lib",
       #"//3rdparty/jvm/joda_time:joda_time"
   ],
   #visibility = ["//:__pkg__"]
)
