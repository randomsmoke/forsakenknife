(ns digitalbird.randomsmoke.forsakenknife.core)

(defn verify-blank "Verifies the blank in the config stanza" [config index] (.equals (nth config (* index 7)) ""))