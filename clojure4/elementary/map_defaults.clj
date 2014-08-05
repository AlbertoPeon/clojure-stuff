(= (#(zipmap %2 (repeat (count %2) %1)) 0 [:a :b :c]) {:a 0 :b 0 :c 0}) ; my solution

(= (#(zipmap %2 (repeat %1)) "x" [1 2 3]) {1 "x" 2 "x" 3 "x"}) ; count is not needed

(= (#(into {} (map vector %2 (repeat %))) [:a :b] [:foo :bar]) {:foo [:a :b] :bar [:a :b]})