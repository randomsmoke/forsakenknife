(ns digitalbird.randomsmoke.forsakenknife.core-test
  (:require [clojure.test :refer :all]
            [digitalbird.randomsmoke.forsakenknife.core :refer :all]))
; blank
; host
; hostname
; user
; identity file
; identities only
(defn verify-identites-only "Verify identites only" [config index] (.equals (nth config (+ (* config 7) 5))))
; control master
; control path          