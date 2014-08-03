(= (#(reduce + (map (constantly 1) %)) '(1 2 3 3 1)) 5) ; my solution

(= ((comp (partial apply +) (partial map #(do % 1))) "Hello World") 11)

(= (#(reduce + (map (constantly 1) %)) [[1 2] [3 4] [5 6]]) 3)

(= (#(reduce + (map (constantly 1) %)) '(13)) 1)

(= (#(reduce + (map (constantly 1) %)) '(:a :b :c)) 3)


