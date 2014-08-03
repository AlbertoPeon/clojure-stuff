(= ((fn [x] (.concat (.concat "Hello, " x ) "!")) "Dave") "Hello, Dave!")

(= ((fn [x] (str "Hello, " x "!")) "Rhea") "Hello, Rhea!")

(= (#(str "Hello, " % "!") "Jenn") "Hello, Jenn!")
