(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
; blank
; host
; hostname
; user
; identity file
; identities only
(deftest verify-identities-only-test-happy-1 (testing "The identities only of the first stanza is correct." (verify-identities-only (seq (list 1 2 3 4 5 6 7 8 9 10 11 12 13 14)) 0)))
; control master
; control path          