(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(defn verify-hostname "Verifies the host name" [config index hostname] (.equals (nth config (+ (* index 7) 2)) (str "Hostname " hostname)))          