(ns digitalbird.randomsmoke.forsakenknife.core)
; blank
(defn verify-host "Verifies the host" [config index host] (.equals (nth config (inc (* index 7))) (str "Host " host)))
; hostname