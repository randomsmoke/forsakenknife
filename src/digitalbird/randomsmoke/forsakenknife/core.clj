(ns digitalbird.randomsmoke.forsakenknife.core)
; blank
; host
; hostname
; user
; identity file
; identities only
(defn verify-identities-only "Verify identities only" [config index] (.equals (nth config (+ (* index 7) 5)) "IdentitiesOnly yes"))
; control master
; control path