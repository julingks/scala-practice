# Scala Practice

This repository is for practicing scala.

## Get Started
* [http://docs.scala-lang.org/ko/tutorials/scala-for-java-programmers.html](http://docs.scala-lang.org/ko/tutorials/scala-for-java-programmers.html)
* [http://twitter.github.io/scala_school/ko/](http://twitter.github.io/scala_school/ko/)

## Install on Mac OS X

```
$ brew install scala
```

## Vim Syntax Highlighting

* [https://github.com/derekwyatt/vim-scala](https://github.com/derekwyatt/vim-scala)

Add the following to .vimrc:

```
Plugin 'derekwyatt/vim-scala'
```

and then run

```
:PluginInstall
```

## Hello World

HelloWorld.scala

```
object HelloWorld {
    def main(args: Array[String]) {
        println("Hello, world!")
    }
}
```

Compile

```
scalac HelloWlrd.scala
```

Execute

```
$ scala -classpath . HelloWorld
Hello, world!
```

## Book
* [ScalaByExample.pdf](book/ScalaByExample.pdf)


