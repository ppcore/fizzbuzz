package fizzbuzz

import (
	"fmt"
	"strconv"
)

func Decide(x int) string {
	r := ""
	if x == 0 {
		return strconv.Itoa(x)
	}
	if x%3 == 0 {
		r = fmt.Sprintf("%s%s", r, "Fizz")
	}
	if x%5 == 0 {
		r = fmt.Sprintf("%s%s", r, "Buzz")
	}
	if r == "" {
		r = strconv.Itoa(x)
	}
	return r
}
