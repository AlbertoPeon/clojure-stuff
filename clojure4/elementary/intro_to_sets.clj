(= (set '(:a :b :c :d)) (set '(:a :a :b :c :c :c :c :d :d))) ; true

(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})) ; true