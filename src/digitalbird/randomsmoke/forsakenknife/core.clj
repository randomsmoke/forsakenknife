(ns digitalbird.randomsmoke.forsakenknife.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn verifyconfigfile [is config start host hostname user keyfile]
  (is (.equals "" (nth config start)))
  (is (.equals (str "Host " host) (nth config (+ start 1))))
  (is (.equals (str "Hostname " hostname) (nth config (+ start 2))))
  (is (.equals (str "User " user) (nth config (+ start 3))))
  (is (.equals (str "IdentityFile " keyfile) (nth config (+ start 4))))
  (is (.equals "ControlMaster auto" (nth config (+ start 5))))
  (is (.equals (str "ControlPath " keyfile "_%h_%p_%r") (nth config (+ start 6))))
)
