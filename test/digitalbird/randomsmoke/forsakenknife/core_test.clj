(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(deftest verify-host-happy-1-a (testing "The host in the first stanza is alpha") (is (verify-host (seq (list 1 "Host alpha" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha")))
(deftest verify-host-happy-1-b (testing "The host in the first stanza is beta") (is (verify-host (seq (list 1 "Host beta" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "beta")))
