(ns digitalbird.randomsmoke.forsakenknife.core)

(defn verify-blank "Verifies the blank in the config stanza" [config index] (.equals (get config (* index 7)) ""))