(ns digitalbird.randomsmoke.forsakenknife.core
    [clojure.test :refer :all]
)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn verifyconfigfile [config start host hostname user keyfile]
  (is (.equals "" (get config start)))
  (is (.equals (str "Host " host) (get config (+ start 1)))
  (is (.equals (str "Hostname " hostname) (get config (+ start 2))))
  (is (.equals (str "User " user) (get config (+ start 3))))
  (is (.equals (str "IdentityFile " keyfile) (get config (+ start 4))))
  (is (.equals "ControlMaster auto" (get config (+ start 5))))
  (is (.equals (str "ControlPath " keyfile "_%h_%p_%r") (get config (+ start 6))))
)