(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(defn verify-user "Verify the user" [config index user] (.equals (get config (+ (* index 7) 3)) (str "User " user)))
