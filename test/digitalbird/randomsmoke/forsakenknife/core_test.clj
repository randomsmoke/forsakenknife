(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))

(deftest verifyconfigfile-test-happy
  (testing "This is a happy path test of verifyconfigfile.")
  (verifyconfigfile (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 0 "host" "hostname" "user" "keyfile")
)

(deftest verifyconfigfile-test-unhappy-start
  (testing "This is an unhappy path test of verifyconfigfile.  The start index is wrong so everything should not work.")
  (is (thrown? (verifyconfigfile (seq (list "" "Host host" "Hostname hostname" "User user" "IdentityFile keyfile" "ControlMaster auto" "ControlPath keyfile_%h_%p_%r")) 1 "host" "hostname" "user" "keyfile")))
)
