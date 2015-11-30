(ns digitalbird.randomsmoke.forsakenknife.core)
; hostname
(defn verify-hostname "Verifies the host name" [config index hostname] (.equals (nth config (+ (* index 7) 2)) (str "Hostname " hostname)))          
; identity file