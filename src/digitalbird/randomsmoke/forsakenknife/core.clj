(ns digitalbird.randomsmoke.forsakenknife.core)
(defn verify-user "Verify the user" [config index user] (.equals (get config (+ (* index 7) 3)) (str "User " user)))
