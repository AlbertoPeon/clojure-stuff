(= (last [1 2 3 4 5]) 5)

(= (#(first (reverse %)) '(5 4 3)) 3) ; my solution

(= ((comp first reverse) ["b" "c" "d"]) "d")
