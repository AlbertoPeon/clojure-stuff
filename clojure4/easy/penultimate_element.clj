(= ((comp first rest reverse) (list 1 2 3 4 5)) 4) ; my solution

(= (#(second (reverse %)) [[1 2] [3 4]]) [1 2])

(= ((comp peek pop vec) ["a" "b" "c"]) "b")
