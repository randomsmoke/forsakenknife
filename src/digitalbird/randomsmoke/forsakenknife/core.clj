(ns digitalbird.randomsmoke.forsakenknife.core)
(use '[clojure.java.shell :only [sh]])

(defn verifypassphrase "Verifies that the passphrase is correct" [is keyfile passphrase]
  (is (= (get (sh "ssh-keygen" "-f" keyfile "-y" "-P" passphrase)) :exit) 0)
)
