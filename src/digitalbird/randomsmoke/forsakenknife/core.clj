(ns digitalbird.randomsmoke.forsakenknife.core)
; hostname
(defn verify-user "Verify the user" [config index user] (.equals (nth config (+ (* index 7) 3)) (str "User " user)))
; identity file