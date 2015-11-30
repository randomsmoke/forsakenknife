(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(deftest verify-hostname-happy-1-a (testing "The hostname in the first stanza is alpha." (is (verify-hostname (seq (list 1 2 "Hostname alpha" 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha"))))
(deftest verify-hostname-happy-1-b (testing "The hostname in the first stanza is beta." (is (verify-hostname (seq (list 1 2 "Hostname beta" 4 5 6 7 8 9 10 11 12 13 14)) 0 "beta"))))
(deftest verify-hostname-happy-2-a (testing "The hostname in the second stanza is alpha." (is (verify-hostname (seq (list 1 2 3 4 5 6 7 8 9 "Hostname alpha" 11 12 13 14)) 1 "alpha"))))
(deftest verify-hostname-happy-2-b (testing "The hostname in the second stanza is beta." (is (verify-hostname (seq (list 1 2 3 4 5 6 7 8 9 "Hostname beta" 11 12 13 14)) 1 "beta"))))
(deftest verify-hostname-unhappy-1-a (testing "The hostname in the first stanza is not alpha." (is (not (verify-hostname (seq (list 1 2 "Hostname not alpha" 4 5 6 7 8 9 10 11 12 13 14)) 0 "alpha")))))
(deftest verify-hostname-unhappy-1-b (testing "The hostname in the first stanza is not beta." (is (not (verify-hostname (seq (list 1 2 "Hostname not beta" 4 5 6 7 8 9 10 11 12 13 14)) 0 "beta")))))
(deftest verify-hostname-unhappy-2-a (testing "The hostname in the second stanza is not alpha." (is (not (verify-hostname (seq (list 1 2 3 4 5 6 7 8 9 "Hostname not alpha" 11 12 13 14)) 1 "alpha")))))
(deftest verify-hostname-unhappy-2-b (testing "The hostname in the second stanza is not beta." (is (not (verify-hostname (seq (list 1 2 3 4 5 6 7 8 9 "Hostname not beta" 11 12 13 14)) 1 "beta")))))
