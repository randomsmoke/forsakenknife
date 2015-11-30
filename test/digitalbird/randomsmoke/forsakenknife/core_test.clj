(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(deftest verify-hostname-happy-1-a (testing "The hostname in the first stanza is alpha." (is (verify-hostname (seq (list 1 2 "Hostname alpha" 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha"))))