(ns digitalbird.randomsmoke.forsakenknife.core)
; user
(defn verify-user "Verify the user" [config index user] (.equals (nth config (+ (* index 7) 3)) (str "User " user)))
