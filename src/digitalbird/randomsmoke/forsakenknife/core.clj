(ns digitalbird.randomsmoke.forsakenknife.core)
(defn verify-hostname "Verifies the host name" [config index hostname] (.equals (nth config (+ (* index 7) 2)) (str "Hostname " hostname)))
