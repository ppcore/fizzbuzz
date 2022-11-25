package fizzbuzz

import (
	"fmt"
	"testing"
)

func TestDecide(t *testing.T) {
	tests := map[int]string{
		3:  "Fizz",
		5:  "Buzz",
		10: "Buzz",
		15: "FizzBuzz",
		23: "23",
		0:  "0",
	}
	for i, v := range tests {
		if r := Decide(i); r != v {
			t.Error(fmt.Sprintf("failed for %d, expected %s got %s", i, v, r))
		}
	}
}
