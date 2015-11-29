(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))

(deftest verifyconfigfile-test
  (testing "verifyconfigfile")
  (verifyconfigfile (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")
)