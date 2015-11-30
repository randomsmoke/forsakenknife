(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))

(deftest verify-blank-test-happy-1 (testing "verifies the blank line in a stanza") (is (verify-blank (seq (list "" "2" "3" "4" "5" "6" "7" "8" "9" "10" "11" "12" "13" "14")) 0)))

(deftest verify-blank-test-happy-2 (testing "verifies the blank line in a stanza") (is (verify-blank (seq (list "1" "2" "3" "4" "5" "6" "7" "" "9" "10" "11" "12" "13" "14")) 1)))

(deftest verify-blank-test-unhappy-1 (testing "verifies the blank line in a stanza") (is (= (verify-blank (seq (list "X" "2" "3" "4" "5" "6" "7" "8" "9" "10" "11" "12" "13" "14")) 0) false)))

(deftest verify-blank-test-unhappy-2 (testing "verifies the blank line in a stanza") (is (= (verify-blank (seq (list "1" "2" "3" "4" "5" "6" "7" "X" "9" "10" "11" "12" "13" "14")) 1) false)))
