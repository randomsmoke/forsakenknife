(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
(deftest verify-user-test-happy-1-a (testing "The user in the first stanza is alpha.") (is (verify-user (seq (list 1 2 3 "User alpha" 5 6 7 8 9 10 11 12 13 14)) 0 "alpha")))
(deftest verify-user-test-happy-1-b (testing "The user in the first stanza is beta.") (is (verify-user (seq (list 1 2 3 "User beta" 5 6 7 8 9 10 11 12 13 14)) 0 "beta")))
(deftest verify-user-test-happy-2-a (testing "The user in the first stanza is alpha.") (is (verify-user (seq (list 1 2 3 4 5 6 7 8 9 10 "User alpha" 12 13 14)) 1 "alpha")))
(deftest verify-user-test-happy-2-b (testing "The user in the first stanza is beta.") (is (verify-user (seq (list 1 2 3 4 5 6 7 8 9 10 "User beta" 12 13 14)) 1 "beta")))

