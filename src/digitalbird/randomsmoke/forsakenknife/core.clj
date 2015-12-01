(ns digitalbird.randomsmoke.forsakenknife.core)
; blank
; host
; hostname
; user
; identity file
; identities only
(defn verify-identies-only "Verify identites only" [config index] (.equals (nth config (+ (* config 7) 5))))
; control master
; control path