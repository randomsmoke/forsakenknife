(ns digitalbird.randomsmoke.forsakenknife.core)
; blank
(defn verify-blank "Verifies the blank in the config stanza" [config index] (.equals (get config (* index 7)) ""))
; host
; hostname
; user
; identity file
; identities only
; control master
; control path
