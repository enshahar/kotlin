package test

header class Foo {
    fun foo(n: Int)
}

fun test(f: Foo) {
    f.foo(1)
    f.foo(n = 1)
}