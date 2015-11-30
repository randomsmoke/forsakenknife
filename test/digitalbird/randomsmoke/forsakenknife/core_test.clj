(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(deftest verify-user-test-happy-1-a (testing "The user in the first stanza is alpha." (verify-user (seq (list 1 2 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha")))