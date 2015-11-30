(ns digitalbird.randomsmoke.forsakenknife.core)
; blank
; host
; hostname
; user
; identity file
(defn verify-keyfile "Verifies the identity key file" [config index keyfile] (.equals (nth config (+ (* index 7) 3) (str "IdentityFile " keyfile))))
; identities only
; control master
; control path