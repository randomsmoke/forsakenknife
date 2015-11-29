(ns digitalbird.randomsmoke.forsakenknife.core
    [clojure.test :refer :all]
)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn verifyconfigfile [config start host hostname user keyfile]
  (is (.equals "" (nth config start)))
  (is (.equals (str "Host " host) (nth config (inc start 1))))
  (is (.equals (str "Hostname " hostname) (nth config (inc start 2))))
  (is (.equals (str "User " user) (nth config (inc start 3))))
  (is (.equals (str "IdentityFile " keyfile) (nth config (inc start 4))))
  (is (.equals "ControlMaster auto" (nth config (inc start 5))))
  (is (.equals (str "ControlPath " keyfile "_%h_%p_%r") (nth config (inc start 6))))
)