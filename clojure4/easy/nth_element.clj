(= ((fn [coll x] (first (nthnext coll x))) '(4 5 6 7) 2) 6) ; my solution

(= (#(first (drop %2 %)) [:a :b :c] 0) :a)

(= ((fn [coll x] (first (nthnext coll x)) [1 2 3 4] 1) 2)

(= ((fn [coll x] (first (nthnext coll x)) '([1 2] [3 4] [5 6]) 2) [5 6])