(true? (#(and (contains? %2 %1) (nil? (get %2 %1))) :a {:a nil :b 2})) ; my solution

(false? (#(and (contains? %2 %1) (nil? (get %2 %1))) :c {:a nil :b 2})) ; my solution

(false? (#(not (%2 % 1)) :b {:a nil :b 2}))

