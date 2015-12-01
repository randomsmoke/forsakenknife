(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
; blank
; host
(deftest verify-host-happy-1-a (testing "The host in the first stanza is alpha") (is (verify-host (seq (list 1 "Host alpha" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha")))
(deftest verify-host-happy-1-b (testing "The host in the first stanza is beta") (is (verify-host (seq (list 1 "Host beta" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "beta")))
(deftest verify-host-unhappy-1-a (testing "The host in the first stanza is not alpha") (is (not (verify-host (seq (list 1 "Host not alpha" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha"))))
(deftest verify-host-unhappy-1-a (testing "The host in the first stanza is not beta") (is (not (verify-host (seq (list 1 "Host not beta" 3 4 5 6 7 8 9 10 11 12 13 14)) 0 "beta"))))
(deftest verify-host-happy-2-a (testing "The host in the second stanza is alpha") (is (verify-host (seq (list 1 2 3 4 5 6 7 8 "Host alpha" 9 10 11 12 13 14)) 1 "alpha")))
(deftest verify-host-happy-2-b (testing "The host in the second stanza is beta") (is (verify-host (seq (list 1 2 3 4 5 6 7 8 "Host beta" 9 10 11 12 13 14)) 1 "beta")))
(deftest verify-host-unhappy-2-a (testing "The host in the second stanza is not alpha") (is (not (verify-host (seq (list 1 2 3 4 5 6 7 "Host not alpha" 9 10 11 12 13 14)) 1 "alpha"))))
(deftest verify-host-unhappy-2-a (testing "The host in the second stanza is not beta") (is (not (verify-host (seq (list 1 2 3 4 5 6 7 "Host not beta" 9 10 11 12 13 14)) 1 "beta"))))
; hostname