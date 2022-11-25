package main

import (
	"fizzbuzz/fizzbuzz"
	"fmt"
)

func main() {
	for i := 0; i <= 100; i++ {
		fmt.Println(fizzbuzz.Decide(i))
	}
}
