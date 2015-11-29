(ns digitalbird.randomsmoke.forsakenknife.core
    [clojure.test :refer :all]
)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn verifyconfigfile [config start host hostname user keyfile]
  (is (.equals "" (get config 1)))
  (is (.equals (str "Host " host) (get config 2)))
  (is (.equals (str "Hostname " hostname) (get config 3)))
  (is (.equals (str "User " user) (get config 4)))
  (is (.equals (str "IdentityFile " keyfile) (get config 5)))
  (is (.equals "ControlMaster auto" (get config 6)))
  (is (.equals (str "ControlPath " keyfile "_%h_%p_%r") (get config 7)))
)