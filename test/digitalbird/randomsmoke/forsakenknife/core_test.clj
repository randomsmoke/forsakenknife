(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
; blank
; host
; hostname
; user
; identity file
; identities only
(deftest verify-identities-only-test-happy-1 (testing "The identities only of the first stanza is correct." (is (verify-identities-only (seq (list 1 2 3 4 5 "IdentitiesOnly yes" 7 8 9 10 11 12 13 14)) 0))))
(deftest verify-identities-only-test-happy-2 (testing "The identities only of the second stanza is correct." (is (verify-identities-only (seq (list 1 2 3 4 5 6 7 8 9 10 "IdentitiesOnly yes" 12 13 14)) 1))))
(deftest verify-identities-only-test-unhappy-1 (testing "The identities only of the first stanza is incorrect." (is (not (verify-identities-only (seq (list 1 2 3 4 5 "IdentitiesOnly not yes" 7 8 9 10 11 12 13 14)) 0)))))
(deftest verify-identities-only-test-unhappy-2 (testing "The identities only of the second stanza is incorrect." (is (not (verify-identities-only (seq (list 1 2 3 4 5 6 7 8 9 10 11 "IdentitiesOnly not yes" 13 14)) 1)))))
; control master
; control path
